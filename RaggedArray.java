package com.vision;

public class RaggedArray {

	public static void main(String[] args) {
		int[][] rarr = new int[4][];
		rarr[0]=new int[] {74};
		rarr[1]=new int[] {99,18};
		rarr[2]=new int[] {74,99,18};
		rarr[3]=new int[] {74,99,18,76};
		for(int i=0;i<rarr.length;i++) {
			for(int j=0;j<rarr[i].length;j++) {
				System.out.print(rarr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
