package PrototypeDesign;

public class IStudent extends Student{

    int psp;

    IStudent(){

    }
    IStudent(IStudent is){
        super(is);
        this.psp = is.psp;
    }


    @Override
    public IStudent copy() {
        IStudent i1 = new IStudent(this);
        return i1;
    }
}
