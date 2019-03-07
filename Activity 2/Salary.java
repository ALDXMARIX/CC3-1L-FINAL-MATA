import java.util.Scanner;


public class Salary {
    
    
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter hourly pay rate: " );
    double  hourlyRate = sc.nextDouble();

    System.out.println("Enter regular hours of work: " );
    double regularHours = sc.nextDouble();

    System.out.println("Enter overtime hours: " );
    double overtimeHours = sc.nextDouble();

    System.out.println("Overtime Pay: " + overtimePay(hourlyRate,  regularHours, overtimeHours));

  
    
    }
    
    
    static double  overtimePay(double hourlyRate, double regularHours, double overtimeHours){
    
    return (regularHours * hourlyRate + ((overtimeHours * 1.5)*regularHours));
    }
    
    
    
}