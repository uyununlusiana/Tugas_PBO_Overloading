public class penggajian {
    String gpokok;
    String gtunjanganJabatan;
    String glembur;

    penggajian(String gpokok, String gtunjanganJabatan, String  glembur){
        this.gpokok=gpokok;
        this.gtunjanganJabatan=gtunjanganJabatan;
        this.glembur=glembur;
    }
    void datapenggajian (String glembur){
        System.out.println("Ini adalah Data Gaji anda, Gaji Pokok Rp"+gpokok+ ", Gaji Tunjangan Jabatan Rp"+ gtunjanganJabatan+ ", Gaji Lembur Rp "+glembur);
    }
}
