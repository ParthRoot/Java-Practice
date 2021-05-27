

/**
 * javaGenerateJavaDocs example
 *@author MrCodder
 *@version 0.01
 *@since 2021
 *@see <a href = "https://docs.oracle.com/en/java/javase/16/" target="_blank">java 16 docs</a>

 */



public class javaGenerateJavaDocs {

    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        try {
            add(25,85);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    /**
     * Hello this is a method and this is the most beautiful method of this class
     * @param a This is the first number to add
     * @param b This is the second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception if a is 0
     * @deprecated This method is deprecated please use + Operator
     */
    static void add(int a, int b) throws Exception{
        if (a<0){
            throw new Exception();
        }
        System.out.println(a+b);
    }
}
