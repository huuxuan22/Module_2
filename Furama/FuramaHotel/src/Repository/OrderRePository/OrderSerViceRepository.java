package Repository.OrderRePository;

import Repository.InterfaceRepository.IBookingRepository;
import Repository.InterfaceRepository.IContactRepository;
import model.OrderService.OrderService;

import java.util.ArrayList;

public class OrderSerViceRepository implements IBookingRepository, IContactRepository {
    private  ArrayList<OrderService> listOrderService  = new ArrayList<>();


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
    @Override
    public ArrayList<OrderService> getAll(){
        return listOrderService;
    }
    @Override
    public void createContact() {

    }

    @Override
    public void readContact() {

    }

    @Override
    public ArrayList<OrderService> updateContact(String maBooking) {
        return null;
    }

    @Override
    public ArrayList<OrderService> deleteContact(String maBooking) {
        return null;
    }
}
