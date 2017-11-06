/*
 * Rental DVD dengan layar masukkan
 */
package tugas4;

/**
 * Soal Nomor 4
 * @author ibnutriyuono
 */
import java.util.Scanner;

class denda{
    int hari,harikembali,n,denda;
    int bulan, bulankembali;
    int tahun, tahunkembali;
 
}
public class Tugas4 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Deklarasi scanner
        Scanner sc = new Scanner(System.in);
        
        //Pengisian data member
        System.out.print("==============");
        System.out.print("Data Masukkan");
        System.out.println("==============");
        System.out.print("Nama Depan\t:");
        String namadepan = sc.next();
        System.out.print("Nama Belakang\t:");
        String namabelakang = sc.next();
        System.out.print("ID Anggota\t:");
        String id = sc.next();
        System.out.print("Alamat\t\t:");
        String alamat = sc.next();
        System.out.print("No Telepon\t:");
        int telpon = sc.nextInt();
        System.out.print("==============");
        System.out.print("Tanggal Pinjam");
        System.out.println("==============");
        System.out.println("Tanggal Pinjam\t");
        System.out.print("Hari ke (DD)\t:");
        int hari = sc.nextInt();
        System.out.print("Bulan ke (MM)\t:");
        int bulan = sc.nextInt();
        System.out.print("Tahun ke (YYYY)\t:");
        int tahun = sc.nextInt();
        System.out.print("==============");
        System.out.print("Tanggal Kembali");
        System.out.println("==============");
        System.out.println("Tanggal Kembali\t");
        System.out.print("Hari ke (DD)\t:");
        int harikembali = sc.nextInt();
        System.out.print("Bulan Kembali (MM)\t:");
        int bulankembali = sc.nextInt();
        System.out.print("Tahun Kembali (YYYY)\t:");
        int tahunkembali = sc.nextInt();
                
        //data keluar
        System.out.print("==============");
        System.out.print("Data Keluaran");
        System.out.println("==============");
        System.out.println("Nama\t\t:"+namadepan+" "+namabelakang);
        System.out.println("ID Member\t:"+id);
        System.out.println("Tanggal Pinjam (dd-mm-yyyy):"+hari+ "," +bulan+ "," +tahun);
        System.out.println("Tanggal Kembali (dd-mm-yyyy):"+harikembali+ ","+bulankembali+","+tahunkembali);
        
        /*penghitungan denda berdasarkan hari
        jika lebih dari 3 hari (n=3) terkena denda*/
        
        int n= harikembali-hari;
        int q= n-2;
        int x= bulankembali-bulan;
        int z= tahunkembali-tahun;
        
               if((n<=2) && (x==0) && (z<=0)){
               //Tidak Terlambat
               System.out.println("Telat\t\t: Tidak terlambat");
               System.out.println("Denda\t: Tidak ada Denda");
            } else if((x==0 &&((n>=3) && (n<=30)))){
               //Telat lebih dari 3 hari dalam bulan yang sama 
               int denda=q*2500;    
               System.out.println("Telat\t\t:"+q+" Hari");
               System.out.println("Denda\t\t: Rp."+denda);
            }else if((x>=1 && x<=12)&&((n==0)&&(n<=30))){ 
               //Telat lebih dari 1 bulan pada hari yang sama
               int denda = 2500*x*30;
               System.out.println("Telat\t\t: "+x+" Bulan");
               System.out.println("Denda\t\t: Rp."+denda);
            } 
            else if((x>=1 && x<=12) && ((n>=1)&&(n<=30))){
                //Telat lebih dari 1 Bulan, pada hari yang berbeda
                int denda = 2500*30*x*q;
                System.out.println("Telat\t\t: "+q+" Hari,"+x+" Bulan");
                System.out.println("Denda\t\t: Rp."+denda);
            }else if((z>=1) && (x==0) && ((n==0)&&(n<=30))){
               //Telat lebih dari 1 Tahun pada Bulan dan Hari yang sama
               int denda = 2500*30*z*365;
               System.out.println("Telat\t\t: "+z+" Tahun");
               System.out.println("Denda\t\t: Rp."+denda);
            } else if ((z>=1) && (x>=1) && ((n==0)&&(n<=30))){
              //Telat lebih dari 1 Tahun, berbeda Bulan pada hari yang sama 
               System.out.println("Telat\t\t: "+q+" Hari,"+x+" Bulan,"+z+" Tahun");
               int denda=2500*x*30*z*365;
            } else if((z>=1) && (x>=1) && ((n>=1)&&(n<=30))){
               //Telat lebih dari 1 Tahun, berbeda Bulan, berbeda Hari
               System.out.println("Telat\t\t: "+q+" Hari,"+x+" Bulan,"+z+" Tahun");
               int denda=q*2500*x*30*z*365;
            } else{
               //Data yang dimasukkan salah 
               System.out.println("Data yang dimasukkan tidak valid");  
            }
               System.out.println("==========================================");
    }
    
}
