package com.elsospring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SpyService {
	
	public String iSaySomething() {
		return "Én egy kém vagyok";
	}
}
