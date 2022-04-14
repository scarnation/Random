public class OneTen {
    // 1 mile =  1.6km
    //15*1/ 1.6 = miles runin 50 minutes 30 sec
    public static void main(String[] args){
        double milage = 0 ;
        milage = 15;// can be changed to input reading
        System.out.println(milesInKm(milage));
    }
    public static Double milesInKm(Double miles){
        return (miles*1)/1.6;

    }
}
