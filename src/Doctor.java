import java.util.Scanner;
import java.util.TreeMap;

//superclass
public class Doctor{
    //field
    static final String docName="doctor";

    //methods
    protected Doctor(){
    }
    //set your patients data
    protected int setData(){
        System.out.print("First,verify your ID: ");
        Scanner input = new Scanner(System.in);
        int docId = input.nextInt();
        int A3 = new Admin().accessToClinicOrDoctor(docId);
        if(A3==-1)
            return 0;
        else{
            System.out.print("please enter your patient data to be saved in our database:\n name:");
            String caName = input.next();
            System.out.print("case number:");
            String caseNum = input.next();
            System.out.print("diagnostics:");
            String diagnostics = input.next();
            System.out.print("enter your name:");
            String dName = input.next();
            System.out.print("please select how urgent the case is: 1.Red\t 2.Yellow\t 3.Green");
            int urgent = input.nextInt();
            System.out.println("____________________________________");
            System.out.println("kindly check your calender to see if you have any shift,surgeries or call today");
            System.out.println("with much respect,hospital administration ;)");
        }
        return 1;
    }
    protected void setAppointment(){
    }
    protected void getAppointment(){
    }
}


//subclasses
//works for both cold staff and internist
class ChosenStaff extends Doctor {

    //fields
    double min=2.00,max=10.00;
    //set
    protected void setAppointment(int num){
        TreeMap <String,String> staffs = new TreeMap<>();
        staffs.put("cold staff","Jack");
        staffs.put("Internist","Sara");
        switch (num) {
            case 1 ->
                    System.out.println("Good evening,this is Dr." + staffs.get("cold staff") + " from " + staffs.firstKey() +
                            ",I am available from " + min + "pm to " + max +
                            "pm if you want to consult me or to be checked out please make sure to book a suitable appointment");
            case 2 ->
                    System.out.println("Good evening,this is Dr." + staffs.get("Internist") + " from " + staffs.lastKey() +
                            ",I am available from " + min + "pm to " + max +
                            "pm if you want to consult me or to be checked out please make sure to book a suitable appointment");
        }

    }
    //get
    protected void getAppointment(double time){
        if(time>=min && time<=max)
            System.out.println("your appointment is booked successfully!");
        else
            System.out.println("It is not an available appointment,please try again later");
    }

}

class QuarantineStaff extends Doctor{
    @Override
    protected void setAppointment(){
        System.out.println("Good evening,this is Quarantine staff\n if you think you have caught the virus, please write down" +
                " your address and our staff will be there as soon as possible to check you out and deal with your case");
    }
    @Override
    protected void getAppointment(){
        System.out.println("Our Staff is on his way to you,dont worry");
    }
}