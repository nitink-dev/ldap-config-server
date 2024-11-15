//package com.ldapserver.auth.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.ldap.DefaultSpringSecurityContextSource;
//
//import java.util.Collections;
//
//@Configuration
//public class LdapConfig {
//
//    @Bean
//    public DefaultSpringSecurityContextSource contextSource() {
//        return new DefaultSpringSecurityContextSource(
//                Collections.singletonList("ldap://localhost:8389"), "dc=springframework,dc=org");
//    }
//}
//
