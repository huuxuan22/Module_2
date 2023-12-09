package Controller;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("---------------------MeNu-----------------");
            System.out.println("1. Employee Management\n" +
                               "2. Customer Management\n" +
                               "3. Facility Management\n" +
                               "4. Booking Management\n" +
                               "5. Promotion Management\n" +
                               "6. Exit");
            System.out.println("---------------------MeNu-----------------");

            System.out.println("Đưa ra lựa chọn của bạn.");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("1. Display list employees\n" +
                            "2. Add new employee\n" +
                            "3. Edit employee\n" +
                            "4. Return main menu\n");
                    try{
                        int chooseMenuE = 0;
                        do {
                            System.out.println("Đưa ra lựa chọn của bạn: ");
                            chooseMenuE = Integer.parseInt(scanner.nextLine());
                            switch (chooseMenuE){
                                case 1:
                                    // hiển thị danh sách Employee
                                    break;
                                case 2:
                                    //thêm 1 Emolyee mới
                                    break;
                                case 3:
                                    // chỉnh sửa thông tin của Employee
                                    break;
                            }
                        }while (chooseMenuE != 4);
                    }catch (Exception e){
                        System.out.println("lựa chọn menu Employeee sai (Controller)");
                    }
                    break;
                case 2:
                    System.out.println("1. Display list customers\n" +
                            "2. Add new customer\n" +
                            "3. Edit customer\n" +
                            "4. Return main menu");
                    try{
                        int chooseMenuE = 0;
                        do {
                            System.out.println("Đưa ra lựa chọn của bạn: ");
                            chooseMenuE = Integer.parseInt(scanner.nextLine());
                            switch (chooseMenuE){
                                case 1:
                                    // hiển thị danh sách Customer
                                    break;
                                case 2:
                                    //thêm 1 Customer mới
                                    break;
                                case 3:
                                    // chỉnh sửa thông tin của Customer
                                    break;
                            }
                        }while (chooseMenuE != 4);// lựa chọn 4 để thoát khỏ chương trình
                    }catch (Exception e){
                        System.out.println("lựa chọn menu Customer sai (Controller)");
                    }
                    break;
                case 3:
                    System.out.println("1 Display list facility\n" +
                            "2 Add new facility\n" +
                            "3 Display list facility maintenance\n" +
                            "4 Return main menu");
                    try{
                        int chooseMenuE = 0;
                        do {
                            System.out.println("Đưa ra lựa chọn của bạn: ");
                            chooseMenuE = Integer.parseInt(scanner.nextLine());
                            switch (chooseMenuE){
                                case 1:
                                    // hiển thị danh sách Facility
                                    break;
                                case 2:
                                    //thêm 1 Facility mới
                                    break;
                                case 3:
                                    // chỉnh sửa thông tin của Facility
                                    break;
                            }
                        }while (chooseMenuE != 4);// lựa chọn 4 để thoát khỏ chương trình
                    }catch (Exception e){
                        System.out.println("lựa chọn menu Facility sai (Controller)");
                    }
                    break;
                case 4:
                    System.out.println("Add new booking\n" +
                            "2. Display list booking\n" +
                            "3. Create new contracts\n" +
                            "4. Display list contracts\n" +
                            "5. Edit contracts\n" +
                            "6. Return main menu");
                    try{
                        int chooseMenuE = 0;
                        do {
                            System.out.println("Đưa ra lựa chọn của bạn: ");
                            chooseMenuE = Integer.parseInt(scanner.nextLine());
                            switch (chooseMenuE){
                                case 1:
                                    // hiển thị danh sách Booking
                                    break;
                                case 2:
                                    //Hiển thị danh sách Booking
                                    break;
                                case 3:
                                    // Tạo 1 cái hợp đồng
                                    break;
                                case 4:
                                    //hiển thị thông tin của hợp đồng
                                    break;
                                case 5:
                                    //chỉnh sửa hợp đồng.
                                    break;
                            }
                        }while (chooseMenuE != 6);// lựa chọn 4 để thoát khỏ chương trình
                    }catch (Exception e){
                        System.out.println("lựa chọn menu Booking sai (Controller)");
                    }
                    break;
                case 5:
                    System.out.println("1. Display list customers use service\n" +
                            "2. Display list customers get voucher\n" +
                            "3. Return main menu");
                    try{
                        int chooseMenuE = 0;
                        do {
                            System.out.println("Đưa ra lựa chọn của bạn: ");
                            chooseMenuE = Integer.parseInt(scanner.nextLine());
                            switch (chooseMenuE){
                                case 1:
                                    // hiển thị danh sách Customer sử dụng dịch vụ
                                    break;
                                case 2:
                                    //tHiển thị danh sách khách hàng nhận voucher
                                    break;
                            }
                        }while (chooseMenuE != 3);// lựa chọn 4 để thoát khỏ chương trình
                    }catch (Exception e){
                        System.out.println("lựa chọn menu sai ở Phần thứ 6 (Controller)");
                    }
                    break;
            }
        }while(choose != 6);// thoát khỏi chương trình menu
    }
}
