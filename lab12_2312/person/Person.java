package lab.lab12_2312.person;

public class Person {
    String name;
    String address;
    Long phonenum;
    String email;

    public Person(String n, String add, Long phnum, String email) {
        this.name = n;
        this.address = add;
        this.phonenum = phnum;
        this.email = email;
    }

    public String toString() {
        return " ((Person)) " + "Name : " + name + " || Address : " + address + " || Phonenumber : " + phonenum
                + " || Email : " + email;
    }

}
