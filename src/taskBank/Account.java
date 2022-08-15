package taskBank;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return uniqueNumber.equals(account.uniqueNumber) && money.equals(account.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueNumber, money);
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
