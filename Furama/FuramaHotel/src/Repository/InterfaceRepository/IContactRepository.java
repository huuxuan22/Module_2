package Repository.InterfaceRepository;

import model.OrderService.OrderService;

import java.util.ArrayList;

public interface IContactRepository {
    void createContact();
    void readContact();
    ArrayList<OrderService> updateContact(String maBooking);
    ArrayList<OrderService> deleteContact(String maBooking);
    ArrayList<OrderService> getAll();
}
