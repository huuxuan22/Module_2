package Repository.InterfaceRepository;

import model.OrderService.OrderService;

import java.util.ArrayList;

public interface IBookingRepository {
    void createBooking();
    void readBooking();
    ArrayList<OrderService> updateBooking(String maBooking);
    ArrayList<OrderService> deletebooking(String maBooking);
}
