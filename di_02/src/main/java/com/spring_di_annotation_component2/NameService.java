package com.spring_di_annotation_component2;

import org.springframework.stereotype.Service;

@Service
public class NameService implements INameService {
	
	@Override
	public String showName(String name) {
		System.out.println("NameService showName() 메소드");
		String myName ="내 이름은 "+name+"입니다.";
		return myName;
	}
}
