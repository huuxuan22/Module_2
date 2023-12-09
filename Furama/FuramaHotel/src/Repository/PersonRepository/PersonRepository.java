package Repository.PersonRepository;

import Repository.InterfaceRepository.ICustomerRepository;
import Repository.InterfaceRepository.IEmployeeRepository;
import model.Person.Person;

import java.util.ArrayList;

public class PersonRepository implements ICustomerRepository, IEmployeeRepository {
    private ArrayList<Person> listPerson;

    public PersonRepository(ArrayList<Person> listPerson) {
        this.listPerson = listPerson;
    }

    @Override
    public void createCustomer() {

    }

    @Override
    public void readCustomer() {

    }

    @Override
    public ArrayList<Person> updateCustomer(String maKhachHang) {
        return null;
    }

    @Override
    public ArrayList<Person> deleteCustomer(String maKhachHang) {
        return null;
    }

    @Override
    public void createEmployee() {

    }

    @Override
    public void readEmployee() {

    }

    @Override
    public ArrayList<Person> updateEmoloyee(String makhachHang) {
        return null;
    }

    @Override
    public ArrayList<Person> deleteEmployee(String maKhachhang) {
        return null;
    }
}
