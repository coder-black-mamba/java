// package stringss;

public class Str_demo {

    public static void main(String args[]) {
        System.out.println(args[0]);
        String name = "sayed";
        String name2="eva";
        // name is still in heap but full_name iu craetad newly 
        String full_name = name+name2;
        System.err.println(full_name);

        String n1="Sayed";
        String n2 = "Sayed";
        // here n1 and n2's referance are the same 
        System.err.println(n1==n2);

    }

}