public class Employee {

    private String name;
    private String profession;
    private int age;
    private double salary;
    private String email;
    private String phone;

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public int getAge(){
        return age;
    }

    public double getSalary(){
        return salary;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone(){
        return phone;
    }

    public Employee(String name, String profession, int age, double salary, String email, String phone) {
        this.name = name;
        this.profession = profession;
        this.age = age;
        this.salary = salary;
        this.email = email;
        this.phone = phone;

        System.out.println("New employee " + getName() + " created");
        System.out.println("Information: Name " + getName()
                + ", Profession " + getProfession()
                + ", Age " + getAge()
                + ", Salary " + getSalary()
                + ", Email " + getEmail()
                + ", Phone number " + getPhone() + ".");
        System.out.println();




    }

}
