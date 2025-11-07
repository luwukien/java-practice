package ontapq2;

// Your Name: Pham Cong Hung
// Class: SE2042
// Student ID: HE204376

import java.util.*;

public class Student {
    private int id;
    private String name;
    private String department;
    
    public Student() {
        
    }

    public Student(int id, String name, String department) {
        if (id < 0) {
            this.id = 0;
        }
        else {
            this.id = id;
        }
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            this.id = 0;
        }
        else {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public String toString() {
        return "Student{id = " + id + ", name = " + name + ", department = " + department + "}";
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("id = ");
            String input = sc.nextLine();
            try {
                id = Integer.parseInt(input);
                if (id < 0) {
                    System.out.print("Id is not valid. Reinput ");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.print("Id is not valid. Reinput ");
            }
        }
        
        System.out.print("Name = ");
        name = sc.nextLine();
        
        System.out.print("Department = ");
        department = sc.nextLine();
    }
}
