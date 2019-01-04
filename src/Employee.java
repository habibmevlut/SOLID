abstract class Employee {
    public  String name ;
    public  String surname;
    public  double salary;
    public  int workyear;

    public Employee(String name, String surname, int workyear) {
        this.name = name;
        this.surname = surname;
        this.workyear = workyear;
    }
    //Her extende olan diger classler bu metodu kendi icerisinde doldurur
    public abstract void calculateSalary();


    //Bu method tek bir goreve sahiptir maasları yazdırmak onun icin tek bir yerde tanımlanması daha mantikli
    public  void printSalary( ){
        System.out.println(this.name +" "+ this.surname + "'in Maaşı = " + this.salary +" Tl");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkyear() {
        return workyear;
    }

    public void setWorkyear(int workyear) {
        this.workyear = workyear;
    }
}
