public class Main {
    public static void main(String[] args) {
        // Implementasi kelas sederhana
        MyClass myObject = new MyClass(7, 5);
        System.out.println("Prima: " + myObject.getPrima());
        System.out.println("Ganjil: " + myObject.getGanjil());
        System.out.println("-----------------");
        // Implementasi kalkulator sederhana menggunakan custom live template
        int a = 5;
        int b = 3;
        int result = a + b;
        System.out.println("Hasil: " + result);
    }
}

// Kelas sederhana dengan beberapa atribut dan metode
class MyClass {
    private int bilangan_prima;
    private int bilangan_ganjil;

    public MyClass(int bilangan_prima, int bilangan_ganjil) {
        this.bilangan_prima = bilangan_prima;
        this.bilangan_ganjil = bilangan_ganjil;
    }

    public int getPrima() {
        return bilangan_prima;
    }

    public int getGanjil() {
        return bilangan_ganjil;
    }
}