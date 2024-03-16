/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dehal
 */
public class Hangman implements HangmanInterface {
    private String[] words = {"pisay", "neutron", "chemistry", "bagsak", "tabang", "constitution", "mainit", "mahusay", "bigaon", "canteen"};
    private String randomWord;

    public Hangman() {
        // No initialization needed here
    }
    
    @Override
    public String generateWord() {
        int randomIndex = (int) (Math.random() * words.length);
        randomWord = words[randomIndex];
        return randomWord;
    }
    
    @Override
    public String generateBlank() {
        StringBuilder blank = new StringBuilder();
        for (int i = 0; i < randomWord.length(); i++) {
            blank.append("_ "); // Add a space after each underscore for better readability
        }
        return blank.toString();
    }
}

