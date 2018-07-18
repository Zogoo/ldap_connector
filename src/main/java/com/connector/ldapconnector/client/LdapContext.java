package com.connector.ldapconnector.client;

import com.connector.ldapconnector.settings.LdapSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;
import org.springframework.stereotype.Component;

@Component
public class LdapContext {
    @Autowired
    private LdapSettings ldapSettings;

    @Bean
    public LdapContextSource contextSource() {
        LdapContextSource contextSource = new LdapContextSource();
        contextSource.setUrl(ldapSettings.getUrl());
        contextSource.setBase(ldapSettings.getPartitionSuffix());
        contextSource.setUserDn(ldapSettings.getPrincipal());
        contextSource.setPassword(ldapSettings.getPassword());
        return contextSource;
    }

    @Bean
    public LdapTemplate ldapTemplate() {
        return new LdapTemplate(contextSource());
    }

    @Bean
    public LdapClient ldapClient() {
        return new LdapClient();
    }
}
