package Modul_12_InputOutput;
import java.io.*;

class ContohFileReader {
    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Error: tulis nama file!");
            return;  // Tambahkan return untuk menghentikan eksekusi jika tidak ada nama file yang diberikan
        }

        String data;
        BufferedReader br = null;
        try {
            Reader fin = new FileReader(args[0]);
            br = new BufferedReader(fin);

            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File: " + args[0] + " tidak ditemukan.");
        } catch (IOException e) {
            System.out.println("Ekspresi tidak diketahui: " + e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException err) {
                    System.out.println("Ekspresi tidak diketahui: " + err);
                }
            }
        }
    }
}
