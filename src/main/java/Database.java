import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    public Database createAddress() throws SQLException{
        String dbUrl = "jdbc:mariadb://192.168.164.15:3306/bitnami_opencart";

        //Database Username
        String username = "root";

        //Database Password
        String password = "root";

        //Query to Execute
        String query = "insert into oc_address()" + "values(null,(select customer_id from oc_customer where email='entest2@yahoo.com'),'test','traian','Endava','Calea Vitan','Iuliu Maniu','Bucuresti',306991,(select country_id from oc_country where name='Romania'),2688,0)";

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,username,password);

        //Create Statement Object
        Statement stmt1 = con.createStatement();

        //Query execute
        stmt1.executeUpdate(query);
        stmt1.close();

        // closing DB Connection
        con.close();

        return this;
}
    public Database changeQuantity() throws SQLException{
        String dbUrl = "jdbc:mariadb://192.168.164.15:3306/bitnami_opencart";
        //Database Username
        String username = "root";
        //Database Password
        String password = "root";
        //Query to Execute
        String query ="UPDATE oc_cart\n"+
                "SET quantity = quantity+1\n"+
                "WHERE customer_id = 18";
        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,username,password);
        //Create Statement Object
        Statement stmt1 = con.createStatement();
        //Query execute
        stmt1.executeUpdate(query);
        stmt1.close();
        // closing DB Connection
        con.close();
        return this;
    }
}
