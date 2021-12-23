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
public class EmployeeBuilder {

    int id;
    public String name, phone, mail, department;
    public int age, basicsalary, timework;
    public int salary = 0;

    public EmployeeBuilder buildId(int id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder buildName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder buildPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public EmployeeBuilder buildMail(String mail) {
        this.mail = mail;
        return this;
    }

    public EmployeeBuilder buildAge(int age) {
        this.age = age;
        return this;
    }

    public EmployeeBuilder buildDepartment(String department) {
        this.department = department;
        return this;
    }

    public EmployeeBuilder buildBasicSalary(int basicSalary) {
        this.basicsalary = basicSalary;
        return this;
    }

    public EmployeeBuilder buildSalary(String type) {
        if (type.equals("part")) {
            this.salary = this.basicsalary * this.timework;
        } else if (type.equals("full")) {
            this.salary = (this.basicsalary * this.timework) * 2;
            
        }
        return this;
    }

    public EmployeeBuilder buildTimework(int timeWork) {
        this.timework = timeWork;
        return this;
    }

    public Employee build() {
        return new Employee(this);
    }

}
