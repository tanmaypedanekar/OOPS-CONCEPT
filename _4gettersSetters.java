class gettersSetters {
    // instance private varible.
    private String OwnerName;
    private int accNumber;
    private double balance;

    // getters and setters for the instance varible.

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String Ownername) {
        this.OwnerName = Ownername;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccnumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public double getbalance() {
        return balance;
    }

    public void setbalance(double balance) {
        if (balance <=0){
            System.out.println("Invalid transaction!!!");
        }else{
        this.balance = balance;
        }
    }

}

// main class.
class _4gettersSetters {
    public static void main(String[] args) {
        // set the values.
        gettersSetters bank = new gettersSetters();
        bank.setOwnerName("Tanmay");
        bank.setAccnumber(123456789);
        bank.setbalance(-100000.00);

        // print the values using getters.
        System.out.println("Account holder name is : " + bank.getOwnerName());
        System.out.println("Account number is : " + bank.getAccNumber());
        System.out.println("Account bank balance is : " + bank.getbalance());
    }
}
