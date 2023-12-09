package Repository.InterfaceRepository;

import model.Facility.House;

import java.util.List;

public interface Repository<T> {
     List<T> getAll();
     void add();
     void update(String id );
     void delete(String id);

}
