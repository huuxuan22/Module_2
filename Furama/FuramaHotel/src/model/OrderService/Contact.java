package model.OrderService;

import Repository.InterfaceRepository.IContactRepository;

import java.util.ArrayList;
import java.util.Date;

public class Contact extends OrderService{
    private String soHopDong;
    private int tienCoc;
    private int tomTien;
    private String maBooking;

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public int getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(int tienCoc) {
        this.tienCoc = tienCoc;
    }

    public int getTomTien() {
        return tomTien;
    }

    public void setTomTien(int tomTien) {
        this.tomTien = tomTien;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public Contact(Date ngayThue, Date ngayHetThue, String maKhachHang, String maDichVu, String soHopDong, int tienCoc, int tomTien, String maBooking) {
        super(ngayThue, ngayHetThue, maKhachHang, maDichVu);
        this.soHopDong = soHopDong;
        this.tienCoc = tienCoc;
        this.tomTien = tomTien;
        this.maBooking = maBooking;
    }
}
