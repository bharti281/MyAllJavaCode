package com.company;

import java.io.File;

public class IO_operation {
    public static void main(String[] args)  {
//            File my_Files = new File("Io_operation.txt");
//            try {
//
//                my_Files.createNewFile();
//            }
//            catch(IOException e)
//            {
//                System.out.println("File not created ");
//                e.printStackTrace();
//            }
//         try {
//             FileWriter writeln = new FileWriter("Io_operation.txt");
//             writeln.write("Hello my name is bharti kumari \n i study in mmphu ");
//            writeln.close();
//         }
//         catch (IOException e)
//         {
//             System.out.println("Can't write ");
//             e.printStackTrace();
//         }
//        File my_file = new File("Io_operation.txt");
//        try {
//            Scanner sc = new Scanner(my_file);
//            while (sc.hasNextLine())
//            {
//                System.out.println(sc.nextLine());
//            }
//      sc.close();
//        }catch (FileNotFoundException e)
//        {
//            System.out.println(e);
//            e.printStackTrace();
//        }
        File my_Files = new File("Io_operation.txt");
        {
            if(my_Files.delete())
            {
                System.out.println("I have delete "+my_Files.getName());
            }
            else {
                System.out.println("Some problem occurred while deleting the file ");
            }
        }



    }
}


