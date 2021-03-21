/**
 * 
 */
package edu.fiu.cardgame;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author ozzo
 *
 */
public class Card implements SelfCheckCapable {
	
	int value;
	int suit;
	
	/**
	 * Shows the card on the display
	 */
	void show() {
		
	}
	
	/**
	 *  flips the card so it cannot be seen
	 */
	void flip() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

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

}
