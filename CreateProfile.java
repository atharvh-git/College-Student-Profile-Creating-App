package JavaProject;

public class CreateProfile {
    public static void main(String[] args) {
        ProfileSettings e1 = new ProfileSettings("Johnathan", "Williams");
        //To set an alternate Email ID, you can use the following method
        e1.setAlternateEmail("JohnW2002@yahoo.com");
        //To change your automatically generated password, use the following method
        //*Password must have alphabets and numbers only*
        e1.changePassword("JSW234K");
        //To see your complete profile, print the method showProfile()
        System.out.println(e1.showProfile()); 
        //To see your alternate Email ID, use the following method
        System.out.println("The alternate Email ID given by you is: "+  e1.getAlternateEmail());
        //To see your changed password, use the following method
        System.out.println("Password Changed successfully!\nNew password is: " + e1.getPassword());
    }
}
