package org.des.designpatterns.structural.facade;

import java.sql.Connection;

public class OracleHelper {

    public static Connection getOracleDBConnection(){
        //get Oracle DB connection using connection parameters
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("generateOraclePDFReport : table name : " + tableName + " === Connection " + con);
    }

    public void generateOracleHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("generateOracleHTMLReport : table name : " + tableName + " === Connection " + con);
    }

}
