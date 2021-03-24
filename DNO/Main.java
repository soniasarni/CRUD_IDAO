package com.sonia.DNO;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Connection connect = Getconnect.getConnection();
		Client afpa= new Client(1,"sarah","sarni");
		ClientDao moussa =new ClientDao();
		moussa.create(afpa);
	}

}
