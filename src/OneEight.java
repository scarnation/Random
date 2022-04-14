public class OneEight {
    public static void main (String[] args){
        final double   radius = 6.5;


        System.out.println(area(radius,radius));
        System.out.printf("%n");
        System.out.println(perimeter(radius));

    }
    private static Double area(double  radius, double radius2){
        double total = 0;

        total  = radius* radius2;




        return total*3.14;

    }
    private static Double perimeter(double radius){
        return (2*radius)*3.14;
    }
}
