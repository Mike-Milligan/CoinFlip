package org.mikemilligan;

import picocli.CommandLine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CoinFlip implements Runnable {
	@CommandLine.Option(
			names = {"-f", "--flips"},
			description = "The number of times to flip the coin")
	private int flips = 1;
	
	/**
	 * Returns the results of a given number of Coin flips
	 * @return a List containing the result of each Coin flip
	 */
	public List<Coin.Face> flipCoin() {
		List<Coin.Face> results = new ArrayList<>();
		// Create a new Coin to flip
		Coin coin = new Coin();
		// Flip the Coin the given number of times and store the results
		for (int i = 0; i < this.flips; i++) {
			coin.flip();
			results.add(coin.getFace());
		}
		return results;
	}
	
	/**
	 * Tell the user how many times we will flip the Coin, show the result of
	 * each flip, then tally the totals for HEADS and TAILS
	 * @param results a List containing the results of all the Coin flips
	 */
	public void displayResults(List<Coin.Face> results) {
		// Show the user how many times we will flip the Coin
		showHeader();
		// Show the outcome of each flip
		showFlips(results);
		// Show the total number of times that HEADS and TAILS were flipped
		showTotal(results);
	}
	
	/**
	 * Show the user how many times we will be flipping the Coin
	 */
	public void showHeader() {
		switch (this.flips) {
			case 1:
				System.out.println("Flipping the coin once.");
				break;
			case 2:
				System.out.println("Flipping the coin twice.");
				break;
			case 3:
				System.out.println("Flipping the coin thrice.");
			default:
				System.out.println("Flipping the coin " + this.flips + " " +
						"times.");
		}
	}
	
	/**
	 * Show the user the result of each Coin flip
	 * @param results a List containing the results of all the Coin flips
	 */
	public void showFlips(List<Coin.Face> results) {
		int numDigits = String.valueOf(this.flips).length();
		String format = "%" + numDigits + "d";
		for (int i = 1; i <= this.flips; i++) {
			System.out.println(String.format(format, i) + ". " + results.get(i - 1));
		}
	}
	
	/**
	 * Show the user how many times the Coin landed on HEADS and TAILS
	 * @param results a List containing the results of all the Coin flips
	 */
	public void showTotal(List<Coin.Face> results) {
		// Count how many times we got HEADS and TAILS
		int numHeads = Collections.frequency(results, Coin.Face.HEADS);
		int numTails = Collections.frequency(results, Coin.Face.TAILS);
		// Show the user the totals
		System.out.println("Number of Heads: " + numHeads);
		System.out.println("Number of Tails: " + numTails);
	}
	
	public void run() {
		List<Coin.Face> results = flipCoin();
		
		displayResults(results);
	}
	
	public static void main(String[] args) {
		int exitCode = new CommandLine(new CoinFlip()).execute(args);
		System.exit(exitCode);
	}
}