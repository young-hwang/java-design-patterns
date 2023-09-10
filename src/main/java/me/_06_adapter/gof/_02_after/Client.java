package me._06_adapter.gof._02_after;

import me._06_adapter.gof._02_after.security.LoginHandler;

public class Client {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        AccountUserDetailsService accountUserDetailsService = new AccountUserDetailsService(accountService);

        LoginHandler loginHandler = new LoginHandler(accountUserDetailsService);
        String user = loginHandler.login("young", "young");
        System.out.println(user);
    }
}
