package decorator2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        int c;
        try (InputStream inputStream = new ShuffleCaseInputSteam(
                new BufferedInputStream(
                        new FileInputStream("test.txt"))
        )
        ) {
            while ((c = inputStream.read()) != -1 ){
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
