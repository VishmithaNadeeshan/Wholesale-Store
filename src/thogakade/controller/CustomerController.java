<<<<<<< HEAD
/*
=======
 /*
>>>>>>> 59002b6 (first commit)
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thogakade.controller;
<<<<<<< HEAD

import java.sql.*;
import thogakade.db.DBConnection;
import thogakade.model.Customer;

/**
 *
 * @author nirot
 */
public class CustomerController {
    public static boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException{
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Customer Values(?,?,?,?)");
=======
import thogakade.model.Customer;
import java.sql.*;
import thogakade.db.DBConnection;
/**
 *
 * @author Vishmitha nadeeshan
 */
public class CustomerController {
    public static boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException{
        DBConnection dbc=DBConnection.getInstance();
        Connection connection=(Connection) dbc.getConnection();
        PreparedStatement stm=connection.prepareStatement("Insert into Customer Values(?,?,?,?)");
>>>>>>> 59002b6 (first commit)
        stm.setObject(1, customer.getId());
        stm.setObject(2, customer.getName());
        stm.setObject(3, customer.getAddress());
        stm.setObject(4, customer.getSalary());
        int res=stm.executeUpdate();
        return res>0;
<<<<<<< HEAD
    }
=======
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
>>>>>>> 59002b6 (first commit)
}
