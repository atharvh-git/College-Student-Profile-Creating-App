package JavaProject;

import java.util.Scanner;

public class ProfileSettings 
{
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 5;
    private String department;
    private int rollNumber;
    private int defaultrollNumberLength = 3;
    private String Email_ID;
    private String alternateEmail;
    private String collegeSuffix = "geca.in";

    //Creating a constructor to receive email holder's first name and last name
    public ProfileSettings(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName; 
        
        //Calling a method asking for the department which will return the name of the department
        this.department = setDepartment();
        
        
        //calling a method to generate a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: " + this.password);

        //calling a method to generate a roll number for the student
        this.rollNumber = randomRollNumber(defaultrollNumberLength);

        //Combining all the required elements to create an Email ID 
        //The Email ID should be in this format:- firstName.lastName@department.company.com
        Email_ID = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + collegeSuffix;
        
       
    }

    //Ask for the department in which he/she's studying
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for Electrical Engineering\n2 for Computer Science Engineering\n3 for Information Technology\n4 for Electronics and Telecommunications Engineering\n5 for Mechanical Engineering\n6 for Master in Computer Application\n\nEnter the DEPARTMENT CODE: ");
        Scanner sc = new Scanner(System.in);
        int deptCode = sc.nextInt();
        if(deptCode == 1)
        { 
            return "EEP"; 
        }
        else if(deptCode == 2)
        { 
            return "CSE";  
        }
        else if(deptCode == 3)
        { 
            return "IT"; 
        }
        else if(deptCode == 4)
        {
            return "ETC";
        }
        else if(deptCode == 5)
        {
            return "MECH";
        }
        else if(deptCode == 6)
        {
            return "MCA";
        }
        else
        { 
            return " "; 
        }
    }

    //Random password generator method
    private String randomPassword(int length){
        String passwordSet = "0123456789abcdefghijklmnopqrstuvwxyz";
        char password[] = new char[length];
        for (int i = 0; i<length; i++) {
            int randomChar = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomChar);
        }
        return new String(password);
    }
    
    //Random roll number generator method
    private int randomRollNumber(int length){
        int rollNum = (int) (Math.random() * 500);
        return rollNum;
    }
    
    //Set an Alternate Email ID
    public void setAlternateEmail(String AltEmail){
        this.alternateEmail = AltEmail;
    }

    // A method to change(setting a new password) the automatically generated password
    public void changePassword(String password){
        this.password = password;
    }

   
    public String getAlternateEmail(){
        return alternateEmail;
    }
    
    public String getPassword(){
        return password;
    }
    //Displaying the complete profile of student
    public String showProfile(){
        return "STUDENT NAME: " + firstName + " " + lastName +
               "\nDEPARTMENT: " + department + 
               "\nCOLLEGE EMAIL-ID: " + Email_ID +
               "\nROLL NUMBER: " + rollNumber +
               "\n**************************************************************";
    }

}

