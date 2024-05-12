package security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pojo.User;
import service.UserService;

@Component("userDetailsService")
public class MongoUserDetailsService implements UserDetailsService
{
    private final UserService service;
    @Autowired
    public MongoUserDetailsService(UserService userService)
    {
        this.service = userService;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = service.findByNickname(username);

        return UserDetailsImpl.build(user);
    }
}