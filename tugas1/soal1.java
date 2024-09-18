package tugas1;

public class soal1 {
    public static void main(String[] args) {
        int[] ar = {7, 6, 2};
        int jmlh = 0;
        for (int angka : ar) {
            jmlh += angka;
        }
        System.out.println("Jumlah dari elemen-elemen array adalah: " + jmlh);
    }
}
