import java.util.Scanner;
public class SIAKAD19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" Masukkan jumlah Mahasiswa: ");
        int mahasiswa = sc.nextInt();
        System.out.print(" Masukkan Jumlah Mata Kuliah : ");
        int matKul = sc.nextInt();
        int[][] nilai = new int[mahasiswa][matKul];

        for (int i = 0; i < nilai.length; i++ ) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            for(int j =0 ; j< nilai[i].length; j++) {
                System.out.println("Nilai mata kuliah " + (j+1) + ": " );
                nilai[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;
            
            for(int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
        }

        System.out.println("\n==============================");
        System.out.println("Rata - Rata Nilai setiap mata kuliah : ");

        for (int j = 0; j< matKul; j++) {
            double totalPerMatkul = 0;
             
            for(int i = 0;i < mahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul / mahasiswa);
        }

    }
}