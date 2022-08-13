package taskBank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    public static List<Client> clients = new ArrayList<>();

    public static List getAccounts(Client client) {

        return client.getAccounts();
    }

    public static Client findClient(Account account) { // BigO = O(n^2) - омерзительно

        for (Client x : clients) {
            for (Account z : x.accounts
            ) {
                if (z.equals(account)) {
                    return x;
                }
            }
        }
        System.out.println("Этот счет никому не принадлежит");
        return null;
    }

    public static Client createClient(String name, Integer age) {

        Client cl = new Client(name, age);

        return cl;
    }

    public static Account createAccountForClient(Client client, Integer uniqueNumber, Integer money) {

        Account ac = new Account(uniqueNumber, money);

        client.accounts.add(ac);

        return ac;

    }
}
