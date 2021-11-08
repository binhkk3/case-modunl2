package Casetudy.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class StaffManager implements GeneralManager <Staff> {
    private int orderfirst = 1;
    public ArrayList<Staff> staffArrayList;

    public StaffManager(ArrayList<Staff> staffArrayList) {
        this.staffArrayList = staffArrayList;
    }

    public StaffManager() {
        staffArrayList = new ArrayList<>();
    }


    @Override
    public void add(Staff staff) {


        orderfirst++;
        staff.setId(orderfirst);
        staffArrayList.add(staff);


    }


    @Override
    public void editByName(String name, Staff staff) {
        int index = findname(name);
        if (index == -1) {
            System.out.println("không có đối tượng bạn muốn sửa");
        } else {
            staffArrayList.set(index, staff);
        }

    }

    @Override
    public void deleteByName(String name) {
        int index = findname(name);
        if (index == -1) {
            System.out.println("không có nhân viên bạn muốn xóa trong danh sách: ");
        } else {
            staffArrayList.remove(index);
        }


    }

    @Override
    public void print() {
        for (int i = 0; i < staffArrayList.size(); i++) {
            System.out.println(staffArrayList.get(i));
        }
        System.out.println("...........*********************...........");
    }

    public int findname(String name) {
        for (int i = 0; i < staffArrayList.size(); i++) {
            if (staffArrayList.get(i).getName().equals(name.trim().toUpperCase(Locale.ROOT).toUpperCase(Locale.ROOT))) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int find(String name) {
        int account = -1;
        for (int i = 0; i < staffArrayList.size(); i++) {
            if (staffArrayList.get(i).getName().contains(name.trim().toLowerCase(Locale.ROOT).toUpperCase(Locale.ROOT))) {
                System.out.println("nhân viên bạn muốn tìm là:  " + staffArrayList.get(i));
                account++;
                return i;
            }
        }

        System.out.println("không có nhân viên bạn muốn tìm: ");

        return -1;
    }

    @Override
    public void printcsv() throws IOException {
        FileWriter fileWriter = new FileWriter("fileStaff.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str ="name,age,id,type,status,salary";
        for (int i = 0; i < staffArrayList.size(); i++) {
            str += "\n" + staffArrayList.get(i).getName()+"," + staffArrayList.get(i).getAge()+","+staffArrayList.get(i).getId()+","+staffArrayList.get(i).isType()+","+
                    staffArrayList.get(i).isStatus()+","+staffArrayList.get(i).salary(staffArrayList.get(i).isType());
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
    }
    public void printsalary(){
        for (int i = 0; i < staffArrayList.size(); i++) {
         if (staffArrayList.get(i).isType()){
             System.out.println(staffArrayList.get(i).getName()+" 50000000");
         }
         else {
             System.out.println(staffArrayList.get(i).getName()+" 20000000");
         }
        }
    }
}