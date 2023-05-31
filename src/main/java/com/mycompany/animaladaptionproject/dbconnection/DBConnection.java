/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animaladaptionproject.dbconnection;
import com.mycompany.animaladaptionproject.Pet;
import com.mycompany.animaladaptionproject.components.LoginPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Tanmay
 */
public class DBConnection 
{
   private Connection con;
   public DBConnection()
    {
        try
        {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           System.out.println("Driver Loaded");

           con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","shadow");
           System.out.println("connection to database created");
        }
        catch(ClassNotFoundException e)
        {
           System.out.println("Driver not loaded");
           e.printStackTrace();
        }
        catch(SQLException e)
        {
           System.out.println("Connection not established");
           e.printStackTrace();
        }
    }
   public Connection getDBConnection()
   {
       return con;
   }
   public boolean validateUser(String username,String password)
   {
       try 
            {
                PreparedStatement selectStmt = con.prepareStatement("select * from animal_adaption_user where username=? and password=?");
                selectStmt.setString(1,username);
                selectStmt.setString(2,password);
                ResultSet result = selectStmt.executeQuery();
                while(result.next())
                {
                    return true;
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
   }
   public int getNewPetId()
   {
       try
       {
           Statement getPetIdStatement = con.createStatement();
           ResultSet result = getPetIdStatement.executeQuery("select count(*) as total from pet");
           result.next();
           int totalPets = result.getInt("total");
           return totalPets+1;
       }
       catch(SQLException ex)
       {
           ex.printStackTrace();
           return -1;
       }
   }

    public boolean addNewPet(int id, String name, String dob, String gender, String pClass, String breed, String color, String ownerMobile) 
    {
        try
        {
            PreparedStatement addNewPetStmt = con.prepareStatement("insert into pet values(?,?,?,?,?,?,?,?,?)");
            addNewPetStmt.setInt(1, id);
            addNewPetStmt.setString(2,name);
            addNewPetStmt.setString(3, dob);
            addNewPetStmt.setString(4,gender);
            addNewPetStmt.setString(5,pClass);
            addNewPetStmt.setString(6,breed);
            addNewPetStmt.setString(7,color);
            addNewPetStmt.setString(8,ownerMobile);
            addNewPetStmt.setString(9,"not adopted");
            int status = addNewPetStmt.executeUpdate();
            if(status==1)
                return true;
            return false;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return false;
        }
        
    }
    
    private boolean verifyPetId(int id)
    {
        try
        {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select id from pet where id="+id);
            if(rs.next())
                return true;
            return false;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addMedicalInfo(int id, String medicalInfo, String medicalDate) 
    {
        if(verifyPetId(id))
        {
            try
            {
                PreparedStatement addMedicalInfoStmt = con.prepareStatement("insert into animal_medical_info values(?,?,?)");
                addMedicalInfoStmt.setInt(1, id);
                addMedicalInfoStmt.setString(2,medicalInfo);
                addMedicalInfoStmt.setString(3, medicalDate);

                int status = addMedicalInfoStmt.executeUpdate();
                if(status==1)
                    return true;
                return false;
            }
            catch(SQLException e)
            {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }
    
    public Pet searchPet(int id)
    {
        if(verifyPetId(id))
        {
            try
            {
                Statement stmt = con.createStatement();
                ResultSet rs1 = stmt.executeQuery("select * from pet where id="+id);
                String name;
                String dob;
                String gender;
                String pClass;
                String breed;
                String color;
                String owner_phone;
                String status;
                String medicalInfo="";
                
                rs1.next();
                name=rs1.getString("name");
                dob=rs1.getString("dob");
                gender=rs1.getString("gender");
                pClass=rs1.getString("CLASSIFICATION");
                breed=rs1.getString("breed");
                color=rs1.getString("color");
                owner_phone=rs1.getString("OWNER_MOBILE");
                status=rs1.getString("STATUS");
                System.out.println(status);
                rs1.close();
                
                ResultSet rs2 = stmt.executeQuery("select * from animal_medical_info where p_id="+id);
                while(rs2.next())
                {
                    medicalInfo=medicalInfo+"\n"+rs2.getString("info")+" - "+rs2.getString("info_date");
                }
                
                return(new Pet(id,name,dob,gender,pClass,breed,color,owner_phone,status,medicalInfo));
                
            }
            catch(SQLException e)
            {
                e.printStackTrace();
                return null;
            }
        }
        else
            return null;
    }
    
    

    public void adoptPet(int pID, String oName, String oEmail, String oPhone, String oAddress)
    {
        Pet p = this.searchPet(pID);
        if(p.getStatus().equals("adopted"))
        {
            showMessageDialog(null,"Pet is already adopted");
            return;
        }
        else
        {
            try
            {
                String query = "insert into potential_adopter values("+pID+",'"+oName+"','"+oEmail+"','"+oPhone+"','"+oAddress+"')";
                Statement stmt = con.createStatement();
                int status = stmt.executeUpdate(query);
                if(status==1)
                {
                    showMessageDialog(null,"Adoption Process Completed");
                     query = "update pet set status = 'adopted',owner_mobile='"+oPhone+"' where id="+pID;
                     stmt.executeUpdate(query);    
                }
                else
                    showMessageDialog(null,"Adoption Process Failed");
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            
        }
    }

    public void getPetDeatils(String type, String breed, String color) 
    {
          
    }
}
