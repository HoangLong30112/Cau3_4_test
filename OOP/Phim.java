public class Phim {
    private String maPhim;
    private String temPhim;
    private int thoiLuong;

    public Phim() {
    }

    public Phim(String maPhim, String temPhim, int thoiLuong) {
        this.maPhim = maPhim;
        this.temPhim = temPhim;
        this.thoiLuong = thoiLuong;
    }

    public String getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(String maPhim) {
        this.maPhim = maPhim;
    }

    public String getTemPhim() {
        return temPhim;
    }

    public void setTemPhim(String temPhim) {
        this.temPhim = temPhim;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    @Override
    public String toString() {
        return "Phim{" +
                "maPhim='" + maPhim + '\'' +
                ", temPhim='" + temPhim + '\'' +
                ", thoiLuong=" + thoiLuong +
                '}';
    }
}
