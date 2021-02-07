public class Main {

    public static void main(String[] args) {

        int[] inputGrades = Reader.readInputGrades();

        System.out.println(School.getAverage(inputGrades));

    }
}
