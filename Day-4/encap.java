class study{
    private int roll_no;
    private String name;
    private int age;
    public void setRollNo(int roll_no){
        this.roll_no=roll_no;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getroll(){
        return roll_no;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
}
class encap{
    public static void main(String args[]){
        study s1=new study();
        s1.setRollNo(101);
        s1.setName("John");
        s1.setAge(20);
        System.out.println("Roll No: "+s1.getroll());
        System.out.println("Name: "+s1.getname());
        System.out.println("Age: "+s1.getage());
    }
}