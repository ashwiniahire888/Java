public class Overlod{
    Overlod(int x){
        System.out.println(x);
    }
    Overlod(char y){
        System.out.println(y);
    }
    Overlod(String z){
        System.out.println(z);
    }
    public static  void main(String args[])
    {
        Overlod o1 = new Overlod(2);
        Overlod o2 = new Overlod('x');
        Overlod o3 = new Overlod("ashwini");  
    }
}