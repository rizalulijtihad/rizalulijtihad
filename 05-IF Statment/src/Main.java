import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Data Member
        int total_belanja = 0;
        // membuat scanner menerima input dari keyboard
        Scanner scan = new Scanner(System.in);

        // mengambil input dari keyboard
        System.out.print("Masukan Total Belanja : ");
        total_belanja = scan.nextInt();

        // cek total belanja
        if (total_belanja >= 50000) {
            System.out.println("Anda Mendapatkan Mouse");
        } else {
            System.out.println("Belanja Anda Kurang Dari Rp. 50000");
        }

        System.out.println("Teirima Kasih Telah Belanja di Toko kami");
    }
}