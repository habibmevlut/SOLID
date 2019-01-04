//Cleaner claasım Employee clasindan extende olunur
public class Cleaner extends Employee {
    //Main class eklenen constructura gore sub-class constructur ekleriz
    public Cleaner(String name, String surname, int workyear) {
        super(name, surname, workyear);
    }
    //calculateSalary methodunun ici burda doldurulur
    @Override
    public void calculateSalary() {
        double salary = 2500;
        salary = salary + 250 * this.workyear;
        this.setSalary(salary);
    }

}
