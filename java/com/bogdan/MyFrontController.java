package com.bogdan;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/*
 * this will replace your xml file
 */
public class MyFrontController extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		// hey i want to return an array of classes
		return new Class[] { MvcConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"}; // for all the request use this
	}

}
