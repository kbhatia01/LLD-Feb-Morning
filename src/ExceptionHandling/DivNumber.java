package ExceptionHandling;

public class DivNumber {

    public int doSomething(int a, int b) throws NumberNotAllowed{
        if(b==0){
            throw new NumberNotAllowed();
        }
        return a/b;
    }


    public  int abc(){
        try{
            this.findStudentByRollNo(10);
            return  10;
        } catch (Exception e){
            System.out.println("exp");
        }
        return 100;

    }
    public void findStudentByRollNo(int rollNo) throws ClassNotFoundException{
        if(rollNo<0){
           throw new ClassNotFoundException();
        }

        System.out.println("User is " + rollNo);
    }

    void area(int a){
        area(a*a);
    }
}
