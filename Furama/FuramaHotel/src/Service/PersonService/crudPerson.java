package Service.PersonService;

import Repository.InterfaceRepository.ICustomerRepository;
import Repository.InterfaceRepository.IEmployeeRepository;
import model.Person.Customer;
import model.Person.Employee;
import model.Person.Person;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class crudPerson implements ICustomerRepository, IEmployeeRepository {
    protected ArrayList<Person> listPerson;
    private Scanner scanner;

    public crudPerson(ArrayList<Person> listPerson, Scanner scanner) {
        this.listPerson = listPerson;
        this.scanner = scanner;
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

    // thêm thông tin cho Customer vào trong bảng
}
