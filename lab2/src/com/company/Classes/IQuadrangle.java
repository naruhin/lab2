package com.company.Classes;

public interface IQuadrangle {
    String getTitle();

    void setTitle(String title);

    int getY4();
    int getX1();
    int getX2();
    int getX3();
    int getX4();
    int getY1();
    int getY2();
    int getY3();
    void setY4(int y4);
    void setX1(int x1);
    void setX2(int x2);
    void setX3(int x3);
    void setX4(int x4);
    void setY1(int y1);
    void setY2(int y2);
    void setY3(int y3);



    //Поиск стороны AB
    double SegmentAB();
    //Поиск стороны BC
    double SegmentBC();
    //Поиск стороны CD
    double SegmentCD();
    //Поиск стороны AD
    double SegmentAD();


    //Поиск диагонали AC
    double DiagonalAC();
    //Поиск диагонали Bd
    double DiagonalBD();

    double GetPerimeter();
    double GetSquare();



}
