package main.org.gradle.test;

import java.math.BigDecimal;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A == null) {
        	return -1;
        }
        int i = A.length;
        if (i == 0 || i > 100000) {
        	return -1;
        }

        for (int j = 0; 0 <= j && j < i; j++) {
        	long sumLeft = 0;
        	long sumRight = 0;
        	for (int m = 0; m <= j-1; m++) {
        		sumLeft += A[m];
        	}
        	for (int n = j + 1; n <= i-1; n++) {
        		sumRight += A[n];
        	}
        	if (sumLeft == sumRight) {
        		return j;
        	}
        }
		return -1;
    }
    
    public int solution2(int[] A) {
        // write your code in Java SE 8
        if (A == null) {
        	return -1;
        }
        int i = A.length;
        if (i == 0 || i > 100000) {
        	return -1;
        }

        int j = 0;
        long sumLeft = 0;
        long sumRight = 0;
        for (int n = j + 1; n <= i-1; n++) {
    		sumRight += A[n];
    	}
        if (sumLeft == sumRight) {
    		return j;
    	}
        for (j = 1; 0 <= j && j < i; j++) {
        	sumLeft += A[j-1];
        	sumRight -= A[j];
        	if (sumLeft == sumRight) {
        		return j;
        	}
        }
		return -1;
    }
    
    public static void main(String[] a) {
    	Solution d = new Solution();
    	d.solution(-2147483648, -2147483648, 2147483647, 2147483647, -3, 3, -5, 5);
    	d.solution(-5, -5, 10, 10, 3, 3, 5, 5);
    }
    
    public int solution(int K, int L, int M, int N, int P, int Q, int R, int S) {
        // write your code in Java SE 8
        if (K == P && L == Q && M == R && N == S) {
            return 0;
        }    
        BigDecimal widthA = BigDecimal.valueOf(M).subtract(BigDecimal.valueOf(K));

        System.out.println("areaA:"+widthA.toString());
        long heightA = N - L;
        Long areaA = new Long(1);
        System.out.println("widthA:"+widthA);
        System.out.println("heightA:"+heightA);
        System.out.println("areaA:"+areaA);
        System.out.println("areaA:"+new Long(1).MAX_VALUE);
        
        long widthB = R - P;
        long heightB = S - Q;
        long areaB = widthB * heightB;
        
        Long areaResult;
        if ((K <= P && P <= M) && (L <= Q && Q <= N) && (K <= R && R <= M) && (L <= S && S <= N)) {
            areaResult = areaA - areaB;
            System.out.println("A:"+areaResult);
            if (areaResult > 2147483647) {
            	return -1;
            } else {
            	return areaResult.intValue();
            }       	
        }
        
        long areaC = 0;
        if ((K <= P && P <= M) && (L <= S && S <= N)) {
            long widthC = M - P;
            long heightC = S - L;
            areaC =  widthC * heightC;
        } else if ((L <= Q && Q <= N) && (K <= R && R <= M)) {
            long widthC = Q - K;
            long heightC = N - Q;
            areaC =  widthC * heightC;
        } else if ((K <= P && P <= M) && (L <= Q && Q <= N)) {
            long widthC = N - Q;
            long heightC = M - P;
            areaC =  widthC * heightC;
        } else if ((K <= R && R <= M) && (L <= S && S <= N)) {
            long widthC = S - L;
            long heightC = R - K;
            areaC =  widthC * heightC;
        }
        
        areaResult = areaA + areaB - areaC;
        System.out.println("B:"+areaResult);
        if (areaResult > 2147483647) {
        	return -1;
        } else {
        	return areaResult.intValue();
        } 
    }
}

