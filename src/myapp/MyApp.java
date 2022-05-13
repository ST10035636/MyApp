/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myapp;

/**
 *
 * @author Ayanda
 */
import java.util.Scanner;
public class MyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);
		int number = 0;
		do {
			System.out.println("Enter number of blankets you want to distribute today: ");
			number = input.nextInt();
		} while (number != number);
		System.out.println("You have 1 blanket left!");
	}
    
}
