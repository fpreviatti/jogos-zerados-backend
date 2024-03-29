//package com.projeto.jogoszerados.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//
//import java.util.Arrays;
//
//@EnableWebSecurity
//@Configuration
//public class SpringSecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        http.csrf().disable()
//                .authorizeRequests()
//                .requestMatchers(HttpMethod.OPTIONS, "/**")
//                .permitAll()
//                //.requestMatchers("/h2-console/**").permitAll()
//                //.requestMatchers("/zerados").hasAuthority("user")
//                .and()
//                .headers().frameOptions().sameOrigin()
//                .and()
//                .httpBasic();
//
//        return http.build();
//    }
//
//    /*@Autowired
//    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
//
//        auth.inMemoryAuthentication()
//                .withUser("admin")
//                .password("admin")
//                .authorities("ADMIN");
//
//        auth.inMemoryAuthentication()
//                .withUser("user")
//                .password("user")
//                .authorities("USER");
//    }*/
//
//}