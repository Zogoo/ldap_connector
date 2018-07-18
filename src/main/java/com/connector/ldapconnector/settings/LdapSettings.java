package com.connector.ldapconnector.settings;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix="spring.ldap")
public class LdapSettings {
    private String partitionSuffix;
    private String partition;
    private String principal;
    private String password;
    private int port;
    private String url;
}
