package taskBank;

public class Account {

    private Integer uniqueNumber;
    private Integer money;

    @Override
    public String toString() {
        return "Account{" +
                "uniqueNumber=" + uniqueNumber +
                ", money=" + money +
                '}';
    }

    public Account(Integer uniqueNumber, Integer money) {

        this.uniqueNumber = uniqueNumber;
        this.money = money;

    }

    public Integer getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(Integer uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
