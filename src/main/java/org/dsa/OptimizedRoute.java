package org.dsa;

public class OptimizedRoute {

    public static void main(String[] args) {

        int [] route = {2,2,5,6,-2};
        int totalSum =0;

        for(int i: route)
            totalSum+=i;

        int rightSum=0, leftSum=0;
        for(int i=0;i<route.length;i++){
            rightSum=totalSum-leftSum-route[i];
            if(rightSum==leftSum)
                System.out.println(i);
            leftSum+=route[i];

        }


    }

}
