package com.eikholm.jpademo10.repositories;

import com.eikholm.jpademo10.model.Dog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends PagingAndSortingRepository<Dog, Long> {

}
