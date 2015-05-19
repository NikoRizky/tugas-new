/**
 * Created by Ritz on 19/05/2015.
 */
public class LingkaranNico {
    int jari;
    int diameter;

    public void CetakKeLayar()
    {
        System.out.println("JARI JARI LINGKARAN: " + jari);
        System.out.println("DIAMETER LINGKARAN: " + diameter);

    }

    public  void ubahProperty(int jariBaru, int diameterBaru)
    {
        jari = jariBaru;
        diameter = diameterBaru;

    }

    public double hitungLuasLingkaran()
    {
        double luas;
        luas = 3.14 * jari * jari;
        return luas;
    }

    public double hitungKelilingLingkaran()
    {
        double keliling;
        keliling = 3.14 * diameter;
        return keliling;
    }
}