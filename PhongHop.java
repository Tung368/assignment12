package assignment12;

import java.util.Date;

public class PhongHop extends Phong {
    private int soGhe;

    public PhongHop(String maPhong, String hangPhong, Date ngayThue, Date ngayTra, int soGhe) {
        super(maPhong, hangPhong, ngayThue, ngayTra);
        this.soGhe = soGhe;
    }


}
