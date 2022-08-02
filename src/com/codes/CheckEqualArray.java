package com.codes;

import java.util.HashMap;
import java.util.Map;

/*
 * 1)Input
 *  N = 5
A[] = {1,2,5,4,0}
B[] = {2,4,5,0,1}
Output: 1
2) Input:
N = 3
A[] = {1,2,5}
B[] = {2,4,15}
Output: 0
 */
public class CheckEqualArray {
	 public static boolean check(long A[],long B[],int N)
	    {
	        Map<Long, Long> hm=new HashMap<Long,Long>();	        
	        for(int i=0; i<N; i++){
	            if(hm.containsKey(A[i])){
	                long s=hm.get(A[i]);
	                s++;
	              hm.put(A[i],s);
	            }else{
	                hm.put(A[i],(long)1);
	            }
	        }
	        
	       for(int i=0; i<N; i++){
	            if(hm.containsKey(B[i])){
	                long s=hm.get(B[i]);
	                s--;
	              hm.put(B[i],s);
	              
	            } }
	            
	            for(Map.Entry<Long,Long> entry:hm.entrySet()){
	                if(entry.getValue()!=0){
	                    return false;
	                }
	            }
	            return true;
	            
	}
	 public static void main(String[] args) {
		long A[]= {1,2,5,4,0};
		long B[] = {2,4,5,0,1};
		System.out.println(check(A, B, 5));
	}
	
}
