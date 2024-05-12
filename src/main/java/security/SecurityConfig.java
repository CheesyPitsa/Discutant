package security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class SecurityConfig
{
    final
    MongoUserDetailsService userDetailsService;
    @Autowired
    public SecurityConfig(MongoUserDetailsService userDetailsService)
    {
        this.userDetailsService = userDetailsService;
    }
}
