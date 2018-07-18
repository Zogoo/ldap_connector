package com.connector.ldapconnector.settings;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix="ldap")
@Configuration
@Data
@Builder
public class LdapSettings {
    private String partitionSuffix;
    private String partition;
    private String principal;
    private String password;
    private Integer port;
    private String url;
}
