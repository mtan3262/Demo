package examples.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.logging.LogFactory;

import examples.dto.GreetingDto;
import examples.service.GreetingService;

public class GreetingServiceImpl implements GreetingService {
    private static final String AM = "a.m.";
    private static final String PM = "p.m.";


    public List getTimeList() {
        List result = new ArrayList();
        result.add(AM);
        result.add(PM);
        return result;
    }

    public String getGreeting(GreetingDto dto) {
    	System.out.print("greeting: " + dto.getTime());
        if (AM.equals(dto.getTime())) {
            return "Good morning";
        }
        if (PM.equals(dto.getTime())) {
            return "Good evening";
        }
        return "";
    }
}