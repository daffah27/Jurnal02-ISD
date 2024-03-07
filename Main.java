import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        int pilihan;

        do {
            System.out.println("--------------------------");
            System.out.println("Aplikasi Pencatatan Buku");
            System.out.println("--------------------------");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cetak Daftar Buku");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan anda :");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("1. Tambah Buku di Depan");
                    System.out.println("2. Tambah Buku di Belakang");
                    System.out.print("Masukkan Pilihan anda :");
                    int pilihan2 = input.nextInt();
                    switch (pilihan2) {
                        case 1:
                            System.out.print("Masukkan Judul Buku :");
                            String judul = input.next();
                            System.out.print("Masukkan Penulis Buku :");
                            String penulis = input.next();
                            System.out.print("Masukkan Tahun Terbit Buku :");
                            int tahun = input.nextInt();
                            list.tambahDepan(new Buku(judul, penulis, tahun));
                            break;
                        case 2:
                            System.out.print("Masukkan Judul Buku :");
                            String judul2 = input.next();
                            System.out.print("Masukkan Penulis Buku :");
                            String penulis2 = input.next();
                            System.out.print("Masukkan Tahun Terbit Buku :");
                            int tahun2 = input.nextInt();
                            list.tambahBelakang(new Buku(judul2, penulis2, tahun2));
                            break;
                        default:
                            break;
                    }
                    break;

                case 2:
                    System.out.println("1. Hapus Buku di Depan");
                    System.out.println("2. Hapus Buku di Belakang");
                    System.out.print("Masukkan Pilihan anda :");
                    int pilihan3 = input.nextInt();
                    switch (pilihan3) {
                        case 1:
                            list.hapusDepan();
                            break;
                        case 2:
                            list.hapusBelakang();
                            break;
                        default:
                            break;
                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Daftar Buku");
                    System.out.println("--------------------------");
                    list.cetak();
                    System.out.println();
                    break;

                case 4:
                    System.exit(0);
                    break;
            
                default:
                    break;
            }
                
        } while (pilihan != 4);
    }
}