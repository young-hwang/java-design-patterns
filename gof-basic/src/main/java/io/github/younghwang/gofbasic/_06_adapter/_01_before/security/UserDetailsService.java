package io.github.younghwang.gofbasic._06_adapter._01_before.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
