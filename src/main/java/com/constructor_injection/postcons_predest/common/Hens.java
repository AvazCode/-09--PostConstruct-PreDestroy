package com.constructor_injection.postcons_predest.common;

import org.springframework.stereotype.Component;

/**
 * Project name: PostCons_PreDest
 * Author: AvaZ
 * Data: 6/22/2024
 * Time: 3:39 PM
 **/
@Component
public class Hens implements Flyable{
    public Hens() {
        System.err.println(getClass().getSimpleName()+": constructed");
    }

    @Override
    public String fly() {
        return "I am Hens and I can fly";
    }
}
