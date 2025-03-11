import java.util.Scanner;
import java.util.Random;

class Mahasiswa {
    String nama;
    int nim;
    int usia;
    int jumlahMatkul;
    double[] nilaiMatkul;
    int nomorAntrian;

    public Mahasiswa(String namaMhs, int nimMhs, int usiaMhs, int jumlahMatkulMhs) {
        nama = namaMhs;
        nim = nimMhs;
        usia = usiaMhs;
        jumlahMatkul = jumlahMatkulMhs;
        nilaiMatkul = new double[jumlahMatkul];
        Random rand = new Random();
        nomorAntrian = rand.nextInt(100) + 1; 
    }

    public void inputNilai(Scanner input) {
        System.out.println("Masukkan nilai untuk:");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Mata kuliah ke-" + (i + 1) + ": ");
            nilaiMatkul[i] = input.nextDouble();
        }
    }

    public double hitungRataRata() {
        double total = 0;
        for (double nilai : nilaiMatkul) {
            total += nilai;
        }
        return total / jumlahMatkul;
    }

    public double hitungIPK() {
        double rataRata = hitungRataRata();
        if (rataRata >= 85) return 4.0;
        else if (rataRata >= 75) return 3.5;
        else if (rataRata >= 65) return 3.0;
        else if (rataRata >= 55) return 2.5;
        else if (rataRata >= 45) return 2.0;
        else if (rataRata >= 35) return 1.5;
        else if (rataRata >= 25) return 1.0;
        else return 0.0;
    }

    public void tampilkan() {
        System.out.println("\n===== Laporan Akademik Mahasiswa =====");
        System.out.println("Nama                : " + nama);
        System.out.println("NIM                 : " + nim);
        System.out.println("Usia                : " + usia + " tahun");
        System.out.println("Jumlah Mata Kuliah  : " + jumlahMatkul);
        System.out.println("Rata-rata Nilai     : " + hitungRataRata());
        System.out.println("IPK                 : " + hitungIPK());
        System.out.println("Nomor Antrian       : " + nomorAntrian);

        boolean usiaebihDari22 = usia > 22;
        System.out.println("\nApakah usia lebih dari 22? " + usiaebihDari22);

        boolean ipk35 = hitungIPK() >= 3.5 && jumlahMatkul > 4;
        System.out.println("Apakah ipk lebih dari atau sama dengan 3.5 DAN jumlah mata kuliah lebih dari 4? " + ipk35);

        boolean ipk25 = hitungIPK() < 2.5 || jumlahMatkul < 4;
        System.out.println("Apakah ipk kurang dari 2.5 ATAU jumlah mata kurang dari 4? " + ipk25);
    }
}

public class Data {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        int nim = input.nextInt();
        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();
        System.out.print("Jumlah mata kuliah yang diambil: ");
        int jumlahMatkul = input.nextInt();

        Mahasiswa mhs = new Mahasiswa(nama, nim, usia, jumlahMatkul);  
        mhs.inputNilai(input);
        mhs.tampilkan();
        input.close();
    }
}