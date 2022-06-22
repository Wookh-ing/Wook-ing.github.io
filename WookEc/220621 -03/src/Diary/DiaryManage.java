package Diary;

import java.time.LocalDate;
import java.util.List;

public interface DiaryManage {
	void add(Diary d); // 일기등록하기
	List<Diary> list();	   // 목록보기
	void edit(LocalDate day, String content); // 날짜를 받아 내용 수정
	void deleteFirst();// 삭제 , 오래된 순으로
}


