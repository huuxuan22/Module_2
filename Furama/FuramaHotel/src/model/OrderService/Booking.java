package model.OrderService;

import Repository.InterfaceRepository.IBookingRepository;

import java.util.ArrayList;
import java.util.Date;

public class Booking  extends OrderService implements IBookingRepository {
    private String maBooking;
    private Date ngayBooking;

    public Booking(Date ngayThue, Date ngayHetThue, String maKhachHang, String maDichVu, String maBooking, Date ngayBooking) {
        super(ngayThue, ngayHetThue, maKhachHang, maDichVu);
        this.maBooking = maBooking;
        this.ngayBooking = ngayBooking;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public Date getNgayBooking() {
        return ngayBooking;
    }

    public void setNgayBooking(Date ngayBooking) {
        this.ngayBooking = ngayBooking;
    }
    Booking(){

    }

    @Override
    public String toString() {
        return "Booking{" +
                "maBooking='" + maBooking + '\'' +
                ", ngayBooking=" + ngayBooking +
                "} " + super.toString();
    }

    @Override
    public void createBooking() {

    }

    @Override
    public void readBooking() {

    }

    @Override
    public ArrayList<OrderService> updateBooking(String maBooking) {
        return null;
    }

    @Override
    public ArrayList<OrderService> deletebooking(String maBooking) {
        return null;
    }
}
