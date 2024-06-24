import java.util.Scanner;

public class JajarGenjang {
    static String HitungLuas(int a, int t) {
        return "\nLuas Jajar Genjang adalah : " + (a * t);
    }
    static String HitungKeliling(int a, int b){
        return "Keliling Jajar Genjang adalah : " + (2 * (a + b));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Alas : ");
        int a = input.nextInt();
        
        System.out.print("Masukkan Tinggi : ");
        int b = input.nextInt();
        
        System.out.println(HitungLuas(a, b));
        System.out.println(HitungKeliling(a, b));
    }
}

