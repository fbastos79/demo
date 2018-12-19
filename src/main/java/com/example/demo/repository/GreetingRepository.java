package com.example.demo.repository;

import com.example.demo.model.Greetings;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface GreetingRepository extends org.springframework.data.jpa.repository.JpaRepository<Greetings,Long> {

    @Query("SELECT con FROM Greetings con  ")
    public List<Greetings> findGreetings();

    public Optional<Greetings> findById(Long id);


}

