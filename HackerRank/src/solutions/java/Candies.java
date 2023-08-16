package solutions.java;

import java.util.ArrayList;
import java.util.List;

public class Candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 3, 4, 2, 5, 6, 4, 3, 1, 7 };
		List<Integer> arr = new ArrayList<>();
		arr.add(4);
		arr.add(6);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(2);
//		arr.add();
//		arr.add();
//		arr.add();
//		arr.add();
		candies(0, arr);
	}

	public static long candies(int n, List<Integer> arr) {
		// Write your code here
		long op=1;
		int candyCurrent=1;
		for(int i=1;i<arr.size();i++) {
			int prev=arr.get(i-1);
			int current = arr.get(i);
			if(prev<current) {
				candyCurrent++;
			}else {
				candyCurrent=1;
			}
			op+=candyCurrent;
		}
		return op;
	}

}
