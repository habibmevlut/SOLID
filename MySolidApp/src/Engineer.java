//Engineer claasım Employee clasindan extende olunur
public class Engineer extends Employee {
    //Main class eklenen constructura gore sub-class constructur ekleriz
    public Engineer(String name, String surname, int workyear) {
        super(name, surname, workyear);
    }
    //calculateSalary methodunun ici burda doldurulur
    @Override
    public void calculateSalary() {
        double salary = 3000;
        salary = salary + 300 * this.workyear;
        this.setSalary(salary);
    }

}
