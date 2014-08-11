package examples.action.impl;

import java.util.List;

import org.apache.log4j.Logger;

import examples.action.GreetingInputInitAction;
import examples.service.GreetingService;
@SuppressWarnings("rawtypes")
public class GreetingInputInitActionImpl implements GreetingInputInitAction {
    private GreetingService service;
  
	private List timeList;
   

    Logger logger = Logger.getLogger(GreetingInputInitActionImpl.class);
    
	public String initialize() {
		timeList = service.getTimeList();
		logger.info("Initalize");
		return null;
	}
    
    public void setGreetingService(GreetingService service) {
        this.service = service;
    }

    public List getTimeList() {
        return timeList;
    }
}