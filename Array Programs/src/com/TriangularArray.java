package com;

class TriangularArray {
	 static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];      //To initialise a new 1D array for triangular shape
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;        //to store the sum of the indices in the elements
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
