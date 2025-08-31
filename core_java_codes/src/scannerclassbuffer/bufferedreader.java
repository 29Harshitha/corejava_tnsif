package scannerclassbuffer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bufferedreader{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter some data (you can enter numbers or text):");
        String name = br.readLine();

        System.out.println("Hello, " + name);
    }
}