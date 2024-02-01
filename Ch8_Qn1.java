package com.company;
class Employee
{
    int salary;
    String name;

    public int getSalary()
    {
        return salary;
    }
    public void setName(String n)
    {
        name=n;
    }
    public String getName(){
        return name;
    }
}

public class Ch8_Qn1 {
    public static void main(String[] args) {
        Employee  bharti = new Employee();

        bharti.setName("Bharti");
        System.out.println(bharti.getName());

        bharti.salary=5614;
        System.out.println(bharti.getSalary());



    }
}
