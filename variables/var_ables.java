public @interface var_ables {
//     ### Types of Variables

// There are three types of variables in [Java](https://www.javatpoint.com/java-tutorial):

// - local variable
// - instance variable
// - static variable

// !https://static.javatpoint.com/core/images/types-of-variables1.png

// ### 1) Local Variable

// A variable declared inside the body of the method is called local 
// variable. You can use this variable only within that method and the 
// other methods in the class aren't even aware that the variable exists.

// A local variable cannot be defined with "static" keyword.

// ### 2) Instance Variable

// A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as [static](https://www.javatpoint.com/static-keyword-in-java).

// It is called an instance variable because its value is instance-specific and is not shared among instances.

// ### 3) Static variable

// A variable that is declared as static is called a static variable. It
//  cannot be local. You can create a single copy of the static variable 
// and share it among all the instances of the class. Memory allocation for
//  static variables happens only once when the class is loaded in the 
// memory.

// ```java
public class A{

    static int m =10 ; //Static Variable
    void method()
    {
        int n = 900;//Local Variable
    }

    public static void main(String args[])
    {
        int data = 50;//instance variable
    }
}
// ```

// ```java
public class Simple {

  public static void main(String[] args) {
    int a = 10;
    int b = 10;
    int c = a + b;
    System.out.println(c);
  }
}
// ```

// **Java Variable Example: Narrowing (Typecasting)**

// ```java
// public class Simple{  
//     public static void main(String[] args){  
//     float f=10.5f;  
//     //int a=f;//Compile time error  
//     int a=(int)f;  
//     System.out.println(f);  
//     System.out.println(a);  
//     }}

// // ```
}
