package com.opps.encapsulation;


class Users {
    private String name;  // private data

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}


public class Gatter_Setter {

	
	public static void main(String[] args) {
		Users a = new Users();

        // Access private variable using getter
        System.out.println("Initial value: " + a.getName());

        // Modify private variable using setter
        a.setName("BBB");
        System.out.println("Updated value: " + a.getName());
      }
}











 
 
