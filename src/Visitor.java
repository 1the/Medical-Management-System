import java.util.Scanner;

public class Visitor {
    String CName,PName;
    double VTime;
    Visitor(){
        setVisitorData();
    }
    protected int setVisitorData(){
        System.out.print("enter your name: ");
        Scanner input = new Scanner(System.in);
        CName = input.nextLine();
        System.out.print("enter patient name you want to visit: ");
        PName = input.nextLine();
        int A2 = new Admin().accessToVisitor(PName);
        if(A2==0){
            System.out.println("Sorry,we don't have any patient named "+PName);
            return 0;
        }
        else{
            System.out.println("The available time to see the patient is from 3.00pm : 5.00pm every Mondays, if it its suitable" +
                    "to you please enter the visit time ");
            VTime = input.nextDouble();
            if(VTime>=3.00 && VTime<=5.00) {
                System.out.println("Your visit is booked to next Monday at " + VTime + "pm\n be ready!");
            }else{
                System.out.println("Sorry, You can't visit him/her at this time");
            }
        }
        return 1;
    }
}
