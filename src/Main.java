import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

     static List<Contacts> contactlist = new ArrayList<>();


     public void view(){
         for( Contacts x : contactlist ){
             System.out.println(x.getName());
         }
     }



     public void addContact(){

         String name,phone;
         Scanner input = new Scanner(System.in);
         System.out.println("enter your name");

         name = input.next();

         System.out.println("enter your phone number");

         phone = input.next();

         Contacts newCon = new Contacts(name, phone);


         contactlist.add(newCon);
     }

     public void mainMenu(){

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
            } else if (choice == 2){
                addContact();
            }else if (choice == 3){
                System.out.println("contact by name");
            }else if (choice == 4){
                System.out.println("delete a contact");
            }else {
                System.out.println("exit");
            }


     }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String choice;

        do {






            System.out.println("do you want to add another?");
            choice = input.next();



        }while(choice.equals("y"));



    }

}
