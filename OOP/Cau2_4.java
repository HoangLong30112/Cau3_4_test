package working_dir.Cau3_4_test.OOP;

import java.util.Date;

class Cau2_4{
    public static void main(String[] args) {
        QuanLyVePhim qlVePhim = new QuanLyVePhim();

        // Tạo một số phim mẫu
        Phim phim1 = new Phim("P001", "Avengers: Endgame", 180);
        Phim phim2 = new Phim("P002", "Inception", 148);

        // Thêm phim vào danh sách
        qlVePhim.themDSPhim(phim1);
        qlVePhim.themDSPhim(phim2);

        // Tạo khách hàng mẫu
        KhachHang kh1 = new KhachHang("KH001", "Nguyễn Văn A", "0123456789");
        KhachHang kh2 = new KhachHang("KH002", "Trần Thị B", "0987654321");

        // Tạo vé cho các khách hàng
        Ve ve1 = new Ve("V001", new Date(), phim1, kh1, 2);  // 2 vé phim Avengers
        Ve ve2 = new Ve("V002", new Date(), phim2, kh2, 3);  // 3 vé phim Inception

        // Thêm vé vào danh sách
        qlVePhim.themDSVe(ve1);
        qlVePhim.themDSVe(ve2);

        // Hiển thị danh sách vé đã bán
        qlVePhim.hienthiThongTin();

        //Xóa vé phim
        qlVePhim.xoaVePhim("V00001");
        qlVePhim.hienthiThongTin();


        // In tổng tiền tất cả vé đã bán
//        System.out.println("Tổng tiền thu được từ vé: " + qlVePhim.tongtienVe() + " VNĐ");
    }
}
