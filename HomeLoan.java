// Home Loan and Bank Loan

package JavaLab4;

import java.util.Scanner;

interface ILoan{
    public boolean homeLoan();
    public boolean vehicleLoan();
}

abstract class BankLoan implements ILoan{
    double income;
    abstract void calcInterest();

}

class HomeLoan extends BankLoan{

    public boolean homeLoan(){
        if(income > 50000)
            return true;
        else
            return false;

    }

    @Override
    public boolean vehicleLoan() {
        if(income > 60000)
            return true;
        else
            return false;

    }

    public void calcInterest(){
        double hl_interest = 2000000 * (9.5/100);
        double vl_interest = 1200000 * (10.5/100);
        System.out.println("Home Class implementation: ");

        if(homeLoan()){
            System.out.println("Loan amount of 20,00,000 issued with the interest of " + hl_interest);
        }
        else
            System.out.println("Expecting higher income..");

        if(vehicleLoan()){
            System.out.println("Loan amount of 12,00,000 issued with the interest of " + vl_interest);
        }
        else
            System.out.println("Expecting higher income..");
    }

}

class VehicleLoan extends BankLoan{
    double income;
    public boolean homeLoan(){
        if(income > 50000)
            return true;
        else
            return false;

    }

    @Override
    public boolean vehicleLoan() {
        if(income > 60000)
            return true;
        else
            return false;
    }

    public void calcInterest(){
        double hl_interest = 2000000 * (9.5/100);
        double vl_interest = 1200000 * (10.5/100);
        System.out.println("\n\nVehicle Class implementation: ");

        if(homeLoan()){
            System.out.println("Loan amount of 20,00,000 issued with the interest of " + hl_interest);
        }
        else
            System.out.println("Expecting higher income..");

        if(vehicleLoan()){
            System.out.println("Loan amount of 12,00,000 issued with the interest of " + vl_interest);
        }
        else
            System.out.println("Expecting higher income..");
    }

}


public class Interface2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HomeLoan[] hl = new HomeLoan[2];
        hl[0]=new HomeLoan();
        System.out.println("Enter annual income: ");

        hl[0].income = sc.nextDouble();
        hl[0].calcInterest();

        VehicleLoan[] vl = new VehicleLoan[2];
        vl[0]=new VehicleLoan();
        System.out.println("Enter annual income: ");
        vl[0].income = sc.nextDouble();
        vl[0].calcInterest();

    }
}
/* OUTPUT
Enter annual income:
80000
Home Class implementation:
Loan amount of 20,00,000 issued with the interest of 190000.0
Loan amount of 12,00,000 issued with the interest of 126000.0
Enter annual income:
90000


Vehicle Class implementation:
Loan amount of 20,00,000 issued with the interest of 190000.0
Loan amount of 12,00,000 issued with the interest of 126000.0

 */
 
 
