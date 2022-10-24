public class karyawan {
    String nama;
    String userID;


    karyawan(String nama,String userID) {
        this.nama = nama;
        this.userID = userID;
    }
    void karyawaan(String nama){
        System.out.println("Hello Ibu CEO " + nama + ", User ID anda adalah " + userID);
    }
}
