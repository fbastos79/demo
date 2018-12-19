package com.example.demo.service;

import com.example.demo.model.Greetings;
import com.example.demo.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    /*
    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
}*/

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Greetings> getGreetings() {
        List<Greetings> todoList = greetingRepository.findGreetings();
        for (Greetings todo : todoList) {
            System.out.println(todo);
        }
        return todoList;

    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public Greetings getGreeting(long id) {

        return greetingRepository.findById(id).orElseThrow(() -> new RuntimeException("id"));

    }


    @Transactional(propagation = Propagation.MANDATORY)
    public Greetings create(Greetings greetings) {
        return greetingRepository.save(greetings);
    }

}