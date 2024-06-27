public class ReturnExample2 {
    public static void main(String[] args) {
        int score = 85; // Contoh skor
        
        String grade = getGrade(score);
        System.out.println("Grade: " + grade);
    }

    public static String getGrade(int score) {
        if (score >= 90) {
            return "A";
        }
        if (score >= 80) {
            return "B";
        }
        if (score >= 70) {
            return "C";
        }
        if (score >= 60) {
            return "D";
        }
        if (score >= 50) {
            return "E";
        }
        return "F";
    }
}
