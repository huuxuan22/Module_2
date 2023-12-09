package Service.InterfaceService;

import model.Facility.Facility;
import model.Facility.House;
import model.Facility.Room;
import model.Facility.Villa;

import java.util.ArrayList;
import java.util.List;

public interface IFacilityService extends Service{
    void addVilla(Villa villa);
    void updateVilla(String maDichVu);
    void deleteVilla(String maDichVu);
    ArrayList<Villa> getAllVilla();

    // các interface của thằng House
    void addHouse(House house);
    void updateHouse(String maDichVu);
    void deleteHouse(String maDichVu);
    List<House> getAllHouse();

    // các interFace của thằng Room
    void addRoom(Room room);
    void updateRoom(String maDichVu);
    void deleteRoom(String maDichVu);
    List<Room> getAllRoom();
}
