package SqlDatabase;

import java.io.IOException;
import java.sql.*;

public class DataBase {

    public DataBase createAddress() throws SQLException, IOException, InterruptedException {

        Connection con = DriverManager.getConnection(PropertiesFile.getBaseUrl(),PropertiesFile.getSqlUser(),PropertiesFile.getSqlPassword());
        //Create Statement Object
        Statement stmt1 = con.createStatement();
        //Query to Execute
        String query = "insert into oc_address()" + "values(null,(select customer_id from oc_customer where email='entest2@yahoo.com'),'test','traian','Endava','Calea Vitan','Iuliu Maniu','Bucuresti',306991,(select country_id from oc_country where name='Romania'),2688,0)";
        //Query execute
        stmt1.executeUpdate(query);
        stmt1.close();
         //closing DatabaseSq Connection
        con.close();

        return DataBase.this;
}
    public DataBase changeQuantity() throws SQLException, IOException {

        Connection con = DriverManager.getConnection(PropertiesFile.getBaseUrl(),PropertiesFile.getSqlUser(),PropertiesFile.getSqlPassword());
        //Query to Execute
        String query ="UPDATE oc_cart\n"+
                "SET quantity = quantity+1\n"+
                "WHERE customer_id = 18";

        //Create Statement Object
        Statement stmt1 = con.createStatement();
        //Query execute
        stmt1.executeUpdate(query);
        stmt1.close();
        // closing DatabaseSq Connection
        con.close();

        return this;
    }
}
