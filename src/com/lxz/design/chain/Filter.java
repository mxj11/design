package com.lxz.design.chain;

public interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);
}
