package kr.co.greenart.model.car;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class CarRepositoryMySQL implements CarRepository {
	@Autowired
	private JdbcTemplate JdbcTemplate;
	private CarRowMapper mapper = new CarRowMapper();

	private class CarRowMapper implements RowMapper<Car> {
		@Override
		public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
			int id = rs.getInt("id");
			String model = rs.getString("model");
			int price = rs.getInt("price");

			return new Car(id, model, price);
		}
	}

	@Override
	public List<Car> getAll() {
		return JdbcTemplate.query("select * from cars", mapper);
	}

	@Override
	public Car getById(int id) {
		return JdbcTemplate.queryForObject("select * from cars where id=?", mapper, id);
	}

	@Override
	public int add(Car car) {
		return JdbcTemplate.update("insert into cars (model, price) values (?, ?)", car.getModel(), car.getPrice());
	}

	@Override
	public int update(Car car) {
		return JdbcTemplate.update("update cars set model=?, price=? where id=?", car.getModel(), car.getPrice(),
				car.getId());
	}

	@Override
	public int delete(int id) {
		return JdbcTemplate.update("delete from cars where id=?", id);
	}

	@Override
	public int[] batchInsert(List<Car> list) {
		return JdbcTemplate.batchUpdate("insert into cars (model, price) values (?, ?)",
				new BatchPreparedStatementSetter() {

					@Override
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						Car car = list.get(i);
						ps.setString(1, car.getModel());
						ps.setInt(2, car.getPrice());
					}

					@Override
					public int getBatchSize() {
						return list.size();
					}
				});
	}

}
