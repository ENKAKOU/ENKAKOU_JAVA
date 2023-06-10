package chapter08.homework;
public class SavingsAccount extends BankAccount {

    private int count = 3;
    private double rate = 0.01;//利率

    public void earnMonthlyInterest() {
        count = 3;//
        super.deposit(getBalance() * rate);
    }

    public void deposit(double amount) {
        //判断是否还可以免手续费
        if(count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;  //减去一次
    }

    public void withdraw(double amount) {//取款
        //判断是否还可以免手续费
        if(count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;
    }

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;

    }
}
