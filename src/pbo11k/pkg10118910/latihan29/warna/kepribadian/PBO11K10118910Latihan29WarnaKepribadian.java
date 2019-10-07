/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan29.warna.kepribadian;
/**
 *
 * @author
 * Nama :Muhamad Syifa Amruloh 
 * Kelas:IF11K 
 * NIM  :10118910
 *
 * Description : Program kepribadian dengan warna favorit
 */
import java.util.*;
public class PBO11K10118910Latihan29WarnaKepribadian {

    public static final String NORMAL = "\u001b[0m";
    public static final String MERAH = "\u001b[31m";
    public static final String HIJAU = "\u001b[32m";
    public static final String KUNING = "\u001b[33m";
    public static final String BIRU = "\u001b[34m";
    public static final String UNGU = "\u001b[35m";
    public static final String BIRUMUDA = "\u001b[36m";
    public static final String PUTIH = "\u001b[37m";
    public static final String BG_HITAM = "\u001b[40m";
    public static final String BG_MERAH = "\u001b[41m";
    public static final String BG_HIJAU = "\u001b[42m";
    public static final String BG_KUNING = "\u001b[43m";
    public static final String BG_BIRU = "\u001b[44m";
    public static final String BG_UNGU = "\u001b[45m";
    public static final String BG_BIRUMUDA = "\u001b[46m";
    public static final String WHITE_BG = "\u001b[47m";
    
    public static Scanner scan = new Scanner(System.in);
    
    public static void tcln(String warna,String teks){
        System.out.println(warna + teks + NORMAL);
    }
    public static void tc(String warna,String teks){
        System.out.print(warna + teks + NORMAL);
    }
    public static void bgtcln(String warna,String teks,String bg){
        System.out.println(bg + warna+ "\t" + teks + "\t\t" + NORMAL);
    }
    
    public static void merah(){
        System.out.println("1.\tPeriang,");
        System.out.println("2.\tPemberani,");
        System.out.println("3.\tBerani mengambil keputusan,");
        System.out.println("4.\tMenyukai tantangan,");
        System.out.println("5.\tKurang sabar,");
        System.out.println("6.\tDapat menahan marah namun jika suda di tahap puncak toleransi, kemarahanya akan sulit dikontrol,");
        System.out.println("7.\tMemiliki energi kehangatan dan cinta");
    }
    
    public static void hijau(){
        System.out.println("1.\tRomantis,");
        System.out.println("2.\tMenyukai hal yang berbau alami dan keindahan,");
        System.out.println("3.\tTeguh pada prinsip,");
        System.out.println("4.\tMengiginkan kesempurnaan,");
        System.out.println("5.\tMudah cemburu,");
        System.out.println("6.\tMudah merasa iri,");
        System.out.println("7.\tMenjungjung tinggi satu nilai toleransi dan kepercayaan");
    }
    
    public static void kuning(){
        System.out.println("1.\tOptimis,");
        System.out.println("2.\tSuka bergaul,");
        System.out.println("3.\tPriang,");
        System.out.println("4.\tSenang menolong,");
        System.out.println("5.\tLincah dan aktif,");
        System.out.println("6.\tTidak suka meremehkan kekurangan orang lain,");
        System.out.println("7.\tLoyal");
        System.out.println("8.\tHangat");
        System.out.println("9.\tMeskipun karakternya optimis dan ideal,sering kali goyah dan tidak stabil");
        System.out.println("10.\tCenderung penakut");
    }
    
    public static void biru(){
        System.out.println("1.\tMenyenangkan,");
        System.out.println("2.\tBijaksana,");
        System.out.println("3.\tPembawaan diri tenang saat menghadapi masalah,");
        System.out.println("4.\tDinamis,");
        System.out.println("5.\tSenang berbagi,");
        System.out.println("6.\tBersahabat,");
        System.out.println("7.\tTidak terlalu suka menjadi sorotan banyak orang orang");
        System.out.println("8.\tMenyembunyikan perasaan karna karakternya yang cendrung mencari jalan damai");
    }
    
    public static void ungu(){
        System.out.println("1.\tOptimis,");
        System.out.println("2.\tTIdak pernah ragu,");
        System.out.println("3.\tMenurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
        System.out.println("4.\tMemiliki ambis & empati yang besar,");
        System.out.println("5.\tMemiliki sisi misterius, sebab seringkali menutupi perasaanya,");
        System.out.println("6.\tTerkadang bersikap keras kepala dan angkuh,");
    }
    
    public static void view(String d){
        System.out.print("Warna Favoritmu Adalah ");
        
        switch(d){
            case "MERAH":
                tcln(MERAH, d);
                merah();
                break;
            case "HIJAU":
                tcln(HIJAU, d);
                hijau();
                break;
            case "KUNING":
                tcln(KUNING, d);
                kuning();
                break;
            case "BIRU":
                tcln(BIRU, d);
                biru();
                break;
            case "UNGU":
                tcln(UNGU, d);
                ungu();
                break;
        }
    }
    public static void main(String[] args) {
        String plh,nama;
        tc(MERAH,"YUK ");
        tc(HIJAU,"CEK ");
        tc(KUNING,"KEPRIBADIANMU ");
        tc(BIRUMUDA,"DARI ");
        tc(UNGU,"WARNA ");
        tc(BIRUMUDA,"FAVORITMU\n");
        bgtcln(PUTIH,"MERAH",BG_MERAH);
        bgtcln(PUTIH,"HIJAU",BG_HIJAU);
        bgtcln(PUTIH,"KUNING",BG_KUNING);
        bgtcln(PUTIH,"BIRU",BG_BIRU);
        bgtcln(PUTIH,"UNGU",BG_UNGU);
        System.out.print("\nPILIH WARNA FAVORITMU : ");
        plh = scan.next().toUpperCase();
        System.out.print("NAMA KAMU : ");
        nama = scan.next().toUpperCase();
        if((plh.equals("MERAH")) || (plh.equals("HIJAU")) || (plh.equals("KUNING")) || (plh.equals("BIRU")) || (plh.equals("UNGU"))){
            System.out.println("\n========== HASIL TEST KEPRIBADIAN "+nama+" ==========");
            view(plh);
        } else{
            System.out.println("\n========== HASIL TEST KEPRIBADIAN "+nama+" ==========");
            System.out.println("Oops... Belum teridentifikasi");
        }  
            
     }
    
}
