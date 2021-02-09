public class Main {

    public static void main(String[] args) {

        double weight = Reader.readWeightOrHeight();

        double height = Reader.readWeightOrHeight();

        System.out.println(Calculate.bmi(weight, height));

    }
}