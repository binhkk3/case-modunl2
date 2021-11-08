package Casetudy.model;

import java.io.IOException;
import java.util.Scanner;

public class MenuStaff {
    private static StaffManager staffManager;
    public static void manageStaff() throws IOException {
        staffManager = new StaffManager();
        Scanner scanner = new Scanner(System.in);
        staffManager.add(new Staff("lê văn a",4,true,true));
        staffManager.add(new Staff("nguyễn văn b",4,false,false));
        staffManager.add(new Staff("trương đình c",4,true,false));
        int input;
        do {
            System.out.println("nhập  0 để thoát khỏi chương trình: ");
            System.out.println("nhập  1 để nhập thêm nhân viên vào: ");
            System.out.println("nhập 2 để tìm kiếm nhân viên bạn muốn: ");
            System.out.println("nhập 3 đê in ra danh sách nhân viên của bạn");
            System.out.println("nhập 4 để xóa nhân viên bạn muốn");
            System.out.println("nhập 5 để sửa thông tin nhân viên bạn muốn");
            System.out.println("nhập 6 để in ra danh sách bạn muốn dưới dạng csv");
            System.out.println("nhập 7 để in ra danh sách bảng lương bạn cần");
            input = scanner.nextInt();
            if (input>0 && input<9){
                switch (input){
                    case 1:
                        System.out.println("nhập vào tên nhân viên bạn muốn thêm: ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        if (staffManager.findname(name)==-1){
                            System.out.println("nhập vào tuổi nhân viên: ");
                            int age = scanner.nextInt();
                            System.out.println("nhập vào 1 nếu làm full time nhâp vào 2 nếu là part time");
                            int index1 =scanner.nextInt();
                            boolean type;
                            if (index1 == 1){
                                type = true;
                            }
                            else type = false;
                            scanner.nextLine();
                            System.out.println("nhập vào trạng thái làm việc true là đang là false là đang nghỉ: ");
                            int index = scanner.nextInt();
                            boolean status;
                            if (index == 1){
                                status = true;
                            }
                            else status = false;
                            staffManager.add(new Staff(name,age,type,status));

                        }
                        else {
                            System.out.println("mời bạn nhập lại tên vì đã trùng tên: ");
                            System.out.println("************************************");
                            break;
                        }
                        break;
                    case 2:
                        System.out.println("nhập vào tên bạn muốn tìm: ");
                        scanner.nextLine();
                        String nameFind = scanner.nextLine();
                        staffManager.find(nameFind);
                        break;
                    case 3:
                        staffManager.print();
                        break;
                    case 4:
                        System.out.println("nhập tên bạn muốn xóa: ");
                        scanner.nextLine();
                        String nameDelete =scanner.nextLine();
                        staffManager.deleteByName(nameDelete);
                    case 5:
                        System.out.println("nhập tên bạn cần sửa: ");
                        scanner.nextLine();
                        String nametoEdit = scanner.nextLine();
                        if(staffManager.findname(nametoEdit)==-1){
                            System.out.println("tên bạn cần tìm ko có");
                            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                            break;
                        }
                        System.out.println("nhập tên bạn muốn sửa lại: ");
                        String nameEdit = scanner.nextLine();
                        if (staffManager.findname(nameEdit)==-1){
                            System.out.println("nhập vào tuổi  nhân viên: ");
                            int age = scanner.nextInt();
                            System.out.println("nhập vào true nếu làm full time false nếu là part time");
                            int index1 =scanner.nextInt();
                            boolean type;
                            if (index1 == 1){
                                type = true;
                            }
                            else type = false;
                            scanner.nextLine();
                            System.out.println("nhập vào trạng thái làm việc true là đang là false là đang nghỉ: ");
                            int index = scanner.nextInt();
                            boolean status;
                            if (index == 1){
                                status = true;
                            }
                            else status = false;
                            Staff newstaff = new Staff(nameEdit,age,type,status);
                            staffManager.editByName(nameEdit,newstaff);

                        }
                        else {
                            System.out.println("mời bạn nhập lại tên vì đã trùng tên: ");
                            break;
                        }
                        break;
                    case 6:
                        staffManager.printcsv();
                        break;
                    case 7:
                        staffManager.printsalary();
                        break;
                }
            }
        }while (input!=0);

    }
}
