package io.github.younghwang.gofbasic._06_adapter._02_after;

import io.github.younghwang.gofbasic._06_adapter._02_after.security.LoginHandler;

public class Client {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        AccountUserDetailsService accountUserDetailsService = new AccountUserDetailsService(accountService);

        LoginHandler loginHandler = new LoginHandler(accountUserDetailsService);
        String user = loginHandler.login("young", "young");
        System.out.println(user);
    }
}
