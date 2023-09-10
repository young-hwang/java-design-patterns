package me._06_adapter.gof._02_after.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
