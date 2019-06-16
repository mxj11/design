package com.lxz.design.chain;

public class ClientTest {
    public static void main(String[] args) {
        Request request = new Request();
        Response response = new Response();
        FilterChain chain = new FilterChain();
        chain.addFilter(new SensitiveFilter());
        chain.addFilter(new HtmlFilter());
        chain.doFilter(request, response, chain);
    }
}
