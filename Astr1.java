import java.util.*;
import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class Astr1{

        public static void main(String[] args){
            ArrayList<Integer> a1 = new ArrayList<Integer>();
            a1.add(2);
            a1.add(6);
            a1.add(9);
            a1.add(4);
            a1.add(20);
            System.out.println(a1);
            List<Integer> newList = a1.stream().map(s->s+5).collect(Collectors.toList());
            System.out.println(newList);
        }
}