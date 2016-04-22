package tamu;
import java.util.Scanner;
public class MainTamu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner in=new Scanner(System.in);
        int t=0;
        
        Tamu t1= new Tamu();
        System.out.println("Masukkan jumlah tamu : ");
        int tamu=in.nextInt();
        Tamu banyak[]= new Tamu[tamu];
        for(int i=0; i<tamu; i++){
        System.out.println("Masukkan Nama : ");
        String nama=input.nextLine();
        System.out.println("Masukkan Alamat : ");
        String alamat=input.nextLine();
        System.out.println("Masukkan No.telp : ");
        String notelp=input.nextLine();
        banyak[i]= new Tamu(nama,alamat,notelp);
        
        }
        System.out.println("----------------------------------");
        System.out.println("-----------Daftar Tamu------------");
        System.out.println("----------------------------------");
        for (int i=0; i<tamu; i++){
            System.out.println("Nama        : "+banyak[i].getNama());
            System.out.println("Alamat      : "+banyak[i].getAlamat());
            System.out.println("No.telp     : "+banyak[i].getNotelp());
            System.out.println("No. id anda : "+t++);
            System.out.println();
        }
        System.out.println("Total tamu yang hadir : "+Tamu.getJumlahTamu());
    }
}
