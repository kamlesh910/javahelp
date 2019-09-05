class card{
    private int number;//1 to 12
    private String shape;   // "heart","spade","diamond","club"
    
    card(int n,String s){
        this.number=n;
        this.shape=s;
    }
    
    public int getNumber(){ return number;}
    public void setNumber(int n){ number=n;}
    public String getShape(){ return shape; }
    public void setShape(String s){ shape=s;}
    
    public void printCard(){
      System.out.println(" Number: "+getNumber()+ " Shape: "+ getShape());
    }
}


public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        card c1=new card(1,"heart");
        c1.printCard();
        c1.setNumber(2);
        c1.setShape("club");
        c1.printCard();
        
        
        card c2=new card(2,"spade");
        card c3=new card(3,"diamond");
     }
}
