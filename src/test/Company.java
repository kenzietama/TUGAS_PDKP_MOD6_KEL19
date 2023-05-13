package test;

public abstract class Company {
    int id;
    public abstract void details();
}

class Manager extends Company {
    private String name;
    final String position = "Manager";

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void details() {
        System.out.println("Id : " + super.id);
        System.out.println("Name : " + name);
        System.out.println("Position : " + position);
    }
}

class VicePresident extends Company {
    private String name;
    final String position = "Vice President";
    public VicePresident(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void details() {
        System.out.println("Id : " + super.id);
        System.out.println("Name : " + name);
        System.out.println("Position : " + position);
    }
}
