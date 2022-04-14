public class OneTwelve {
    // 1 mile =  1.6km
    //24*1.6/ 1 = km runin  1hr 40 minutes 35 sec
    public static void main(String[] args){
        double kilometers = 0 ;
        kilometers = 24;// can be changed to input reading
        System.out.println(milesToKm(kilometers));
    }
    public static Double milesToKm(Double km){
        return (km*1.6)/1;

    }
}
