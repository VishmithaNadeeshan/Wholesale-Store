<<<<<<< HEAD
package thogakade;

import java.sql.*;

/**
 *
 * @author nirot
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thogakade;

/**
 *
 * @author Vishmitha nadeeshan
>>>>>>> 59002b6 (first commit)
 */
public class ThogaKade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ThogaKade", "root", "mysql");

            String SQL = "Select * From Customer";
            Statement stm = connection.createStatement();
            ResultSet rst = stm.executeQuery(SQL);
            while (rst.next()) {
                String id = rst.getString("id");
                String name = rst.getString("name");
                String address = rst.getString(3);
                double salary = rst.getDouble("salary");
                System.out.println(id + "\t" + name + "\t+" + address + "\t" + salary);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver s/w not found..");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

=======
        // TODO code application logic here
    }
    
>>>>>>> 59002b6 (first commit)
}
