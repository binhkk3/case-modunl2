package Casetudy.model;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class MainAccount {
    public static void menuAccount() throws IOException {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);
        map.put("abcd",1234);
        map.put("abcf",1234);
        map.put("abck",1234);
        map.put("abcl",1234);
        int input;
        do {
            System.out.println("nhập 1 để vào tài khoản của bạn: ");
            System.out.println("nhập 2 để tạo tài khoản");
            System.out.println("nhập 0 để thoát");
            input = scanner.nextInt();
            if (input==1||input==2){
                switch (input){
                    case 1:
                        System.out.println("nhập vào tài khoải của bạn: ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("nhập pass word  của bạn: ");
                        int pass = scanner.nextInt();
                        if (map.containsKey(name)&&map.get(name)==pass){
                                MenuStaff.manageStaff();
                                break;
                            }
                            else {
                            System.out.println("bạn đã snhập sai bạn còn 2 lần nhập thử: ");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("nhập vào tài khoải của bạn: ");
                            String name1 = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("nhập pass word  của bạn: ");
                            int pass1 = scanner.nextInt();
                            if (map.containsKey(name1)&&map.get(name1)==pass1){
                                MenuStaff.manageStaff();
                                break;
                            }
                                else {
                                    System.out.println("bạn đã nhập sai bạn còn 1 lần nhập thử: ");
                                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println("nhập vào tài khoải của bạn: ");
                                scanner.nextLine();
                                String name2 = scanner.nextLine();
                                System.out.println("nhập pass word  của bạn: ");
                                int pass2 = scanner.nextInt();
                                if (map.containsKey(name2)&&map.get(name2)==pass2){
                                    MenuStaff.manageStaff();
                                    break;
                                }

                                    else {
                                        System.out.println("bạn đã nhập quá số lần quy định: ");
                                        System.out.println("nếu bạn không có tài khoản xin mời tạo tài khoản rồi thử lại: ");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
                                        menuAccount();

                                    }
                                }
                            }
                    case 2:
                        System.out.println("nhập vào tên tài khoản bạn muốn: ");
                        scanner.nextLine();
                        String nameAccount = scanner.nextLine();
                        System.out.println("nhập pass word của bạn");
                        //scanner.nextLine();
                        int passWord = scanner.nextInt();
                        if (map.containsKey(nameAccount)){
                            System.out.println("tên tài khoản bị trùng mời bạn tạo lại: ");
                            menuAccount();
                        }
                        else {
                            map.put(nameAccount,passWord);
                            break;
                        }
                        }

                }

        }
        while (input!= 0);
    }

    public static void main(String[] args) throws IOException {
        menuAccount();
    }

}
