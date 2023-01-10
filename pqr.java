interface abc
{
    void display();
}
class pqr implements abc
{
    public void display(){System.out.print("This is a display method");}
     public static void main(String[] args){
        pqr p=new pqr();
        p.display();
    }
}
