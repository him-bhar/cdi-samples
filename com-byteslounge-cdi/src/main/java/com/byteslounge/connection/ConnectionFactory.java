package com.byteslounge.connection;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.Disposes;

public class ConnectionFactory {

	@Produces
	@RequestScoped
	@TestConnection
	public Connection getConnection(){
		Connection conn = new ConnectionImpl();
		conn.connect();
		return conn;
	}
	
	public void closeConnection(@Disposes @TestConnection Connection connection){
		connection.closeConnection();
	}
	
}
