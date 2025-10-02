package nilaimahasiswa.java;

public class NilaiMahasiswaJava {
    public static void main(String[] args) {
        // Inisialisasi data (hardcode, bukan input Scanner)
        String nama = "Laila Dwi Saputri";
        int nim = 2251706;  
        double uts = 84.0;
        double uas = 96.0;
        double nilaiAkhir = (0.4*uts)+(0.6*uas);
        nilaiAkhir = (uts < 40 && uas < 40) ? 0 : ((uts + uas) / 2);
        nilaiAkhir = (uas > 95) ? (nilaiAkhir +2) : nilaiAkhir;
        
        String grade = (nilaiAkhir >= 85 && nilaiAkhir <= 100) ? "A" :
                       (nilaiAkhir >= 70 && nilaiAkhir <= 84)  ? "B" :
                       (nilaiAkhir >= 55 && nilaiAkhir <= 69)  ? "C" :
                       (nilaiAkhir >= 40 && nilaiAkhir <= 54)  ? "D" : "E";
        
        String status = (nilaiAkhir >= 55) ? "Lulus" : "Tidak Lulus";  
        
        // Output program
        System.out.println("===== Data Nilai Mahasiswa =====");
        System.out.println("Nama Mahasiswa = " + nama);
        System.out.println("NIM            = " + nim);
        System.out.println("Nilai UTS      = " + uts);
        System.out.println("Nilai UAS      = " + uas);
        System.out.printf("Nilai Akhir    = %.2f%n", nilaiAkhir); 
        System.out.println("Grade          = " + grade);
        System.out.println("Status Lulus   = " + status);
    }
}
