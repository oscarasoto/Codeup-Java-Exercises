package circle;

/**
 * @author Oscar Soto on 11/30/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
class Circle {
    private double radius;
    private static int circlesCount = 0;

    Circle(double radius){
        this.radius = radius;
        circlesCount++;
    }

    private double getCircumference(){
        return (2 * radius) * Math.PI;
    }

    String getFormattedCircumference(){
        return formatNumber(getCircumference());
    }
    private double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    String getFormattedArea(){
        return formatNumber(getArea());
    }

    private String formatNumber(double x){
        return String.format("%.2f", x);

    }

    static int getObjectCount(){
        return circlesCount;
    }
}
