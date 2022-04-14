public class OneSix {
    public static void main (String[] args){
        final int   fra1 = 2;
        final  int fra2  = 3; // do i  even need to down cast when double has higher precedence lol
        final double   fra3 = 4;
        final  double fra4  = 5;
        final  double fra5  = 6;
        final  double fra6  = 7;
        final int   fra7 = 8;
        final  int fra8  = 9;
        final  int fra9  = 10;
        final  double numOne  = 1.0;

        System.out.println(cpmplexOne(fra1,fra2,(int)fra3,(int)fra4,(int)fra5,(int)fra6,fra7,fra8,fra9,numOne));// for some reasons i had to cast even at lower precedence
        System.out.printf("%n");


    }
    private static Double cpmplexOne(int fra1, int fra2, int fra3, int fra4, int fra5, int fra6, int fra7, int fra8, int fra9, double num){
        double result = num + fra1 + fra2+fra3 + fra4 + fra5 + fra6 + fra7 + fra8 + fra9;
        return result;
    }
}
