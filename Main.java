import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Dosen pakDaniel = new Dosen("Ir. Daniel","123123123123");
       Mahasiswa Achoi = new Mahasiswa("Achoi","200200200200");
       Mahasiswa Kevin = new Mahasiswa("Kevin","255255255255");
       
       System.out.println("=== Dosen menambah bimbingan ===");
       pakDaniel.SetMahasiswaBimbingan(Achoi);
       pakDaniel.SetMahasiswaBimbingan(Kevin);
       
       System.out.println("=== Mahasiswa mencatat dosen pembimbing ===");
       Achoi.SetPembimbing(pakDaniel);
       Kevin.SetPembimbing(pakDaniel);
       
       System.out.println("=== Hasil akhir ===");
       Achoi.DaftarPembimbing();
       Kevin.DaftarPembimbing();
    }
}
