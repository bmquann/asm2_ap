/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manhq
 */
public class PartTime extends Employee {
    public PartTime() {
    }

    private static ArrayList<Employee> part = new ArrayList();

    public static ArrayList<Employee> Load() throws SQLException {
        
        Connection conn = null;
        Statement st = null;
        DBConnection jdbc = DBConnection.getInstance();
        conn = jdbc.getConnect();
        String sql = "select * from parttime";
        st = conn.createStatement();
        ResultSet re = st.executeQuery(sql);
        while (re.next()) {
            
            part.add(new EmployeeBuilder().buildId(Integer.parseInt(re.getObject(1).toString())).buildName(re.getObject(2).toString()).buildPhone(re.getObject(3).toString())
                    .buildMail(re.getObject(4).toString()).buildDepartment(re.getObject(5).toString()).buildAge(Integer.parseInt(re.getObject(6).toString()))
                    .buildBasicSalary(Integer.parseInt(re.getObject(7).toString())).buildTimework(Integer.parseInt(re.getObject(8).toString()))
                    .buildSalary("part").build());
        }

        return part;

    }
    public static void Remove(List<Employee> list){
        list.removeAll(list);
    }

    public static void Add(Employee emp) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        DBConnection jdbc = DBConnection.getInstance();
        conn = jdbc.getConnect();
        String sql = "insert into parttime(name, phone, mail, department, age, basicsalary, timework, salary) values (?,?,?,?,?,?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, emp.getName());
            ps.setString(2, emp.getPhone());
            ps.setString(3, emp.getMail());
            ps.setString(4, emp.getDepartment());
            ps.setInt(5, emp.getAge());
            ps.setInt(6, emp.getBasicsalary());
            ps.setInt(7, emp.getTimework());
            ps.setInt(8, emp.getSalary());

            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PartTime.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void arrayDispose() {
        part.clear();
    }

    public static Employee searchByID(int id) {
        try {
            Load();
            for (int i = 0; i < part.size(); i++) {
                if (part.get(i).getId() == id) {
                    return part.get(i);
                }
            }

        } catch (Exception e) {
        }
        return null;
    }

    public static ArrayList<Employee> search(String search) throws SQLException {
        Load();
        ArrayList<Employee> send = new ArrayList();

        for (int i = 0; i < part.size(); i++) {
            if (String.valueOf(part.get(i).getId()).toUpperCase().contains(search.toUpperCase())) {
                send.add(part.get(i));
            } else if (part.get(i).getName().toUpperCase().contains(search.toUpperCase())) {
                send.add(part.get(i));
            } else if (String.valueOf(part.get(i).getPhone()).toUpperCase().contains(search.toUpperCase())) {
                send.add(part.get(i));
            }
        }
        arrayDispose();
        return send;

    }

    public static ArrayList<Employee> getArray() {
        return part;
    }

    public static void Update(Employee emp) throws SQLException {

        Load();;
        Connection conn = null;
        PreparedStatement ps = null;
        DBConnection jdbc = DBConnection.getInstance();
        conn = jdbc.getConnect();
        String sql = "Update parttime SET name = ?, phone = ? , mail = ?, "
                + "department = ?, age = ? , basicsalary = ? , timework = ?, salary = ? where id = " + emp.getId();
        try {
            ps = conn.prepareCall(sql);
            ps.setString(1, emp.getName());
            ps.setString(2, emp.getPhone());
            ps.setString(3, emp.getMail());
            ps.setString(4, emp.getDepartment());
            ps.setInt(5, emp.getAge());
            ps.setInt(6, emp.getBasicsalary());
            ps.setInt(7, emp.getTimework());
            ps.setInt(8, emp.getSalary());


            ps.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(PartTime.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void Delete(Employee emp) {
        Connection conn = null;
        PreparedStatement pp = null;
        DBConnection jdbc = DBConnection.getInstance();
        conn = jdbc.getConnect();
        String sql = "delete from parttime where id="+emp.getId();
        try {
            pp = conn.prepareCall(sql);
            pp.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PartTime.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) throws SQLException {
        PartTime pt = new PartTime();
        Employee e1 = new EmployeeBuilder().buildId(1).buildAge(2).build();
//        pt.Delete(e1);
//        System.out.println(pt.Load());
        Employee emp=new EmployeeBuilder().buildId(2).buildName("quan").buildPhone("1234").buildMail("123@1234").buildDepartment("giam doc").buildAge(20).buildBasicSalary(1000000).buildTimework(200).buildSalary("part").build();
//        pt.Add(emp);
        EmployeeFactory fac=new EmployeeFactory();
        Employee part=fac.createEmp("part");
        part=new EmployeeBuilder().buildName("quan").buildPhone("123").buildMail("123").buildDepartment("giam doc").buildAge(2).buildBasicSalary(2).buildTimework(2).build();
        pt.Add(part);
        System.out.println(pt.Load());
    }

}
