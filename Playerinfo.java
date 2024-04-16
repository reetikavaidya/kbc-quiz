package com.kbc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class Playerinfo {

    public void player() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter name, gender, phone number, age & date of birth of player ");
        String name = "", gender = "", phoneno = "", dob = "";
        int age = 0;

        try {
            name = br.readLine();
            gender = br.readLine();
            phoneno = br.readLine();
            age = Integer.parseInt(br.readLine());
            dob = br.readLine();
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age format: " + e.getMessage());
        }

        System.out.println("Player Information:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneno);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dob);

        // Save info to file
        try (
        		Writer f1 = new FileWriter("H:\\java project\\Remarkskill\\kbc\\FileData\\Userdata.txt", true);
             BufferedWriter w = new BufferedWriter(f1)) {
            w.write("Name: " + name + "\n");
            w.write("Gender: " + gender + "\n");
            w.write("Phone Number: " + phoneno + "\n");
            w.write("Age: " + age + "\n");
            w.write("Date of Birth: " + dob + "\n");
            System.out.println("Player information has been saved to Userdata.txt");
        } catch (IOException e) {
            System.out.println("Error saving player information to file: " + e.getMessage());
        }
    }
}
