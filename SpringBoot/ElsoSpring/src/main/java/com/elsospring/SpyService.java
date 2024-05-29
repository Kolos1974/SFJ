package com.elsospring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
// A bean elnevezése másképp
@Service("spying")
public class SpyService {
	
	public String iSaySomething() {
		return "Én egy kém vagyok";
	}
}
