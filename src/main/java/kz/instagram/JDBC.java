package kz.instagram;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {

    public void runJDBC(){
        Connection connection = null;
        //URL к базе состоит из протокола:подпротокола://[хоста]:[порта_СУБД]/[БД] и других_сведений
        String url = "jdbc:postgresql://127.0.0.1:5432/instagram";
        //Имя пользователя БД
        String name = "postgres";
        //Пароль
        String password = "123";



        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, name, password);
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select person_id, person_name from Person");

            while (rs.next()){
                System.out.println("Person id: " + rs.getLong("person_id") + ", name:" + rs.getString("person_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
