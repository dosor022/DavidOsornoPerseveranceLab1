/**
 * 
 */
package edu.fiu.roverVision;

import java.util.Scanner;
import java.io.*;

/**
 * @author ozzo
 *
 */
public class Transceiver {
	
	RemoteControlRobot myRemoteControl;
	Camera myCamera;
	Motor myMotor;
	Wheel myWheel;
	Computer myComputer;

	
	public Transceiver() {
		myRemoteControl = new RemoteControlRobot();
		myCamera = new Camera();
		myMotor = new Motor();
	}
	
	public  static void displayMainMenu() {
		System.out.println("");
		System.out.println("**************************************");
		System.out.println("***********CONTROL REMOTE*************");
		System.out.println("* 1) Take a Picture                  *");
		System.out.println("* 2) Move Forward                    *");
		System.out.println("* 3) Stop/Exit                       *");
		System.out.println("**************************************");
	}
	
	
	public static int AskUserInput(Scanner reader, int numAnswers) {
		// Ask the User for an action choice
		// Check that user input is between amount of options given in the question
		int vMenuAction=0;
		do {
			System.out.print("> Please choose one option (between 1 and " + numAnswers + "):");
			vMenuAction = reader.nextInt();
		}while(vMenuAction!=0 && vMenuAction>numAnswers);
		
		return vMenuAction;
	}
	
	public  void MenuInteraction(int choice, Scanner reader, String userName) throws IOException {
		// Menu interaction options and flow
		switch(choice) {
		case 1:
			//Call Camera to Take A picture
			myCamera.takePicture();
			
			//Show the menu back
			displayMainMenu();
			break;
		case 2:
			//Call the Motor->Wheels to move forward
			myMotor.moveForward();	
			
			//Show Menu Again
			displayMainMenu();
			break;
		case 3:
			//Say Bye!
			System.out.println("\n [ Thank you! " + userName + " for engaging with VISION! ]");
			//once finished
			reader.close();
			System.exit(0); 
			break;
		}
		
	}

	public void startOperation() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------");
		// Get User Input
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.print("What\'s your name?");
		String userName = reader.next(); // Scans the next token of the input.
		System.out.println("Thank you! " + userName + ", Ready to Connect?");
		System.out.println("__________________________________");
		
		//Show Remote Control Menu
		displayMainMenu();
		
		do{
			// Ask user for answer/action
			int menuAction = AskUserInput(reader,3);
			
			// Call Menu Interaction
			MenuInteraction(menuAction, reader, userName);
		}while(true);
	}

}
