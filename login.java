import java.util.Scanner;
public class loginapp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String correctuser="admin";
        String correctpass="1234";
        System.out.println("Enter the user name");
        String user=sc.nextLine();
        System.out.println("Enter the passwpord");
        String pass=sc.nextLine();
        if(user.equals(correctuser)&&pass.equals(correctpass))
        {
            System.out.println("Login success");
        }
        else{
            System.out.println("acess denied");
        }
        sc.close();

    }
}
