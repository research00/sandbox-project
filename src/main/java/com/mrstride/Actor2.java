package com.mrstride;

import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Actor2 implements MyBehavior {
    public void act() {
        System.out.println("I can act too!");
    }

    public boolean earnAnOscar(Logger logger) {
        logger.info("I earned an Oscar as Actor2!");
        return true;
    }
}
