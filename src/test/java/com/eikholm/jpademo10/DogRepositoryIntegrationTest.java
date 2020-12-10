package com.eikholm.jpademo10;


import com.eikholm.jpademo10.model.Dog;
import com.eikholm.jpademo10.repositories.DogRepository;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import static org.junit.Assert.assertNotNull;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class DogRepositoryIntegrationTest {
    @Autowired private DataSource dataSource;
    @Autowired private JdbcTemplate jdbcTemplate;
    @Autowired private EntityManager entityManager;
    @Autowired private DogRepository dogRepository;

    //Forstår ikke hvorfor det her ikke virker
    @Test
    public void injectedComponentsAreNotNull(){
        assertNotNull(dataSource);
        assertNotNull(jdbcTemplate);
        assertNotNull(entityManager);
        assertNotNull(dogRepository);
    }
    //Forstår ikke hvorfor det her ikke virker
    @Test
    public void whenSaved_thenFindsById() {


        // dogRepository.findById((long) Math.random()); Måske for at finde et ID der ikke er i brug
        Dog testDog = new Dog();

        testDog.setId((long)999);
        testDog.setName("Test Dog");

        //Ellers ved jeg der findes en getLastId() metode som er god til at teste auto-incrementing IDs
        dogRepository.save(testDog);
        assertNotNull(dogRepository.findById((long) 999));
        dogRepository.delete(testDog);
    }
}