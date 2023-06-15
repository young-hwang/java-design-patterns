package io.younghwang.basemodel._06_adapter._01_before.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
