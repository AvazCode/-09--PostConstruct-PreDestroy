package com.constructor_injection.postcons_predest.rest;

import com.constructor_injection.postcons_predest.common.Flyable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project name: PostCons_PreDest
 * Author: AvaZ
 * Data: 6/22/2024
 * Time: 3:16 PM
 **/
@RestController
public class Controller {

    private final Flyable flyable;

    @Autowired
    public Controller(@Qualifier("penguin") Flyable theFlyable) {
        flyable = theFlyable;
    }

    @GetMapping("/")
    public String Flyable() {
        return flyable.fly();
    }

}
