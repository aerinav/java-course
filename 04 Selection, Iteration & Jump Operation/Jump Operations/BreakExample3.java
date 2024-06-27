public class BreakExample3 {
    public static void main(String[] args) {
        int i = 0;
        
        while (true) { // Hindari penggunaan while (true)
            System.out.println("Iteration: " + i);
            i++;
            
            if (i >= 10) { // Gunakan break untuk berhenti dari infinity loop
                break;
            }
        }
        
        System.out.println("Loop terminated.");
    }
}
