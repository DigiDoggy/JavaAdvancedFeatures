package database.hw;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Config {


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(dbURL,userName,password);


        int choice;
        do {
          System.out.println("""
                  Hello Welcome to the DataBase\s
                  If u want to read press 1.
                  If u want to create account then press 2.
                  If u want delete something from DataBase press 3.
                  If u want break enter 0.""");

          System.out.println("Enter here your choice: ");
          choice = scanner.nextInt();

          getChoice(choice, con);

          System.out.println();
      }while (choice !=0);
    }

    public static void readData(Connection con) throws SQLException {

        String sql = "SELECT * FROM users";

        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        int row = 1;

        while (resultSet.next()){
            String  username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String fullName = resultSet.getString("fullname");
            String email = resultSet.getString("email");



            String output = "User #%d: %s -%s -%s -%s";
            System.out.println(String.format(output, row ++,username,password,fullName,email));
        }


    }

    public static void deleteData(Connection con) throws SQLException{

        //Bug
        scanner.nextLine();
        String username = scanner.nextLine().trim();

        String sqlDeleteCommand = "Delete  from users WHERE " +getColumnName(con).get(0) + " = ?";

        PreparedStatement preparedStatement = con.prepareStatement(sqlDeleteCommand);
        preparedStatement.setString(1,username);

        if(preparedStatement.executeUpdate()>0){
            System.out.println("A user was deleted successfully.");
        }

    }

    static public void getUserNameFromData(Connection con)throws SQLException {

        String sql = "Select " + getColumnName(con).get(0) + " from users";
        Statement statement = con.createStatement();
        ResultSet set = statement.executeQuery(sql);


        while (set.next()){
            System.out.println(set.getString(1));
    }



    }

    public static ArrayList<String> getColumnName(Connection con) throws SQLException {
        String sql = ("select * from users limit 0");

        Statement statement = con.createStatement();
        ResultSet set = statement.executeQuery(sql);
        ResultSetMetaData data = set.getMetaData();

        ArrayList<String> colNames = new ArrayList<>();



        for (int i = 1; i <= data.getColumnCount(); i++) {
            colNames.add(data.getColumnName(i));
        }
        return colNames;
    }

    public static void insertData(Connection con)throws SQLException{
        String sql = "INSERT INTO users(username, password, fullname, email) VALUES (?, ?, ?, ?)";

        PreparedStatement preparedStatement = con.prepareStatement(sql);

        int countFor = 0;

        for (int i=0; i<=getColumnName(con).size();i++){
            countFor++;
            System.out.println(countFor);
            switch (i){
                case 0:
                    scanner.nextLine();
                    System.out.println("Enter your " + getColumnName(con).get(i) + " : ");
                    preparedStatement.setString(i+1, scanner.nextLine().trim());
                    break;
                case 1:
                    System.out.println("Enter your " + getColumnName(con).get(i) + " : ");
                    preparedStatement.setString(i+1, scanner.nextLine().trim());
                    break;
                case 2:
                case 3:
                    System.out.println("Enter your " + getColumnName(con).get(i) + " : ");
                    preparedStatement.setString(i+1, scanner.nextLine());
                    break;
                default:
                    break;
            }
        }

        if(preparedStatement.executeUpdate()>0){
            System.out.println("A new user was inserted successfully");
        }
    }

//    public static ArrayList<String> getInformationForData(Connection con) throws SQLException {
//
//
//        getColumnName(con);
//
//
//        System.out.print("Enter username: ");
//        userInfo.add(scanner.nextLine().trim());
//        System.out.println("Enter password");
//        userInfo.add(scanner.nextLine().trim());
//        System.out.println("Enter fullname");
//        userInfo.add(scanner.nextLine());
//        System.out.println("Enter email");
//        userInfo.add(scanner.nextLine().trim());
//
//
//        return userInfo;
//    }

    public static void getChoice(int choice,Connection con) throws Exception {
            switch (choice) {
                case 1:
                    readData(con);
                    break;
                case 2:
                    insertData(con);
                    break;
                case 3:
                    System.out.println("Enter user name what do you want to delete from list");
                    getUserNameFromData(con);
                    deleteData(con);
                    break;
                default:
                    break;
            }


        }







}
