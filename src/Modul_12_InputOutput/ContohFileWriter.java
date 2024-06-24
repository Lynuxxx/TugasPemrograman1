package Modul_12_InputOutput;
import java.io.*;

class ContohFileWriter {
    public static void main(String[] args) {

        String inputFileName = "file/Lat12.txt";

        // if (args.length == 0) {
        //     System.out.println("Error: tulis nama file!");
        //     return;  // Add return to stop execution if no file name is provided
        // }

        String data;

        try (FileWriter fout = new FileWriter(inputFileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Ketik teks yang akan disimpan ke file. Ketik STOP untuk berhenti");

            data = br.readLine();
            while (!data.equals("STOP")) {
                fout.write(data + System.lineSeparator());
                data = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File: " + inputFileName + " tidak dapat dibuka atau dibuat.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}







// import java.io.*;

// class ContohFileWriter {
//     public static void main(String[] args) {
//         String inputFileName = "file/Lat12.txt"; // Jalur relatif ke file input
//         String outputFileName = "output.txt"; // Nama file untuk hasil output

//         String data;
//         FileWriter fout = null;
//         BufferedReader br = null;
//         try {
//             fout = new FileWriter(outputFileName);
//             br = new BufferedReader(new FileReader(inputFileName));
//             System.out.println("Membaca dari file: " + inputFileName);

//             while ((data = br.readLine()) != null) {
//                 fout.write(data + "\r\n");
//             }
//             System.out.println("Teks berhasil disalin ke file " + outputFileName);
//         } catch (FileNotFoundException e) {
//             System.out.println("File: " + inputFileName + " tidak ditemukan.");
//         } catch (IOException e) {
//             System.out.println("Ekspresi tidak diketahui: " + e);
//         } finally {
//             try {
//                 if (br != null)
//                     br.close();
//                 if (fout != null)
//                     fout.close();
//             } catch (IOException err) {
//                 System.out.println("Ekspresi tidak diketahui: " + err);
//             }
//         }
//     }
// }
