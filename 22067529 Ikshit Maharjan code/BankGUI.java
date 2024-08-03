
/**
 * Write a description of class BankGUI here.
 *
 * @author (22067529 Ikshit Maharjan)
 * @version (1.0.0)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Color;

public class BankGUI implements ActionListener{
    //declaring components for main frame

    private JFrame mainframe;   
    private JLabel bankcardlabel, creditcardlabel;
    private JButton debitcardbtn, creditcardbtn;

    //debit card components
    private JFrame frame;
    private JLabel headinglabel, cardID, clientname, issuerBank, bankaccount, balanceamount, pinnumber,withdrawalamount, withdrawaldate;
    private JTextField cardIDtxt, clientNametxt, issuerBanktxt, bankaccounttxt, balanceamounttxt, pinnumbertxt, withdrawalamounttxt;
    private JComboBox yearbox, monthbox, daybox;    
    private JButton adddebitcardbtn, debitcardclearbtn, displaybtn, withdrawfromcardbtn, backbtn;

    //credit card components
    private JFrame creditframe;
    private JLabel  expirationdate, cvcnumber, creditlimit, graceperiod, interestrate;
    private JTextField  creditcardIDtxt, creditclientNametxt, creditissuerBanktxt, creditbankaccounttxt, creditbalanceamounttxt, creditcvcnumbertxt, creditlimittxt, graceperiodtxt, interestratetxt;
    private JButton addcreditcardbtn, creditcardclearbtn, cancilcreditcardbtn, creditlimitdbtn , cancelcreditcardbtn, creditbackbtn, creditdisplaybtn;
    private JComboBox credityearbox, creditmonthbox, creditdaybox;

    ArrayList<BankCard> cards = new ArrayList<BankCard>();

    public void BankGUI(){
        //first window
        mainframe = new JFrame("Bank GUI"); 
        //Color c = new Color(116, 172, 196);
        //mainframe.getContentPane().setBackground(c);

        //Title
        bankcardlabel = new JLabel("Choose a CARD");
        bankcardlabel.setBounds(200,20,200,30);
        bankcardlabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
        mainframe.add(bankcardlabel);

        //debit card
        debitcardbtn = new JButton("Debit Card");
        debitcardbtn.setBounds(100, 130, 130, 50);
        debitcardbtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mainframe.add(debitcardbtn);
        debitcardbtn.addActionListener(this);

        //for credit card
        creditcardbtn = new JButton("Credit Card");
        creditcardbtn.setBounds(360, 130,130,50);
        creditcardbtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mainframe.add(creditcardbtn);
        creditcardbtn.addActionListener(this);

        mainframe.setSize(600,280);
        mainframe.setLayout(null);
        mainframe.setVisible(true);
        mainframe.setResizable(false);

    }

    public void DebitcardGUI(){

        frame = new JFrame("Debit Card");

        //heading for Debit card
        headinglabel = new JLabel("Debit Card");
        headinglabel.setBounds(274,22,150,40);
        headinglabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        frame.add(headinglabel);

        //Card id
        cardID = new JLabel("Card ID");
        cardIDtxt = new JTextField();
        cardID.setBounds(50,95,100,20);
        cardIDtxt.setBounds(147,90,100,20);
        frame.add(cardID);
        frame.add(cardIDtxt);

        //Client Name
        clientname = new JLabel("Client Name");
        clientNametxt = new JTextField();
        clientname.setBounds(50,139,100,20);
        clientNametxt.setBounds(147,139,100,20);
        frame.add(clientname);
        frame.add(clientNametxt);

        //Issuer bank
        issuerBank = new JLabel("Issuer Bank");
        issuerBanktxt = new JTextField();
        issuerBank.setBounds(50,183,100,20);
        issuerBanktxt.setBounds(147,183,100,20);
        frame.add(issuerBank);
        frame.add(issuerBanktxt);

        //Bank account
        bankaccount = new JLabel("Bank Account");
        bankaccounttxt = new JTextField();
        bankaccount.setBounds(350,91,100,20);
        bankaccounttxt.setBounds(485,91,100,20);
        frame.add(bankaccount);
        frame.add(bankaccounttxt);

        //Bank amount    (balance amount)
        balanceamount = new JLabel("Balance Amount");
        balanceamounttxt = new JTextField();
        balanceamount.setBounds(350,134,100,20);
        balanceamounttxt.setBounds(485,134,100,20);
        frame.add(balanceamount);
        frame.add(balanceamounttxt);

        //PIN Number
        pinnumber = new JLabel("PIN Number");
        pinnumbertxt = new JTextField();
        pinnumber.setBounds(350,177,100,20);
        pinnumbertxt.setBounds(485,177,100,20);
        frame.add(pinnumber);
        frame.add(pinnumbertxt);

        //Withdrawal amount
        withdrawalamount = new JLabel("Withdrawal Amount");
        withdrawalamounttxt = new JTextField();
        withdrawalamount.setBounds(350,220,115,20);
        withdrawalamounttxt.setBounds(485,220,100,20);
        frame.add(withdrawalamount);
        frame.add(withdrawalamounttxt);

        //withdrawalDate
        withdrawaldate = new JLabel("Withdrawal Date");
        withdrawaldate.setBounds(350,255,100,20);
        frame.add(withdrawaldate);

        //combobox year
        yearbox = new JComboBox();
        yearbox.setBounds(485,254,55,20);
        frame.add(yearbox);
        yearbox.addItem("2015");
        yearbox.addItem("2016");
        yearbox.addItem("2017");
        yearbox.addItem("2018");
        yearbox.addItem("2019");
        yearbox.addItem("2020");
        yearbox.addItem("2021");

        //combo box month
        monthbox = new JComboBox();
        monthbox.setBounds(550,254,45,20);
        frame.add(monthbox);
        monthbox.addItem("jan");
        monthbox.addItem("feb");
        monthbox.addItem("mar");
        monthbox.addItem("apr");
        monthbox.addItem("may");

        //combo box day\
        daybox = new JComboBox();
        daybox.setBounds(600,254,45,20);
        frame.add(daybox);
        daybox.addItem("1");
        daybox.addItem("2");  
        daybox.addItem("3");
        daybox.addItem("4");
        daybox.addItem("5");
        daybox.addItem("6");
        daybox.addItem("7");

        //add Debit card button
        adddebitcardbtn = new JButton("Add Debit Card");
        adddebitcardbtn.setBounds(49,270,261,27);   
        frame.add(adddebitcardbtn);
        adddebitcardbtn.addActionListener(this);

        //clear button
        debitcardclearbtn = new JButton("Clear");
        debitcardclearbtn.setBounds(187,323,120,27);
        frame.add(debitcardclearbtn);
        debitcardclearbtn.addActionListener(this);

        //Display button
        displaybtn = new JButton("Display");
        displaybtn.setBounds(330,323,120,27);
        frame.add(displaybtn);
        displaybtn.addActionListener(this);

        //Withdrawal from card button
        withdrawfromcardbtn = new JButton("Withdraw From Card");
        withdrawfromcardbtn.setBounds(489,323,170,27);
        frame.add(withdrawfromcardbtn);  
        withdrawfromcardbtn.addActionListener(this);

        //Back button
        backbtn = new JButton("BACK");
        backbtn.setBounds(47,323,120,27);
        frame.add(backbtn);
        backbtn.addActionListener(this);
 
        frame.setSize(690, 405);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

    }

    public void CreditcardGUI(){

        creditframe = new JFrame("Credit Card");

        //heading for Credit card
        headinglabel = new JLabel("Credit Card");
        headinglabel.setBounds(270,22,180,40);
        headinglabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        creditframe.add(headinglabel);

        //Card id
        cardID = new JLabel("Card ID");
        creditcardIDtxt = new JTextField();
        cardID.setBounds(35,79,100,20);
        creditcardIDtxt.setBounds(172,79,100,20);
        creditframe.add(cardID);
        creditframe.add(creditcardIDtxt);

        //Client Name
        clientname = new JLabel("Client Name");
        creditclientNametxt = new JTextField();
        clientname.setBounds(35,122,100,20);
        creditclientNametxt.setBounds(172,117,100,20);
        creditframe.add(clientname);
        creditframe.add(creditclientNametxt);

        //Issuer bank
        issuerBank = new JLabel("Issuer Bank");
        creditissuerBanktxt = new JTextField();
        issuerBank.setBounds(35,165,100,20);
        creditissuerBanktxt.setBounds(172,160,100,20);
        creditframe.add(issuerBank);
        creditframe.add(creditissuerBanktxt);

        //Bank account
        bankaccount = new JLabel("Bank Account");
        creditbankaccounttxt = new JTextField();
        bankaccount.setBounds(35,208,100,20);
        creditbankaccounttxt.setBounds(172,203,100,20);
        creditframe.add(bankaccount);
        creditframe.add(creditbankaccounttxt);

        //Bank amoount
        balanceamount = new JLabel("Bank Amount");
        creditbalanceamounttxt = new JTextField();
        balanceamount.setBounds(394,80,100,20);
        creditbalanceamounttxt.setBounds(559,84,100,20);
        creditframe.add(balanceamount);
        creditframe.add(creditbalanceamounttxt);

        //cvcv Number
        cvcnumber = new JLabel("CVC Number");
        creditcvcnumbertxt = new JTextField();
        cvcnumber.setBounds(394,117,100,20);
        creditcvcnumbertxt.setBounds(559,121,100,20);
        creditframe.add(cvcnumber);
        creditframe.add(creditcvcnumbertxt);

        //Interestrate
        interestrate = new JLabel("Interest Rate");
        interestratetxt = new JTextField();
        interestrate.setBounds(394,154,100,20);
        interestratetxt.setBounds(559,155,100,20);
        creditframe.add(interestrate);
        creditframe.add(interestratetxt );

        //Grace period
        graceperiod = new JLabel("Grace Period");
        graceperiodtxt = new JTextField();
        graceperiod.setBounds(394,195,100,20);
        graceperiodtxt.setBounds(559,195,100,20);
        creditframe.add(graceperiod);
        creditframe.add(graceperiodtxt);

        //CreaditLimit
        creditlimit = new JLabel("Credit Limit");
        creditlimittxt = new JTextField();
        creditlimit.setBounds(394,238,100,20);
        creditlimittxt.setBounds(559,236,100,20);
        creditframe.add(creditlimit);
        creditframe.add(creditlimittxt);

        //Expiration date
        expirationdate = new JLabel("Expiration Date");
        expirationdate.setBounds(35,254,100,20);
        creditframe.add(expirationdate);

        //combobox year
        credityearbox = new JComboBox();
        credityearbox.setBounds(172,249,59,20);
        creditframe.add(credityearbox);
        credityearbox.addItem("2015");
        credityearbox.addItem("2016");
        credityearbox.addItem("2017");
        credityearbox.addItem("2018");
        credityearbox.addItem("2019");
        credityearbox.addItem("2020");
        credityearbox.addItem("2021");

        //combo box month
        creditmonthbox = new JComboBox();
        creditmonthbox.setBounds(241,249,45,20);
        creditframe.add(creditmonthbox);
        creditmonthbox.addItem("jan");
        creditmonthbox.addItem("feb");
        creditmonthbox.addItem("mar");
        creditmonthbox.addItem("apr");
        creditmonthbox.addItem("may");

        //combo box day\
        creditdaybox = new JComboBox();
        creditdaybox.setBounds(291,249,45,20);
        creditframe.add(creditdaybox);
        creditdaybox.addItem("1");
        creditdaybox.addItem("2");
        creditdaybox.addItem("3");
        creditdaybox.addItem("4");
        creditdaybox.addItem("5");
        creditdaybox.addItem("6");
        creditdaybox.addItem("7");

        //add Credit card button
        addcreditcardbtn = new JButton("Add Credit Card");
        addcreditcardbtn.setBounds(35,295,261,27);
        creditframe.add(addcreditcardbtn);
        addcreditcardbtn.addActionListener(this);

        //clear button
        creditcardclearbtn = new JButton("Clear");
        creditcardclearbtn.setBounds(566,332,120,27);
        creditframe.add(creditcardclearbtn);
        creditcardclearbtn.addActionListener(this);

        //Display button
        creditdisplaybtn = new JButton("Display");
        creditdisplaybtn.setBounds(140,332,120,27);
        creditframe.add(creditdisplaybtn);
        creditdisplaybtn.addActionListener(this);

        //Cancel from card button
        cancilcreditcardbtn = new JButton("Cancel Credit Card");
        cancilcreditcardbtn.setBounds(264,332,170,27);
        creditframe.add(cancilcreditcardbtn);
        cancilcreditcardbtn.addActionListener(this);

        //Credit limit
        creditlimitdbtn = new JButton("Credit Limit");
        creditlimitdbtn.setBounds(444,332,101,27);
        creditframe.add(creditlimitdbtn);
        creditlimitdbtn.addActionListener(this);

        //Back button
        creditbackbtn = new JButton("BACK");
        creditbackbtn.setBounds(9,332,120,27);
        creditframe.add(creditbackbtn);
        creditbackbtn.addActionListener(this);
        

        creditframe.setSize(690, 405);
        creditframe.setLayout(null);
        creditframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        creditframe.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){

        //for debit card gui
        if(e.getSource() == debitcardbtn){
            mainframe.setVisible(false);
            //calls debit gui method
            DebitcardGUI();
        }

        //for credit card GUI
        if(e.getSource() == creditcardbtn){
            mainframe.setVisible(false);
            //calls credit gui method
            CreditcardGUI();
        }

        //back button for Debit card
        if(e.getSource() == backbtn){
            frame.setVisible(false);
            mainframe.setVisible(true);
        }

        //back button for credit card
        if(e.getSource() == creditbackbtn){
            creditframe.setVisible(false);
            mainframe.setVisible(true);
        }

        //   CLEAR debitcard
        if (e.getSource() == debitcardclearbtn) {
            // Clear all input text fields
            cardIDtxt.setText("");
            clientNametxt.setText("");
            issuerBanktxt.setText("");
            bankaccounttxt.setText("");
            balanceamounttxt.setText("");
            pinnumbertxt.setText("");
            withdrawalamounttxt.setText("");
        }

        // Debit Card Display Button fuinctionalyity
        if(e.getSource() == displaybtn){
            if(cards.isEmpty()){
                JOptionPane.showMessageDialog(frame, "There is no Debit Card to Display");
            }else{
                for (BankCard card : cards){
                    if(card instanceof DebitCard){
                        ((DebitCard) card).display();
                    }
                }
            }
        }

        //Credit display button functionality
        if(e.getSource() == creditdisplaybtn){
            if(cards.isEmpty()){
                JOptionPane.showMessageDialog(frame, "There is no Credit Card to Display");
            }else{
                for (BankCard card : cards){
                    if(card instanceof CreditCard){
                        ((CreditCard) card).display();
                    }
                }
            }
        }

        //Withdraw from DEBIT CARD button
        if(e.getSource() == withdrawfromcardbtn){
            if(cardIDtxt.getText().isEmpty() || withdrawalamounttxt.getText().isEmpty() || pinnumbertxt.getText().isEmpty() ){
                JOptionPane.showMessageDialog(frame, "Enter all required Text-Fields.","Warning",JOptionPane.WARNING_MESSAGE); 
            }else{
                try{
                    int cardID = Integer.parseInt(cardIDtxt.getText());
                    int withdrawlAmount = Integer.parseInt(withdrawalamounttxt.getText());
                    int pinNumber = Integer.parseInt(pinnumbertxt.getText());
                    int balanceAmount = Integer.parseInt(balanceamounttxt.getText());
                    String year = yearbox.getSelectedItem().toString();
                    String month = monthbox.getSelectedItem().toString();
                    String day = daybox.getSelectedItem().toString();
                    String date = year +"/"+ month + "/" + day; 
                    if(cards.isEmpty()){
                        JOptionPane.showMessageDialog(frame, "Add a Debit card to Withdraw .","Warning",JOptionPane.WARNING_MESSAGE);
                    }else{
                        for(BankCard card : cards){
                            if(card instanceof DebitCard){
                                DebitCard debitCard = (DebitCard)card;
                                if(debitCard.getCardId() == cardID){
                                    if(debitCard.getPinNumber() == pinNumber){
                                        if(withdrawlAmount<balanceAmount){
                                            debitCard.withdraw(withdrawlAmount,date,pinNumber);
                                            JOptionPane.showMessageDialog(frame,"You'r Amount has been withdrawn successfully.");
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(frame, "Card not found","Warning",JOptionPane.WARNING_MESSAGE);

                                        }
                                    }else{
                                        JOptionPane.showMessageDialog(frame, "insufficient balance", "Not Enough Balance", JOptionPane.ERROR_MESSAGE);

                                    }
                                }else{
                                    JOptionPane.showMessageDialog(frame,"Incorrect PIN Number");
                                }
                            }
                        }                       
                    }              
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame,"Inaapropriate data filled. Try again","Error",JOptionPane.WARNING_MESSAGE); 
                }
            }
        }

        //Add Debit card button functionality
        if(e.getSource() == adddebitcardbtn){
            if(cardIDtxt.getText().isEmpty() || clientNametxt.getText().isEmpty() || issuerBanktxt.getText().isEmpty() || bankaccounttxt.getText().isEmpty() || balanceamounttxt.getText().isEmpty() || pinnumbertxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Please enter all the necessary fields.","Warning",JOptionPane.WARNING_MESSAGE); 
            }
            else{
                try{
                    // getting all the parameter 
                    String bankAccount = bankaccounttxt.getText();
                    String issuerBank = issuerBanktxt.getText();
                    String name = clientNametxt.getText();
                    int balanceamount = Integer.parseInt(balanceamounttxt.getText());
                    int cardid = Integer.parseInt(cardIDtxt.getText());
                    int pin = Integer.parseInt(pinnumbertxt.getText());

                    //If array list is empty
                    if(cards.isEmpty()){
                        DebitCard debitObj = new DebitCard( balanceamount,  cardid,  bankAccount,  issuerBank ,name ,pin);
                        cards.add(debitObj);
                        JOptionPane.showMessageDialog(frame,"The DebitCard has been successfully added");
                    }else{
                        for(BankCard card : cards){
                            if(card instanceof DebitCard){
                                DebitCard debitCard = (DebitCard)card;
                                if(debitCard.getCardId() == cardid){
                                    JOptionPane.showMessageDialog(frame,"You'r DebitCard has been already added");
                                }else{
                                    DebitCard debitObj = new DebitCard(balanceamount,  cardid,  bankAccount,  issuerBank ,name ,pin);
                                    cards.add(debitObj);
                                    JOptionPane.showMessageDialog(frame,"The DebitCard has been successfully added");
                                }
                            }  
                        }
                    }
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame," exception occured","Error",JOptionPane.WARNING_MESSAGE);
                }
            }
        }

        // ADD Credit Card Button
        if(e.getSource() == addcreditcardbtn){
            // logic for the button functionality here            
            //If array list is empty
            if(creditcardIDtxt.getText().isEmpty() || creditclientNametxt.getText().isEmpty() || creditissuerBanktxt.getText().isEmpty() || creditbankaccounttxt.getText().isEmpty() || creditbalanceamounttxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Please enter all the necessary Text-Fields.","Warning",JOptionPane.WARNING_MESSAGE); 
            }
            else{
                try{
                    // getting all the parameter
                    String bankAccount = creditbankaccounttxt.getText();
                    String issuerBank = creditissuerBanktxt.getText();
                    String name = creditclientNametxt.getText();
                    double balanceamount = Double.parseDouble(creditbalanceamounttxt.getText());
                    int cardid = Integer.parseInt(creditcardIDtxt.getText());       
                    int cvcnumber = Integer.parseInt(creditcvcnumbertxt.getText());
                    double interestrate = Double.parseDouble(interestratetxt.getText());
                    String credityear = credityearbox.getSelectedItem().toString();
                    String creditmonth = creditmonthbox.getSelectedItem().toString();
                    String creditday = creditdaybox.getSelectedItem().toString();
                    String expirationdate = credityear +"/"+creditmonth + "/" + creditday;
                    if(cards.isEmpty()){
                        CreditCard creditObj = new CreditCard(balanceamount, cardid, bankAccount,  issuerBank, name,cvcnumber, interestrate,expirationdate);
                        cards.add(creditObj);
                        JOptionPane.showMessageDialog(frame,"The Credit Card has been successfully added");
                    }else{
                        for(BankCard card : cards){
                            if(card instanceof DebitCard){
                                CreditCard creditCard = (CreditCard)card;
                                if(creditCard.getCardId() == cardid){
                                    JOptionPane.showMessageDialog(frame,"The Credit Card has been already added");
                                }else{
                                    CreditCard creditobj = new CreditCard(balanceamount, cardid, bankAccount,  issuerBank, name,cvcnumber, interestrate,expirationdate);
                                    cards.add(creditobj);
                                    JOptionPane.showMessageDialog(frame,"The Credit Card has been successfully added");
                                }
                            }
                        }
                    }
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame,"Some Probelem Accured","Error",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        //   CLEAR Credit card
        if(e.getSource() == creditcardclearbtn){
            //clears all input textfield

            creditcardIDtxt.setText("");
            creditclientNametxt.setText("");
            creditissuerBanktxt.setText("");
            creditbankaccounttxt.setText("");
            creditbalanceamounttxt.setText("");
            creditlimittxt.setText("");
            graceperiodtxt.setText("");
            creditcvcnumbertxt.setText("");
            interestratetxt.setText("");
        }

        //Credit limit functionality

        if(e.getSource() == creditlimitdbtn){
            if(creditcardIDtxt.getText().isEmpty()  || graceperiodtxt.getText().isEmpty() || creditlimittxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Please enter all Text-Fields");
            }else{
                try{
                    int cardID = Integer.parseInt(creditcardIDtxt.getText());
                    int gracePeriod = Integer.parseInt(graceperiodtxt.getText());
                    double creditLimit = Double.parseDouble(creditlimittxt.getText());
                    String values = "\n CardID:"+cardID+"\n Grace Period:"+gracePeriod+"\n Credit Limit :"+creditLimit;
                    if(cards.isEmpty()){
                        JOptionPane.showMessageDialog(frame, "You'r Credit Card is not found. Cannot set Credit limit.","Warning",JOptionPane.WARNING_MESSAGE);
                    }else{
                        for(BankCard card : cards){
                            if(card instanceof CreditCard){
                                CreditCard creditCard = (CreditCard)card;
                                if(creditCard.getCardId() == cardID){
                                    creditCard.setCreditLimit(creditLimit, gracePeriod);
                                    JOptionPane.showMessageDialog(frame,"Credit limit is set successfully" + values);
                                }else{
                                    JOptionPane.showMessageDialog(frame, "You'r Credit Card is not found","Warning",JOptionPane.WARNING_MESSAGE);
                                }
                            }
                        }
                    }
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame,"error","Error",JOptionPane.WARNING_MESSAGE);
                }
            }
        }

        // Cancil credit card functionality
        if(e.getSource() == cancilcreditcardbtn){
            if(creditcardIDtxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Enter the card-ID","Warning",JOptionPane.WARNING_MESSAGE);
            }else{
                try{
                    int cardID = Integer.parseInt(creditcardIDtxt.getText());
                    int count = 1;
                    //checking if the CardID has been cancel or not
                    for(BankCard card : cards){
                        if(card instanceof CreditCard){
                            CreditCard creditCard = (CreditCard)card;
                            if(creditCard.getCardId() == cardID){
                                if(creditCard.getIsGranted() == true){
                                    creditCard.cancelCreditCard();
                                    JOptionPane.showMessageDialog(frame,"You'r Credit Card has been successfully cancelled.");
                                    break;
                                }else{
                                    JOptionPane.showMessageDialog(frame,"The Credit Card has already been canceled");
                                    break;
                                }
                            }else{
                                if(count == cards.size()){
                                    JOptionPane.showMessageDialog(frame,"ADD The exixting CardID.");
                                    break;
                                }   
                            }
                        }else{
                            if(count == cards.size()){
                                JOptionPane.showMessageDialog(frame," CardID does not Match.");
                                break;
                            }
                        }
                        count ++;
                    }
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame,"Please enter valid Data. Try again","Error",JOptionPane.WARNING_MESSAGE);
                }
            }
        }

    }
    public static  void main(String[]args){
        BankGUI bGUI = new BankGUI();
        bGUI.BankGUI();
    }
}

