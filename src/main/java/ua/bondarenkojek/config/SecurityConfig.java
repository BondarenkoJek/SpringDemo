package ua.bondarenkojek.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
@ComponentScan("ua.bondarenkojek")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/developers/")
                .hasAnyAuthority("DEVELOPER", "ADMIN", "TEAM_LEAD")

                .antMatchers("/developers/**")
                .hasAnyAuthority("ADMIN", "TEAM_LEAD")

                .antMatchers("/projects/")
                .hasAnyAuthority("DEVELOPER", "ADMIN", "TEAM_LEAD", "CUSTOMER")

                .antMatchers("/projects/**")
                .hasAnyAuthority("ADMIN", "CUSTOMER")

                .antMatchers("/resources/**", "/registration").permitAll()
                .antMatchers("/**").authenticated()
                .and()
                .formLogin()
                .usernameParameter("login")
                .passwordParameter("password")
                .defaultSuccessUrl("/")
                .loginPage("/login")
                .permitAll();
//                .and()
//                .rememberMe()
//                .rememberMeParameter("remember-me").userDetailsService(userDetailsService)
//                .tokenRepository(tokenRepository());

    }

    @Bean
    public PersistentTokenRepository tokenRepository() {
        JdbcTokenRepositoryImpl tokenRepository = new JdbcTokenRepositoryImpl();
        tokenRepository.setDataSource(dataSource);
        return tokenRepository;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
