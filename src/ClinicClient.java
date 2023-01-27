import java.util.Scanner;

public class ClinicClient {
    String CName;
    int CId, choosed,illness;
    ClinicClient(){
        setClientData();
    }

    //gathering data
    protected int setClientData() {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        CName = input.nextLine();
        System.out.print("Enter your ID: ");
        CId = input.nextInt();
        //store in int because this method has a return value needs to be stored
        int A1= new Admin().accessToClinicOrDoctor(CId);
        if(A1==-1)
            return 0;
        else
            choosedProcess();
        return 1;
    }

    //client choice
    protected void choosedProcess() {
            System.out.println("Please select from the following which process you want:\n 1.book appointment\t" +
                    " 2.buy medical drugs\n 3.perform a surgery\t 4.yearly check\n 5.Exit");
            Scanner input = new Scanner(System.in);
            choosed = input.nextInt();
            switch (choosed) {
                case 1 -> bookAppointment();
                case 2 -> buyMedicalDrugs();
                case 3 -> surgery();
                case 4 -> yearlyCheck();
                case 5 -> System.out.println("Have a nice day :)");
            }
    }

    //1st choice
    protected void bookAppointment() {
        double time;

        //check if the prefered doctor is avaliable or not
        System.out.println("please select your illness:\n 1.common cold\t 2.stomachache\t 3.Covid19");
        Scanner input = new Scanner(System.in);
            illness = input.nextInt();
            switch (illness) {
                case 1:
                    new ChosenStaff().setAppointment(illness);
                    time=input.nextDouble();
                    new ChosenStaff().getAppointment(time);
                    break;
                case 2:
                    new ChosenStaff().setAppointment(illness);
                    time=input.nextDouble();
                    new ChosenStaff().getAppointment(time);
                    break;
                case 3:
                    new QuarantineStaff().setAppointment();
                    Scanner add = new Scanner(System.in);
                    String address=add.nextLine();
                    new QuarantineStaff().getAppointment();
                    break;
            }
    }

    //2nd choice
    protected void buyMedicalDrugs(){
        System.out.println("please enter your medical drugs names:");
        Scanner input = new Scanner(System.in);
        String medicine = input.nextLine();
        //Generate random value from 50 to 1000
        int min=50,max=1000;
        int randomValue = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("Your total cost equal:"+randomValue+"\n please enter you credit card number: ");
        int cardNum=input.nextInt();
        System.out.println("Bill is discounted from your account, Thanks for choosing us ;)");
    }

    //3rd choice
    protected void surgery(){
        System.out.print("If you are sure you will perform your surgery,please fill this form:\n your name: ");
        Scanner input= new Scanner(System.in);
        String clName = input.nextLine();
        System.out.print("your doctor name: ");
        String doName = input.nextLine();
        System.out.print("your phone number: ");
        long phNum = input.nextInt();
        System.out.print("your relatives: ");
        Scanner inp = new Scanner(System.in);
        String reName = inp.nextLine();
        System.out.print("your illness: ");
        String ill = inp.nextLine();
        System.out.print("your age: ");
        int age = input.nextInt();
        System.out.print("if you have any allergy or chronic disease please let us know for your safety: ");
        String aler_chron = inp.nextLine();
        System.out.println("Thank you,the doctor or his staff will contact you in an hour");
    }

    //4th choice
    protected void yearlyCheck(){
        System.out.println("Hello "+CName+", you can come for your yearly check at any time from 8.00am to 2.pm every day" +
                " except fridays\n"
        +"please tell us what time you will come:");
        Scanner input= new Scanner(System.in);
        double bookTime=input.nextDouble();
        System.out.println("when you will come:");
        Scanner inp= new Scanner(System.in);
        String date = inp.nextLine();
        System.out.println("Your appointment is booked successfully");

    }
}
