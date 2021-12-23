/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author manhq
 */
public class Login {
    private static ArrayList<Account> loginList = new ArrayList();

    /* Loading the data from database*/   
   public static ArrayList<Account>  load() throws SQLException
   {
       Connection conn = null;
        Statement st = null;
        DBConnection jdbc = DBConnection.getInstance();
        conn = jdbc.getConnect();
        String sql = "select * from account";
        st = conn.createStatement();
        ResultSet re = st.executeQuery(sql);

        while (re.next()) {
            loginList.add(new Account(Integer.parseInt(re.getObject(1).toString()), re.getObject(2).toString(), re.getObject(3).toString()) );
        }

        return loginList;
   }
    public static boolean access(String username, String pass) throws SQLException
   {
       load();
        for(int i=0; i<loginList.size(); i++)
        {
           if(loginList.get(i).getUsername().equals(username) && loginList.get(i).getPassword().equals(pass))
                return true;
        }
        return false;
   }
    public static void main(String[] args) throws SQLException {
        System.out.println(access("admin", "123"));
    }
}
