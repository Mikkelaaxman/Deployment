package com.eikholm.jpademo10.service;

import com.eikholm.jpademo10.model.Dog;

import java.util.List;
import java.util.Set;

public interface DogService extends CrudService<Dog,Long> {
    public List<Dog> getOwnerlessDogs();
    public List<Dog> getDogs(int start, int number);

}
