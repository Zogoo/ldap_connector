package com.connector.ldapconnector.client;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations="classpath:test.yml")
public class LdapClientFeatureTest {

    String User = "Administrator";
    String Password = "!QAZ2wsx";

    @Autowired
    private LdapClient ldapClient;

    @Test
    public void authenticate() {
        ldapClient.authenticate(User, Password);
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