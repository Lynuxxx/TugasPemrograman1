public class Elearning12 {
    public static void main(String[] args) {
        // StringBuffer initialization
        StringBuffer nama = new StringBuffer("BagusMaulana");

        // 1. Panjang kalimat nama kalian masing-masing
        int panjangNama = nama.length();
        System.out.println("\n1.) Panjang nama  =  " + panjangNama);

        // 2. Karakter ke 4 dari nama kalian
        char karakterKe4 = nama.charAt(3);
        System.out.println("\n2.) Karakter ke-4  =  " + karakterKe4);

        // 3. Tambahkan "unpam" di belakang nama kalian
        nama.append(" unpam");
        System.out.println("\n3.) Nama setelah ditambahkan 'unpam'  =  " + nama);

        // 4. Nilai absolut dari 3 dan -3
        int nilaiAbsolut1 = Math.abs(3);
        int nilaiAbsolut2 = Math.abs(-3);
        System.out.println("\n4.) Nilai absolut dari 3  =  " + nilaiAbsolut1);
        System.out.println("\n    Nilai absolut dari -3  =  " + nilaiAbsolut2);

        // 5. Nilai max dari 7.1 dan 9.1
        double nilaiMax = Math.max(7.1, 9.1);
        System.out.println("\n5.) Nilai max dari 7.1 dan 9.1  =  " + nilaiMax);

        // 6. Nilai min dari 7.1 dan 9.1
        double nilaiMin = Math.min(7.1, 9.1);
        System.out.println("\n6.) Nilai min dari 7.1 dan 9.1  =  " + nilaiMin);

        // 7. Pembulatan ke atas dari 2.1
        double pembulatanKeAtas = Math.ceil(2.1);
        System.out.println("\n7.) Pembulatan ke atas dari 2.1  =  " + pembulatanKeAtas);

        // 8. Pembulatan ke bawah dari 9.8
        double pembulatanKeBawah = Math.floor(9.8);
        System.out.println("\n8.) Pembulatan ke bawah dari 9.8  =  " + pembulatanKeBawah);

        // 9. 5 pangkat 5 dan akar kuadrat dari 9
        double pangkat5 = Math.pow(5, 5);
        double akarKuadrat9 = Math.sqrt(9);
        System.out.println("\n9.) 5 pangkat 5  =  " + pangkat5);
        System.out.println("\n    Akar kuadrat dari 9  =  " + akarKuadrat9);

        // 10. Nilai random sebanyak 20
        System.out.println("\n10.) 20 nilai random  =  \n");
        for (int i = 0; i < 20; i++) {
            double nilaiRandom = Math.random();
            System.out.println(nilaiRandom);
        }
    }
}


/*
Penjelasan singkat untuk setiap bagian kode  = 
        1. `StringBuffer nama = new StringBuffer("Ichibi");` menginisialisasi `StringBuffer` dengan nama Anda.
2. `nama.length();` mengembalikan panjang dari `StringBuffer`.
        3. `nama.charAt(3);` mengembalikan karakter ke-4 (indeks dimulai dari 0).
        4. `nama.append(" unpam");` menambahkan "unpam" di akhir `StringBuffer`.
        5. `Math.abs(3)` dan `Math.abs(-3)` mengembalikan nilai absolut.
6. `Math.max(7.1, 9.1)` mengembalikan nilai maksimum.
7. `Math.min(7.1, 9.1)` mengembalikan nilai minimum.
8. `Math.ceil(2.1)` mengembalikan nilai pembulatan ke atas.
9. `Math.floor(9.8)` mengembalikan nilai pembulatan ke bawah.
10. `Math.pow(5, 5)` menghitung 5 pangkat 5, dan `Math.sqrt(9)` menghitung akar kuadrat dari 9.
        11. `Math.random()` menghasilkan nilai random antara 0.0 dan 1.0.
*/