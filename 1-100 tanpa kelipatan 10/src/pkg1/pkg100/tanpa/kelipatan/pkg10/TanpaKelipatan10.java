
package pkg1.pkg100.tanpa.kelipatan.pkg10;

public class TanpaKelipatan10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 10!= 0) { // jika bukan kelipatan 10
                System.out.print(i + " ");
            }
        }
    } 
} 
