import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Data Member
         int total_belanja = 0;

        // membuat scanner menerima input dari keyboard
        Scanner scan = new Scanner (System.in);

        //mengambil input dari keyborad
        System.out.print("Masukan Total belanja : ");
        total_belanja = scan.nextInt();

        // cek total belanja
        if(total_belanja >=50000){
            System.out.println("Anda Mendapatkan Mouse : ");

        }
    
        System.out.println("Belanja Anda Kurang Dari");
    }
}