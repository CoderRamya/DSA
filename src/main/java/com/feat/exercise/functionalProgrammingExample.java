package com.feat.exercise;

@FunctionalInterface
interface chef{
    public String cookedMeal(String ingredients);
}


public class functionalProgrammingExample {
StringBuilder cbuilder = new StringBuilder();
    public static void main(String[] args) {
        chef traditionalchef= new chef() {
            @Override
            public String cookedMeal(String ingredients) {
                return "cooked ";
            }
        };

        chef lambdachef= i -> "Cooked " + i;
        System.out.println( lambdachef.cookedMeal("Dosa"));

    }
}
