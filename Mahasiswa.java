import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    private String nama;
    private String nim;
    private Dosen pembimbing;
    
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    
    public void SetPembimbing(Dosen dosen) {
        this.pembimbing = dosen;
    }
    
    public void DaftarPembimbing() {
        if (this.pembimbing != null) System.out.println("Nama dosen pembimbing: "+this.pembimbing.getNama());
        else System.out.println("Anda belum mendapatkan pembimbing!");
        
    }
    // ... getter
}
