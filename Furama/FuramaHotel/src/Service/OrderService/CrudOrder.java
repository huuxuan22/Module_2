package Service.OrderService;

import Repository.InterfaceRepository.IBookingRepository;
import Repository.InterfaceRepository.IContactRepository;
import Repository.OrderRePository.OrderSerViceRepository;
import Service.InterfaceService.IBookingSerVice;
import Service.InterfaceService.IContactService;
import Service.InterfaceService.Service;
import model.OrderService.Booking;
import model.OrderService.Contact;
import model.OrderService.OrderService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CrudOrder implements IBookingSerVice, IContactService {
    private IContactRepository orderSerViceContact = new OrderSerViceRepository();
    private IContactRepository orderServiceBooking = new OrderSerViceRepository();

    private Scanner scanner;

    public CrudOrder(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public List getAll() {
        return null;
    }

    @Override
    public void add() {

    }


    @Override
    public void update(String maBooking) {

    }

    @Override
    public void delete(String maBooking) {

    }
}
