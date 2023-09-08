package com.example;

import com.example.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private final static Logger log = LoggerFactory.getLogger(Main.class);
//    private final static String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        log.info("Guess the number game");

        //create context (container)
        ConfigurableApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        //get number generator bean from context (container)
        NumberGenerator numberGenerator
                = context.getBean(NumberGenerator.class);

        //call method next() to get random number
        int number = numberGenerator.next();

        //log generated number
        log.info("number = {}", number);

        //get message generator from context (container)
        MessageGenerator messageGenerator
                = context.getBean(MessageGenerator.class);
        log.info("getMainMessage() = {}", messageGenerator.getMainMessage());
        log.info("getResultMessage() = {}", messageGenerator.getResultMessage());

        //close context
        context.close();

    }

}
