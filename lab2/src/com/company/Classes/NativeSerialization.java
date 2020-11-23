package com.company.Classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class NativeSerialization {

    private static String fileName = "Figure.txt";


    public static void saveFile(ArrayList<Quadrangle> quadrangle, ArrayList<Trapeze> trapeze)
    {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName, true)))
        {
            oos.writeObject(quadrangle);
            oos.writeObject(trapeze);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static Figure[] loadFile(String fileName)
    {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName)))
        {
            Figure[] figure = new Figure[2];
            figure[0] = (Quadrangle)ois.readObject();
            figure[1] = (Trapeze) ois.readObject();
            return figure;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        return new Figure[1];
    }
}
