/**
 * 
 */
package edu.fiu.roverVision;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author ozzo
 *
 */
public abstract class Sensor implements SelfCheckCapable {
	
	private int voltage;
	private double units;
	
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * Get Sensor Reading
	 */
	public void getReading() {
		
	}
	
	/**
	 * Calibrate
	 */
	public void calibrate() {
		
	}
	
	/**
	 * Stop wheel
	 */
	public void wheelStop() {
		
	}

}
