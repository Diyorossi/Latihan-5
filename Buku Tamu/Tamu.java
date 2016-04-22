package tamu;
public class Tamu {
    private final String nama,alamat,notelp;
    private static int tamu=0;
    
    public Tamu(){
        nama="";
        alamat="";
        notelp="";
    }
    public Tamu(String n, String a, String t){
        nama=n;
        alamat=a;
        notelp=t;
        tamu++;
    }
     public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getNotelp(){
        return notelp;
    }
    public static int getJumlahTamu(){
        return tamu;
    }
}

