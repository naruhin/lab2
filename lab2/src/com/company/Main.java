package com.company;
import com.company.Classes.*;


import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
	// write your code here
        ArrayList <Quadrangle> quadrangles = new ArrayList<>();
        ArrayList <Trapeze> trapezes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

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

        NativeSerialization.saveFile(quadrangles, trapezes);
        Figure[] loadData = NativeSerialization.loadFile("Figure.txt");
        System.out.println("NativeSerialization" + "\n" + "------------");
        System.out.println("Quadrangle:\n" + loadData[0].toString() + "\n\n" + "Trapeze:\n" + loadData[1].toString() + "\n");


        JSONSerialization.saveFile(quadrangles, trapezes);
        loadData = JSONSerialization.loadFile("Quadrangle.json", "Trapeze.json");
        System.out.println("JacksonSerialization" + "\n" + "------------");
        System.out.println("Quadrangle:\n" + loadData[0].toString() + "\n\n" + "Trapeze:\n" + loadData[1].toString());



    }
}
