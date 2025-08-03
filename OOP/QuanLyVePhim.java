import java.util.ArrayList;
import java.util.List;

public class QuanLyVePhim {
    private List<Ve> dsVe;
    private List<Phim> dsPhim;

    public QuanLyVePhim() {
        this.dsVe = new ArrayList<>();
        this.dsPhim = new ArrayList<>();
    }

    public QuanLyVePhim(List<Ve> dsVe, List<Phim> dsPhim) {
        this.dsVe = new ArrayList<>();
        this.dsPhim = new ArrayList<>();
    }

    public void themDSVe(Ve ve){
        dsVe.add(ve);
    }

    public void themDSPhim(Phim phim){
        dsPhim.add(phim);
    }

    public int tongtienVe(){
        int tongtien = 0;
        for(Ve ve : dsVe){
            tongtien = tongtien + ve.getSoluongVeMua() * 100000;
        }
        return tongtien;
    }

    //Bổ sung chức năng xóa vé

    public void hienthiThongTin(){
        System.out.println("=========DANH SÁCH VÉ ĐÃ BÁN=========");
        for(Ve ve: dsVe){
            String tenPhim = ve.getTenPhim().getTemPhim();
            String tenKhachHang = ve.getDsKhachHang().getTenKH();
            int soLuong = ve.getSoluongVeMua();
            int tongTien = soLuong * 100000;
            System.out.println("Phim: " + tenPhim + " | Khách: " + tenKhachHang + " | Số lượng: " + soLuong + " | Tổng tiền: " + tongTien + " VNĐ");
        }
    }
}


//Câu 2: Một hệ thống bán vé xem phim cần quản lý các thông tin sau:
//Phim: mã phim, tên phim, thời lượng (phút).
//Khách hàng: mã KH, tên KH, số điện thoại.
//Vé: mã vé, ngày xem, phim, khách hàng, số lượng vé mua.
//Yêu cầu:
//Thiết kế các lớp: Phim, KhachHang, Ve, áp dụng OOP.
//Tạo danh sách vé, nhập liệu mẫu.
//Viết hàm hiển thị danh sách vé đã bán, bao gồm tên phim, tên khách hàng và tổng tiền (giả sử 1 vé = 100,000 VNĐ).
