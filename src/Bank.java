public class Bank {
    public static void main (String [] args) {

        Clients c001 = new Clients();
        c001.firstName = "Wagner";
        c001.age = 28;

        Clients c002 = new Clients();
        c002.firstName = "Gabriele";
        c002.age = 25;

        c002.newAccount();
    }
}
