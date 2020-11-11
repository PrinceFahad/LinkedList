package com.company;

public class Main {

    public static void main(String[] args) {
        
        Employee janeJones = new Employee("Jane","Jones",10);
        Employee johnDoe = new Employee("John","Doe",11);
        Employee marySmith = new Employee("Mary","Smith",12);
        Employee mikeWilson = new Employee("Mike","Wilson",13);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

    }
}
