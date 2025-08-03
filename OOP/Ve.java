package working_dir.Cau3_4_test.OOP;

import working_dir.Cau3_4_test.OOP.KhachHang;

import java.util.Date;

public class Ve {
    private String maVe;
    private Date ngayXem;
    private Phim phim;
    private KhachHang khachHang;
    private int soluongVeMua;

    public Ve() {
    }

    public Ve(String maVe, Date ngayXem, Phim phim, KhachHang khachHang, int soluongVeMua) {
        this.maVe = maVe;
        this.ngayXem = ngayXem;
        this.phim = phim;
        this.khachHang = khachHang;
        this.soluongVeMua = soluongVeMua;
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public Date getNgayXem() {
        return ngayXem;
    }

    public void setNgayXem(Date ngayXem) {
        this.ngayXem = ngayXem;
    }

    public Phim getTenPhim() {
        return phim;
    }

    public void setTenPhim(Phim phim) {
        this.phim = phim;
    }

    public KhachHang getDsKhachHang() {
        return khachHang;
    }

    public void setDsKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public int getSoluongVeMua() {
        return soluongVeMua;
    }

    public void setSoluongVeMua(int soluongVeMua) {
        this.soluongVeMua = soluongVeMua;
    }

    @Override
    public String toString() {
        return "Ve{" +
                "maVe='" + maVe + '\'' +
                ", ngayXem=" + ngayXem +
                ", tenPhim='" + phim.toString() + '\'' +
                ", dsKhachHang=" + khachHang.toString() +
                ", soluongVeMua=" + soluongVeMua +
                '}';
    }
}
