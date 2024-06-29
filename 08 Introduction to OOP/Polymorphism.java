public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism: Objek dari berbagai kelas dapat diperlakukan sebagai objek dari kelas induk yang sama
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Memanggil metode sound pada objek yang berbeda
        myAnimal.sound();
        myDog.sound();
        myCat.sound();
    }
}

// Kelas induk (Superclass)
class Animal {
    // Metode yang akan dioverride
    public void sound() {
        System.out.println("Suara hewan");
    }
}

// Kelas turunan (Subclass) Dog
class Dog extends Animal {
    // Mengoverride metode sound
    @Override
    public void sound() {
        System.out.println("Anjing menggonggong");
    }
}

// Kelas turunan (Subclass) Cat
class Cat extends Animal {
    // Mengoverride metode sound
    @Override
    public void sound() {
        System.out.println("Kucing nyaa");
    }
}


