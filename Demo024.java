class Student {
    String name, address, phoneNo;

    Student(String name, String address, String phoneNo) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    void display() {
        System.out.println(name + " | " + address + " | " + phoneNo);
    }
}

public class Demo024 {
    public static void main(String[] args) {
        new Student("Bhargavi", "Ananthapuraam", "1234567890").display();
        new Student("Sravanthi", "Bodampahad", "2345678901").display();
        new Student("Bindhu", "Bichkunda", "3456789012").display();
        new Student("Sowmya", "Bellary", "4567890123").display();
        new Student("Manasa", "Rayadurgam", "5678901234").display();
    }
}