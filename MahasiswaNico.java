/**
 * Created by Ritz on 19/05/2015.
 */
public class MahasiswaNico {
    private String Nama;
    private int Umur;
    public MahasiswaNico(String n,int u){
        Nama = n;
        Umur = u;
    }
    public void TampilkanBiodata(){
        System.out.println("BIODATA");
        System.out.println("Nama : "+Nama);
        System.out.println("Umur : "+Umur);
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String n) {
        this.Nama = n;
    }

    public int getUmur() {
        return Umur;
    }

    public void setUmur(int u) {
        this.Umur = u;
    }
}
