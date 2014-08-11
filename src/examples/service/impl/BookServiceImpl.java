package examples.service.impl;

import java.util.List;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;


import examples.dao.BookDao;
import examples.service.BookService;

public class BookServiceImpl implements BookService {
	private static final String PATH = "PagerClient.dicon";
	 
	@Override
	public List searchBook(String category) {
		S2Container container = S2ContainerFactory.create(PATH);
		BookDao dao = (BookDao) container.getComponent(BookDao.class);
		return dao.findByCategory(category);
	}
	
	

}
