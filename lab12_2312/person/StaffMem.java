package lab.lab12_2312.person;

public class StaffMem extends Person {
    String title;

    public StaffMem(String n, String add, Long phnum, String email, String title) {
        super(n, add, phnum, email);

        this.title = title;
    }

    public String toString() {
        return " ((Staff Member)) " + "Name : " + name + " || Address : " + address + " || Phonenumber : " + phonenum
                + " || Email : " + email + " || title : " + title;
    }
}
