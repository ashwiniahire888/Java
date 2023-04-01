public class Overlodding{
    Overlodding(){

    }
    Overlodding(int x)
    {
        System.out.println(x);
    }
    Overlodding(int x,int y)
    {
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String args[]){
        Overlodding o1 = new Overlodding();
        Overlodding o2 = new Overlodding(2);
        Overlodding o3 = new Overlodding(3,4);

    }

}