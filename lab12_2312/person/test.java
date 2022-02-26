package lab.lab12_2312.person;

public class test {
    public static void main(String[] args) {
        Person someguy = new Person("NPC", "Village", (long) 1919191, "goodsmilenpc@yahoo.com");
        System.out.println(someguy.toString());

        System.out.println();

        Student stu1 = new Student("Sorawee", "Home", (long) 815425851, "Knaff@gmail.com", "Your waifu");
        System.out.println(stu1.toString());

        System.out.println();

        Employee emp1 = new Employee("Prongpong", "CAMT", (long) 15884, "Prompongprompay@gmail.com", "401", 400000);
        System.out.println(emp1.toString());

        System.out.println();

        FacultyMember fam1 = new FacultyMember("P'Earth", "Oishi's room", (long) 854225, "Eartho@gmail.com", 20, "A");
        System.out.println(fam1.toString());

        System.out.println();

        StaffMem stm1 = new StaffMem("P'Fai", "Sound room", (long) 85642, "Fai@facebook.com", "Mystery");
        System.out.println(stm1.toString());
    }
}
