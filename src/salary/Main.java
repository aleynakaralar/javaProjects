package salary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter weekly base salary ");
        Scanner scanner = new Scanner(System.in);
        double weeklyBaseSalary = scanner.nextDouble();
        double salary = 0;

        if (weeklyBaseSalary < 1000){
            System.out.println("Please enter a valid weekly base salary. Weekly base salary must be at least 1000$");
        }
        else {
            double unitWage = weeklyBaseSalary/ 40;
            System.out.println("Please enter working hours in weekdays");
            int weekdayWorkingHours = scanner.nextInt();

            System.out.println("Please enter working hours in weekends");
            int weekendWorkingHours = scanner.nextInt();

            int totalWorkingHours = weekdayWorkingHours + weekendWorkingHours ;
               if (totalWorkingHours < 40){
                 salary = unitWage * totalWorkingHours;
                } else {
                   if(weekdayWorkingHours < 40 ){
                       salary = weeklyBaseSalary + ((totalWorkingHours - 40) * unitWage * 2);
                   }
                   else{
                       if(weekendWorkingHours < 10){
                           salary = weeklyBaseSalary + ((weekdayWorkingHours - 40) * unitWage * 1.5) + (weekendWorkingHours * unitWage * 2) ;
                       }
                       else{
                           salary = weeklyBaseSalary + ((weekdayWorkingHours - 40) * unitWage * 1.5) + (weekendWorkingHours * unitWage * 2) + 500 ;
                           System.out.println("Congratulations, you earned 500$ bonus !!");
                       }
                   }
                   
               }


        }
        System.out.println(salary);
    }
}