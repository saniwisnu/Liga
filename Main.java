/**
 * Created by VAIO on 7/7/2015.
 */
public class Main {

    public static void main(String[] args) {

        //Liga
        Liga Inggris = new Liga("Inggris");
        Liga German = new Liga("German");

        //Divisi
        Divisi serieA = new Divisi("Serie A",Inggris);
        Divisi serieB = new Divisi("Serie B",Inggris);
        Divisi divisi1 = new Divisi("Divisi1",German);
        Divisi divisi2 = new Divisi("Divisi2",German);

        //Klub
        Klub manchester = new Klub("manchester United",serieA,Inggris);
        Klub city = new Klub("manchester city",serieA,Inggris);
        Klub arsenal = new Klub("Arsenal",serieB,Inggris);
        Klub Stoke = new Klub("Stoke City",serieB,Inggris);
        Klub bm = new Klub("Bayer Munchen",divisi1,German);
        Klub WD = new Klub("Wenderbremen",divisi1,German);
        Klub aston = new Klub("aston villa",divisi2,German);
        Klub Brosia = new Klub("BrosiaDortmund",divisi2,German);

        Inggris.setDaftarDivisi(serieA);
        Inggris.setDaftarDivisi(serieB);
        German.setDaftarDivisi(divisi1);
        German.setDaftarDivisi(divisi2);

        serieA.setDaftarKlub(manchester);
        serieA.setDaftarKlub(city);
        serieB.setDaftarKlub(arsenal);
        serieB.setDaftarKlub(Stoke);
        divisi1.setDaftarKlub(bm);
        divisi1.setDaftarKlub(WD);
        divisi2.setDaftarKlub(aston);
        divisi2.setDaftarKlub(Brosia);

        //1. Get daftar divisi by nama liga

        System.out.println("Soal Nomer 1 :");
        System.out.println("Divisi Liga Inggris : ");
        Inggris.getDaftarDivisi("Inggris");
        System.out.println();

        //2. Get Daftar Klub by nama liga

        System.out.println("Soal Nomer 2 :");
        System.out.println("Klub Liga Inggris : ");
        serieA.getDaftarKlubLiga("Inggris");
        System.out.println("Liga German : ");
        divisi1.getDaftarKlubLiga("German");
        System.out.println();

        //3. Get Daftar Klub by nama Divisi

        System.out.println("Soal Nomer 3 :");
        System.out.println("Serie A : ");
        serieA.getDaftarKlubDivisi("Serie A");
        System.out.println("Serie B : ");
        serieB.getDaftarKlubDivisi("Serie B");
        System.out.println();

        //4. Get Klub ini berada di divisi mana by nama Klub

        System.out.println("Soal Nomer 4 :");
        manchester.getDivisi("manchester United");
        bm.getDivisi("Bayer Munchen");
        System.out.println();

        //5. Get Klub ini berada di liga apa by nama Klub

        System.out.println("Soal Nomer 5 :");
        bm.getLiga("Bayer Munchen");
    }
}


