package me._06_adapter.gof._01_before.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
