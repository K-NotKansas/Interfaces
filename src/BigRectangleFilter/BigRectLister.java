package BigRectangleFilter;

import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    static Rectangle rect;
    //static  rectangleRecord = "";
    static ArrayList<Object> Rectanglelist = new ArrayList();

    public static void main(String[] args) {
        //declaring and adding all ten rectangles
        rect  = new Rectangle(2, 5);//over
        Rectanglelist.add(rect);

        rect  = new Rectangle(1, 10);//over
        Rectanglelist.add(rect);

        rect  = new Rectangle(1, 2);//under
        Rectanglelist.add(rect);

        rect  = new Rectangle(5, 5);//over
        Rectanglelist.add(rect);

        rect  = new Rectangle(1, 2);//under
        Rectanglelist.add(rect);

        rect  = new Rectangle(2, 1);//under
        Rectanglelist.add(rect);

        rect  = new Rectangle(6, 5);//over
        Rectanglelist.add(rect);

        rect  = new Rectangle(1, 1);//under
        Rectanglelist.add(rect);

        rect  = new Rectangle(1, 2);//under
        Rectanglelist.add(rect);

        rect  = new Rectangle(2, 5);//over
        Rectanglelist.add(rect);

        //System.out.println(Rectanglelist);

        //Declare area
        BigRectFilter m;
        int i = 0;

        while (i<10) {

                rect = (Rectangle) Rectanglelist.get(i);
                m = new BigRectFilter();
                i++;

                if (m.accept(rect)){//m.accept(m)) {
                    System.out.println(String.valueOf(rect));
                }

        }

    }


}


