package edu.global.study0629;

import java.math.BigInteger;

public class NumberMethod {

	public static void main(String[] args) {
		
		Integer n1 = Integer.valueOf(5);
		Integer n2 = Integer.valueOf(1024);
		
		System.out.println(Integer.max(n1,n2));
		System.out.println(Integer.min(n1,n2));
		System.out.println(Integer.sum(n1,n2));
		System.out.println();
		
		System.out.println(Integer.toBinaryString(12));
		System.out.println(Integer.toOctalString(12));
		System.out.println(Integer.toHexString(12));
		
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println();
		
		BigInteger big1 = new BigInteger("100000000000000000000");
		BigInteger big2 = new BigInteger("-999999999999987777777777");
		
		BigInteger r1 = big1.add(big2);
		System.out.println(r1);
		
		BigInteger r2 = big1.multiply(big2);
		System.out.println(r2);
		

	}

}
