public class Main {
    public static void main(String[] args){
        //Sub-classlara yazdırmak icin verileri atıyoruz
        Cleaner clener = new Cleaner("Ahmet", "Ali",2);
        Chief chief = new Chief("Mehmet","Baş",5);
        Engineer engineer = new Engineer("Veli","Ünal",7);
        Company company = new Company();
        clener.calculateSalary();
        chief.calculateSalary();
        engineer.calculateSalary();
        clener.printSalary();
        chief.printSalary();
        engineer.printSalary();

        company.addEmployee(clener);
        company.addEmployee(engineer);
        company.addEmployee(chief);
        company.calculatTotalSalaryofEmployee();//Butun calısanların maaslarını toplamini yazdirmak icin

    }
}
