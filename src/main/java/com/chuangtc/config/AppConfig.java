/*   Copyright 2014, Tzu-Cheng Chuang (http://chuangtc.com) 
 *   Licensed under the MIT license. http://opensource.org/licenses/MIT
 */
package com.chuangtc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration //Marks this class as configuration
//Specifies which package to scan, make sure the folder is what you point to the controllers folder
@ComponentScan("com.chuangtc.controllers")
//Enables Spring's annotations
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//By doing it, css and js folder, ...etc can be easily accessed
        registry.addResourceHandler("/**").addResourceLocations("/").setCachePeriod(31556926);
    }
	
	@Bean 
	public UrlBasedViewResolver setupViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}
}