package com.aula114.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService(){

        UserDetails admin = User
                                .withUsername("Cassiano")
                                .password("$2a$10$CXvgjXLPCN.Ti4uKwT0gme48yWGJmVXsA6UJy8Npopq3wEK.sVBd.")
                                .roles("ADMIN")
                                .build();

        UserDetails user = User
                                .withUsername("José")
                                .password("$2a$10$CXvgjXLPCN.Ti4uKwT0gme48yWGJmVXsA6UJy8Npopq3wEK.sVBd.")
                                .roles("USER")
                                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
            .authorizeRequests().antMatchers("/","/home").permitAll()
            .mvcMatchers("/cpanel").hasRole("ADMIN").anyRequest().authenticated()
            .and()
            .formLogin()
                .loginPage("/login")
                .usernameParameter("u").passwordParameter("p")
                .permitAll()
                .failureUrl("/loginerror")
                .defaultSuccessUrl("/loginsuccess")
                .and()
            .logout().permitAll()
            .logoutSuccessUrl("/logoutsuccess")
            .and()
            .exceptionHandling().accessDeniedPage("/403");

    }

}
