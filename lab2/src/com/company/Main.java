package com.company;

import com.company.Classes.Quadrangle;
import com.company.Classes.Trapeze;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList <Quadrangle> quadrangles = new ArrayList<>();
        ArrayList <Trapeze> trapezes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int j = 1;
            //Создаём 5 объектов класса
            // В качестве входных параметров исп. случайное число от 1 до 10
            quadrangles.add(new Quadrangle(
                    "Q" + i,
                    (int)(Math.random() * ((10 - 1) + 1)) + 1,
                    (int)(Math.random() * ((10 - 1) + 1)) + 1,
                    (int)(Math.random() * ((10 - 1) + 1)) + 1,
                    (int)(Math.random() * ((10 - 1) + 1)) + 1,
                    (int)(Math.random() * ((10 - 1) + 1)) + 1,
                    (int)(Math.random() * ((10 - 1) + 1)) + 1,
                    (int)(Math.random() * ((10 - 1) + 1)) + 1,
                    (int)(Math.random() * ((10 - 1) + 1)) + 1)
            );

            trapezes.add(new Trapeze(
                    (int)(Math.random() * ((10 - 1) + 1)) + 1,
                    (int)(Math.random() * ((10 - 1) + 1)) + 1,
                    (int)(Math.random() * ((10 - 1) + 1)) + 1,
                    (int)(Math.random() * ((10 - 1) + 1)) + 1,
                    (int)(Math.random() * ((10 - 1) + 1)) + 1,
                    (int)(Math.random() * ((10 - 1) + 1)) + 1,
                    (int)(Math.random() * ((10 - 1) + 1)) + 1,
                    (int)(Math.random() * ((10 - 1) + 1)) + 1,
                    "T" + i));

        }


        System.out.println("Прямоугольники - \n " + quadrangles + "------------------------");

        System.out.println("Трапеции - \n"  + trapezes + "--------------------------");

    }
}
