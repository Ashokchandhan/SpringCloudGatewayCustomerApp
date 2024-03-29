package com.app.filter;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ErrorFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {

		return false;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("from Error Filter");
		return null;
	}

	@Override
	public String filterType() {
		//return "error
		return FilterConstants.ERROR_TYPE;
	}

	@Override
	public int filterOrder() {

		return 0;
	}

}
