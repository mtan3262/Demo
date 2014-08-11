package examples.action.impl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import examples.action.ChangeAction;

@Resource
public class ChangeActionImpl extends Action implements ChangeAction {
	Logger logger = Logger.getLogger(getClass());
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
		
			System.out.println("hello "+req.getParameter("user"));
			return mapping.findForward(SUCCESS) ;
	}
	
}
