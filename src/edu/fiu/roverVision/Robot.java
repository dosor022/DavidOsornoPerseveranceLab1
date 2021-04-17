/**
 * 
 */
package edu.fiu.roverVision;

import java.io.IOException;

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
	
	
	Motor myMotor;
	Wheel myWheel;
	Computer myComputer;
	Transceiver myTransceiver;
	
	public Robot() {
		
		myComputer = new Computer();
		
	}


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
	 * @throws IOException 
	 */
	public void powerOn() throws IOException {
		
		//Check System is good-to-go!
		System.out.println("Vision is Alive");
		runSelfCheck();
		
		//Start operation from the user's remote control
		Transceiver myTransceiver = new Transceiver();
		myTransceiver.startOperation();
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
