package com.telstra.assignment.repository;


import org.springframework.data.repository.CrudRepository;

import com.telstra.assignment.entity.user;
public interface UserRepository extends CrudRepository<user, Integer>{

}
