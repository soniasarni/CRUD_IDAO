package com.sonia.DNO;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class ClientDao implements IDAO<Client> {
Connection connect = Getconnect.getConnection();

	@Override
	public void create(Client object) {
	try {
		PreparedStatement req= connect.prepareStatement("INSERT INTO Client"
				+"(id,nom,prenom)VALUES(?,?,?)");
		req.setInt(1,object.getId());
		req.setString(2,object.getNom());
		req.setString(3,object.getPrenom());
		req.executeUpdate();
		System.out.println("insert success");
	}catch (Exception e) {
		e.printStackTrace();
		System.out.println("insert kooo");
	}
		
	}

}
