package homework;

import java.util.Scanner;

public class Playdish {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество тарелок");
        int dishes = in.nextInt();
        System.out.println("Введите количество средство");
        double wosh = in.nextDouble();

        while(dishes > 0){
            if (wosh <= 0.5){
                System.out.println("нет средства");
                break;

            }

            dishes = dishes-1;
            wosh = wosh - 0.5;
            if( dishes <0){
                System.out.println("Вы все вымыли");
            }
            if (wosh <= 0.5){
                System.out.println("средство закончилось");
                break;

            }

        }
        System.out.println("сталось помыть тарелок: " + dishes);
        System.out.println("Моющего средства осталось: "  + wosh);

    }
}
