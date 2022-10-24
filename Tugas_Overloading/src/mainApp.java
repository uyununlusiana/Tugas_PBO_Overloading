public class mainApp {
    public static void main(String[]args) {
        //Data Kariawan
        karyawan karyawan = new karyawan("Uyunun Lusiana", "SI17200049");
        karyawan.karyawaan(karyawan.nama);

        //Data Gaji
        penggajian penggajian = new penggajian("10000000", "5000000", "3000000");
        penggajian.datapenggajian(penggajian.glembur);

        //Riwayat Pendidikan
        pendidikan pendidikan = new pendidikan("Universitas Bismillah", "Universitas Alhamdulillah");
        pendidikan.pendidikanterakhir(pendidikan.S3);

        //Jabatan di Perusahaan
        jabatan jabatan = new jabatan(" CEO of PT Alhamdulillah jaya Abadi", "PT Alhamdulillah jaya Abadi");
        jabatan.kedudukan(jabatan.CEO);
    }
}
