/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Employee;
/**
 *
 * @author manhq
 */
public class EmployeeFactory {
    public EmployeeFactory() {
    }
    public Employee createEmp(String type){
        Employee emp=null;
        if(type.equals("part")){
            emp=new PartTime();
        }
        else if(type.equals("full")){
            emp=new FullTime();
        }
        return emp;
    }
}
