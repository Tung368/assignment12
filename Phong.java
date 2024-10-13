package assignment12;

import java.util.Date;

public class Phong implements IPhong {

    protected String maPhong;
    protected String hangPhong;
    protected Date ngayThue;
    protected Date ngayTra;
    protected double donGia;

    public Phong(String maPhong, String hangPhong, Date ngayThue, Date ngayTra) {
        this.maPhong = maPhong;
        this.hangPhong = hangPhong;
        this.ngayThue = ngayThue;
        this.ngayTra = ngayTra;
        this.donGia = layDonGia(hangPhong);
    }

    private double layDonGia(String hangPhong) {
        switch (hangPhong) {
            case "A":
                return 1200000;
            case "B":
                return 1000000;
            case "C":
                return 750000;
            default:
                return 0;
        }
    }

    private int tinhSoNgayThue() {
        long diffInMillies = Math.abs(ngayTra.getTime() - ngayThue.getTime());
        long diff = diffInMillies / (1000 * 60 * 60 * 24);
        return diff == 0 ? 1 : (int) diff;
    }

    @Override
    public double tinhTienThue() {
        int soNgayThue = tinhSoNgayThue();
        return donGia * soNgayThue;
    }

}
