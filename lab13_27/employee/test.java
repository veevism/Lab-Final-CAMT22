package lab.lab13_27.employee;

public class test {
    public static void main(String[] args) {
        Administrator npc1 = new Administrator("P'Roger", "CAMT", 15000);
        System.out.println(npc1.toString());
        System.out.println();

        Receptionist npc2 = new Receptionist("P'receptionist", "CAMT", 15000);
        System.out.println(npc2.toString());
        System.out.println();

        Janitor npc3 = new Janitor("P'Janitor", "CAMT", 15000);
        System.out.println(npc3.toString());
        System.out.println();

        ITStaff npc4 = new ITStaff("P'IT", "CAMT", 15000);
        System.out.println(npc4.toString());
        System.out.println();

        Developer npc5 = new Developer("VeeTheDEV", "CAMT", 15000);
        System.out.println(npc5.toString());
        System.out.println();

    }
}
