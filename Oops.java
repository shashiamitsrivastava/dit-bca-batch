public class Oops {

    // SOLID ---
    // S---- > Single Responsibility Principle

    // DRY -> Do not Repeat Yourself

    public static void main(String[] args) {
        // int i = 10;
        // Abstraction ---- Data hide
        Employee yash = new Employee(1001, "Yash", 999);
        System.out.println(yash);
        // yash.salary = 1233;
        yash.setSalary(12345);
        System.out.println(yash.getSalary());
        // System.out.println(yash);
        // yash.takeInput(1001, "Yash", 999);
        // System.out.println(yash.id);
        // System.out.println(yash.name);
        // System.out.println(yash.salary);
        // yash.printValues();
        // Employee ram = new Employee();
        // System.out.println(ram.hashCode());
        // ram.takeInput(10002, "Ram", 99999);
        // ram.printValues();
        // System.out.println(ram.id);
        // System.out.println(ram.name);
        // System.out.println(ram.salary);
    }
}