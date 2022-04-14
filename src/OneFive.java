public class OneFive {// this is 1.9 you can rename file didn't want to refactor
    public static void main (String[] args){
        final double   d1 = 7.5;
       final  double d2  = 6.5;
        final  double d3  = 4.5;
        final  double d4  = 47.5;
        final  double d5  = 5.5;
        final int three = 3;



       System.out.println(calc(d1,d2,d3,d4,d5,three));


    }
    private static Double calc(double d1, double d2,double d3, double d4,double d5, int three){
        double flow = (d1*d2)-(d3*three); // to avoid compilation flow error lets seperate
        double flow2 = d4-d5;
        return flow/flow2;

    }

}
