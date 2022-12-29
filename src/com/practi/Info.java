package com.practi;

import java.util.Arrays;

public class Info {
	 public static void findMaxGuests(int[] arrival, int[] departure)
	    {
	        // sort the arrival and departure arrays in increasing order
	        Arrays.sort(arrival);
	        Arrays.sort(departure);
	 
	        int checked_in = 0;     // keep track of the total number of guests at any time
	        int max_checked_in = 0; // keep track of the max number of guests in the event
	        int max_event_tm = 0;   // keep track of the time when there are maximum guests
	 
	        /* The following code is similar to the merge routine of the merge sort */
	 
	        // Process all events (arrival & departure) in sorted order
	        for (int i = 0, j = 0; i < arrival.length && j < departure.length; )
	        {
	            // if the next event is arrival
	            if (arrival[i] <= departure[j])
	            {
	                // increment number of guests
	                checked_in++;
	 
	                // update the maximum count of guests if needed
	                if (max_checked_in < checked_in)
	                {
	                    max_checked_in = checked_in;
	                    max_event_tm = arrival[i];
	                }
	 
	                // increment index of arrival array
	                i++;
	            }
	            // if the next event is a departure
	            else {
	                // decrement number of guests
	                checked_in--;
	 
	                // increment index of departure array
	                j++;
	            }
	        }
	 
	        System.out.println("Event Time: " + max_event_tm);
	        System.out.println("The maximum number of guests is " + max_checked_in);
	    }
	public static void main(String[] args) {
		int[] start_time = { 1, 4, 8, 10 };
		int[] end_time = { 2, 9, 11, 12 };
		int temp=0;
		int count=0;
		
		

	}

}
