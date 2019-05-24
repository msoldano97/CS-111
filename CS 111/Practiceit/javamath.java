public class javamath {
public static void main(String[] args) {
// Calculate pay at work based on hours worked each day
int totalHours= 4+5+8+4;
double salary =8.75;
double totalPay =totalHours* salary;
double taxRate= 0.20;
double taxOwed=totalPay*taxRate;

System.out.println("My total hours worked:");
System.out.println(totalHours);
System.out.println("My hourly salary:");
System.out.println("$" + salary);
System.out.println("My total pay:");
System.out.println(totalPay);
System.out.println("My taxes owed:"); // 20% tax
System.out.println(totalPay*taxRate);
}
}
