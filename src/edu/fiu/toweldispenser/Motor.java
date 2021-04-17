/**
 * 
 */
package edu.fiu.toweldispenser;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author ozzo
 *
 */
public class Motor implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Motor";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	public void run(int i) {
		// TODO Auto-generated method stub
		System.out.println("Running motor for " + i + " seconds");
	}

}
