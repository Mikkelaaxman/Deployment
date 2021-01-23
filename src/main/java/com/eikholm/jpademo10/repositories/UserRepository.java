package com.eikholm.jpademo10.repositories;

import com.eikholm.jpademo10.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
