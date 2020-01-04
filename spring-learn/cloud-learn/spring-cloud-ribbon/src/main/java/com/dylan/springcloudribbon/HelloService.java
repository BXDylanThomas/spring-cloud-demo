package com.dylan.springcloudribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
	@HystrixCommand(fallbackMethod = "hiError")//指定熔断的方法
	public String hiService(String name) {
		return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
	}



	public String hiError(String name) {
		return "hi,"+name+",sorry,error!";
	}
}
