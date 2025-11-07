package ontapq2;

// Your Name: Pham Cong Hung
// Class: SE2042
// Student ID: HE204376

import java.util.*;

public class StudentList {
    private ArrayList<Student> studentList;

    public StudentList() {
        studentList = new ArrayList<>();
    }

    public void addStudent() {
        System.out.println("Please input the information of the student to insert.");
        Student s = new Student();
        s.input();
        if (search(s.getId()) != null) {
            System.out.println("Student with id = " + s.getId() + " already exists. The " + s + " is not added into the list.");
        } else {
            studentList.add(s);
            System.out.println(s + " has been added.");
        }
    }

    public Student search(int studentId) {
        for (Student s : studentList) {
            if (s.getId() == studentId) return s;
        }
        return null;
    }

    public void searchStudent() {
        Scanner sc = new Scanner(System.in);
        int id;

        System.out.print("Input id of the student to search: ");
        while (true) {
            try {
                id = Integer.parseInt(sc.nextLine());
                if (id < 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("Id is not valid. Reinput id = ");
            }
        }

        Student found = search(id);
        if (found != null) {
            System.out.println("Student found: " + found);
        } else {
            System.out.println("Student " + id + " does not exist.");
        }
    }

    public void removeStudent() {
        Scanner sc = new Scanner(System.in);
        int id;

        System.out.print("Input id of the student to delete: ");
        while (true) {
            try {
                id = Integer.parseInt(sc.nextLine());
                if (id < 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("Id is not valid. Reinput id = ");
            }
        }

        Student found = search(id);
        if (found != null) {
            studentList.remove(found);
            System.out.println(found + " has been removed.");
        } else {
            System.out.println("Student " + id + " does not exist.");
        }
    }

    public void show() {
        if (studentList.isEmpty()) {
            System.out.println("There is no student in the list.");
            return;
        }
        System.out.println("We have " + studentList.size() + " students:");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public void sort() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int depCmp = s2.getDepartment().compareToIgnoreCase(s1.getDepartment());
                if (depCmp != 0) return depCmp;
                return s1.getName().compareToIgnoreCase(s2.getName());
            }
        });
    }
}
