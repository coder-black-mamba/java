public class D_type {
    - Java Data Types
    
    # Data Types in Java
    
    Data types specify the different sizes and values that can be stored 
    in the variable. There are two types of data types in Java:
    
    1. **Primitive data types:** The primitive data types include boolean, char, byte, short, int, long, float and double.
    2. **Non-primitive data types:** The non-primitive data types include [Classes](https://www.javatpoint.com/object-and-class-in-java), [Interfaces](https://www.javatpoint.com/interface-in-java), and [Arrays](https://www.javatpoint.com/array-in-java).
    
    - boolean data type
    - byte data type
    - char data type
    - short data type
    - int data type
    - long data type
    - float data type
    - double data type
    
    !https://static.javatpoint.com/images/java-data-types.png
    
    | Data Type | Default Value | Default size |
    | --- | --- | --- |
    | boolean | false | 1 bit |
    | char | '\u0000' | 2 byte |
    | byte | 0 | 1 byte |
    | short | 0 | 2 byte |
    | int | 0 | 4 byte |
    | long | 0L | 8 byte |
    | float | 0.0f | 4 byte |
    | double | 0.0d | 8 byte |
    
    ## Boolean Data Type
    
    The Boolean data type is used to store only two possible values: true and false.
    
    ```java
    Boolean one =false
    ```
    
    ## Byte Data Type
    
    The byte data type is an example of primitive data type. It is an 8-bit signed two's complement integer. Its value-range lies between -128 to 127 (inclusive). Its minimum value is -128 and maximum value is 127. Its default value is 0.
    
    ```java
    byte a = 10 , byte b = -20
    ```
    
    ## Short Data Type
    
    The short data type is a 16-bit signed two's complement integer. Its 
    value-range lies between -32,768 to 32,767 (inclusive). Its minimum 
    value is -32,768 and maximum value is 32,767. Its default value is 0.
    
    The short data type can also be used to save memory just like byte 
    data type. A short data type is 2 times smaller than an integer.
    
    ```java
    short s = 10000 , short = -50000
    ```
    
    ## Int Data Type
    
    The int data type is a 32-bit signed two's complement integer. Its 
    value-range lies between - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 
    -1) (inclusive). Its minimum value is - 2,147,483,648and maximum value 
    is 2,147,483,647. Its default value is 0.
    
    ```java
    int a = 10000000 , int b = -200000
    ```
    
    ## Long Data Type
    
    The long data type is a 64-bit two's complement integer. Its 
    value-range lies between -9,223,372,036,854,775,808(-2^63) to 
    9,223,372,036,854,775,807(2^63 -1)(inclusive). Its minimum value is - 
    9,223,372,036,854,775,808and maximum value is 9,223,372,036,854,775,807.
     Its default value is 0. The long data type is used when you need a 
    range of values more than those provided by int.
    
    ```java
    long a = 10000L , long b = -200000
    ```
    
    ## Float Data Type
    
    The float data type is a single-precision 32-bit IEEE 754 floating 
    point.Its value range is unlimited. It is recommended to use a float 
    (instead of double) if you need to save memory in large arrays of 
    floating point numbers. The float data type should never be used for 
    precise values, such as currency. Its default value is 0.0F.
    
    ```java
    float f1 = 234.5f
    ```
    
    ## Double Data Type
    
    The double data type is a double-precision 64-bit IEEE 754 floating 
    point. Its value range is unlimited. The double data type is generally 
    used for decimal values just like float. The double data type also 
    should never be used for precise values, such as currency. Its default 
    value is 0.0d.
    
    ```java
    double d1 =13.3
    ```
    
    # **Char Data Type**
    
    The char data type is a single 16-bit Unicode character. Its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive).The char data type is used to store characters.
    
    ```java
    char letterA='A
    ```
    
    ### Why char uses 2 byte in java and what is \u0000 ?
    
    It is because java uses Unicode system not ASCII code system. The 
    \u0000 is the lowest range of Unicode system. To get detail explanation 
    about Unicode visit next page.
    
- Text Representation System
    
    # Unicode System
    
    Unicode is a universal international standard character 
    encoding that is capable of representing most of the world's written 
    languages.
    
    ---
    
    ### Why java uses Unicode System?
    
    Before Unicode, there were many language standards:
    
    ---
    
    - ASCII (American Standard Code for Information Interchange) for the United States.
    - ISO 8859-1 for Western European Language.
    - KOI-8 for Russian.
    - GB18030 and BIG-5 for chinese, and so on.
    
    ---
    
    ## Problem
    
    **This caused two problems:**
    
    1. A particular code value corresponds to different letters in the various language standards.
    2. The encodings for languages with large character sets have variable
    length.Some common characters are encoded as single bytes, other require two or more byte.
    
    ---
    
    ## Solution
    
    To solve these problems, a new language standard was developed i.e. Unicode System.
    
    ---
    
    In unicode, character holds 2 byte, so java also uses 2 byte for characters.
    
    ---
    
    **lowest value:**
    
    \u0000
    
    ---
    
    **highest value:**
    
    \uFFFF
    
    ---
    
- Java Operatrors
    
    # Operators in Java
    
    **Operator** in [Java](https://www.javatpoint.com/java-tutorial) is a symbol that is used to perform operations. For example: +, -, *, / etc.
    
    There are many types of operators in Java which are given below:
    
    - Unary Operator,
    - Arithmetic Operator,
    - Shift Operator,
    - Relational Operator,
    - Bitwise Operator,
    - Logical Operator,
    - Ternary Operator and
    - Assignment Operator.
    
    ## Java Operator Precedence
    
    | Operator Type | Category | Precedence |
    | --- | --- | --- |
    | Unary | postfix | expr++ expr-- |
    |  | prefix | ++expr --expr +expr -expr ~ ! |
    | Arithmetic | multiplicative | * / % |
    |  | additive | + - |
    | Shift | shift | << >> >>> |
    | Relational | comparison | < > <= >= instanceof |
    |  | equality | == != |
    | Bitwise | bitwise AND | & |
    |  | bitwise exclusive OR | ^ |
    |  | bitwise inclusive OR | | |
    | Logical | logical AND | && |
    |  | logical OR | || |
    | Ternary | ternary | ? : |
    | Assignment | assignment | = += -= *= /= %= &= ^= |= <<= >>= >>>= |
    
    ### Java Unary Operator
    
    The Java unary operators require only one operand. Unary operators are used to perform various operations i.e.:
    
    - incrementing/decrementing a value by one
    - negating an expression
    - inverting the value of a boolean
    
    ### Java Unary Operator Example: ++ and --
    
    1. public class OperatorExample{
    2. public static void main(String args[]){
    3. int x=10;
    4. System.out.println(x++);//10 (11)
    5. System.out.println(++x);//12
    6. System.out.println(x--);//12 (11)
    7. System.out.println(--x);//10
    8. }}
    
    **Output:**
    
    `10
    12
    12
    10`
    
    ### Java Unary Operator Example 2: ++ and --
    
    1. public class OperatorExample{
    2. public static void main(String args[]){
    3. int a=10;
    4. int b=10;
    5. System.out.println(a++ + ++a);//10+12=22
    6. System.out.println(b++ + b++);//10+11=21
    7. 
    8. }}
    
    **Output:**
    
    `22
    21`
    
    ### Java Unary Operator Example: ~ and !
    
    1. public class OperatorExample{
    2. public static void main(String args[]){
    3. int a=10;
    4. int b=-10;
    5. boolean c=true;
    6. boolean d=false;
    7. System.out.println(~a);//-11 (minus of total positive value which starts from 0)
    8. System.out.println(~b);//9 (positive of total minus, positive starts from 0)
    9. System.out.println(!c);//false (opposite of boolean value)
    10. System.out.println(!d);//true
    11. }}
    
    **Output:**
    
    - `11
    9
    false
    true`
    
    ### Java Arithmetic Operators
    
    Java arithmetic operators are used to perform addition, subtraction, 
    multiplication, and division. They act as basic mathematical operations.
    
    ### Java Arithmetic Operator Example
    
    1. public class OperatorExample{
    2. public static void main(String args[]){
    3. int a=10;
    4. int b=5;
    5. System.out.println(a+b);//15
    6. System.out.println(a-b);//5
    7. System.out.println(a*b);//50
    8. System.out.println(a/b);//2
    9. System.out.println(a%b);//0
    10. }}
    
    **Output:**
    
    `15
    5
    50
    2
    0`
    
    ### Java Arithmetic Operator Example: Expression
    
    1. public class OperatorExample{
    2. public static void main(String args[]){
    3. System.out.println(10*10/5+3-1*4/2);
    4. }}
    
    **Output:**
    
    `21`
    
    ### Java Left Shift Operator
    
    The Java left shift operator << is used to shift all of the 
    bits in a value to the left side of a specified number of times.
    
    ### Java Left Shift Operator Example
    
    1. public class OperatorExample{
    2. public static void main(String args[]){
    3. System.out.println(10<<2);//10*2^2=10*4=40
    4. System.out.println(10<<3);//10*2^3=10*8=80
    5. System.out.println(20<<2);//20*2^2=20*4=80
    6. System.out.println(15<<4);//15*2^4=15*16=240
    7. }}
    
    **Output:**
    
    `40
    80
    80
    240`
    
    ### Java Right Shift Operator
    
    The Java right shift operator >> is used to move the value of 
    the left operand to right by the number of bits specified by the right 
    operand.
    
    ### Java Right Shift Operator Example
    
    1. public OperatorExample{
    2. public static void main(String args[]){
    3. System.out.println(10>>2);//10/2^2=10/4=2
    4. System.out.println(20>>2);//20/2^2=20/4=5
    5. System.out.println(20>>3);//20/2^3=20/8=2
    6. }}
    
    **Output:**
    
    `2
    5
    2`
    
    ### Java Shift Operator Example: >> vs >>>
    
    1. public class OperatorExample{
    2. public static void main(String args[]){
    3. //For positive number, >> and >>> works same
    4. System.out.println(20>>2);
    5. System.out.println(20>>>2);
    6. //For negative number, >>> changes parity bit (MSB) to 0
    7. System.out.println(-20>>2);
    8. System.out.println(-20>>>2);
    9. }}
    
    **Output:**
    
    `5
    5
    -5
    1073741819`
    
    ### Java AND Operator Example: Logical && and Bitwise &
    
    The logical && operator doesn't check the second condition if
     the first condition is false. It checks the second condition only if 
    the first one is true.
    
    The bitwise & operator always checks both conditions whether first condition is true or false.
    
    1. public class OperatorExample{
    2. public static void main(String args[]){
    3. int a=10;
    4. int b=5;
    5. int c=20;
    6. System.out.println(a<b&&a<c);//false && true = false
    7. System.out.println(a<b&a<c);//false & true = false
    8. }}
    
    **Output:**
    
    `false
    false`
    
    ### Java AND Operator Example: Logical && vs Bitwise &
    
    1. public class OperatorExample{
    2. public static void main(String args[]){
    3. int a=10;
    4. int b=5;
    5. int c=20;
    6. System.out.println(a<b&&a++<c);//false && true = false
    7. System.out.println(a);//10 because second condition is not checked
    8. System.out.println(a<b&a++<c);//false && true = false
    9. System.out.println(a);//11 because second condition is checked
    10. }}
    
    **Output:**
    
    `false
    10
    false
    11`
    
    ### Java OR Operator Example: Logical || and Bitwise |
    
    The logical || operator doesn't check the second condition if the 
    first condition is true. It checks the second condition only if the 
    first one is false.
    
    The bitwise | operator always checks both conditions whether first condition is true or false.
    
    1. public class OperatorExample{
    2. public static void main(String args[]){
    3. int a=10;
    4. int b=5;
    5. int c=20;
    6. System.out.println(a>b||a<c);//true || true = true
    7. System.out.println(a>b|a<c);//true | true = true
    8. //|| vs |
    9. System.out.println(a>b||a++<c);//true || true = true
    10. System.out.println(a);//10 because second condition is not checked
    11. System.out.println(a>b|a++<c);//true | true = true
    12. System.out.println(a);//11 because second condition is checked
    13. }}
    
    **Output:**
    
    `true
    true
    true
    10
    true
    11`
    
    ### Java Ternary Operator
    
    ADVERTISEMENT
    
    ADVERTISEMENT
    
    Java Ternary operator is used as one line replacement for
     if-then-else statement and used a lot in Java programming. It is the 
    only conditional operator which takes three operands.
    
    ### Java Ternary Operator Example
    
    1. public class OperatorExample{
    2. public static void main(String args[]){
    3. int a=2;
    4. int b=5;
    5. int min=(a<b)?a:b;
    6. System.out.println(min);
    7. }}
    
    **Output:**
    
    `2`
    
    Another Example:
    
    1. public class OperatorExample{
    2. public static void main(String args[]){
    3. int a=10;
    4. int b=5;
    5. int min=(a<b)?a:b;
    6. System.out.println(min);
    7. }}
    
    **Output:**
    
    `5`
    
    ### Java Assignment Operator
    
    Java assignment operator is one of the most common operators. It is 
    used to assign the value on its right to the operand on its left.
    
    ### Java Assignment Operator Example
    
    1. public class OperatorExample{
    2. public static void main(String args[]){
    3. int a=10;
    4. int b=20;
    5. a+=4;//a=a+4 (a=10+4)
    6. b-=4;//b=b-4 (b=20-4)
    7. System.out.println(a);
    8. System.out.println(b);
    9. }}
    
    **Output:**
    
    `14
    16`
    
    ### Java Assignment Operator Example
    
    1. public class OperatorExample{
    2. public static void main(String[] args){
    3. int a=10;
    4. a+=3;//10+3
    5. System.out.println(a);
    6. a-=4;//13-4
    7. System.out.println(a);
    8. a*=2;//9*2
    9. System.out.println(a);
    10. a/=2;//18/2
    11. System.out.println(a);
    12. }}
    
    **Output:**
    
    `13
    9
    18
    9`
    
    ### Java Assignment Operator Example: Adding short
    
    1. public class OperatorExample{
    2. public static void main(String args[]){
    3. short a=10;
    4. short b=10;
    5. //a+=b;//a=a+b internally so fine
    6. a=a+b;//Compile time error because 10+10=20 now int
    7. System.out.println(a);
    8. }}
    
    **Output:**
    
    `Compile time error`
    
    After type cast:
    
    1. public class OperatorExample{
    2. public static void main(String args[]){
    3. short a=10;
    4. short b=10;
    5. a=(short)(a+b);//20 which is int now converted to short
    6. System.out.println(a);
    7. }}
    
    **Output:**
    
    `20`
    
- Java Keywords
    
    Java keywords are also known as reserved words. Keywords are 
    particular words that act as a key to a code. These are predefined words
     by Java so they cannot be used as a variable or object name or class 
    name.
    
    ## List of Java Keywords
    
    A list of Java keywords or reserved words are given below:
    
    1. **[abstract](https://www.javatpoint.com/abstract-keyword-in-java):** Java abstract keyword is used to declare an abstract class. An abstract class can provide the implementation of the interface. It can have
    abstract and non-abstract methods.
    2. **[boolean:](https://www.javatpoint.com/boolean-keyword-in-java)** Java boolean keyword is used to declare a variable as a boolean type. It can hold True and False values only.
    3. **[break](https://www.javatpoint.com/java-break):** Java break keyword is used to break the loop or switch statement. It
    breaks the current flow of the program at specified conditions.
    4. **[byte](https://www.javatpoint.com/byte-keyword-in-java):** Java byte keyword is used to declare a variable that can hold 8-bit data values.
    5. **[case](https://www.javatpoint.com/case-keyword-in-java):** Java case keyword is used with the switch statements to mark blocks of text.
    6. **[catch](https://www.javatpoint.com/try-catch-block):** Java catch keyword is used to catch the exceptions generated by try statements. It must be used after the try block only.
    7. **[char](https://www.javatpoint.com/char-keyword-in-java):** Java char keyword is used to declare a variable that can hold unsigned 16-bit Unicode characters
    8. **[class](https://www.javatpoint.com/class-keyword-in-java):** Java class keyword is used to declare a class.
    9. **[continue](https://www.javatpoint.com/java-continue):** Java continue keyword is used to continue the loop. It continues the
    current flow of the program and skips the remaining code at the
    specified condition.
    10. **[default](https://www.javatpoint.com/default-keyword-in-java):** Java default keyword is used to specify the default block of code in a switch statement.
    11. **[do](https://www.javatpoint.com/java-do-while-loop):** Java do keyword is used in the control statement to declare a loop. It can iterate a part of the program several times.
    12. **[double](https://www.javatpoint.com/double-keyword-in-java):** Java double keyword is used to declare a variable that can hold 64-bit floating-point number.
    13. **[else](https://www.javatpoint.com/java-if-else):** Java else keyword is used to indicate the alternative branches in an if statement.
    14. **[enum](https://www.javatpoint.com/enum-in-java):** Java enum keyword is used to define a fixed set of constants. Enum constructors are always private or default.
    15. **[extends](https://www.javatpoint.com/inheritance-in-java):** Java extends keyword is used to indicate that a class is derived from another class or interface.
    16. **[final](https://www.javatpoint.com/final-keyword):** Java final keyword is used to indicate that a variable holds a constant value. It is used with a variable. It is used to restrict the user from updating the value of the variable.
    17. **[finally](https://www.javatpoint.com/finally-block-in-exception-handling):** Java finally keyword indicates a block of code in a try-catch
    structure. This block is always executed whether an exception is handled or not.
    18. **[float](https://www.javatpoint.com/float-keyword-in-java):** Java float keyword is used to declare a variable that can hold a 32-bit floating-point number.
    19. **[for](https://www.javatpoint.com/java-for-loop):** Java for keyword is used to start a for loop. It is used to execute a
    set of instructions/functions repeatedly when some condition becomes
    true. If the number of iteration is fixed, it is recommended to use for
    loop.
    20. **[if](https://www.javatpoint.com/java-if-else):** Java if keyword tests the condition. It executes the if block if the condition is true.
    21. **[implements](https://www.javatpoint.com/interface-in-java):** Java implements keyword is used to implement an interface.
    22. **[import](https://www.javatpoint.com/package):** Java import keyword makes classes and interfaces available and accessible to the current source code.
    23. **[instanceof](https://www.javatpoint.com/downcasting-with-instanceof-operator):** Java instanceof keyword is used to test whether the object is an instance of the specified class or implements an interface.
    24. **[int](https://www.javatpoint.com/int-keyword-in-java):** Java int keyword is used to declare a variable that can hold a 32-bit signed integer.
    25. **[interface](https://www.javatpoint.com/interface-in-java):** Java interface keyword is used to declare an interface. It can have only abstract methods.
    26. **[long](https://www.javatpoint.com/long-keyword-in-java):** Java long keyword is used to declare a variable that can hold a 64-bit integer.
    27. **native:** Java native keyword is used to specify that a method is implemented in native code using JNI (Java Native Interface).
    28. **[new](https://www.javatpoint.com/new-keyword-in-java):** Java new keyword is used to create new objects.
    29. **[null](https://www.javatpoint.com/null-keyword-in-java):** Java null keyword is used to indicate that a reference does not refer to anything. It removes the garbage value.
    30. **[package](https://www.javatpoint.com/package):** Java package keyword is used to declare a Java package that includes the classes.
    31. **[private](https://www.javatpoint.com/private-keyword-in-java):** Java private keyword is an access modifier. It is used to indicate that a method or variable may be accessed only in the class in which it is
    declared.
    32. **[protected](https://www.javatpoint.com/protected-keyword-in-java):** Java protected keyword is an access modifier. It can be accessible
    within the package and outside the package but through inheritance only. It can't be applied with the class.
    33. **[public](https://www.javatpoint.com/public-keyword-in-java):** Java public keyword is an access modifier. It is used to indicate that
    an item is accessible anywhere. It has the widest scope among all other
    modifiers.
    34. **[return](https://www.javatpoint.com/return-keyword-in-java):** Java return keyword is used to return from a method when its execution is complete.
    35. **[short](https://www.javatpoint.com/short-keyword-in-java):** Java short keyword is used to declare a variable that can hold a 16-bit integer.
    36. **[static](https://www.javatpoint.com/static-keyword-in-java):** Java static keyword is used to indicate that a variable or method is a
    class method. The static keyword in Java is mainly used for memory
    management.
    37. **[strictfp](https://www.javatpoint.com/strictfp-keyword):** Java strictfp is used to restrict the floating-point calculations to ensure portability.
    38. **[super](https://www.javatpoint.com/super-keyword):** Java super keyword is a reference variable that is used to refer to
    parent class objects. It can be used to invoke the immediate parent
    class method.
    39. **[switch](https://www.javatpoint.com/java-switch):** The Java switch keyword contains a switch statement that executes code
    based on test value. The switch statement tests the equality of a
    variable against multiple values.
    40. **[synchronized](https://www.javatpoint.com/synchronization-in-java):** Java synchronized keyword is used to specify the critical sections or methods in multithreaded code.
    41. **[this](https://www.javatpoint.com/this-keyword):** Java this keyword can be used to refer the current object in a method or constructor.
    42. **[throw](https://www.javatpoint.com/throw-keyword):** The Java throw keyword is used to explicitly throw an exception. The
    throw keyword is mainly used to throw custom exceptions. It is followed
    by an instance.
    43. **[throws](https://www.javatpoint.com/throws-keyword-and-difference-between-throw-and-throws):** The Java throws keyword is used to declare an exception. Checked exceptions can be propagated with throws.
    44. **[transient](https://www.javatpoint.com/transient-keyword):** Java transient keyword is used in serialization. If you define any data member as transient, it will not be serialized.
    45. **[try](https://www.javatpoint.com/try-catch-block):** Java try keyword is used to start a block of code that will be tested
    for exceptions. The try block must be followed by either catch or
    finally block.
    46. **void:** Java void keyword is used to specify that a method does not have a return value.
    47. **[volatile](https://www.javatpoint.com/volatile-keyword-in-java):** Java volatile keyword is used to indicate that a variable may change asynchronously.
    48. **[while](https://www.javatpoint.com/java-while-loop):** Java while keyword is used to start a while loop. This loop iterates a
    part of the program several times. If the number of iteration is not
    fixed, it is recommended to use the while loop.
- **Java Control Statements | Control Flow in Java**
    
    Java compiler executes the code from top to bottom. The statements in 
    the code are executed according to the order in which they appear. 
    However, [Java](https://www.javatpoint.com/java-tutorial) provides statements that can be used to control the flow of Java Code. Such statements are called control flow statements. It is one of the 
    fundamental features of Java, which provides a smooth flow of program.
    
    1. Decision Making statements
        - if statements
        - switch statement
    2. Loop statements
        - do while loop
        - while loop
        - for loop
        - for-each loop
    3. Jump statements
        - break statement
        - continue statement
    
    **If Else Statement** 
    
    1. Simple if statement
    
    ```java
    int a = 5; 
    int b = 10;
    if(condition){
    	exevutes 
    }
    ```
    
    1. if-else statement
    2. if-else-if ladder
    3. Nested if-statement
}
