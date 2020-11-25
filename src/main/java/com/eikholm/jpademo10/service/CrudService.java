package com.eikholm.jpademo10.service;

import java.util.Optional;
import java.util.Set;

public interface CrudService<T, ID> { // super interface til flere services
    Set<T> findAll();
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
    Optional<T> findById(ID id);
}
