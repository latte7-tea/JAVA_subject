package main.java.org.refactoring;

public class Sample2prac {
    public static void main (String[]args){
        double overWorkingHours1 = EmployeePrac.calculateoverWorkingHours(10);
        System.out.println(overWorkingHours1);
        EmployeePrac e=new EmployeePrac();
        System.out.println(e.getPayment(10));
    }
}
class EmployeePrac{
    public static double PAYMENT_WORKING_OVER_HOURS = 1.5;
    int paymentPerHour=1000;
    public double getPayment(int workingHours){
        double overWorkingHours=calculateoverWorkingHours(workingHours);
        double paymentForoverWorkingHours=this.paymentPerHour*PAYMENT_WORKING_OVER_HOURS*overWorkingHours;
        double standardWorkingHours = workingHours - overWorkingHours;
        double paymentForStandardWorkHours = this.paymentPerHour * standardWorkingHours;
        return paymentForoverWorkingHours + paymentForStandardWorkHours;
    }
    public static int STANDARD_WORK_HOURS_PER_DAY=8;
    public static double calculateoverWorkingHours(double workingHours){
        if(workingHours <STANDARD_WORK_HOURS_PER_DAY ) {
            return 0;
        }
        else {
            return workingHours - STANDARD_WORK_HOURS_PER_DAY;
        }
    }

}
