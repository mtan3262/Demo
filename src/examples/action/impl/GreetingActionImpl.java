package examples.action.impl;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import examples.action.GreetingAction;
import examples.dto.GreetingDto;
import examples.service.GreetingService;

public class GreetingActionImpl implements GreetingAction {
    private GreetingService service;
    private GreetingDto greetingDto;
    private String greeting;
    
    public String goGreeting() {
        greeting = service.getGreeting(greetingDto);
        return SUCCESS;
    }

    public void setGreetingService(GreetingService service) {
        this.service = service;
    }

    public GreetingDto getGreetingDto() {
    	System.out.print("getGreetingDto");
        return greetingDto;
    }

    public void setGreetingDto(GreetingDto greetingDto) {
        this.greetingDto = greetingDto;
    }

    public String getGreeting() {
        return greeting;
    }
}