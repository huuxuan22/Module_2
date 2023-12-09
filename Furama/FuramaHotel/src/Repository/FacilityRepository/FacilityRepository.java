package Repository.FacilityRepository;

import Repository.InterfaceRepository.IFacilityRepository;
import Service.FacilityServvice.CrudFacility;
import model.Facility.Facility;
import model.Facility.House;
import model.Facility.Room;
import model.Facility.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacilityRepository implements IFacilityRepository {
    private IFacilityRepository facilityRepository= new FacilityRepository();
    private Scanner scanner;

    public FacilityRepository() {
        this.scanner = new Scanner(System.in);
    }


    @Override
    public Villa addVilla(Villa villa) {
        return villa;
    }

    @Override
    public void updateVilla(String maDichVu) {

    }

    @Override
    public void deleteVilla(String maDichVu) {

    }

    @Override
    public List<Villa> getAllVilla() {
        return null;
    }

    @Override
    public House addHouse(House house) {
        return house;
    }

    @Override
    public void updateHouse(String maDichVu) {

    }

    @Override
    public void deleteHouse(String maDichVu) {

    }

    @Override
    public List<House> getAllHouse() {
        return null;
    }

    @Override
    public Room addRoom(Room room) {
        return room;
    }

    @Override
    public void updateRoom(String maDichVu) {

    }

    @Override
    public void deleteRoom(String maDichVu) {

    }

    @Override
    public List<Room> getAllRoom() {
        return null;
    }

    @Override
    public ArrayList<Facility> getAll() {

        return null;
    }

    @Override
    public void add() {
        ArrayList<Facility> listFacility = (ArrayList<Facility>) facilityRepository.getAll();
        try{
            System.out.println("NHẬP THÔN TIN CỦA FACILITY");
            // nhập mã dịch vụ
            System.out.println("Mã dịch vụ: ");
            String maDichVu = scanner.nextLine();
            // nhập tên của dịch vụ
            System.out.println("Tên ichjh vụ: ");
            String tenDichVu = scanner.nextLine();
            // Nhập diện tích sử dụng
            System.out.println("diện tích dử dụng");
            int usebleArea = Integer.parseInt(scanner.nextLine());
            // Nhập chi phí
            System.out.println("Chi phí: ");
            double chiPhi = Double.parseDouble(scanner.nextLine());
            //Nhập số lượng người
            System.out.println("So Lượng người: ");
            int soLuongNguoi = Integer.parseInt(scanner.nextLine());
            //Nhập kiểu thuê
            System.out.println("Kiểu thuê: ");
            String kieuThue = scanner.nextLine();
            // chọn những kiểu dịch vụ để thêm vào danh sách cần làm
            System.out.println("1. thêm House\n" +
                               "2. Thêm Room\n" +
                               "3. thêm Villa");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    // Nhập tiêu chuẩn phòng
                    System.out.println("Tiêu chuẩn phòng: ");
                    String tieuChuanPhong = scanner.nextLine();
                    // Nhập số tầng
                    System.out.println("Số tầng: ");
                    int soTang = Integer.parseInt(scanner.nextLine());
                    //(String maDichVu, String tenDichVu, String dienTichSuDung, double chiPhi, int soLuongNguoi, String kieuThue, String tieuChuanPhong, int soTang
                    listFacility.add(new House(maDichVu,tenDichVu,usebleArea,chiPhi,soLuongNguoi,kieuThue,tieuChuanPhong,soTang));
                    break;
                case 2:
                    // Nhập dịch vụ miễn phis
                    System.out.println("Dịch vụ miễn Phí: ");
                    String dichVuFree = scanner.nextLine();
                    listFacility.add(new Room(maDichVu,tenDichVu,usebleArea,chiPhi,soLuongNguoi,kieuThue,dichVuFree));
                    break;
                case 3:
                    //Nhập tiêu chuẩn phòng
                    System.out.println("Tiêu chuẩn phòng: ");
                    String tieuChuan = scanner.nextLine();
                    // Nhập diện tích
                    System.out.println("Diện tích: ");
                    int area = Integer.parseInt(scanner.nextLine());
                    // Nhập số tầng
                    System.out.println("Số tầng: ");
                    int Tang = Integer.parseInt(scanner.nextLine());
                    listFacility.add(new Villa(maDichVu,tenDichVu,usebleArea,chiPhi,soLuongNguoi,kieuThue,tieuChuan,area,Tang));
            }
        }catch (Exception e){
            System.out.println("sai ở phần nhập dữ liệu cho Facility trong repository" + e.getMessage());
        }

    }

    public void display(){
        ArrayList<Facility> listFacility = (ArrayList<Facility>) facilityRepository.getAll();
       try{
           for (int i=0;i<listFacility.size();i++){
               System.out.println(listFacility.get(i).toString());
           }
       }catch (Exception e){
           System.out.println("xuất thông tin của danh sách trong Facility trong repository không dúng!@@@@@");
       }
    }
    @Override
    public void update(String maDichVu) {

    }

    @Override
    public void delete(String maDichVu) {

    }

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        CrudFacility crudFacility = new CrudFacility(scanner1);
        crudFacility.add();
        crudFacility.display();
    }
}
