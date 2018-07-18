package com.connector.ldapconnector.service;

import com.connector.ldapconnector.settings.LdapSettings;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@PropertySource("classpath:application-test.yml")
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Autowired
    LdapSettings ldapSettings;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void authenticate() {
        userService.authenticate(ldapSettings.getPrincipal(), ldapSettings.getPassword());
    }

    @Test
    public void search() {
    }

    @Test
    public void create() {
    }

    @Test
    public void modify() {
    }
}