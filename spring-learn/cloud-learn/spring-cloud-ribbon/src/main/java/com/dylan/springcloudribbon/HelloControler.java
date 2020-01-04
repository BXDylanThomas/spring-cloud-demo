package com.dylan.springcloudribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/1/4 19:08
 */
@RestController
public class HelloControler {

	@Autowired
	HelloService helloService;

	@GetMapping(value = "/hi")
	public String hi(@RequestParam String name) {
		return helloService.hiService( name );
	}
}
