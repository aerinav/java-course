package Scope;
public class Scope {
    int instanceVar; // Variabel instance
    static int staticVar; // Variabel static

    public static void main(String[] args) {
        // System.out.println(localVar); // Error: Variabel lokal tidak bisa diakses di sini
        staticVar = 20; // Variabel static bisa diakses disini
    }

    public void myMethod() {
        Scope scope = new Scope();
        int localVar = 10; // Variabel lokal

        scope.instanceVar = 50; // Variabel instance bisa diakses disini
        staticVar = 30; // Variabel static bisa diakses disini

        System.out.println(localVar); // Variabel lokal bisa diakses di sini
        
        if (true) {
            int blockVar = 40; // Variabel blok
            System.out.println(blockVar);
        }
    }
}
