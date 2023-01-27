import java.util.Scanner;

public class Patient {
    //fields
    String pName;
    int roomNum,choise;
    Patient(){
        setPatientData();
    }

    //gathering data
    protected void setPatientData() {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        pName = input.nextLine();
        System.out.print("Enter your room number: ");
        roomNum = input.nextInt();
        choosedProcess();
    }
    //patient choice
    protected void choosedProcess() {
            System.out.println("Please select from the following which process you want:\n 1.Exit permission\t" +
                    " 2.perform a surgery\n 3.Medical tests\t 4.emergency \n 5.Exit");
            Scanner input = new Scanner(System.in);
                choise = input.nextInt();
                switch (choise) {
                    case 1:
                        exitPermission();
                        break;
                    case 2:
                        performSurgery();
                        break;
                    case 3:
                        medicalTests();
                        break;
                    case 4:
                        emergency();
                        break;
                    case 5:
                        System.out.println("Have a nice residence :)");
                        break;
                }
        }
    protected void exitPermission(){
        System.out.println("please stay in your room and the doctor will come to check your case" +
                " to see if you can exit now or not yet");

    }
    protected void performSurgery() {
        System.out.println("please stay in your room and the doctor will come to book an appointment" +
                "for your surgery");

    }
    protected void medicalTests() {
        System.out.println("please stay in your room and the nurse will come to guide you");

    }
    protected void emergency() {
        System.out.println("please stay in your room and the doctor will be here right now");

    }
}
