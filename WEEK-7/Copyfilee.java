import java.io.*;

class Copyfilee {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("File copied successfully");

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}