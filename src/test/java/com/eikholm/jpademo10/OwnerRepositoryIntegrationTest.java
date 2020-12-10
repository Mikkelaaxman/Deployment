package com.eikholm.jpademo10;

import com.eikholm.jpademo10.model.Owner;
import com.eikholm.jpademo10.repositories.OwnerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class OwnerRepositoryIntegrationTest {
    @Autowired
    private OwnerRepository ownerRepository;

    @Test
    public void whenCalledSave_thenCorrectNumberOfUsers() {
        ownerRepository.save(new Owner());
        List<Owner> owners = (List<Owner>) ownerRepository.findAll();

        assertTrue(owners.size()>1);

    }
}