package org.dsa;

import java.util.Arrays;

public class RotateArrayBy90 {

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        int rows= matrix.length;
        int cols= matrix[0].length;
        int [][] result= new int[rows][cols];
        for(int i=rows-1; i>=0;i--){
            for(int j =cols-1; j>=0;j--) {
                //System.out.println(matrix[i][j]);
                result[j][i]=matrix[i][j];
            }

        }

      for(int i=0;i<rows-1;i++)
      {
          int left=0;
          int right=cols-1;
          while(left<right){
              int temp=result[i][left];
              result[i][left]=result[i][right];
              result[i][right]=temp;
              left++;
              right--;
          }
      }

        System.out.println(Arrays.toString(result[0]));
        System.out.println(Arrays.toString(result[1]));
        System.out.println(Arrays.toString(result[2]));


        //for()
    }
}
