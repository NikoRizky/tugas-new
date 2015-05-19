/**
 * Created by Ritz on 19/05/2015.
 */
public class TestMahasiswaNico {
    public static void main(String[] args) {
        MahasiswaNico mhs = new MahasiswaNico("Bangun Satria Hitam",17);
        mhs.TampilkanBiodata();
        System.out.println();
        mhs.setUmur(17);
        mhs.TampilkanBiodata();
    }
}
