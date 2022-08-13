package taskBank;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private Integer age;
    private String name;
    List<Account> accounts = new ArrayList<>();

    public Client(String name, Integer age) {
        this.age = age;
        this.name = name;
        Bank.clients.add(this);

    }

    @Override
    public String toString() {
        return "Client{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
