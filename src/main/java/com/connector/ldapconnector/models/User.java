package com.connector.ldapconnector.models;

import javax.naming.Name;

import lombok.*;
import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

@Data
@Builder
@NoArgsConstructor
@Entry(base = "ou=users", objectClasses = { "person", "inetOrgPerson", "top" })
public class User  {

    @Id
    private Name id;

    private @Attribute(name = "cn") String username;
    private @Attribute(name = "sn") String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return username;
    }

}