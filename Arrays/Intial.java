package Arrays;

/**
 * Intial
 */

public class Intial {

    public static void main(String args[]) {
        /*
         * In Java, array is an object of a dynamically generated class. Java array
         * inherits the Object class, and implements the Serializable as well as
         * Cloneable interfaces. We can store primitive values or objects in an array in
         * Java. Like C/C++, we can also create single dimentional or multidimentional
         * arrays in Java.
         * 
         * Moreover, Java provides the feature of anonymous arrays which is not
         * available in C/C++.
         * Java array
         * Advantages:
         * Code Optimization: It makes the code optimized, we can retrieve or sort the
         * data efficiently.
         * Random access: We can get any data located at an index position.
         */

        // Types of Array in java

        // There are two types of array.

        // Single Dimensional Array
        // Multidimensional Array

        /*
         * =========Format=========
         * dataType[] arr; (or)
         * dataType []arr; (or)
         * dataType arr[];
         * dattype arrayRefVar=new datatype[size];
         */
        int a[] = new int[10];
        // initialization
        a[0] = 10;
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;

        for (int i = 0; i < a.length; i++) {
            // System.out.println(a[i]);
        }

        // ====================================== ShortCut Version
        // ========================================
        int b[] = { 1, 2, 3, 4, 5 };
        for (int j = 0; j < b.length; j++) {
            // System.out.println(b[j]);
        }

        // printing array using for-each loop
        for (int k : b) {
            // System.out.println(k);
        }
        // ============================================ Anonymous Array in Java
        // ====================================
        // Nothing but than passing arr directly as a function parameter without
        // initializing array in avariable
        // ============================================ Multidimenssional Array in Java
        // ====================================
        // dataType[][] arrayRefVar; (or)
        // dataType [][]arrayRefVar; (or)
        // dataType arrayRefVar[][]; (or)
        // dataType []arrayRefVar[];
        // declearing via class
        int[][] arr_mul_class = new int[2][2];
        // 2 row and 2 column
        int[][] arr_mul_class_diff = new int[4][2];
        arr_mul_class[0][1] = 1;
        // System.out.println(arr_mul_class[0][1]);

        // declearing directly
        int arr_mul[][] = { { 1, 2 } };

        // usage example of java multidimensional arrays
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 5, 6, 7, 8 } };
        // System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // System.out.println("arr[i][j] : "+i+" "+j +" = "+arr[i][j]);
            }
        }
        // ========================== Jagged Array in
        // Java========================================
        // @TODO Pretty Confusing
        // If we are creating odd number of columns in a 2D array, it is known as a
        // jagged array. In other words, it is an array of arrays with different number
        // of columns.

        // int jagged_arr[][] = new int[3][];
        // jagged_arr[0] = new int[3];
        // jagged_arr[1] = new int[4];
        // jagged_arr[2] = new int[2];
        // System.out.println(jagged_arr[0]);

        // In Java, an array is an object. For array object, a proxy class is created
        // whose name can be obtained by getClass().getName() method on the object.

        int arr_class[] = { 4, 4, 5 };
        // getting the class name of Java array
        Class c = arr_class.getClass();
        String name = c.getName();
        // printing the class name of Java array
        // System.out.println(name);
        // ==========================================Example of Copying an Array in
        // Java===============================
        char copy_form[] = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };

        char copy_to[] = new char[7];
        System.arraycopy(copy_form, 2, copy_to, 0, 7);
        // System.out.println(String.valueOf(copy_to));
        // ==========================================Cloning an Array in
        // Java===============================
        // it creates the shallow copy of the Java array which means it copies the
        // references.
        int arrr_cp[] = { 33, 3, 4, 5 };
        // String jv="Java";
        // String js="JavaScript";
        // System.out.println(js.compareTo(jv));

        int copy_arr[] = arrr_cp.clone();
        copy_arr[0] = 69;
        for (int i : copy_arr) {
            // System.out.println(i);
        }
        System.out.println("Printing Original Array");
        for (int i : arrr_cp) {
            // System.out.println(i);
        }

        // Addition of matrices in java
        // creating two matrices
        int mat_a[][] = { { 1, 3, 4 },
                { 3, 4, 5 } };
        int mat_b[][] = { { 1, 3, 4 },
                { 3, 4, 5 } };
        // int mat_result[][] = new int[3][2];
        for (int i = 0; i < mat_a.length; i++) {
            for (int j = 0; j < mat_a[i].length; j++) {
                // System.out.println(mat_a[i][j]+mat_b[i][j]);
            }
        }

        // ==============================Multiplying of
        // matrix==========================================
        // creating two matrices
        int mat_c[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        int mat_d[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

        // creating another matrix to store the multiplication of two matrices
        int mat_e[][] = new int[3][3]; // 3 rows and 3 columns

        // multiplying and printing multiplication of 2 matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat_e[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    mat_e[i][j] += mat_c[i][k] * mat_d[k][j];
                } // end of k loop
                System.out.print(mat_e[i][j] + " "); // printing matrix element
            } // end of j loop

        }
    }
}