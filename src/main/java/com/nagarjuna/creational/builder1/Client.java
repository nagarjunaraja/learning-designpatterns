package com.nagarjuna.creational.builder1;

public class Client {

	public static void main(String[] args){
		
		// setup the director
		QueryBuildDirector director = new QueryBuildDirector();
		String from="client table";
		String where="client name = ...";
		
		QueryBuilder builder = new SqlQueryBuilder();
		Query query = director.buildQuery(from, where, builder);
		query.execute();

	}
	
}
