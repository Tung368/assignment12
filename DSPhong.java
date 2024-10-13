package assignment12;

import java.util.ArrayList;

public class DSPhong {

    private ArrayList<Phong> danhSachPhong;

    public DSPhong() {
        this.danhSachPhong = new ArrayList<>();
    }

    public void themPhong(Phong phong) {
        danhSachPhong.add(phong);
    }

    public void xoaPhong(String maPhong) {
        danhSachPhong.removeIf(phong -> phong.maPhong.equals(maPhong));
    }

    public void capNhatPhong(String maPhong, Phong phongMoi) {
        for (int i = 0; i < danhSachPhong.size(); i++) {
            if (danhSachPhong.get(i).maPhong.equals(maPhong)) {
                danhSachPhong.set(i, phongMoi);
                break;
            }
        }
    }

    public void thongKeSoLuongTheoHang() {
        int soLuongA = 0, soLuongB = 0, soLuongC = 0;
        for (Phong phong : danhSachPhong) {
            switch (phong.hangPhong) {
                case "A":
                    soLuongA++;
                    break;
                case "B":
                    soLuongB++;
                    break;
                case "C":
                    soLuongC++;
                    break;
            }
        }
        System.out.println("Số lượng phòng hạng A: " + soLuongA);
        System.out.println("Số lượng phòng hạng B: " + soLuongB);
        System.out.println("Số lượng phòng hạng C: " + soLuongC);
    }

    public double tinhTongTienThue() {
        double tongTien = 0;
        for (Phong phong : danhSachPhong) {
            tongTien += phong.tinhTienThue();
        }
        return tongTien;
    }

    public void taoMenu() {

    }
}
