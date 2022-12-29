package com.practi;



public class SquareRoot {
	  public static double NthRoot(int n, int m) //n=3 m=8
	  
{
		  for (int j = 1; j<m; j++) {
			  double r=	  Math.pow(j, n);
			  if(r==m)
				  return j;
		
		  }
	
		  return -1;
		  }
 public static void main(String[] args) {
	System.out.println (NthRoot(3, 8));
//		int[] a = { 1, 2,32, 4, 5,100,3 };
//		int[] b = { 7, 9, 2, 1, 5,4,5 };
//		Map<Integer, Integer> m = new HashMap<>();
//		List<Integer> l=new ArrayList<>();
//		for (int i = 0; i < b.length; i++) {
//			if(!m.containsKey(b[i]))
//			m.put(b[i], 1);
//
//			}
//		for (int i = 0; i < a.length; i++) {
//			if(!m.containsKey(a[i])) {
//				l.add(a[i]);
//			}
//		}
		
		
	}

}
