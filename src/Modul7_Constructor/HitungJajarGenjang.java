// MODUL 7

package Modul7_Constructor;

public class HitungJajarGenjang {

    public static void main(String args[]) {
        JajarGenjang j1 = new JajarGenjang();
        JajarGenjang j2 = new JajarGenjang(10, 5);

        j1.setTinggi(12.0);
        j1.setAlas(9.0);

        System.out.println("Tinggi = " + j1.getTinggi());
        System.out.println("Alas = " + j1.getAlas());
        System.out.println("Luas Jajar Genjang = " + j1.getLuas());
        System.out.println();
        System.out.println("Tinggi = " + j2.getTinggi());
        System.out.println("Alas = " + j2.getAlas());
        System.out.println("Luas Jajar Genjang = " + j2.getLuas());
    }
}
