package com.test.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RouteFilter extends ZuulFilter {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public String filterType() {
        return "route";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        log.debug("Route Filter");
        return null;
    }
}

