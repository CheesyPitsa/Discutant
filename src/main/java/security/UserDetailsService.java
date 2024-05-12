package security;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface UserDetailsService
{
    UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException;
}