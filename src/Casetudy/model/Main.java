package Casetudy.model;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static StaffManager staffManager;
    public static void main(String[] args) {
//        staffManager = new StaffManager();
        Scanner scanner = new Scanner(System.in);
//        staffManager.add(new Staff("bac",4,true,false));
//        staffManager.add(new Staff("bac",4,true,false));
//        staffManager.add(new Staff("apkllll",4,true,false));
//
//        staffManager.print();
//        staffManager.find("bac");
//        staffManager.deleteByName("5");
//        staffManager.print();
        String pass = scanner.nextLine();
        Pattern pattern=Pattern.compile("[a-zA-Z0-9]{6,8}");
        Matcher matcher = pattern.matcher(pass);
        ;
        System.out.println(matcher.matches());

    }
}
