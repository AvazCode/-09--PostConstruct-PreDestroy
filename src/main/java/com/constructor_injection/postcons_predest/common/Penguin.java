package com.constructor_injection.postcons_predest.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Project name: PostCons_PreDest
 * Author: AvaZ
 * Data: 6/22/2024
 * Time: 3:37 PM
 **/
@Component
public class Penguin implements Flyable{

    @Override
    public String fly() {
        return " Although i am a bird, i can't fly !";
    }

    @PostConstruct
    public void initial(){
        System.err.println("Penguin initial ->" + getClass().getSimpleName());
    }

    @PreDestroy
    public void end(){
        System.err.println("Penguin end ->" + getClass().getSimpleName());
    }
}
