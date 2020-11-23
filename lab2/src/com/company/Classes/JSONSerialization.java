package com.company.Classes;

import org.codehaus.jackson.map.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


public class JSONSerialization {
    private static String fileNameQuadrangle = "Quadrangle.json";
    private static String fileNameTrapeze = "Trapeze.json";

    public static void saveFile(ArrayList<Quadrangle> quadrangle, ArrayList<Trapeze> trapeze)
    {
        try
        {
            FileWriter fw1 = new FileWriter(fileNameQuadrangle, true);
            FileWriter fw2 = new FileWriter(fileNameTrapeze, true);

            ObjectMapper mapper = new ObjectMapper();

            mapper.writeValue(fw1, quadrangle);
            mapper.writeValue(fw2, trapeze);
        }

        catch (Exception e)
        {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static Figure[] loadFile(String fileNameQuadrangle, String fileNameTrapeze)
    {
        Figure[] figures = new Figure[2];

        try
        {
            FileReader fr1 = new FileReader(fileNameQuadrangle);
            FileReader fr2 = new FileReader(fileNameTrapeze);

            ObjectMapper mapper = new ObjectMapper();

            figures[0] = mapper.readValue(fr1, Quadrangle.class);
            figures[1] = mapper.readValue(fr2, Trapeze.class);

        }
        catch (Exception e)
        {
            System.out.println("Ошибка: " + e.getMessage());
        }

        return figures;
    }
}
