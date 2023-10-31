public class App {
    public static void main(String[] args) throws Exception {
       // Program Biodata Mahasiswa
       // deklarasi variable 
       String nama;
       String nim;
       String Tgl_lahir;
       String alamat;
       float berat_badan;
       float tinggi_badan;
       
       // mengsi variable
       nama = "Rizal";
       nim = "23241047";
       Tgl_lahir = "15 Agustus 2004";
       alamat = "Montong Are Sandubaya";
       berat_badan = 45,5f;
       tinggi_badan = 160,5f

       // cetak Biodata
       System.out.println("=================================");
       System.out.println("nama : " + nama);
       System.out.println("NIM : " + nim);
       System.out.println("Tanggal Lahir : " + Tgl_lahir);
       System.out.println("Alamat : " + alamat);
       System.out.println("Barat Badan : " + berat_badan);
       System.out.println("Tinggi Badan : " + tinggi_badan);
       System.out.println("=================================");
    }
}
