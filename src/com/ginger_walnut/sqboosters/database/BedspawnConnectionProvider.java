package com.ginger_walnut.sqboosters.database;

import java.sql.Connection;

import net.countercraft.movecraft.bedspawns.Bedspawn;

public class BedspawnConnectionProvider implements ConnectionProvider{

	@Override
	public Connection getConnection() {
		
		Bedspawn.getContext();
		return Bedspawn.cntx;
		
	}

}
