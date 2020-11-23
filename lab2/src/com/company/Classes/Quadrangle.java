package com.company.Classes;

import org.codehaus.jackson.annotate.JsonAutoDetect;

import java.io.Serializable;
@JsonAutoDetect
public class Quadrangle implements IQuadrangle, Figure, Serializable{


    private String title;
    private int y4;
    private int x1;
    private int x2;
    private int x3;
    private int x4;
    private int y1;
    private int y2;
    private int y3;

    public Quadrangle(){

    }

    public Quadrangle(String title, int y4, int x1, int x2, int x3, int x4, int y1, int y2, int y3) {
        this.title = title;
        this.y4 = y4;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getY4() {
        return y4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getX4() {
        return x4;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    @Override
    public String toString() {
        return "\n" + this.title + " \n A(" + this.x1 + ", " + this.y1 + ")\n" +
                " B(" + this.x2 + ", " + this.y2 + ")\n" +
                " C(" + this.x3 + ", " + this.y3 + ")\n" +
                " D(" + this.x4 + ", " + this.y4 + ")\n\n" +
                "Segments:\n AB = " + SegmentAB() + "\n BC = " + SegmentBC() +
                "\n CD = " + SegmentCD() + "\n AD = " + SegmentAD() +
                "\n\n Diagonals:\n AC = " + DiagonalAC() + "\n BD = " + DiagonalBD() +
                "\n Perimeter = " + GetPerimeter() + "\n Square = " + GetSquare();
    }


    //Поиск стороны AB
    public double SegmentAB()
    {
        return Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
    }

    //Поиск стороны BC
    public double SegmentBC()
    {
        return Math.sqrt(Math.pow(this.x3 - this.y2, 2) + Math.pow(this.y3 - this.y2, 2));
    }

    //Поиск стороны CD
    public double SegmentCD()
    {
        return Math.sqrt(Math.pow(this.x4 - this.x3, 2) + Math.pow(this.y4 - this.y3, 2));
    }

    //Поиск стороны AD
    public double SegmentAD()
    {
        return Math.sqrt(Math.pow(this.x4 - this.x1, 2) + Math.pow(this.y4 - this.y1, 2));
    }



    //Поиск диагонали AC
    public double DiagonalAC()
    {
        return Math.sqrt(Math.pow(this.x3 - this.x1, 2) + Math.pow(this.y3 - this.y1, 2));
    }

    //Поиск диагонали Bd
    public double DiagonalBD()
    {
        return Math.sqrt(Math.pow(this.x4 - this.x2, 2) + Math.pow(this.y4 - this.y2, 2));
    }

    public double GetPerimeter()//Периметр
    {
        return SegmentAB() + SegmentAD() + SegmentBC() + SegmentCD();
    }


    public double GetSquare()//Площадь
    {
        double cos = ((this.x3 - this.x1) * (this.x4 - this.x2) + (this.y3 - this.y1) * (this.y4 - this.y2)) / (DiagonalAC() * DiagonalBD());
        double sin = Math.sqrt(1 - Math.pow(cos, 2));
        return ((DiagonalAC() * DiagonalBD()) / 2) * sin;
    }




}
