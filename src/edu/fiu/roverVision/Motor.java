/**
 * 
 */
package edu.fiu.roverVision;

/**
 * @author ozzo
 *
 */
public class Motor {
	
	Wheel myWheel;
	
	private int speed;
	private double velocity;
	
	public Motor() {
		myWheel = new Wheel();
	}
	
	/**
	 * Move Forward
	 */
	public void moveForward() {
		
		//Move Wheel Forward
		myWheel.wheelForward();
		
	}
	
	/**
	 * Move Backward
	 */
	public void moveBackward() {
		
	}
	/**
	 * Turn Left
	 */
	public void turnLeft() {
		
	}
	/**
	 *  Turn Right
	 */
	public void turnRight() {
		
	}
	/**
	 * Stop Motor
	 */
	public void stop() {
		
	}

}
