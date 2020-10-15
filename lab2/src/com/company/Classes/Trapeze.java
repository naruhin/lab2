package com.company.Classes;

public class Trapeze extends Quadrangle {

    public Trapeze()
    {
    }

    public Trapeze(int x1, int x2, int x3, int x4,
                   int y1, int y2, int y3, int y4,
                   String title)
    {
        super(title, y4, x1, x2, x3, x4, y1, y2, y3);

    }



    public Boolean IsTrapeze()
    {
        boolean check = false;

        if ((getY1() == getY4() && getY2() == getY3()) || (getX1() == getX2() && getX3() == getX4())){
            check = true;
        }


        return check;
    }


    public String ToString()
    {
        return getTitle() + " \n A(" + getX1() + ", " + getY1() + ")\n" +
                " B(" + getX2() + ", " + getY2() + ")\n" +
                " C(" + getX3() + ", " + getY3() + ")\n" +
                " D(" + getX4() + ", " + getY4() + ")\n\n" +
                " \n Side 'a'(BC) = " + super.SegmentBC() + " \n" +
                " Side 'b'(AD) = " + super.SegmentAD() + "\n" +
                " Side 'c'(AB) = " + super.SegmentAB() + "\n" +
                " Side 'd'(CD) = " + super.SegmentCD() + "\n\n" +
                " Middle line  = " + this.MiddleLine();

    }

    public double MiddleLine()
    {
        return (super.SegmentBC() + super.SegmentAD()) / 2;
    }
}
