package com.feat.evaluations;

public class evalutation1 {


    public static void main(String [] args)
    {
        int [] arr= {11, 13, 21, 3, 24};
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            boolean received= false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>num){
                    System.out.println(arr[j]);
                    received=true;
                    break;
                }
            }
            if(!received)
                System.out.println("-1");




        }


    }
}
