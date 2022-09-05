
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreditCard {
    

private final String username ;
private String cardNumber ;
private String cardExpiry ;
private String cardLimit ;
private String cardPin ;

    
public CreditCard(String username) throws FileNotFoundException {
        this.username = username;
        getData();
    }
    
    
    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardExpiry() {
        return cardExpiry;
    }

    public String getCardLimit() {
        return cardLimit;
    }

    public String getCardPin() {
        return cardPin;
    }


private void getData() throws FileNotFoundException{
    Scanner inStream = new Scanner(new File(username.concat(".txt"))) ;
    while(inStream.hasNextLine()){
        String line = inStream.nextLine() ;
        if(line.contains("Card number"))
            this.cardNumber = line.substring(line.indexOf(":")+1) ;
        else
            if(line.contains("Card expiry"))
                this.cardExpiry = line.substring(line.indexOf(":")+1)  ;
        else
            if(line.contains("Card limit"))
                this.cardLimit = line.substring(line.indexOf(":")+1)  ;
        else
            if(line.contains("Card pin"))
                this.cardPin = line.substring(line.indexOf(":")+1)  ;
    
    }
}
}
