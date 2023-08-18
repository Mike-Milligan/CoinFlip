package org.mikemilligan;

import java.util.Random;
public class Coin {
	private Face face;
	private final Random random = new Random();
	
	/**
	 * Two sides of the same coin
	 */
	public enum Face {
		HEADS, TAILS
	}
	
	public Coin() {
		this.face = Face.HEADS;
	}
	
	/**
	 * Set the Face of the coin to the one given
	 * @param face the new Face value
	 */
	public void setFace(Face face) {
		this.face = face;
	}
	
	/**
	 * Gets the Coins current Face value
	 * @return the current Face
	 */
	public Face getFace() {
		return this.face;
	}
	
	/**
	 * Randomly assigns a new Face to the Coin
	 */
	public void flip() {
		// Generate 0 or 1
		int result = random.nextInt(2);
		
		// 0 is HEADS
		if (result == 0) {
			setFace(Face.HEADS);
		// 1 is TAILS
		} else {
			setFace(Face.TAILS);
		}
		
	}
	
}
