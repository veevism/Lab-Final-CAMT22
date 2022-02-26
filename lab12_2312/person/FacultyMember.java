package lab.lab12_2312.person;

public class FacultyMember extends Person {
    int officehour;
    String rank;

    public FacultyMember(String n, String add, Long phnum, String email, int ofih, String rank) {
        super(n, add, phnum, email);

        this.officehour = ofih;
        this.rank = rank;
    }

    public String toString() {
        return " ((Faculty Member)) " + "Name : " + name + " || Address : " + address + " || Phonenumber : " + phonenum
                + " || Email : " + email + " || Office Hours : " + officehour + " || Rank : " + rank;
    }
}
