package com.yedam.dev;

public class ArrayExample2 {

	public static void main(String[] args) {

		//.int[] intAry = { 1, 2, 3, 4 }; // 배열
		//int[] intAry2 = new int[5]; // 배열 크기만 지정
		//intAry2 = new int[] { 1, 2, 3, 4 }; // 배열 크기지정해놓고 배열담기

		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
       
		int sum = 0;
		int avg = 0;
		for(int i = 0; i <array.length; i++) {
			
			
			for(int j = 0; j <array.length; j++) {
				
				sum += array[i][j];

				
			avg = sum /array.length;
			}
			System.out.println(sum);
		}
		
		
		

	}

}
