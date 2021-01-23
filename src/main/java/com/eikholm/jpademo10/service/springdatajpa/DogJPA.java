package com.eikholm.jpademo10.service.springdatajpa;

import com.eikholm.jpademo10.model.Dog;
import com.eikholm.jpademo10.repositories.DogRepository;
import com.eikholm.jpademo10.service.DogService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DogJPA implements DogService {
    private final DogRepository dogRepository;

    public DogJPA(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public Set<Dog> findAll() {
        Set<Dog> dogs = new HashSet<>();
        dogRepository.findAll().forEach(dogs::add);

        return dogs;
    }

    @Override
    public Dog save(Dog object) {
        return dogRepository.save(object);
    }

    @Override
    public void delete(Dog object) {
        dogRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        dogRepository.deleteById(aLong);
    }

    @Override
    public Optional<Dog> findById(Long aLong) {
        return dogRepository.findById(aLong);
    }


    @Override
    public List<Dog> getOwnerlessDogs() {
        List<Dog> list = new ArrayList<>();
        dogRepository.findAll().forEach(dog -> {
            if(dog.getOwner() == null){
                list.add(dog);
            }
        });
        return list;
    }

    @Override
    public List<Dog> getDogs(int start, int number) {
        List<Dog> list = new ArrayList<>();

        //Pageable getNDogs = PageRequest.of(start,number, Sort.by("name"));
        dogRepository.findAll().forEach(list::add);
        return list;
    }
}
