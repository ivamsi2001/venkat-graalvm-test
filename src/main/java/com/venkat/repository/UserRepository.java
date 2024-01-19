package com.venkat.repository;

import com.venkat.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}