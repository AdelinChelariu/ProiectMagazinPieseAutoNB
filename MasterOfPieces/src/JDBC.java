import java.sql.*;

public class JDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/Magazin Piese Auto";
    private static final String USER = "root";
    private static final String PASSWORD = "Adelin2711";

    private static Connection connection = null;
    private static String username;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexiune reusita la baza de date!");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    
    public static char emailCheck(String user, String password){
        try{
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, user);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            username = user;
            if(rs.next())
                return 'l';
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return 'i';
    }
    
}
