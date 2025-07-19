package lec7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
  public static void main(String[] args) throws IOException {
    // `fr` reads file as a stream of characters
    // NOTE: relative path is relative to the project root
    FileReader fr = new FileReader("./lec7/import_this.txt");
    // `br` reads the stream of characters and returns readable content
    BufferedReader br = new BufferedReader(fr);
    String line = null;
    while ((line = br.readLine()) != null) {
      System.out.println(line);
    }
    br.close();
  }
}
