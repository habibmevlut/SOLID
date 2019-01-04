import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;
    //Sirketteki butun calısanların maasları hesaplanir
    public void calculatTotalSalaryofEmployee(){
        double totalSalary = 0;
        for (Employee employee : employees) {
            employee.calculateSalary();
            totalSalary = totalSalary + employee.getSalary();
        }
        System.out.println("Bu Şirketin 1 aylık toplam maliyeti: " + totalSalary +" Tl");

        if (totalSalary > 10000 ){
            System.out.println("Bu Şirket batar hacı :)");
        }
    }
    public void addEmployee (Employee employee){
        if (employees == null){
            employees = new ArrayList<>();
        }
         employees.add(employee);
    }
}
