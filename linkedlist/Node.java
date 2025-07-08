package linkedlist;

class Node {
    int rollnumber;
    String name;
    int age;
    String grade;
    Node next;

    Node(int rollnumber, String name, int age, String grade) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}