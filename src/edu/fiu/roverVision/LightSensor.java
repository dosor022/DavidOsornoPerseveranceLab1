/**
 * 
 */
package edu.fiu.roverVision;

/**
 * @author ozzo
 *
 */
public abstract class LightSensor extends Sensor {

	private int triggerLevel;
	/**
	 * 
	 */
	public LightSensor() {
		// TODO Auto-generated constructor stub
		 
	}

	/**
	 * Activate Sensor
	 */
	public void activate() {
		
	}
	
	/**
	 * Clean memory
	 */
	public void cleanUp() {
		
	}
	
	
	/**
	 * Get Trigger Level
	 */
	public int getValue() {
		return triggerLevel; 
	}
}
