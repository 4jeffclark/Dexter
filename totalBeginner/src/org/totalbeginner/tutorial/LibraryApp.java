package org.totalbeginner.tutorial;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Console console=System.console();
	    String username = null;
	    
	    
		Person p = new Person();
		System.out.println(p.getName());
		
		
	    System.out.print("Please enter user name : ");
	    try {
	        username = reader.readLine();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    System.out.println("You entered : " + username);
	    
        System.out.println(System.getProperty("user.dir"));
        File file = new File("file.txt");
        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                int i = sc.nextInt();
                System.out.println(i);
            }
            sc.close();
        } catch (Exception e) {
        System.out.println(e);
        }

	}
	
	
}
