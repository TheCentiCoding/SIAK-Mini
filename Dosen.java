public class Dosen {
    private String nama;
    private String nidn;
    private List<Mahasiswa> mahasiswaBimbingan;
    
    public Dosen(String nama, String nidn) {
        this.nama = nama;
        this.nidn = nidn;
        this.mahasiswaBimbingan = new ArrayList<>();
    }
    
    public void SetMahasiswaBimbingan(Mahasiswa mhs){
        this.mahasiswaBimbingan.add(mhs);
        System.out.println("Berhasil menambahkan "+mhs.getNama()+" ke dalam daftar bimbingan");
    }
    
    public void DaftarBimbingan() {
        System.out.println("Daftar bimbingan: ");
        for (Mahasiswa mhs : this.mahasiswaBimbingan) {
            System.out.println("- "+mhs.getNama()+" "+mhs.getNim());
        }
    }
}
