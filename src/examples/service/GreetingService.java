package examples.service;

import java.util.List;

import examples.dto.GreetingDto;

public interface GreetingService {
	List getTimeList();

    String getGreeting(GreetingDto dto);
}
