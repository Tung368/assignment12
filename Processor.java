package assignment12;


    import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        DSPhong dsPhong = new DSPhong();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Them phong");
            System.out.println("2. Xoa phong");
            System.out.println("3. Cap nhat phong");
            System.out.println("4. Thong ke so luong theo hang phong");
            System.out.println("5. Tinh tong tien thue");
            System.out.println("6. Thoat");
            System.out.print("Chon chuc nang: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhap ma phong: ");
                    String maPhong = scanner.nextLine();
                    System.out.print("Nhap hang phong (A/B/C): ");
                    String hangPhong = scanner.nextLine();
                    System.out.print("Nhap ngay thue (dd/MM/yyyy): ");
                    Date ngayThue = null;
                    Date ngayTra = null;
                    try {
                        ngayThue = dateFormat.parse(scanner.nextLine());
                        System.out.print("Nhap ngay tra (dd/MM/yyyy): ");
                        ngayTra = dateFormat.parse(scanner.nextLine());
                    } catch (ParseException e) {
                        System.out.println("Ngay khong hop le!");
                        break;
                    }
                    System.out.print("Chon loai phong (1: Phong ngu, 2: Phong hop): ");
                    int loaiPhong = scanner.nextInt();
                    if (loaiPhong == 1) {
                        System.out.print("Nhap so giuong: ");
                        int soGiuong = scanner.nextInt();
                        Phongngu phongNgu = new Phongngu(maPhong, hangPhong, ngayThue, ngayTra, soGiuong);
                        dsPhong.themPhong(phongNgu);
                    } else if (loaiPhong == 2) {
                        System.out.print("Nhap so ghe: ");
                        int soGhe = scanner.nextInt();
                        PhongHop phongHop = new PhongHop(maPhong, hangPhong, ngayThue, ngayTra, soGhe);
                        dsPhong.themPhong(phongHop);
                    }
                    break;
                case 2:
                    System.out.print("Nhap ma phong can xoa: ");
                    String maPhongXoa = scanner.nextLine();
                    dsPhong.xoaPhong(maPhongXoa);
                    break;
                case 3:
                    System.out.print("Nhap ma phong can cap nhat: ");
                    String maPhongCapNhat = scanner.nextLine();
                    System.out.print("Nhap hang phong moi (A/B/C): ");
                    String hangPhongMoi = scanner.nextLine();
                    System.out.print("Nhap ngay thue moi (dd/MM/yyyy): ");
                    try {
                        ngayThue = dateFormat.parse(scanner.nextLine());
                        System.out.print("Nhap ngay tra moi (dd/MM/yyyy): ");
                        ngayTra = dateFormat.parse(scanner.nextLine());
                    } catch (ParseException e) {
                        System.out.println("Ngay khong hop le!");
                        break;
                    }
                    System.out.print("Chon loai phong moi (1: Phong ngu, 2: Phong hop): ");
                    loaiPhong = scanner.nextInt();
                    if (loaiPhong == 1) {
                        System.out.print("Nhap so giuong moi: ");
                        int soGiuongMoi = scanner.nextInt();
                        Phongngu phongNguMoi = new Phongngu(maPhongCapNhat, hangPhongMoi, ngayThue, ngayTra, soGiuongMoi);
                        dsPhong.capNhatPhong(maPhongCapNhat, phongNguMoi);
                    } else if (loaiPhong == 2) {
                        System.out.print("Nhap so ghe moi: ");
                        int soGheMoi = scanner.nextInt();
                        PhongHop phongHopMoi = new PhongHop(maPhongCapNhat, hangPhongMoi, ngayThue, ngayTra, soGheMoi);
                        dsPhong.capNhatPhong(maPhongCapNhat, phongHopMoi);
                    }
                    break;
                case 4:
                    dsPhong.thongKeSoLuongTheoHang();
                    break;
                case 5:
                    System.out.println("Tong tien thue cua tat ca cac phong: " + dsPhong.tinhTongTienThue());
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }
}


