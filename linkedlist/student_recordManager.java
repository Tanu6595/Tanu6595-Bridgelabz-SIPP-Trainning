 package linkedlist;

import java.util.Scanner;

// Node class
//class Node {
//    int rollnumber;
//    String name;
//    int age;
//    String grade;
//    Node next;
//
//    Node(int rollnumber, String name, int age, String grade) {
//        this.rollnumber = rollnumber;
//        this.name = name;
//        this.age = age;
//        this.grade = grade;
//        this.next = null;
//    }
//}

// Linked List class
class StudentLinkedList {
    Node head;

    public void addAtBeginning(int roll, String name, int age, String grade) {
        Node newNode = new Node(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(int roll, String name, int age, String grade) {
        Node newNode = new Node(roll, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void addAtPosition(int position, int roll, String name, int age, String grade) {
        Node newNode = new Node(roll, name, age, grade);
        if (position == 0 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node curr = head;
        for (int i = 0; curr != null && i < position - 1; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void deleteByRollNumber(int roll) {
        if (head == null) return;

        if (head.rollnumber == roll) {
            head = head.next;
            System.out.println("Record deleted");
            return;
        }

        Node curr = head, prev = null;
        while (curr != null && curr.rollnumber != roll) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Record not found");
            return;
        }

        prev.next = curr.next;
        System.out.println("Record deleted");
    }

    public void searchByRollNumber(int roll) {
        Node curr = head;
        while (curr != null) {
            if (curr.rollnumber == roll) {
                System.out.println("Record found:");
                printStudent(curr);
                return;
            }
            curr = curr.next;
        }
        System.out.println("Student with Roll Number " + roll + " not found.");
    }

    public void updateGradeByRollNumber(int roll, String newGrade) {
        Node curr = head;
        while (curr != null) {
            if (curr.rollnumber == roll) {
                curr.grade = newGrade;
                System.out.println("Grade updated.");
                return;
            }
            curr = curr.next;
        }
        System.out.println("Student with Roll Number " + roll + " not found.");
    }

    public void displayAll() {
        if (head == null) {
            System.out.println("No records to display.");
            return;
        }

        Node current = head;
        System.out.println("\nStudent Records:");
        while (current != null) {
            printStudent(current);
            current = current.next;
        }
    }

    private void printStudent(Node student) {
        System.out.println("Roll Number: " + student.rollnumber);
        System.out.println("Name       : " + student.name);
        System.out.println("Age        : " + student.age);
        System.out.println("Grade      : " + student.grade);
     }
}

// Main class
public class student_recordManager {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStudent Record Management System");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete by Roll Number");
            System.out.println("5. Search by Roll Number");
            System.out.println("6. Update Grade by Roll Number");
            System.out.println("7. Display All");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            int roll, age, pos;
            String name, grade;

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    grade = sc.nextLine();
                    list.addAtBeginning(roll, name, age, grade);
                    break;

                case 2:
                    System.out.print("Enter Roll No: ");
                    roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    grade = sc.nextLine();
                    list.addAtEnd(roll, name, age, grade);
                    break;

                case 3:
                    System.out.print("Enter Position (0-based): ");
                    pos = sc.nextInt();
                    System.out.print("Enter Roll No: ");
                    roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    grade = sc.nextLine();
                    list.addAtPosition(pos, roll, name, age, grade);
                    break;

                case 4:
                    System.out.print("Enter Roll No to delete: ");
                    roll = sc.nextInt();
                    list.deleteByRollNumber(roll);
                    break;

                case 5:
                    System.out.print("Enter Roll No to search: ");
                    roll = sc.nextInt();
                    list.searchByRollNumber(roll);
                    break;

                case 6:
                    System.out.print("Enter Roll No to update grade: ");
                    roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Grade: ");
                    grade = sc.nextLine();
                    list.updateGradeByRollNumber(roll, grade);
                    break;

                case 7:
                    list.displayAll();
                    break;

                case 0:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}