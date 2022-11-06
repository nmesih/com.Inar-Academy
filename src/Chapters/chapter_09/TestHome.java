package Chapters.chapter_09;

public class TestHome {
    public static void main(String[] args) {

        Home yeniEv = new Home(145, 2, 3, true, 500_000, 3000, "Güney", 2010);
        System.out.println("Evin ozellikleri\n---------------");
        System.out.println(yeniEv.print());
        System.out.println("------------------");
        yeniEv.setKira(4000);
        yeniEv.setUcret(624000);
        yeniEv.setGarajVarmi(false);
        System.out.println(yeniEv.print());
    }
}
