import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class ArrayMinMaxSort {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String BacaInput = "";
        int JmlData = 0;
        Byte DataArray[];

        System.out.print("\nMasukkan jumlah data : ");

        try {
            BacaInput = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Ada kesalahan !");
        }

        JmlData = Integer.parseInt(BacaInput);
        DataArray = new Byte[JmlData];

        // Membaca data dari keyboard
        System.out.println();
        for (int i = 0; i < JmlData; i++) {
            System.out.print("DataArray[" + i + "] = ");

            try {
                BacaInput = dataIn.readLine();
            } catch (IOException e) {
                System.out.println("Ada kesalahan !");
            }

            DataArray[i] = Byte.parseByte(BacaInput);
        }

        // Menampilkan data dari array
        System.out.print("\nData dalam array: ");
        for (int i = 0; i < JmlData; i++) {
            System.out.print(DataArray[i] + " ");
        }
        
        // Menampilkan nilai minimal
        byte min = DataArray[0];
        for (int i = 1; i < JmlData; i++) {
        if (DataArray[i] < min) {
            min = DataArray[i];
        }
        }
        System.out.println("\n\nNilai minimal pada array: " + min);

        // Menampilkan nilai maksimal
        byte max = DataArray[0];
        for (int i = 1; i < JmlData; i++) {
            if (DataArray[i] > max) {
                max = DataArray[i];
            }
        }
        System.out.println("\nNilai maksimal pada array : " + max);
        
        // Mengurutkan array
        Arrays.sort(DataArray);
        System.out.print("\nData dalam array yang telah diurutkan:");
        for (int i = 0; i < JmlData; i++) {
            System.out.print(DataArray[i] + " ");
        }
        System.out.println();
    }
}
