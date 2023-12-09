package Repository.InterfaceRepository;

import model.Person.Person;

import java.util.ArrayList;

public interface IEmployeeRepository {
    void createEmployee();
    void readEmployee();
    ArrayList<Person> updateEmoloyee(String makhachHang);
    ArrayList<Person> deleteEmployee(String maKhachhang);
}
