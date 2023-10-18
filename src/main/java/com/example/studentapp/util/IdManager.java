package com.example.studentapp.util;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class IdManager {
    private final static String CHAR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$";

    public String generate(int length,String prefix){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(prefix);
        stringBuilder.append("-");

        for (int i=0;i<length;i++){
            stringBuilder.append(
                    CHAR.charAt(new Random().nextInt(64))
            );
        }
        return stringBuilder.toString();
    }
}
