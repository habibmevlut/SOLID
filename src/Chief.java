//Chief claasım Employee clasindan extende olunur
public class Chief extends Employee {
    //Main classa eklenen constructura gore sub-class constructur ekleriz
    public Chief(String name, String surname, int workyear) {
        super(name, surname, workyear);
    }
    //calculateSalary methodunun ici burda doldurulur
    @Override
    public void calculateSalary() {
        double salary = 4000;
        salary = salary + 500 * this.workyear;
        this.setSalary(salary);
    }

}
