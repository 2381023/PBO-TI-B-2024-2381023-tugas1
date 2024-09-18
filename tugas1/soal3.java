package tugas1;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan kalimat dalam format camelCase: ");
        String kalimat = input.next();

        int count = 1;
        for (int i = 1; i < kalimat.length(); i++) {
            if (Character.isUpperCase(kalimat.charAt(i))) {
                count++;
            }
        }

        System.out.println("Jumlah kata dalam camelCase: " + count);
    }
}
