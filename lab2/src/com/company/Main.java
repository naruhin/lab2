package com.company;

import com.company.Classes.Load;
import com.company.Classes.Quadrangle;
import com.company.Classes.Save;
import com.company.Classes.Trapeze;

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

        Save FileSave = new Save();
        FileSave.save("savefile.txt", quadrangles, trapezes);

        quadrangles.clear();
        trapezes.clear();
        Load FileLoad = new Load();
        FileLoad.read("savefile.txt", quadrangles, trapezes);
        System.out.println("Загрузка...");
        Thread.sleep(1000);
        System.out.println("Прямоугольники - \n " + quadrangles + "------------------------");
        System.out.println("Трапеции - \n"  + trapezes + "--------------------------");



    }
}
