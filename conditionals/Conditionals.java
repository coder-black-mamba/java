// for using the folder conditionals as i am compiling it from root
package conditionals;

public class Conditionals {
    public static void main(String args[]) {
        // ================================= simple if statement =================================
        // Let's take an example of an adult site where 18 or greater aged people access
        // whole less than less than eightteen but grater than fiften can access a few
        // content
        int age = 10;
        // age =18;
        String gender = "male";
        gender = "female";
        // age =19;
        if (age >= 18) {
            System.out.println("You Can Access This Website");
        }
        // ================================= if with else =================================
        if (age >= 18) {
            System.out.println("You Can Access The Website");
        } else {
            System.out.println("Hey You Are To Small Too Access This Website");
        }
        // if with else if
        if (age >=18){
            System.out.println("Hey You Can Access This Website");
        }else if (age>=15){
            System.out.println("Hey You Can Access A Few Content Of This Website");
        }else{
            System.out.println("Hey You Are To Small Too Access This Website");
        }

        // ================================= if ,else if ,else =================================
        // lets say we want to check if this person male or female if the person is greater 18 or male then we want to give them access
        // and as 15 aged group is accepting male and female both
        if(age>=18 && gender == "male" ){
            System.out.println("Male and over 18");
        }else if(age>=15 && (gender=="male" || gender=="female")){
            System.out.println("Female Male and over 15");
        }else{
            System.out.println("Nothing");
        }

    }
}