import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

     static List<Contacts> contactlist = new ArrayList<>();


     public static void view(){
         for( Contacts x : contactlist ){
             System.out.println(x.getName());
         }
     }

    public static int searchName(){
         Scanner input = new Scanner(System.in);
         String userInput;

        System.out.println("enter user name you are looking for");
         userInput = input.next();
        for( Contacts x : contactlist ){
            if(x.getName().contains(userInput)){
                System.out.println("user found");
                int index = x.getName().indexOf(userInput);
                return index;
            }else {
                System.out.println("user is not found");
                return -1;
            }
        }

        return -1;
    }

    public static void delete(){
         
        contactlist.remove(searchName());

    }


     public static void addContact(){

         String name,phone;
         Scanner input = new Scanner(System.in);
         System.out.println("enter your name");

         name = input.next();

         System.out.println("enter your phone number");

         phone = input.next();

         Contacts newCon = new Contacts(name, phone);


         contactlist.add(newCon);
         mainMenu();
     }

     public static void mainMenu(){

         Scanner input = new Scanner(System.in);
         int choice;
         System.out.println("1. View contacts.\n" +
                 "2. Add a new contact.\n" +
                 "3. Search a contact by name.\n" +
                 "4. Delete an existing contact.\n" +
                 "5. Exit.\n" +
                 "Enter an option (1, 2, 3, 4 or 5):\n");
            choice = input.nextInt();

            if (choice == 1){
               view();
                mainMenu();
            } else if (choice == 2){
                addContact();
                mainMenu();
            }else if (choice == 3){
                searchName();
                mainMenu();
            }else if (choice == 4){
                delete();
                mainMenu();
            }else {
                System.out.println("program ended");
            }



     }


    public static void main(String[] args) {


        mainMenu();



    }

}
