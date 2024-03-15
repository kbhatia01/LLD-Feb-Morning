//package Builder;
//
//public class Builder {
//
//    int id;
//    String name;
//
//    double psp;
//
//    int gradYear;
//
//    public int getGradYear() {
//        return gradYear;
//    }
//
//    public double getPsp() {
//        return psp;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public Builder setGradYear(int gradYear) {
//        this.gradYear = gradYear;
//        return this;
//    }
//
//    public Builder setId(int id) {
//        this.id = id;
//        return this;
//    }
//
//    public Builder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public Builder setPsp(double psp) {
//        this.psp = psp;
//        return this;
//    }
//
//    public Student build(){
//        if(this.psp>100){
//            throw new RuntimeException("Not allowed");
//        }
//        return new Student(this);
//    }
//}
