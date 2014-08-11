package examples.action.impl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import examples.action.AddAction;
import examples.form.AddForm;
import examples.service.AddService;


public class AddActionImpl extends Action implements AddAction {
	
	@Resource
	AddService addService;
	
	Logger logger = Logger.getLogger(getClass());

	public void setChangeService(AddService addService) {
		this.addService = addService;
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
		
		//LoginForm login = (LoginForm) form;
		AddForm change = (AddForm) form;
		
		logger.info(change);
		
		req.setAttribute("user", change);
		int result = addService.AddResult(change.getNumber1(),change.getNumber2());
		change.setResult(result);
			return mapping.findForward(SUCCESS); 
		
	}
}
