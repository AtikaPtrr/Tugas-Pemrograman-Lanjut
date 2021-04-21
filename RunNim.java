package pemrogramanlanjut;
import java.util.*;
public class RunNim {
    public static void main(String[] abc){
        System.out.print("Masukkan NIM : ");
        Scanner in = new Scanner(System.in);

        String nim = in.nextBigInteger().toString();

        Nim mhs = new Nim();
        mhs.setNim(nim);

        System.out.println("Maka Dari NIM Yang Di Masukan Kami Mendapatkan Informasi Sebagai Berikut : ");
        System.out.println("Jenjang = "+mhs.getLulus());
        System.out.println("Tahun Masuk = "+mhs.getTahun());
        System.out.println("Fakultas = "+mhs.getFakultas());
        System.out.println("Jurusan = "+mhs.getProdi());
        System.out.println("Jenis Kelamin = "+mhs.getGender());
        System.out.println("Nomor Urut Mahasiswa = "+mhs.getNomor());


    }
}
