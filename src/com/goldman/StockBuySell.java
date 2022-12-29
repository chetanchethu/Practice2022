package com.goldman;

public class StockBuySell {

	public static void main(String[] args) {
//		int[] arr = { 4, 2, 2, 9 };
//		if(arr.length<2) {
//			System.out.println("0");
//		}else {
//		int min=arr[0];
//		int max=0;
//		for (int i = 1; i < arr.length; i++) {
//			if(arr[i]<min){
//				min=arr[i];
//			}else {
//				max=Math.max(max, arr[i]-min);
//			}
//		}System.out.println(max);
//	}

		
		
		
		
		
		int[] arr = { 4, 2, 2, 9 };
		int n = arr.length;
		int start = 0;
		System.out.println(maxProfit(arr, start, n - 1));
	}

	static int maxProfit(int price[], int start, int end) {
		if (end <= start)
			return 0;

		int profit = 0;
		for (int i = start; i < end; i++) {
			for (int j = i + 1; j <= end; j++) {
				if (price[j] > price[i]) {
					int curr_profit = price[j] - price[i] + maxProfit(price, start, i - 1)
							+ maxProfit(price, j + 1, end);
					profit = Math.max(curr_profit, profit);
				}
			}
		}
		return profit;
	}
}
