package taskBank;

import java.util.*;
import java.util.stream.Collectors;

public class Bank {

    public static Map<Account, Client> mapClients = new HashMap();

    public static List<Account> getAccounts(Client client) {

        List<Account> list = mapClients.entrySet().stream()
                .filter(k -> k.getValue().equals(client))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return list;
    }

    public static Client findClient(Account account) {

        for (Map.Entry<Account, Client> entry : mapClients.entrySet()) {
            if (entry.getKey().equals(account)) {
                return entry.getValue();
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

        mapClients.put(ac, client);

        return ac;
    }
}
