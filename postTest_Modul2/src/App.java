import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Masukkan nama Anda: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Masukkan usia Anda: ");
        int age = input.nextInt();
        System.out.println("Jumlah uang yang dimiliki: ");
        double uang = input.nextDouble();
        System.out.println("Rata-rata pengeluaran harian: ");
        double rata2 = input.nextDouble();

        double usia = (double) + age;
        int jumlahUang = (int) + uang;

        double sisaUang = uang - (rata2 * 30);
        double bulanBertahan = uang / (rata2 * 30);


        String status = "Keuangan Anda stabil";
        if (bulanBertahan < 1) {
            status = "PERINGATAN: Keuangan Anda kurang stabil!";
        } else if (bulanBertahan > 6) {
            status = "Keuangan Anda dalam Kondisi aman.";
        }

        boolean umur = age > 30;
        System.out.println("Apakah usia lebih dari 30? " + umur);

        boolean lebihDari = age > 30 && uang > 10000000;
        System.out.println("Apakah usia > 30 dan uang > 10000000? " + lebihDari);

        boolean kurangDari = age < 30 || uang > 5000000;
        System.out.println("Apakah usia < 30 atau uang > 5000000? " + kurangDari);

        System.out.println("Masukkan jumlah hutang Anda: ");
        double hutang = input.nextDouble();

        double absolutHutang = Math.abs(hutang);
        double pembulatan = Math.ceil(rata2);
        double bonusTakTerduga = 100000 + (Math.random() * (1000000 - 100000));

        double uangSetelahPengeluaran = sisaUang + bonusTakTerduga;

        System.out.println("\n==== LAPORAN KEUANGAN PRIBADI ====");
        System.out.println("Nama: " + name);
        System.out.println("Usia: " + age + " tahun");
        System.out.println("Uang yang dimiliki: Rp" + uang);
        System.out.println("Pengeluaran harian rata-rata: Rp" + rata2);
        System.out.println("Sisa uang dalam 30 hari: Rp" + sisaUang);
        System.out.println("Estimasi bulan bertahan: " + bulanBertahan + " bulan");
        System.out.println("Status Keuangan: " + status);
        System.out.println("Nilai absolut dari hutang: Rp" + absolutHutang);
        System.out.println("Pengeluaran harian setelah pembulatan: Rp" + pembulatan);
        System.out.println("Total uang yang dimiliki setelah pengeluaran dan bonus: Rp" + uangSetelahPengeluaran);
        System.out.println("Bonus tak terduga: Rp" + bonusTakTerduga);

        input.close();
    }
}
