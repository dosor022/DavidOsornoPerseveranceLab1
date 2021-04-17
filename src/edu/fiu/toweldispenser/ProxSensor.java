/**
 * 
 */
package edu.fiu.toweldispenser;

/**
 * @author ozzo
 *
 */
public class ProxSensor extends Sensor {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Bosch Proximity Sensor";
	}

	public void detectPresence() {
		// TODO Auto-generated method stub
		System.out.println("Waiting for proximity");
		
		
		System.out.println("Proximity Detected!!");
	}
	
	

}
