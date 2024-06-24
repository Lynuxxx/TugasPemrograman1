// MODUL 7

package Modul_07_Constructor;

public class JajarGenjang {
    private double tinggi;
    private double alas;

    public JajarGenjang() {
        tinggi = 0;
        alas = 0;
    }

    public JajarGenjang(double tinggi, double alas) {
        this.tinggi = tinggi;
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public double getLuas() {
        return tinggi * alas;
    }

    public static void main(String args[]) {
        JajarGenjang[] jajargenjangArray = new JajarGenjang[4];
        for (int i = 0; i < 4; i++) {
            jajargenjangArray[i] = new JajarGenjang(); // Inisialisasi objek
        }

        jajargenjangArray[0].setTinggi(6);
        jajargenjangArray[0].setAlas(8);

        jajargenjangArray[1].setTinggi(5);
        jajargenjangArray[1].setAlas(3);

        jajargenjangArray[2].setTinggi(12);
        jajargenjangArray[2].setAlas(8);

        jajargenjangArray[3].setTinggi(11.23);
        jajargenjangArray[3].setAlas(7.7);

        for (int i = 0; i < 4; i++) {
            System.out.println("Jajar Genjang ke-" + (i + 1));
            System.out.println("Tinggi = " + jajargenjangArray[i].getTinggi());
            System.out.println("Alas = " + jajargenjangArray[i].getAlas());
            System.out.println("Luas Jajar Genjang = " + jajargenjangArray[i].getLuas());
            System.out.println();
        }
    }
}
