package com.levent.constructor.injection.model.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.levent.constructor.injection.model.Team;

public class TeamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("constructor.injection.context.xml");
		
		Team manchesterCity = context.getBean("teamId", Team.class);
		
		System.out.println(manchesterCity);
		
		//manchesterCity.getPlayers().stream().forEach(System.out::println);
	}

}
