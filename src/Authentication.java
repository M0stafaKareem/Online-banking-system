
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Authentication {

private static boolean checkUserID(String userID) throws FileNotFoundException{
    Scanner inStream = new Scanner(new File("C:\\Users\\mostafa\\Documents\\NetBeansProjects\\Software project\\src\\Database\\UsersList.txt")) ;
    while(inStream.hasNextLine()){
        String username = inStream.nextLine();
        if(username.equals(userID))
            return true ;
    }
    return false ;
    
}

public static boolean validate(String userID,String password) throws FileNotFoundException{
    if(!checkUserID(userID))
        return false ;
    Scanner inStream = new Scanner(new File("C:\\Users\\mostafa\\Documents\\NetBeansProjects\\Software project\\src\\Database\\".concat(userID.concat(".txt")))) ;
    String pass="";
    while(inStream.hasNextLine()){
        String line = inStream.nextLine();
        if( line.contains("Password") ){
            pass = line.substring(line.indexOf(":")+1);
            break;
        }
    }
    return pass.equals(password) ;
}

}
