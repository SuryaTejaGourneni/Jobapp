package com.example.jobapp.repo;
 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.jobapp.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(name = "User.findByUsername")
    User findByUsername(@Param("username") String username);
}
