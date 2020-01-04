package com.dylan.springcloudfeign;

import org.springframework.stereotype.Component;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/1/4 19:41
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}
}
