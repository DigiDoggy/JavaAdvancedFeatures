package database;

//TODO
// Using the JDBC API and MySQl make the following queries as individual functions:
// 1.Drop table MOVIES if there is one.
// 2. Create a table MOVIES with columns: id of type INTEGER AUTO INCREMENT,title of type VARCHAR (255), genre of type VARCHAR (255),yearOfRelease of type INTEGER.
// 3. Add any three records to the MOVIES table
// 4. Update one selected record's title field (use the PreparedStatement)
// 5. Delete selected record with specified id
// 6. Display all other records in the database


import java.sql.*;
import java.util.ArrayList;


public class Task1 {
    public static void main(String[] args) {

        String dbURL = "jdbc:mysql://localhost:3306/javaee18";
        String  username="root";
        String password = "12345678Java!";

        try(Connection con = DriverManager.getConnection(dbURL,username,password)){

            drop(con);
            create(con);
            insert(con);
            readN(con);
            update(con);
            delete(con);
            read(con);





        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void drop(Connection con)throws SQLException{

        Statement dropStatement= con.createStatement();
        dropStatement.execute("DROP TABLE IF EXISTS MOVIES");

    }
    public static void create(Connection con)throws SQLException{

        String SQL = "CREATE TABLE IF NOT EXISTS MOVIES " +
                "(id INTEGER AUTO_INCREMENT NOT NULL, " +
                " title VARCHAR(255) NOT NULL, " +
                " genre VARCHAR (255) NOT NULL, " +
                "year Integer NOT NULL," +
                " PRIMARY KEY (id))";

       Statement statement = con.createStatement();
       statement.executeUpdate(SQL);

    }

    public static void insert(Connection con) throws SQLException{

        String sql = "INSERT INTO movies(title, genre, year) VALUES (?, ?, ? )";
        PreparedStatement preparedStatement = con.prepareStatement(sql);

        String grinch = "INSERT INTO MOVIES (title, genre, year) VALUES ('How the Grinch Stole Christmas', 'Comedy', 2000)";
        String mission = "INSERT INTO MOVIES (title, genre, year) VALUES ('Mission: Impossible II', 'blockbuster', 2000)";
        String gladiator = "INSERT INTO MOVIES (title, genre, year) VALUES ('Gladiator', 'action', 2000)";

        preparedStatement.executeUpdate(grinch);
        preparedStatement.executeUpdate(mission);
        preparedStatement.executeUpdate(gladiator);


    }

    public static void  read(Connection con)throws SQLException {

        String sql = "SELECT * FROM movies";

        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);


        while (resultSet.next()) {
            String id = "Id: " + resultSet.getString("id");
            String title = "Title: " + resultSet.getString("title");
            String genre = "Genre: " + resultSet.getString("genre");
            String year = "Year: " + resultSet.getString("year");


            System.out.println("##################" + "\n" + id + "\n" + title + "\n" + genre + "\n" + year);


        }
    }

    public static void readN(Connection con) throws SQLException{
        Statement readItemStatement = con.createStatement();
        String readItemsQuery = "SELECT * FROM MOVIES";
        ResultSet rs = readItemStatement.executeQuery((readItemsQuery));

        while(rs.next()){
            int id = rs.getInt("id");
            String title = rs.getString("title");
            String genre = rs.getString("genre");
            int year =rs.getInt("year");
            System.out.println("###############");
            System.out.println("Id: "+id);
            System.out.println("Title: " + title);
            System.out.println("Genre: " + genre);
            System.out.println("Year of release: "+ year);

        }
    }
    public static void update(Connection con)throws SQLException{

        PreparedStatement updateStatement = con.prepareStatement("UPDATE MOVIES SET title = ? WHERE id = ?");
        updateStatement.setString(1,"Grinch");
        updateStatement.setInt(2,1);
        updateStatement.executeUpdate();



    }

    public static void delete(Connection con) throws SQLException {
        Statement deleteItemStatement = con.createStatement();
        deleteItemStatement.executeUpdate("DELETE FROM MOVIES WHERE id= 2");
    }



}
