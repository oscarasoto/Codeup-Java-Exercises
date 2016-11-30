package circle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oscar Soto on 11/30/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
public class Circle {
    private double radius;
    private static int circlesCount = 0;

    public Circle(double radius){
        this.radius = radius;
        circlesCount++;
    }

    private double getCircumference(){
        return (2 * radius) * Math.PI;
    }

    public String getFormattedCircumference(){
        return formatNumber(getCircumference());
    }
    private double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public String getFormattedArea(){
        return formatNumber(getArea());
    }

    private String formatNumber(double x){
        return String.format("%.2f", x);

    }

    public static int getObjectCount(){
        return circlesCount;
    }
}
