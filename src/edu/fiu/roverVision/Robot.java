/**
 * 
 */
package edu.fiu.roverVision;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author ozzo
 *
 */
public class Robot implements SelfCheckCapable {
	private String name;
	private int position;
	private int isOn;


	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Robot";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.25);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}
	
	/**
	 * Power On Robot
	 */
	public void powerOn() {
	}
	
	/**
	 * Power Off Robot
	 */
	public void powerOff() {
	}
	
	/**
	 * Stop Robot
	 */
	public void stop() {
	}
	
	
	
	

}
