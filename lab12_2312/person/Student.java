package lab.lab12_2312.person;

public class Student extends Person {
    String status;

    public Student(String n, String add, Long phnum, String email, String status) {
        // Error fixed
        // implicit super constructor Person() is undefined. Must explicitly invoke
        // another constructor?

        // คลาสแม่ต้องมี no arg constructor ไม่งั้นเอ๋อเร่อ กูเลยประกาศ constructor
        // แบบมี arg อีกทีด้วย super()

        // super() คือแทน Person() constructor หรือ Person().getemail เพื่อใช้ method
        super(n, add, phnum, email);
        this.status = status;
    }

    public String toString() {
        return " ((Student)) " + "Name : " + name + " || Address : " + address + " || Phonenumber : " + phonenum
                + " || Email : " + email + " || Status : " + status;
    }
}
