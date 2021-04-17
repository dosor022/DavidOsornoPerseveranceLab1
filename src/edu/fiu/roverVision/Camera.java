/**
 * 
 */
package edu.fiu.roverVision;

/**
 * @author ozzo
 *
 */
public class Camera extends Sensor {

	/**
	 * 
	 */
	public Camera() {
		// TODO Auto-generated constructor stub
		int cStatus; // 0=Good, 1=Error
		int resolution; 
		

		
		
	}
	
	/**
	 * Take picture
	 */
	public void takePicture() {
		System.out.println("\n");
		System.out.println(":):):):):):):):):):):):):):):):):)");
		System.out.println(".... Smile for the Camera!........");
		System.out.println("----------------------------------");
		System.out.println("********[ PICTURE TAKEN ]*********");
		System.out.println("(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:");
		System.out.println("\n");
	}
	
	/**
	 * Clean up
	 */
	public void cleanUp() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Canon Camera";
	}

	

}
