package com.company;

import java.util.Random;

public class SheLovesMe {
    public static void sheLovesMe(){
        Random random = new Random();
        int leaves = random.nextInt(10);
        boolean love = random.nextBoolean();

        for (int i = 0; i < leaves; i++){
            System.out.println(love ? "Sie liebt mich!" : "Sie liebt mich nicht!");
            love = !love;
        }
    }
}
