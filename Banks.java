 class Bank {
    protected int balance;

    public Bank() {
        balance = 0; // Initialize balance to 0
    }

    public int getBalance() {
        return balance;
    }
}

class ABL extends Bank {
    public ABL(int amount) {
        balance = amount; // Set the balance for ABL
    }
}

class HBL extends Bank {
    public HBL(int amount) {
        balance = amount; // Set the balance for HBL
    }
}

class MCB extends Bank {
    public MCB(int amount) {
        balance = amount; // Set the balance for MCB
    }
}

public class Banks {
    public static void main(String[] args) {
        ABL abl = new ABL(3000);
        HBL hbl = new HBL(5000);
        MCB mcb = new MCB(2000);

        System.out.println("ABL Balance: " + abl.getBalance());
        System.out.println("HBL Balance: " + hbl.getBalance());
        System.out.println("MCB Balance: " + mcb.getBalance());
    }
}