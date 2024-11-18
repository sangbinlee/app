package com.sodi.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable);
        http
                .authorizeHttpRequests(
                        authorize -> authorize
                        	.requestMatchers("/*").permitAll()
                            .requestMatchers("/boards/**").permitAll()
                            .requestMatchers("/boards*").permitAll()
                            .requestMatchers("/members/**").permitAll()
                            .requestMatchers("/swagger-ui/**").permitAll()
                            .requestMatchers("/v3/api-docs/**").permitAll()
                            .requestMatchers("/api/v1/**").permitAll()
                            .requestMatchers("/member/join").permitAll()
                            .requestMatchers("/auth/login").permitAll()
                            .anyRequest().authenticated()
                );
        return http.build();
    }
}
