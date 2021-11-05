package com.nagarjuna.structural.flyweight;


public class App {

    public static void main(String[] args) {
        WordProcessor processor = new WordProcessor();

        String textToAdd = "Hello i'm aaaa wwworddd pprocessorrrr";
        int length = textToAdd.length();


        LetterFactory factory = new LetterFactory();

        for(int i = 0; i<length;i++){

            String value = textToAdd.substring(i,i+1);
            processor.addLetter(factory.createLetter(value));

        }

        processor.printLetters();
    }


}
