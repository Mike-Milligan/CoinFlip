
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.mikemilligan.Coin;

import static org.junit.jupiter.api.Assertions.*;

public class TestCoin {
	@Test
	@DisplayName("Starts as HEADS")
	public void testInitialState() {
		Coin coin = new Coin();
		// Coin shoUld start as HEADS
		assertEquals(Coin.Face.HEADS, coin.getFace());
	}
	
	@Test
	@DisplayName("HEADS or TAILS")
	public void testFlip() {
		Coin coin = new Coin();
		coin.flip();
		// Coin should be facing either HEADS or TAILS only
		assertTrue(coin.getFace() == Coin.Face.HEADS
				|| coin.getFace() == Coin.Face.TAILS);
	}
	
	@Test
	@DisplayName("Remembers Face")
	public void testConsistency() {
		Coin coin = new Coin();
		coin.setFace(Coin.Face.TAILS);
		// Coin should remember which way it's facing
		assertEquals(Coin.Face.TAILS, coin.getFace());
	}
	
	@Test
	@DisplayName("Distribution in 100 Coin Flips")
	public void testMultipleFlips() {
		Coin coin = new Coin();
		//Number of Flips
		int numFlips = 100;
		//Number of Heads in 100 Flips
		int numHeads = 0;
		for (int i = 0; i < numFlips; i++) {
			coin.flip();
			if (coin.getFace() == Coin.Face.HEADS) {
				numHeads++;
			}
		}
		// Calculate probability to flip that many heads
		double probability = (double) numHeads / (double) numFlips;
		
		// Assuming a fair coin, probability for heads in 100 flips is 0.5
		double expectedProbability = 0.5;
		double tolerance = 0.1; //Tolerance for randomness
		
		// Check that calculated probability is within the expected range 40-60
		assertTrue(Math.abs(probability - expectedProbability) < tolerance);
	}
}
