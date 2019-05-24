package js;

import java.util.Arrays;

public class Lotto {
	private int[] lots;
	private int base;
	private int ballNum;
	public Lotto(int base, int ballNum) {
		this.base = base;
		this.ballNum = ballNum;
		lots = new int[ballNum];
	}
	
	public Lotto() {
		this(45,6);
	}
	
	public void print() {
		for(int i = 0; i<lots.length; i++) {
			if(i==lots.length-1) {
				System.out.println(lots[i]);
			}else {
				System.out.println(lots[i]);
			}
		}
		System.out.println();
	}
	private int rand() {
		return (int)(Math.random()*base) + 1;
	}
	
	public boolean contain(int n) {
		boolean isC = false;
		for(int i=0; i<lots.length; i++) {
			if(lots[i]==n) {
				isC=true;
				break;
			}
		}
		return isC;
	}
	
	public void make() {
		Arrays.fill(lots, 0);
		int count = 0;
		while(count!=ballNum) {
			int temp = rand();
			if(!contain(temp)) {
				lots[count++] = temp;
			}
		}
		
		Arrays.sort(lots);
	}
	
	public int[] getLots() {
		return lots;
	}
	
}







