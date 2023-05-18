package emailapp;

import java.util.Scanner;

public class Email {

   private String firstName;
    private String lastName;
    private String password;
    private  String department;
     private int mailBoxCapacity = 1000;
    private String email;
    private  String alternateEmail;

     private  int defaultPasswordLength =8;

    private  String companyName ="cognizant.com";


    //constructor to receive the firstname and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created:" + " " + firstName+ " "+ lastName);


        this.department = setDepartment();
        System.out.println("Mine is:" + " "+department +" "+ "Department");

        //call a method that return a random password
this.password = randomPass(defaultPasswordLength);
System.out.println("Your Password is:" +" "+password );

//Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"."+companyName;
        System.out.println("Your Email is:" + " "+ email);
    }

    public Email() {

    }


    // method ask for the department
    //ask the IT specialist which department  is this person
    public String setDepartment() {
        System.out.println("New Worker: " + firstName+ ".Department Codes:\n1 for sales\n2 for Development\n3  for Accounting\n0 for none\nEnter the Department Code:");
        Scanner sc = new Scanner(System.in);
       int depChoice= sc.nextInt();
        if(depChoice ==1){
            return "SALES";
    } else if (depChoice ==2) {
            return "DEVELOPMENT";
        } else if (depChoice ==3) {
            return "ACCOUNTING";
        }
        else {
            return " ";
        }

    }


        //Method to generate a random password


    //If there is 30 charchters  here we are generating random number 0 to 30 ie 0 &1 multiplied
    //Byhow many charchters have here make that integer and store that in rand variable
    //after typecasting
public String randomPass(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i=0;i<length;i++){

            //we need to generate random number so we can have function called Math.ranodm()
          int rand=  (int) (Math.random() * passwordSet.length());
          password[i]= passwordSet.charAt(rand);

        }
        return  new String(password);
}

    //  set the mailbox capacity

    public void setMailboxCapacity(int capacity) {
        this.mailBoxCapacity =capacity;
    }
//get the mailbox capacity
    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }



    // set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }
    //get the alternate Email
    public String getAlternateEmail(String s) {
        return s;
    }

    // method to change the password setter

    public void setChangePassword(String password) {
        this.password = password;
    }
//getter
    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "EMPLOYEE PROFILE DETAILS GIVEN BELOW\n" +"DISPLAY NAME:" + firstName + " "+ lastName +"\n"+ "COMPANY EMAIL: "+email +"\n"+
                "MAILBOX CAPACITY:"+ mailBoxCapacity +"mb";

    }

//    public void newWorker() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the name of Employee Holder:");
//        firstName = sc.next();
//        lastName =sc.next();
//    }
}
