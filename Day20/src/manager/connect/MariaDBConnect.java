package manager.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDBConnect {

    private static Connection conn = null;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        if(conn == null) {
            Class.forName("org.mariadb.jdbc.Driver");
            conn =  DriverManager.getConnection(
                    "jdbc:mariadb://javalec.czvo3mok5lfm.ap-northeast-2.rds.amazonaws.com:3306/JavaProject",
                    "admin",
                    "1234567890"
            );
        }
        return conn;
    }


    public static void closeConnection() throws SQLException {
        if(!conn.isClosed()) conn.close();
    }
}
