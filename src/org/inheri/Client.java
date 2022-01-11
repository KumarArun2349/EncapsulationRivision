package org.inheri;

public class Client extends Company {
	private void clientId() {
		System.out.println("Client ID: 0000");

	}

	private void clientName() {
		System.out.println("AABBCC");

	}
	private void clientAdd() {
		System.out.println("USA");
	}
	public static void main(String[] args) {
		Client c1=new Client();
		c1.clientId();
		c1.clientName();
		c1.clientAdd();
		c1.cId();
		c1.cName();
		c1.empID();
		c1.empName();
		
	}

}
