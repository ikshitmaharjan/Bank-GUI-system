
/**
 * Write a description of class BankCard here.
 *
 * @author (22067529 ikshit maharjan)
 * @version (1.0.0)
 */
public class BankCard
{
    //// private attributes : 
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;

        //Parameterized constructor:
    public BankCard(double balanceAmount, int cardId, String bankAccount, String issuerBank){
        this.balanceAmount = balanceAmount;
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;this.clientName = "";
    }

        //setter method setclientname for accepting client name
    public void setClientName(String clientName){
        this.clientName = clientName;
    }

        //setter method setbalance for accepting new balance
    public void setBalance(double balanceAmount){
        this.balanceAmount = balanceAmount;
    }

        //getter method for balanceAmount 
    public double getBalanceAmount(){
        return this.balanceAmount;
    }

        //getter method for cardId
    public int getCardId(){
        return this.cardId;
    }

        //getter method for bankAccount
    public String getBankAccount(){
        return this.bankAccount;
    }

        //getter method for issuerBank
    public String getIssuerBank(){
        return this.issuerBank;
    }
        //getter method for clientNam
    public String getClientName() {
        return this.clientName;
    }

        //display  method
    public void display (){
        if(this.clientName == " "){
            System.out.println("Invalid name entered. Please try again later");
        }
        else{
        System.out.println("ClientName: " + this.clientName);
        System.out.println("CardId: " + this.cardId);
        System.out.println("IssuerBank: " + this.issuerBank);
        System.out.println("BankAccount: " + this.bankAccount);
        System.out.println("BalanceAmount: " + this.balanceAmount);
        }
    }
}