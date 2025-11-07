package ontapq2;

// Your Name: Pham Cong Hung
// Class: SE2042
// Student ID: HE204376

import java.util.Scanner; 
 
public class Main { 
    public static void displayMenu(){ 
        System.out.println("================= Menu ================"); 
        System.out.println("1. Add a new Student."); 
        System.out.println("2. Search a student based on its id."); 
        System.out.println("3. Remove a student based on its id."); 
        System.out.println("4. Sort the student list."); 
        System.out.println("5. List all students."); 
        System.out.println("6. Quit."); 
        System.out.print("Choose from 1 to 6: "); 
    } 
     
    public static int getMenuChoice(){ 
        displayMenu();
        Scanner sc = new Scanner(System.in); 
        int choice = 6; 
        try{ 
            choice = Integer.parseInt(sc.nextLine()); 
            if (choice > 0 && choice <= 6){ 
                return choice; 
            } 
            else { 
                return 6; 
            } 
        } 
        catch(Exception e){             
            return 6; 
        } 
    } 
    public static void main(String[] args){ 
        StudentList slist = new StudentList(); 
         
        int choice = 0; 
        do { 
            choice = getMenuChoice(); 
            switch(choice){ 
                case 1: slist.addStudent();break; 
                case 2: slist.searchStudent();break; 
                case 3: slist.removeStudent();break; 
                case 4: slist.sort(); break; 
                case 5: slist.show(); break; 
                default: System.out.println("Good bye!"); 
            } 
        } while (choice > 0 && choice < 6); 
    } 
} 