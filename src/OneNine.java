public class OneNine {
    public static void main (String[] args){
        final double   width = 5.3;
        final  double height  = 8.6;

        System.out.println(area(width,height));
        System.out.printf("%n");
        System.out.println(perimeter(width,height));

    }
    private static Double area(double width, double height){
        return width*height;
    }
    private static Double perimeter(double width, double height){
        return 2*(width*height);
    }
}
