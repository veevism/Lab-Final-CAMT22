package lab.lab13_27.employee;

class Administrator extends employee {
    public Administrator(String nm, String org, int sal) {
        super(nm, org, sal);

    }

    public String Job() {
        return "Organizing and storing information";
    }

    @Override
    public String toString() {
        return super.toString() + "My job is : " + Job() + " I'm Administrator";
    }
}

class Receptionist extends employee {
    public Receptionist(String nm, String org, int sal) {
        super(nm, org, sal);
    }

    public String Job() {
        return "greeting visitors and delivering exceptional customer service assistance";
    }

    @Override
    public String toString() {
        return super.toString() + " My job is : " + Job() + " I'm Receptionist";
    }
}

class Janitor extends employee {
    public Janitor(String nm, String org, int sal) {
        super(nm, org, sal);
    }

    public String Job() {
        return "responsible for maintaining a cleanly facility by completing";
    }

    @Override
    public String toString() {
        return super.toString() + " My job is : " + Job() + " I'm Janitor";
    }
}

class ITStaff extends employee {
    public ITStaff(String nm, String org, int sal) {
        super(nm, org, sal);
    }

    public String Job() {
        return "Installing and configuring computer hardware, software, systems, networks, printers, and scanners. Monitoring and maintaining computer systems and networks";
    }

    @Override
    public String toString() {
        return super.toString() + " My job is : " + Job() + " I'm IT Staff";
    }

}

class Developer extends employee {
    public Developer(String nm, String org, int sal) {
        super(nm, org, sal);
    }

    public String Job() {
        return "Researching, designing, implementing, and managing software programs. Testing and evaluating new programs. Identifying areas for modification";
    }

    @Override
    public String toString() {
        return super.toString() + " My job is : " + Job() + " I'm Developer";
    }

}
