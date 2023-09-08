package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator {

    // --fields--
    @Autowired
   private final Random random = new Random();
   private int maxNumber = 100;

   //--public method--
    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}
