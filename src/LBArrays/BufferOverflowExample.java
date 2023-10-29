package LBArrays;
import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        int bufferSize = 5;
        byte[] buffer = new byte[bufferSize];

        String input = "hello world!";
        byte[] inputBytes = input.getBytes();

        for (int i = 0; i < inputBytes.length; i++) {
            buffer[i] = inputBytes[i];
        }

        System.out.println(new String(buffer));
    }
}
