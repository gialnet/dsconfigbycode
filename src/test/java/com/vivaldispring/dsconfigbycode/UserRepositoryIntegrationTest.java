package com.vivaldispring.dsconfigbycode;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryIntegrationTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void whenCalledSave_thenCorrectNumberOfUsers() {
        userRepository.save(new Users(0L,"Bob", "bob@domain.com"));
        List<Users> users = (List<Users>) userRepository.findAll();

        Assert.assertEquals(1, users.size());
    }
}
