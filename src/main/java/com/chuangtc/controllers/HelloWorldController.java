/*   Copyright 2014, Tzu-Cheng Chuang (http://chuangtc.com) 
 *   Licensed under the MIT license. http://opensource.org/licenses/MIT
 */
package com.chuangtc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	public String hello(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
		model.addAttribute("name", name);
		return "helloworld";
	}
}
