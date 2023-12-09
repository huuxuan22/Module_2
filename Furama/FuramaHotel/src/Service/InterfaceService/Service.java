package Service.InterfaceService;

import java.util.ArrayList;
import java.util.List;

public interface Service<T> {
    List<T> getAll();
    void add();
    void update(String id);
    void delete(String id);
}
