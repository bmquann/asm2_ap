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
public  class Employee {
    int id;
    public String  name, phone, mail, department;
    public int age, basicsalary,timework;
    public int salary=0;

    public Employee() {
    }
    public Employee(EmployeeBuilder builder){
        this.id=builder.id;
        this.name=builder.name;
        this.phone=builder.phone;
        this.mail=builder.mail;
        this.department=builder.department;
        this.age=builder.age;
        this.basicsalary=builder.basicsalary;
        this.timework=builder.timework;
        this.salary=builder.salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(int basicsalary) {
        this.basicsalary = basicsalary;
    }

    public int getTimework() {
        return timework;
    }

    public void setTimework(int timework) {
        this.timework = timework;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", mail=" + mail + ", department=" + department + ", age=" + age + ", basicsalary=" + basicsalary + ", salary=" + salary + '}';
    }
    
    
}
