import java.util.Scanner;
public class EmployeeData {
    static int employee_id;
    public static String employee_name;
    static double employee_salary;


    void display(int employee_id,String employee_name,double employee_salary){
        System.out.println("Employee id=" +employee_id);
        System.out.println("Employee Name=" +employee_name);
        System.out.println("Employee Salary=" +employee_salary);
        }

   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter Employee id");
       employee_id=sc.nextInt();
       System.out.println("Enter Employee Name");
       employee_name=sc.next();
       System.out.println("Enter Employee Salary");
       employee_salary=sc.nextDouble();
       EmployeeData obj=new EmployeeData();
       obj.display(employee_id,employee_name,employee_salary);
    }
}