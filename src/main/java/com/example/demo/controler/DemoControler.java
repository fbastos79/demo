package com.example.demo.controler;

import com.example.demo.model.Greetings;
import com.example.demo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DemoControler {


    @Autowired
    private GreetingService greetingService;

    @RequestMapping(path = "/greetings", method = RequestMethod.GET)
        public List<Greetings> getGreetings(){

            return greetingService.getGreetings();
        }

    @Transactional(propagation = Propagation.REQUIRED)
    @RequestMapping(path = "/greetings", method = RequestMethod.POST)
    public Greetings createGreetings(@RequestBody Greetings greeting){
        Greetings greetingRes = greetingService.create(greeting);
       return greetingRes;

    }

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String test(){
        return "OK";

    }

}
