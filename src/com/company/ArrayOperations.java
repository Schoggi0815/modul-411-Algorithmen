package com.company;

public class ArrayOperations {
    private static final double[] temps = { 13.5, 18.4, 19.6, 21.4, 17.6, 18.3 };

    public static void printAll(){
        for (double temp : temps) {
            System.out.println(temp);
        }
    }

    public static double highestTemp(){
        double highest = Double.MIN_VALUE;

        for (double temp : temps) {
            if (temp > highest){
                highest = temp;
            }
        }

        return highest;
    }

    public static double lowestTemp(){
        double lowest = Double.MAX_VALUE;

        for (double temp : temps) {
            if (temp < lowest){
                lowest = temp;
            }
        }

        return lowest;
    }

    public static void printDiff(){
        System.out.println(highestTemp() - lowestTemp());
    }

    public static boolean isPalindrome(String text){
        int loopTime = text.length() / 2;

        for (int i = 0; i < loopTime; i++){
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)){
                return false;
            }
        }

        return true;
    }
}
