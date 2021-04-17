/**
 * 
 */
package edu.fiu.toweldispenser;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author ozzo
 *
 */
public class MainHousing implements SelfCheckCapable {
	
	TowelReel mytowelreel;
	StatusLight mystatuslight;
	ProxSensor myproxsensor;
	
	public MainHousing() {
		mytowelreel = new TowelReel();
		mystatuslight = new StatusLight();
		myproxsensor = new ProxSensor();
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Main Housing";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.05);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this, mytowelreel, mystatuslight, myproxsensor);
	}

	public void setup() {
		// TODO Auto-generated method stub
		mytowelreel.loadTowels();
	}

	public void activateSensors() {
		// TODO Auto-generated method stub
		mystatuslight.flashGreen();
		System.out.println("Activating Sensors");
		myproxsensor.detectPresence();
		mystatuslight.flashRed();
		mytowelreel.operateReel();
	}

}
