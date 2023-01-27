import java.util.Scanner;
//to select with which account you are gonna be in
public class Users {
    //field
    String userName;
    //default constructor
    protected Users(){
        //login to account
        System.out.print("enter username: ");
        Scanner input = new Scanner(System.in);
        userName=input.nextLine();
       //no password yet because he is just selecting the identity
        //calling method
        access();
    }
    protected void access(){
        String name=this.userName;
        switch (name) {
            case Clients.cName ->  //clients class object
                    new Clients();
            case Doctor.docName ->  //doctor class object
                    new Doctor().setData();
            case Admin.Aname ->  //admin class object
                    new Admin().verify();
            case Donor.doName -> //donor class object
                    new Donor();
        }
    }

}
