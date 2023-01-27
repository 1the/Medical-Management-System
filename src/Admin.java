import java.util.ArrayList;
import java.util.Scanner;

public class Admin{
    //field
    static final String Aname ="admin";
    static int AId = 4000;
    //identify your identity
    protected int verify(){
        System.out.println("Please enter your passcode,you only have 1 chance: ");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        if(id!=AId){
            System.out.println("Access is blocked");
            return 0;
        }
        else{
           checkSystem();
        }
        return 1;
    }

    //admin job
    protected void checkSystem(){
        //random number
        int max=10,min=1, num = (int)Math.floor(Math.random()*(max-min+1)+min);
        if(num==1 || num==0)
            System.out.println("There is "+num+" user who can not reach his account and reported for a problem");
        else
            System.out.println("There is "+num+" users who can not reach their account and reported for a problem");

        System.out.println("________________\n" +
                "We have 4 main categories of access:\n" +
                "1. Admin 'only we could have this access'\n" +
                "2. Doctor 'any clinic or hospital doctor in our staffs'\n" +
                "3. Clients 'there are 3 sub-categories'\n" +
                "\t I. Patient 'any hospital patient'\n" +
                "\t II. Clinic client 'any client visits our clinics'\n" +
                "\t III. Visitor 'any person visits hospital patients'\n" +
                "4. Donor 'blood donors'");
    }


    //method1: clinic client and doctor access constraints
    protected int accessToClinicOrDoctor(int id){
        int cnt=3;
        while((id<0 || id>100) && cnt>0){
            System.out.println("Please enter a valid ID,you have "+cnt+" chances");
            Scanner input = new Scanner(System.in);
            id = input.nextInt();
            cnt--;
        }
        if(cnt==0 && (id<0 || id>100))
        {
            System.out.println("Your access has been blocked,try contact support center");
            return -1;
        }
        return 0;
    }

    //method2: visitor access constraints
    protected int accessToVisitor(String name){
        //using array list from java collections to insert patients names
        ArrayList <String> patientsNames=new ArrayList<>();
        patientsNames.add("ali");
        patientsNames.add("ramy");
        patientsNames.add("rana");
        patientsNames.add("soha");
        patientsNames.add("dina");
        //check if exist
        for(String i:patientsNames)
        {
            if(name.equals(i))
                return 1;
        }
        return 0;
    }
}
