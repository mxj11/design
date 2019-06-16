package com.lxz.design.chain;

public class SensitiveFilter implements Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        chain.doFilter(request,response,chain);
    }
}
