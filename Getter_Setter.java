package com.company;
class MyEmployee{
    private int id;
    private String name;

    public void setId(int i)
    {

        id = i;
    }
    public int getId()
    {

        return id;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getName()

    {

        return name;
    }

}
public class Getter_Setter {
    public static void main(String[] args) {
        MyEmployee bharti= new MyEmployee();
        bharti.setId(101);
        bharti.setName("Bharti");
        System.out.println(bharti.getId());
        System.out.println(bharti.getName());
    }
}
