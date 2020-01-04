package com.dylan.springcloudribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/1/4 19:07
 */
@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;

	/**
	 * 调用service-hi的 hi接口
	 * @param name
	 * @return
	 */
	public String hiService(String name) {
		return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
	}
}
