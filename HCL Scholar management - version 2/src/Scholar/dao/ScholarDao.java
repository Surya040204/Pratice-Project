package Scholar.dao;

import Scholar.db.DBConnection;
import Scholar.model.Scholar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScholarDao implements ScholarDaoInterface{

    public Statement stmt;
    public PreparedStatement pst;
    public PreparedStatement ps;
    public Connection con;
    public String query;
    public ResultSet rs;
    public boolean flag;
    public static int choice;

	@Override
    public boolean insertScholar(Scholar s) {
        flag=false;
        try{
            //returns a new instance of the provider's class that implements the
            //DBconnection class
            con= DBConnection.createConnection();
            //inserting class
            query="insert into Scholar_details(sname,age,Sapid,location) value(?,?,?,?)";
            //Prepare statement object provides a feature to execute parameterized
            //query. to return the object of preparestatement
            pst=con.prepareStatement(query);
            pst.setString(1,s.getName());
            pst.setString(2,s.getage());
            pst.setString(3,s.getSapId());
            pst.setString(4,s.getLocation());
            //execution of update
            //execution of DML statement UPDATE which is return int value, count of the
            //affected rows
            pst.executeUpdate();
            flag=true;

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean delete(int Id) {
        flag=false;
        try{
        	//calling the connection
            con=DBConnection.createConnection();
            query="delete from Scholar_details where id="+Id;
            //to return the object of Prepared statement
            pst=con.prepareStatement(query);
            //execution of update//execution of DML statement UPDATE which is return int
            //value, count of the affected rows
            pst.execute();
            flag=true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean update(int id, String update, int ch, Scholar s) {
    	// updation of student details
        choice=ch;
        flag=false;
        try{
            if(choice==1){
            	//Returns a new instance of the provider's class that implements the DBConnection class
                con=DBConnection.createConnection();
                query="update Scholar_details set sname=? where id=?";
                ps=con.prepareStatement(query);
                //updating student details based on roll number input
                ps.setString(1,update);
                ps.setInt(2,id);
                //execution of update//execution of DML statement UPDATE which is return int
                ps.executeUpdate();
                flag=true;
            }
            else if(choice==2){
            	//calling the connection
                con=DBConnection.createConnection();
                query="update Scholar_details set location=? where id=?";
                //to return the object of PreparedStatement
                ps=con.prepareStatement(query);
                ps.setString(1,update);
                // updating age
                ps.setInt(2,id);
                //execution of DML statement UPDATE which is return int value, count of the affected rows.
                ps.executeUpdate();
                flag=true;
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return flag;
    }

    @Override
    //getting all the students
    public void showAllScholar() {
        try{
        	// Returns a new instance of the provider's class that implements the
        	// DBConnection class.
            con=DBConnection.createConnection();
            //query is used to update the details and run the queries
            query="select * from Scholar_details";
            // to return the object of PreparedStatement.
            stmt=con.createStatement();
             // executing the result query.
            rs=stmt.executeQuery(query);
            while(rs.next()){
                System.out.println("Id: "+rs.getInt(1)+"\n" +
                        "Name: "+rs.getString(2)+"\n" +
                        "Age: "+rs.getString(3)+"\n" +
                        "SapId: "+rs.getString(4)+"\n" +
                        "Location: "+rs.getString(5));
                System.out.println("----------------------------------");

            }

        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public boolean showScholarById(int id) {
        flag=false;
        try{
        	//Returns a new instance of the provider's class that implements the DBConnection class.
            con=DBConnection.createConnection();
            // getting particular student details via id coll:
            query="select * from Scholar_details where id="+id;
            stmt=con.createStatement();
            // executing the result query
            rs=stmt.executeQuery(query);
            while(rs.next()){
                System.out.println("id: "+rs.getInt(1)+"\n" +
                        "Name: "+rs.getString(2)+"\n" +
                        "Age: "+rs.getString(3)+"\n" +
                        "SapId: "+rs.getString(4)+"\n" +
                        "Location: "+rs.getString(5));
                System.out.println("----------------------------------");
                flag=true;
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        return flag;
    }
}