package model.OrderService;

import java.util.Date;

public abstract class OrderService {
    private Date ngayThue;
    private Date ngayHetThue;
    private String maKhachHang;
    private String maDichVu;

    public OrderService(Date ngayThue, Date ngayHetThue, String maKhachHang, String maDichVu) {
        this.ngayThue = ngayThue;
        this.ngayHetThue = ngayHetThue;
        this.maKhachHang = maKhachHang;
        this.maDichVu = maDichVu;
    }

    public OrderService() {
    }

    public Date getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(Date ngayThue) {
        this.ngayThue = ngayThue;
    }

    public Date getNgayHetThue() {
        return ngayHetThue;
    }

    public void setNgayHetThue(Date ngayHetThue) {
        this.ngayHetThue = ngayHetThue;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    @Override
    public String toString() {
        return "OrderService{" +
                "ngayThue=" + ngayThue +
                ", ngayHetThue=" + ngayHetThue +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", maDichVu='" + maDichVu + '\'' +
                '}';
    }
}
