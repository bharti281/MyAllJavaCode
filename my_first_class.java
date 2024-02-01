package com.company;
// my first class
class employee{
    int id ;
    String name ;
    int salary;

    public void getId() {
        System.out.println("your id is "+id);
        System.out.println("and your name is "+name);
    }
    public int  getSalary()
    {
        //System.out.println("your salary is "+salary);
        return  salary;
    }

}
public class my_first_class {
    public static void main(String[] args) {

        employee bharti = new employee();
        bharti.id=1;
        bharti.name="Bharti";
        bharti.salary=50000;

        bharti.getId();

       int salary =  bharti.getSalary();
        System.out.println(salary);

    }
}
