package B2;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MangeDocuments mangeDocuments = new MangeDocuments();
        while(true){
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Show");
            System.out.println("4. Search");
            System.out.println("5. Exit");

            String choose = scanner.nextLine();
            switch(choose){
                case "1":
                    System.out.println("1. Book");
                    System.out.println("2. Magazine");
                    System.out.println("3. Newpapers");
                    choose=scanner.nextLine();
                    switch (choose) {
                        case "1":
                            System.out.print("Enter ID: ");
                            int id = scanner.nextInt();
                            System.out.print("Enter nxb:");
                            String nxb = scanner.nextLine();
                            System.out.print("Enter number: ");
                            int number = scanner.nextInt();
                            System.out.print("Enter author: ");
                            scanner.nextLine();
                            String author = scanner.nextLine();
                            System.out.print("Enter page number: ");
                            String pageNumber = scanner.nextLine();
                            Documents book = new Books(id, author, number, nxb, pageNumber);
                            mangeDocuments.addDocuments(book);
                            break;
                        
                        case "2":
                            

                            break;

                        case "3":
                            break;

                        
                    }
                    break;
                case "2":
                     
                    break;
            }
        }
    }

}
