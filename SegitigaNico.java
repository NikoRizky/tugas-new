/**
 * Created by Ritz on 19/05/2015.
 */
public class SegitigaNico {

    int alas;
    int tinggi;
    int sisimiring;

    public void CetakKeLayar()
    {
        System.out.println("ALAS SEGITIGA: " + alas);
        System.out.println("TINGGI SEGITIGA: " + tinggi);
        System.out.println("SISI MIRING SEGITIGA: " + sisimiring);

    }

    public  void ubahProperty(int alasBaru, int tinggiBaru, int sm)
    {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisimiring = sm;
    }

    public double hitungLuasSegitiga()
    {
        double luas;
        luas = ((0.5) * alas * tinggi);
        return luas;
    }

    public int hitungKelilingSegitiga()
    {
        int keliling;
        keliling = (alas + sisimiring + sisimiring);
        return keliling;
    }
    }
