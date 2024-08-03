 
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067529 ikshit maharjan)
 * @version (a version number or a date)
 */

public class CreditCard extends BankCard
{
    //// private Attributes
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;

    //Parameterized Constructor
    public CreditCard(double balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int cvcNumber, double interestRate, String expirationDate) {
        //call the parent class constructor
        super(balanceAmount, cardId, bankAccount, issuerBank);
        //setter method setclientName()
        setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        //set flag to false
        this.isGranted = false;
    }
    
    //creating method for setCreditLimt
    public void setCreditLimit(double creditLimit, int gracePeriod) {
        //using if else condition
        if (creditLimit <= 2.5 * getBalanceAmount()) {
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            //set flag to true
            this.isGranted = true;
        } else {
            System.out.println("Credit cannot be issued.");
        }
    }
    
    //creating method for cancelCreditCard
    public void cancelCreditCard() {
        //using if else condition
        if (isGranted) {
            this.cvcNumber = 0;
            this.creditLimit = 0;
            this.gracePeriod = 0;
            this.isGranted = false;
        } else {
            System.out.println("No credit card to cancel.");
        }
    }
    
   
    
    //getter method for getCvcNumber
    public int getCvcNumber(){
        return cvcNumber;
    }
    
    //getter method for getCreditLimit
    public double getCreditLimit(){
        return creditLimit;
    }
    
    //getter method for getInterestRate
    public double getInterestRate(){
        return interestRate;
    }
    
    //getter method for getExpirationDate
    public String getExpirationDate(){
        return expirationDate;
    }
    
    //getter method for getGracePeriod
    public int getGracePeriod(){
        return gracePeriod;
    }
    
    //getter method for getIsGranted
    public boolean getIsGranted(){
        return isGranted;
    }
    
     //Display method for Credit Card
    public void display() {
        //calling the parent class display method
        super.display();
        if (isGranted) {
            System.out.println("CVC number: " + cvcNumber);
            System.out.println("Credit limit: " + creditLimit);
            System.out.println("Interest rate: " + interestRate);
            System.out.println("Expiration date: " + expirationDate);
            System.out.println("Grace period: " + gracePeriod);
        } else {
            System.out.println("no credit has been granted yet.");
        }
    }
}
