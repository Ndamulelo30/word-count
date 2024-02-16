/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wordcount;

/**
 *
 * @author Sanele
 */


public class App {

    public static void main(String[] args){ 
        
     String text = "Hello, this is a sample text to count the number of words.";

        // Split the text into words based on whitespace
        String[] words = text.split("\\s+");

        // Count the number of words
        int wordCount = words.length;

        System.out.println("The number of words in the text is: " + wordCount);
    }
}
