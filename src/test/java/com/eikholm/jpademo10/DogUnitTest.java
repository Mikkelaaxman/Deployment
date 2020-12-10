package com.eikholm.jpademo10;

import javax.persistence.*;

import com.eikholm.jpademo10.model.Dog;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Mikkel Åxman
 * Prøver at følge https://dzone.com/articles/unit-testing-jpastop-integration-testing
 * Unit Tests der omhandler korrekt opsætning af JPA med annotations og fields.
 */
public class DogUnitTest {
    @Test
    public void typeAnnotations(){
        //Jeg ville gerne have annotation typen og sammenligne den, men det lykkedes ikke helt
        System.out.println("DOG ANNOTATIONS : " + Arrays.stream(Dog.class.getAnnotations()).findFirst());
        assert(Arrays.stream(Dog.class.getAnnotations()).count() > 1);  // Vis at det er korrekt type annotations her i stedet.
    }

    //Burde bruge getAnnotations() men ved ikke hvordan jeg sammenligner det da jeg bare får et objektstring
    @Test
    public void fieldTests(){
        try{
            assertNotNull(Dog.class.getDeclaredField("name"));
            assertNotNull(Dog.class.getDeclaredField("id"));
            assertNotNull(Dog.class.getDeclaredField("imageUrl"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void methodTests(){
        try{
            assertTrue(Arrays.stream(Dog.class.getDeclaredMethods()).count() > 1);
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
