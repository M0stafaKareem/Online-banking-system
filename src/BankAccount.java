import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BankAccount {

private final String username ;
private String availableBalance;
private String clientAccountID ;
private String safeDeposit ;
private String cashback ;
private String todayNetTransactions ;
private String weekNetTransactions  ;
private String monthNetTransactions ;

public BankAccount(String username) throws FileNotFoundException {
        this.username = username;
        getData();
    }


private void getData() throws FileNotFoundException{
    Scanner inStream = new Scanner(new File(username.concat(".txt"))) ;
    while(inStream.hasNextLine()){
        String line = inStream.nextLine() ;
        if(line.contains("Customer ID"))
            this.clientAccountID = line.substring(line.indexOf(":")+1) ;
        else
            if(line.contains("Available balance"))
                this.availableBalance = line.substring(line.indexOf(":")+1)  ;
        else
            if(line.contains("Safe deposit"))
                this.safeDeposit = line.substring(line.indexOf(":")+1)  ;
        else
            if(line.contains("Cashback"))
                this.cashback = line.substring(line.indexOf(":")+1)  ;
        else
            if(line.contains("Today net transactions"))
                this.todayNetTransactions = line.substring(line.indexOf(":")+1) ;
        else
            if(line.contains("Last week net transactions"))
                this.weekNetTransactions =  line.substring(line.indexOf(":")+1)  ;
        else
            if(line.contains("Last month net transactions"))
                this.monthNetTransactions = line.substring(line.indexOf(":")+1) ;
        
    }
}

    public String getSafeDeposit() {
        return safeDeposit;
    }

    public String getCashback() {
        return cashback;
    }

    public String getTodayNetTransactions() {
        return todayNetTransactions;
    }

    public String getWeekNetTransactions() {
        return weekNetTransactions;
    }

    public String getMonthNetTransactions() {
        return monthNetTransactions;
    }
    
    public String getAvailableBalance() {
        return availableBalance;
    }

    public String getClientAccountID() {
        return clientAccountID;
    }

    
}
