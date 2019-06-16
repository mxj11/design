package com.lxz.design.chain;

public class HtmlFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("html do filter");
    }
}
