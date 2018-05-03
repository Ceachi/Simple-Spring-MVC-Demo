package com.bogdan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*
 * this will replace your Dispatcher server configuration
 */

@EnableWebMvc // use annotations everywhere
@ComponentScan("com. ")// fisierul unde sunt toate controalerele
public class MvcConfig extends WebMvcConfigurerAdapter{ // te ajuta sa navighezi in aplicatie
	
}
