import java.util.Scanner;
/*we have 3 levels of clients
  1. clinic client
  2. visitor to a patient
  3. hospital patient
 */
public class Clients{
    //field
    static final String cName="client";
    //specify which client you are
    protected Clients(){
        System.out.println("please select from bellow:\t 1.Clinic Client\t 2.Visitor\t 3.Patient");
        Scanner inp = new Scanner(System.in);
            int num = inp.nextInt();
            switch (num)
            {
                case 1:
                    new ClinicClient();
                    break;
                case 2:
                    new Visitor();
                    break;
                case 3:
                    new Patient();
                    break;
                //no default because its supposed to be a responsive screen and he only choose from 3 choices
            }
    }
}


