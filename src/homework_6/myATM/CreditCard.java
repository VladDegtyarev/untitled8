package homework_6.myATM;




public class CreditCard {
    private String nameOwner;
    private long creditCardNumber;
    private long creditCardBalance;


    public CreditCard(String nameOwner,long creditCardNumber, long creditCardValance) {
        this.nameOwner = nameOwner;
        this.creditCardNumber = creditCardNumber;
        this.creditCardBalance = creditCardValance;
    }

    public String getCreditCardInformation() {
        return "Owner : " + nameOwner+"\n"+
                "Credit Card Number is: " + creditCardNumber + "\n" +
                "Credit Card balance is:  " + creditCardBalance + "\n" ;


    }
    public void addMoney(long money){
        this.creditCardBalance += money;
    }

    public void takeMoney(long money){
        this.creditCardBalance -= money;
    }


}
