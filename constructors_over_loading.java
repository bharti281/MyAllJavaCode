package com.company;
class constructors{
    private int id ;
    private  String name;
    private  int salary;
    public constructors()
    {
        id=1;
        name="Bharti";
        salary=10000;
        System.out.println("1st constructors called!");
    }
    public constructors(int i)
    {
        id=i;
        name ="Neha";
        salary=15000;
        System.out.println("2nd constructors called!");
    }
    public constructors(int d , String n)
    {
        id=d;
        name = n;
        salary=20000;
        System.out.println("3rd constructors called!");
    }
    public constructors(int id , String name , int salary)
    {
        this.id = id;
        this.name=name;
        this.salary=salary;
        System.out.println(" 4th constructors called!");
    }
    public void display(){
        System.out.println("your id is "+id);
        System.out.println("your name is "+name);
        System.out.println("your salary is "+salary);
    }

}

public class constructors_over_loading {
    public static void main(String[] args) {

       // constructors cons= new constructors();//-------->constructors with default argument
       // constructors cons= new constructors(2);//----------->constructors with argument
        //constructors cons= new constructors(2,"Bharti");
        constructors cons= new constructors(1,"Bharti",50000);

        cons.display();
    }
}
