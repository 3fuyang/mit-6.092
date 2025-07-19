package lec7.assn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class MagicSquares {
    public static boolean testMagic(String pathName) throws IOException {
        FileReader fr = new FileReader(pathName);
        BufferedReader br = new BufferedReader(fr);

        String line;
        int prevSum = -1;
        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) {
                continue;
            }

            String[] parts = line.split("\t");
            int sum = 0;
            for (String part : parts) {
                sum += Integer.parseInt(part);
            }

            if (prevSum == -1) {
                // first line
                prevSum = sum;
            } else if (prevSum != sum) {
                br.close();
                return false;
            }

            prevSum = sum;
        }

        br.close();

        return true;
    }

    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");
        String[] fileNames = { "Mercury.txt", "Luna.txt" };
        try {
            for (String fileName : fileNames) {
                String absPath = Paths.get(userDir, "lec7", "assn", fileName).toString();
                System.out.println(fileName + " is magic? " + testMagic(absPath));
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
