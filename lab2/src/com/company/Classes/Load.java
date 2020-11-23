package com.company.Classes;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Load {

    public void read(String filename, ArrayList<Quadrangle> quadrangles, ArrayList<Trapeze> trapezes) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader(filename));
        while (scanner.hasNextLine())
        {
            String[] line = scanner.nextLine().split(" ");
            if(line[0].matches("Quadrangle"))
            {
              quadrangles.add(new Quadrangle(String.valueOf(line[1]),
                                            Integer.parseInt(line[2]),
                                            Integer.parseInt(line[3]),
                                            Integer.parseInt(line[4]),
                                            Integer.parseInt(line[5]),
                                            Integer.parseInt(line[6]),
                                            Integer.parseInt(line[7]),
                                            Integer.parseInt(line[8]),
                                            Integer.parseInt(line[9]))
              );
            }
            else if(line[0] .matches("Trapeze") )
            {
                trapezes.add(new Trapeze(Integer.parseInt(line[9]),
                        Integer.parseInt(line[2]),
                        Integer.parseInt(line[3]),
                        Integer.parseInt(line[4]),
                        Integer.parseInt(line[5]),
                        Integer.parseInt(line[6]),
                        Integer.parseInt(line[7]),
                        Integer.parseInt(line[8]),
                        String.valueOf(line[1])));
            }
            else
                System.out.println("ERROR");

        }
    }
}
