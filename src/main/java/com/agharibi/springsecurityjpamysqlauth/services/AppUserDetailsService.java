package com.agharibi.springsecurityjpamysqlauth.services;

import com.agharibi.springsecurityjpamysqlauth.models.AppUserDetails;
import com.agharibi.springsecurityjpamysqlauth.models.User;
import com.agharibi.springsecurityjpamysqlauth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AppUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = this.userRepository.findByUserName(userName)
            .orElseThrow(() -> new UsernameNotFoundException("Invalid user for [ " + userName + " ] userName."));
        return new AppUserDetails(user);
    }
}
