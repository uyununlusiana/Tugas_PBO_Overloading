public class jabatan {
    String CEO;
    String direktur;

    jabatan(String CEO, String direktur){
        this.CEO=CEO;
        this.direktur=direktur;
    }
    void kedudukan(String CEO){
        System.out.println("Jabatan Anda Diperusahaan berkedudukan sebagai" + CEO  );
    }

}
