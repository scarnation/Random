public class OneSeven {
    public static void main (String[] args){
        final double   fra1 = 1.0/3.0;
        final  double fra2  = 1.0/5.0;
        final double   fra3 = 1.0/7.0;
        final  double fra4  = 1.0/9.0;
        final  double fra5  = 1.0/11.0;
        final  double fra6  = 1.0/13.0;
        final  double numOne  = 1.0;
        //fra2= 1.0/5.0; running a test
        System.out.println(fra2);
        System.out.println(cpmplexOne(fra1,fra2,fra3,fra4,fra5,numOne));

        System.out.printf("%n");
        System.out.println(cpmplexTwo(fra1,fra2,fra3,fra4,fra5,fra6,numOne));





    }
    private static Double cpmplexOne(double fra1, double fra2, double fra3, double fra4, double fra5, double num){
        double result = 4*(num- (fra1 + fra2)-(fra3 + fra4)-fra5);
        return result;
    }

    private static Double cpmplexTwo(double fra1, double fra2, double fra3, double fra4, double fra5,double fra6, double num){
        double result = 4*(num- (fra1 + fra2)-(fra3 + fra4)-(fra5 + fra6));
        return result;
    }

}
