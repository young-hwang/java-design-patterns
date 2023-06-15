package io.younghwang.basemodel._06_adapter._02_after;

import io.younghwang.basemodel._06_adapter._02_after.security.UserDetails;

public class AccountUserDetails implements UserDetails {
    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }
}
