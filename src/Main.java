public class Main {

    public static void main(String[] args) {
        // Create table head
        System.out.println(
                "\nFeet     Meters     |     Meters     Feet\n" +
                "----------------------------------------------"
        );

        // Table for loop
        for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5) {
            //Format output with printf to create table
            System.out.printf("%4.1f     ", feet);
            System.out.printf("%6.3f", footToMeter(feet));
            System.out.print("     |     ");
            System.out.printf("%-11.1f", meters);
            System.out.printf("%7.3f\n", meterToFoot(meters));

        }
    }

    // Method to convert feet to meters
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    // Method to convert meters to feet
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
