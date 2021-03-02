public class Calculate {

    public static final String UNDERWEIGHT_INDEX = "Underweight";
    public static final String NORMAL_INDEX = "Normal";
    public static final String OVERWEIGHT_INDEX = "Overweight";
    public static final String OBESE_INDEX = "Obese";
    public static final String NEGATIVE_INPUT = "Input can't be negative";
    public static final String ZERO_INPUT = "Input can't be zero";
    public static final String INVALID_PERSON_WEIGHT = "A person can't be more than 350 kg.";
    public static final String INVALID_PERSON_HEIGHT = "A person can't be more than 2.30 cm. tall";

    public static String bmi(double weight, double height) {
        if (weight < 0.0 || height < 0) {
            throw new NumberFormatException(NEGATIVE_INPUT);
        } else if (weight == 0 || height == 0) {
            throw new NumberFormatException(ZERO_INPUT);
        }

        if (weight > 350) {
            throw new NumberFormatException(INVALID_PERSON_WEIGHT);
        } else if (height > 2.3) {
            throw new NumberFormatException(INVALID_PERSON_HEIGHT);
        }

        double bmi = weight / Math.pow(height, 2);

        return (bmi <= 18.5) ? UNDERWEIGHT_INDEX :
                (bmi <= 25) ? NORMAL_INDEX : (bmi <= 30) ? OVERWEIGHT_INDEX : OBESE_INDEX;

    }
}