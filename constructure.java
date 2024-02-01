package com.company;
class MyMainEmployee{
    private int id;
    private String name;

public MyMainEmployee(int MyId, String MyName){
    id=MyId;
    name=MyName;
}
   // public void setId(int i)
    //{
     //   id = i;
    //}
    public int getId()
    {
        return id;
    }
    //public void setName(String n)
    //{
      //  name = n;
    //}
    public String getName()

    {
        return name;
    }

}

public class constructure {
    public static void main(String[] args) {
        MyMainEmployee bharti = new MyMainEmployee(5,"Bharti");
        System.out.println(bharti.getName());
        System.out.println(bharti.getId());


    }
}
