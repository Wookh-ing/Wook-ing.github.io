package Diary;

import java.time.LocalDate;

public class TestManage {
	public static void main(String[] args) {
		DiaryManage m = new DiaryManageImpl();
		
		m.add(new Diary(LocalDate.now(), "6월21일 일기", "맑음", "적을게없다"));
		
		m.add(new Diary(LocalDate.of(2022, 6, 20), "6월20일 일기", "맑음", "적을게없다2"));
		
		m.add(new Diary(LocalDate.of(2022, 6, 19), "6월19일 일기", "흐림음", "아직적을게없다2"));
		
		System.out.println(m.list());
		
		m.edit(LocalDate.now(), "수정된 내용");
		
		System.out.println(m.list().get(0).getContent());
		
		m.deleteFirst();

		System.out.println(m.list().size());
		
		System.out.println(m.list());
	}
}
