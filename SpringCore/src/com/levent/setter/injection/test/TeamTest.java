package com.levent.setter.injection.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.levent.setter.injection.model.Team;

public class TeamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("setter.injection.context.xml");
		
		Team manchesterCity = context.getBean("teamId", Team.class);
		
		System.out.println(manchesterCity);
	}

}
