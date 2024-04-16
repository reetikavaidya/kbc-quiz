package com.kbc;

import java.util.Scanner;

public class KBC {
	 private static Scanner s=new Scanner(System.in);
	public void quiz() {
		System.out.println("Do you want to start the KBC:1 yes 2 no");
		int i = s.nextInt();
		 switch (i) {
         case 1:
             startQuiz();
             break;
         case 2:
             System.out.println("Exit.");
             break;
         default:
             System.out.println("Invalid choice. Please choose 1 or 2.");
             break;
		 }
     }
	
	public static void startQuiz() {
		        System.out.println("I welcome you to KBC. ALL THE BEST!");
		        System.out.println("HIGHEST SCORE OF KBC IS 310");

		        System.out.println("Select: 1) Demo  2) Start Quiz");
		        int choice = s.nextInt();

		        switch (choice) {
		            case 1:
		                demoQuiz();
		                break;
		            case 2:
		                actualQuiz();
		                break;
		            default:
		                System.out.println("Invalid choice. Please choose 1 or 2.");
		                break;
		        }
		        }
	public static void demoQuiz() {
		System.out.println("Demo Started");
        askQuestion("What is the major language spoken in India?", "Hindi", 10);
        askQuestion("What is state flower of Haryana?", "Lotus", 30);
	}
	
	  public static void actualQuiz() {
	        // Actual quiz questions
	        System.out.println("Started Quiz");
	        askQuestion("Which planet is known as the Red Planet?\r\n"
	        		+ "a) Venus\r\n"
	        		+ "b) Mars\r\n"
	        		+ "c) Jupiter\r\n"
	        		+ "d) Saturn", "Mars", 10);
	        askQuestion("Who wrote the famous play \"Romeo and Juliet\"?\r\n"
	        		+ "a) William Shakespeare\r\n"
	        		+ "b) Charles Dickens\r\n"
	        		+ "c) Jane Austen\r\n"
	        		+ "d) Mark Twain", "Charles Dickens", 30);
	        askQuestion("What is the chemical symbol for water?\r\n"
	        		+ "a) H2O\r\n"
	        		+ "b) CO2\r\n"
	        		+ "c) NaCl\r\n"
	        		+ "d) O2", "H2O", 50);
	        askQuestion("Which country is known as the Land of the Rising Sun?\r\n"
	        		+ "a) China\r\n"
	        		+ "b) Japan\r\n"
	        		+ "c) South Korea\r\n"
	        		+ "d) Vietnam", "South Korea", 70);
	        askQuestion("Which animal is known as the \"King of the Jungle\"?\r\n"
	        		+ "a) Lion\r\n"
	        		+ "b) Elephant\r\n"
	        		+ "c) Tiger\r\n"
	        		+ "d) Gorilla", "Lion", 90);
	        
	       
	    }
	  public static void askQuestion(String question, String correctAnswer, int points) {
	        System.out.println(question);
	        s.nextLine(); 
	        String answer = s.nextLine();

	        if (answer.equalsIgnoreCase(correctAnswer)) {
	            System.out.println("Correct! You win " + points + " points.");
	        } else {
	            System.out.println("Sorry, wrong answer. Better luck next time!");
	        }
	  
	
}
}
