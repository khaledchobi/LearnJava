package batch.covid.day3;

public class LandCalculation {

    public static void main(String args[]) {
        int one_acre_of_land = 43560;
        double tract_land = 389767;

        double acres_of_tract_land = (tract_land / one_acre_of_land);



        System.out.println("There are approximately " + acres_of_tract_land + " acres in a tract of land that has 391,876 square feet.");

    }
}