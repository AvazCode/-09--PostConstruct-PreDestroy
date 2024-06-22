package com.constructor_injection.postcons_predest.common;

import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Project name: PostCons_PreDest
 * Author: AvaZ
 * Data: 6/22/2024
 * Time: 3:35 PM
 **/
@Component
public class Eagle implements Flyable {

    public Eagle() {
        System.err.println(getClass().getSimpleName() + ": constructed");
    }

    @Override
    public String fly() {
        return "I am the fastest bird (Eagle) in the world !";
    }
}
