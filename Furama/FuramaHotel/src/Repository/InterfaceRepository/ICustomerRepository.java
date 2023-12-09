package Repository.InterfaceRepository;

import model.Person.Person;

import java.util.ArrayList;

public interface ICustomerRepository {
    void createCustomer();
    void readCustomer();
    ArrayList<Person> updateCustomer(String maKhachHang);
    ArrayList<Person> deleteCustomer(String maKhachHang);
}
