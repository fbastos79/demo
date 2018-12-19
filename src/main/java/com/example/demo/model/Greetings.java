package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Greetings {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  long id;

    @Column private  String content;

    public Greetings(){}

        public Greetings(Long id, String content) {
            this.id = id;
            this.content = content;
        }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
