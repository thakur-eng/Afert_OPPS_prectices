package com.opps;

public class Mony {
    Mony(String name) {
    }
}

class Pesa extends Mony {
    String name;
    String account;

    public Pesa(String name, String account) {
        super(name);
        this.account = account;
        this.name = name;
    }
}

class Rupes extends Pesa {
    Rupes(String name, String account) {
        super(name, account); // Fix: Call the parent constructor
    }
}

class Curancy extends Rupes {
    Curancy(String name, String account) {
        super(name, account);
    }

    public static void main(String[] args) {
        Curancy c = new Curancy("Dollar", "12345"); // Fix: Provide constructor arguments
        System.out.println("Object created successfully!");
    }
}
