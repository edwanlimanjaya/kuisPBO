/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.User;
import Model.CategoryUser;

/**
 *
 * @author HP
 */
public class DatabaseController {

    static DatabaseHandler conn = new DatabaseHandler();

    // SELECT ALL from table users
    public static ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM users";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("ID"));
                user.setName(rs.getString("Name"));
                user.setEmail(rs.getString("Email"));
                user.setPassword(rs.getString("Password"));
                user.setIdCategory(rs.getInt("IdCategory"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (users);
    }

    // SELECT WHERE
    public static User getUser(int idCategory) {
        conn.connect();
        String query = "SELECT * FROM users WHERE IdCategory='" + idCategory;
        User user = new User();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                user.setId(rs.getInt("ID"));
                user.setName(rs.getString("Name"));
                user.setEmail(rs.getString("Email"));
                user.setPassword(rs.getString("Password"));
                user.setIdCategory(rs.getInt("IdCategory"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (user);
    }

    // INSERT
    public static boolean insertNewUser(User user) {
        conn.connect();
        String query = "INSERT INTO users VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setInt(1, user.getId());
            stmt.setString(2, user.getName());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getPassword());
            stmt.setInt(5, user.getIdCategory());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    // UPDATE
    public static boolean updateUser(User user) {
        conn.connect();
        String query = "UPDATE `users` SET `Name`='" + user.getName()
                + "',`Email`='" + user.getEmail()
                + "',`Password`='" + user.getPassword() + "',`IdCategory`='"
                + user.getIdCategory() + "' WHERE `Id`='" + user.getId() + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    //Login
    public static User loginUser(String email, String password) {
        conn.connect();
        String query = "SELECT * FROM users";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("ID"));
                user.setName(rs.getString("Name"));
                user.setEmail(rs.getString("Email"));
                user.setPassword(rs.getString("Password"));
                user.setIdCategory(rs.getInt("IdCategory"));

                if (email.equals(user.getEmail())) {
                    if (password.equals(user.getPassword())) {
                        return user;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<String> getCategory() {
        conn.connect();
        ArrayList<String> categories = new ArrayList<>();
        int i = 0;
        String query = "SELECT `Category name` FROM category";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                CategoryUser category = new CategoryUser();
                category.setName((rs.getString("Category name")));
                categories.add(category.getName());
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }

    public static ArrayList<String> searchUser(String kategori) {
        conn.connect();
        ArrayList<String>hasilBanyak = new ArrayList<>();
        ArrayList<User>users = new ArrayList<>();
        ArrayList<CategoryUser>categories = new ArrayList<>();
        String hasil = "";
        String query = "SELECT*FROM `users` \n" 
                +"INNER JOIN category ON `IdCategory` = `Category id`"
                + "WHERE `Category name` = '"+kategori+"'";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                User user = new User();
                CategoryUser category = new CategoryUser();
                user.setId(rs.getInt("Id"));
                user.setName(rs.getString("Name"));
                user.setEmail(rs.getString("Email"));
                user.setPassword(rs.getString("Password"));
                user.setIdCategory(rs.getInt("IdCategory"));
                category.setId(rs.getInt("Category id"));
                category.setName(rs.getNString("Category name"));
                users.add(user);
                categories.add(category);
                hasil = users.toString()+ "\n" +categories.toString();
                hasilBanyak.add(hasil);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hasilBanyak;

    }
    
    // DELETE
    public static boolean deleteUser(String name) {
        conn.connect();

        String query = "DELETE FROM users WHERE Name='" + name + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}
