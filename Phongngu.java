package assignment12;

import java.util.Date;

public class Phongngu extends Phong {

    private int soGiuong;

    public Phongngu(String maPhong, String hangPhong, Date ngayThue, Date ngayTra, int soGiuong) {
        super(maPhong, hangPhong, ngayThue, ngayTra);
        this.soGiuong = soGiuong;
    }

}
