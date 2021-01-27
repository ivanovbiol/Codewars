
public class Calculate {
    public static final String UNDERWEIGHT_INDEX = "Underweight";
    public static final String NORMAL_INDEX = "Normal";
    public static final String OVERWEIGHT_INDEX = "Overweight";
    public static final String OBESE_INDEX = "Obese";

    public static String bmi(double weight, double height) {

        double bmi = weight / Math.pow(height, 2);

        return (bmi <= 18.5) ? UNDERWEIGHT_INDEX : (bmi <= 25) ? NORMAL_INDEX : (bmi <= 30) ? OVERWEIGHT_INDEX : OBESE_INDEX;
    }


}
