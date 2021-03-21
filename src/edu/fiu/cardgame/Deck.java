/**
 * 
 */
package edu.fiu.cardgame;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author ozzo
 *
 */
public class Deck implements SelfCheckCapable {
	String brand;
	String material;
	
	/**
	 * This is shuffle method - it takes the cards and changes the order.
	 */
	void shuffle() {
		
	}
	
	/**
	 * A draw that picks the top card from the deck
	 * @return
	 */
	Card draw() {
		return null;
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My deck";
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

}
