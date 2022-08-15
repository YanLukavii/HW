package taskBank;

public class Main {

    public static void main(String[] args) {

        Client client = new Client("Bro", 13);
        Client client1 = new Client("NeBro", 22);

        Account account = Bank.createAccountForClient(client, 1, 8400);
        Account account1 = Bank.createAccountForClient(client, 2, 800);
        Account account2 = Bank.createAccountForClient(client, 3, 322);
        Account account6 = Bank.createAccountForClient(client, 8, 3222);

        Account account3 = Bank.createAccountForClient(client1, 4, 8040);
        Account account4 = Bank.createAccountForClient(client1, 5, 8220);
        Account account5 = Bank.createAccountForClient(client1, 6, 32323);

        System.out.println("Нашли клиента по номеру счета "+ Bank.findClient(account4));
        System.out.println("Все счета клиента " + Bank.getAccounts(client1));

    }


}
