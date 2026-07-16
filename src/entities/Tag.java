package entities;

public class Tag {

    private int tagNumber;
    private String holderName;
    private double balance;

    public Tag(int tagNumber, String holderName, double initialDeposit) {
        this.tagNumber = tagNumber;
        this.holderName = holderName;
        recharge(initialDeposit);
    }

    public Tag(int tagNumber, String holderName) {
        this.tagNumber = tagNumber;
        this.holderName = holderName;
    }

    public int getTagNumber() {
        return this.tagNumber;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void recharge(double amount) {
        balance += amount;
    }

    public void payToll(double tollFee) {
        balance -= tollFee + 1.50;
    }

    @Override
    public String toString() {
        return "Tag: "
        + tagNumber
        + ", Holder: "
        + holderName
        + ", Balance: $ "
        + String.format("%.2f", balance);
    }
}