public class IfElseIfExample {
    public static void main(String[] args) {
        int number = 0;
        if (number > 0) {
            System.out.println(number + " adalah bilangan positif");
        } else if (number < 0) {
            System.out.println(number + " adalah bilangan negatif");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
