/**
 * 
 */
package edu.fiu.roverVision;

/**
 * @author ozzo
 *
 */
public class Battery {	
	private double percentCharge;
	private int criticalLevel;
	
	
	/**
	 * Get Battery Charger
	 */
	public double getPercentCharge() {
		return percentCharge;
	}

	
	/**
	 * Get Battery Charger
	 */
	public int getTimeRem() {
		return criticalLevel;
	}
	
}
