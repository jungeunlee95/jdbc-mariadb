package bookshop.test;

import java.util.List;

import bookshop.dao.BookDao;
import bookshop.vo.BookVo;

public class BookDaoTest {
	public static void main(String[] args) {
		// insert
//		insert("아리랑", 2L);
//		insert("젊은그들", 5L);
//		insert("아프니깐 청춘이다", 6L);
//		insert("귀천", 7L);
//		insert("태백산맥", 2L);
//		insert("풀하우스", 8L);
		
		// select
		getListTest();
	}

	public static void insert(String title, Long authorNo) {
		BookVo vo = new BookVo();
		vo.setTitle(title);
		vo.setAuthorNo(authorNo);
		
		new BookDao().insert(vo);
		
	}

	public static void getListTest() {
		List<BookVo> list = new BookDao().getList();
		for(BookVo vo : list) {
			System.out.println(vo);
		}
	}
	
}
