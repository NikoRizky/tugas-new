/**
 * Created by Ritz on 19/05/2015.
 */
public class TestBangun {
    public static void main(String[] args)
    {
        SegitigaNico bangun_Segitiga = new SegitigaNico();
        LingkaranNico bangun_Lingkaran = new LingkaranNico();

        bangun_Segitiga.alas = 20;
        bangun_Segitiga.tinggi = 20;
        bangun_Segitiga.sisimiring = 40;
        bangun_Lingkaran.jari= 20;
        bangun_Lingkaran.diameter= 40;

        bangun_Lingkaran.CetakKeLayar();
        System.out.println("LUAS LINGKARAN: " + bangun_Lingkaran.hitungLuasLingkaran());
        System.out.println("KELILING LINGKARAN: " + bangun_Lingkaran.hitungKelilingLingkaran());

        bangun_Segitiga.CetakKeLayar();
        System.out.println("LUAS SEGITIGA: " + bangun_Segitiga.hitungLuasSegitiga());
        System.out.println("KELILING SEGITIGA: " + bangun_Segitiga.hitungKelilingSegitiga());
    }

}
