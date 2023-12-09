package Repository.InterfaceRepository;

import model.Facility.Facility;
import model.Facility.House;
import model.Facility.Room;
import model.Facility.Villa;

import java.util.ArrayList;
import java.util.List;

public interface IFacilityRepository extends Repository {
    // các interface của thằng villa
    Villa addVilla(Villa villa);
    void updateVilla(String maDichVu);
    void deleteVilla(String maDichVu);
    List<Villa> getAllVilla();

    // các interface của thằng House
    House addHouse(House house);
    void updateHouse(String maDichVu);
    void deleteHouse(String maDichVu);
    List<House> getAllHouse();

    // các interFace của thằng Room
    Room addRoom(Room room);
    void updateRoom(String maDichVu);
    void deleteRoom(String maDichVu);
    List<Room> getAllRoom();
}
