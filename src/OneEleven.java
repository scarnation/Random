public class OneEleven {
    public static void main (String[] args){
        final double birthRate =  7.0;
        final double imigrationRate = 45.0;
        final double  deathRate = 13.0;
        final double yearInSec = 31536000.0; // 60-1minute, 60m-1hr , 24hr - 1 day, 365d- 1 year
        //final int year = 365; retired because it didnt suit my off calculated inputs
        int currentPopulation =  312032486;
        double pPopulationInFive= 0 ;
        //using a method call method
        double birthPerYear = (yearInSec/birthRate);
        double deathPerYear = yearInSec/deathRate;
        double imigraationPeryear = yearInSec/imigrationRate;
        double b= birthRateInFive(birthPerYear);
        double d = deathRateInFive(deathPerYear);
        double i = immigrationRateInFive(imigraationPeryear);




        //to get population in five we have to account  the birthrate, death rate and the immigration rate
        pPopulationInFive = populationInFive(currentPopulation,b,d,i);
        System.out.printf("%s%2f%n","The total population in five years is equal to ", pPopulationInFive);


    }
    public static double birthRateInFive(double birthPerYear){
        return birthPerYear*5;
    }
    public static double deathRateInFive(double deathPerYear){
        return deathPerYear*5;
    }
    public static double immigrationRateInFive(double immigrationPerYear){
        return immigrationPerYear*5;
    }
    public static double populationInFive(int currentPopulation,double birthIn5, double deathIn5, double immigrationInFive){

        return (currentPopulation+birthIn5+immigrationInFive)-deathIn5;
    }
}
