package org.des.designpatterns.structural.facade;

import java.sql.Connection;

public class MySqlHelper {

    public static Connection getMySqlDBConnection(){
        //get MySql DB connection using connection parameters
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("generateMySqlPDFReport : table name : " + tableName + " === Connection " + con);
    }

    public void generateMySqlHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("generateMySqlHTMLReport : table name : " + tableName + " === Connection " + con);
    }
}
