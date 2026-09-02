package com.joysistvi.stage1.day11;

//String Class
public class Activity9_Part2_Gonzales {

    public static void main(String[] args) {

        String country = "Philippines";
        char firstCharacter = country.charAt(0);
        char lastCharacter = country.charAt(country.length() - 1);

        int pCount = 0;
        int vowelCount = 0;


        String lowercaseCountry = country.toLowerCase();

        for (char letter : lowercaseCountry.toCharArray()) {

            if (letter == 'p') {pCount++;}
            if ("aeiou".contains(String.valueOf(letter))) {vowelCount++;}
        }

       //result
        System.out.println("Country: " + country);
        System.out.println("First character: " + firstCharacter);
        System.out.println("Last character: " + lastCharacter);
        System.out.println("Number of P/p: " + pCount);
        System.out.println("Number of vowels: " + vowelCount);




    }
}
