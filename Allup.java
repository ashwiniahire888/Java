import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.List;
public class Allup{
                    public static void main(String args[]){
                        ArrayList<String>a1 = new ArrayList<String>();
                        a1.add("ashu");
                        a1.add("sunny");
                        a1.add("vaishu");
                        a1.add("prati");
                        a1.add("hello");
                        System.out.print(a1);
                        List<String>newList = a1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
                        System.out.println(newList);

                    }
 }