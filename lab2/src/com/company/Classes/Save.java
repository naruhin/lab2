package com.company.Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Save {
    public void save(String filename, ArrayList<Quadrangle> quadrangles, ArrayList<Trapeze> trapezes) throws IOException {

        FileWriter fw = new FileWriter(filename);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Quadrangle quadrangle : quadrangles) {
            try {
                bw.write("Quadrangle " + String.valueOf(quadrangle.getTitle())
                        + " " + String.valueOf(quadrangle.getX1())
                        + " " + String.valueOf(quadrangle.getX2())
                        + " " + String.valueOf(quadrangle.getX3())
                        + " " + String.valueOf(quadrangle.getX4())
                        + " " + String.valueOf(quadrangle.getY1())
                        + " " + String.valueOf(quadrangle.getY2())
                        + " " + String.valueOf(quadrangle.getY3())
                        + " " + String.valueOf(quadrangle.getY4()));
                bw.write(System.lineSeparator());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (Trapeze trapeze : trapezes) {
            try {
                bw.write("Trapeze " + String.valueOf(trapeze.getTitle())
                        + " " + String.valueOf(trapeze.getX1())
                        + " " + String.valueOf(trapeze.getX2())
                        + " " + String.valueOf(trapeze.getX3())
                        + " " + String.valueOf(trapeze.getX4())
                        + " " + String.valueOf(trapeze.getY1())
                        + " " + String.valueOf(trapeze.getY2())
                        + " " + String.valueOf(trapeze.getY3())
                        + " " + String.valueOf(trapeze.getY4()));
                bw.write(System.lineSeparator());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        bw.close();
        fw.close();
    }
}
