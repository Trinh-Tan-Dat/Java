package practice;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        managerOfficer managerOfficers = new managerOfficer();
        while(true){
            System.out.println("Application Manager Officer");
            System.out.println("1. To insert officer");
            System.out.println("2. To search officer by name");
            System.out.println("3. To show list");
            System.out.println("4. Exit");
            String line = scanner.nextLine();
            switch(line){
                case "1":
                    System.out.println("1. To insert Engineer");
                    System.out.println("2. To insert Staff");
                    System.out.println("3. To insert Worker");
                    String temp = scanner.nextLine();
                    switch(temp){
                        case "1":
                            System.out.println("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.println("Enter age: ");
                            int age = scanner.nextInt();
                            System.out.println("Enter gender");
                            String gender = scanner.nextLine();
                            System.out.println("Enter address");
                            String address = scanner.nextLine();
                            System.out.println("Enter branch");
                            String branch = scanner.nextLine();
                            officer engineers = new engineer(name, age, gender, address, branch);
                            managerOfficers.addOfficer(engineers);
                            System.out.println(engineers.toString());
                            break;
                    }
                    break;
                case "2":
                    System.out.println("Enter name to search: ");
                    String name = scanner.nextLine();
                    break;
                case "3":
                    managerOfficers.showListInforOfficer();
                    break;
                case "4":
                    return;
            }
        }
    }
    
}
