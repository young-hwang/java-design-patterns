package me._13_chain_of_responsibility.java;

import javax.servlet.*;
import java.io.IOException;

public class CoRinJava {
    public static void main(String[] args) {
        Filter filter = new Filter() {
            @Override
            public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
                chain.doFilter(request, response);
            }
        };
    }
}
