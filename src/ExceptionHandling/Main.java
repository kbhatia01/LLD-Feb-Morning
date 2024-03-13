package ExceptionHandling;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        DivNumber d = new DivNumber();
        int z = d.abc();
        System.out.println(z);
        try{
            d.doSomething(1,0); // notify user
            d.findStudentByRollNo(1);  // actual transfer
        } catch (NumberNotAllowed e){
           System.out.println("Got Exception" + Arrays.toString(e.getStackTrace()));
        } catch (ClassNotFoundException e){
            System.out.println("Got class NF Exception" + Arrays.toString(e.getStackTrace()));
        }

        try{
            d.doSomething(1,0); // notify user
            d.findStudentByRollNo(1);  // actual transfer
        } catch (ClassNotFoundException e){
            System.out.println("Got class NF Exception" + Arrays.toString(e.getStackTrace()));
        } catch (Exception e){
            System.out.println("Got Exception as E" + Arrays.toString(e.getStackTrace()));
        }


//        Exception-> A -> B-> C-> D
//        HANDLING : D-> C -> B -> A -> Exception



        try{
            System.out.println("in try 1");
            d.doSomething(1,0); // notify user

        } catch (Exception e){
            System.out.println("Got Exception as E" + Arrays.toString(e.getStackTrace()));
        }

        try{
            System.out.println("in try 2");

            d.findStudentByRollNo(-1);  // actual transfer

        } catch (Exception e){
            System.out.println("Got Exception as E" + Arrays.toString(e.getStackTrace()));
        }


        try{
            d.doSomething(1,1); // notify user
            d.findStudentByRollNo(-1);  // actual transfer
//            System.out.println("DB Close?"); // ?? -> NO, if exception occur won't execute..

        } catch (ClassNotFoundException e){
            System.out.println("Got class NF Exception" + Arrays.toString(e.getStackTrace()));
//            throw e;
//            System.out.println("DB Close?");
        } catch (Exception e){
            System.out.println("Got Exception as E" + Arrays.toString(e.getStackTrace()));
            //            System.out.println("DB Close?");

        } finally {
            System.out.println("DB Close? in finally");
        }


//        try{
//            d.doSomething(1,1); // notify user
//            d.findStudentByRollNo(-1);  // actual transfer
////            System.out.println("DB Close?"); // ?? -> NO, if exception occur won't execute..
//
//        } finally {
//            System.out.println("DB Close? in finally 2");
//        }

        d.area(10);

        System.out.println("DB Close?");

    }
}
