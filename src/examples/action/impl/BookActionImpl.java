package examples.action.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import examples.action.BookAction;
import examples.service.BookService;


public class BookActionImpl extends Action implements BookAction {
	
	BookService bookservice;
	public void setBookService(BookService bookService) {
		this.bookservice = bookService;
	}
public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
		
	String category = req.getParameter("category");
	List books = bookservice.searchBook(category);
    req.setAttribute("books", books);	
	return mapping.findForward(SUCCESS) ;
		
	}

}
