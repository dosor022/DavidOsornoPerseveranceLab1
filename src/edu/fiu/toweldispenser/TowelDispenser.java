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
public class TowelDispenser implements SelfCheckCapable {
	
	MainHousing myhousing;
	
	public TowelDispenser() {
		myhousing = new MainHousing();
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "towel dispenser";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.05);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this, myhousing);
	}
	
	
	public static void main(String[] args) {
		TowelDispenser mydispenser = new TowelDispenser();
		mydispenser.runSelfCheck();
		mydispenser.startOperation();
	}

	private void startOperation() {
		// TODO Auto-generated method stub
		myhousing.setup();
		myhousing.activateSensors();
	}

}
