import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Masukkan nama Anda: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Masukkan NIM Anda: ");
        int nim = input.nextInt();
        System.out.println("Masukkan usia Anda: ");
        int age = input.nextInt();
        System.out.println("Masukkan tinggi badan: ");
        double height = input.nextDouble();

        
        
        // no. 1
        double hasil = (age * 2) + 10 / 5 - 3;
        System.out.println("Hasil: " + hasil);

        // no. 2
        boolean umur =  age > 18;
        System.out.println("Usia lebih dari 18: " + umur);

        // no. 3
        boolean tinggi = height > 160;
        System.out.println("Tinggi badan lebih dari 160: " + tinggi);

        // no. 4
        double usia = (double) + age;
        int tinggiBadan = (int) + height;

        System.out.println("Usia dalam double: " + usia);
        System.out.println("Tinggi badan dalam int: " + tinggiBadan);


        input.close();

    }
}