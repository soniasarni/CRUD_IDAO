package com.sonia.DNO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


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

	@Override
	public List<Client> read(Client object) {
		// TODO Auto-generated method stub
		List <Client>liste= new ArrayList<>();
		try {
			PreparedStatement req= connect.prepareStatement("SELECT*FROM Client");
					ResultSet rs=req.executeQuery();
					System.out.println("SELECT OK");
					while(rs.next()) {
						Client cli= new Client(0, null, null);
						cli.setNom(rs.getString("nom"));
						cli.setPrenom(rs.getString("prenom"));
						liste.add(cli);
					}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return liste;
	}

}
