public class Main {

    public static void main(String[] args) {

        int[] arr = Reader.readInputGrades();

        System.out.println(GrassHopper.getGrade(arr[0], arr[1], arr[2]));
        
    }
}