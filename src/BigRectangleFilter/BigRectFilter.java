package BigRectangleFilter;

import java.awt.*;

public class BigRectFilter implements Filter{

    @Override
    public boolean accept(Object x) {
        Rectangle r = (Rectangle) x;
        int finalperim = ((r.height*2) + (r.width*2));

        if (finalperim >= 10){
            return true;
        }
        else {
            return false;
        }
    }

}
