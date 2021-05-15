import java.util.Scanner;

class myException extends Exception{
    @Override
    public String toString() {
        return "string not found Exception";
    }

    @Override
    public String getMessage() {
        return "Get Message";
    }

    public String hello(){
        return "Hello";
    }
}

public class Exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number: ");
        int a = sc.nextInt();

        if(a<99){
            try{
                //throw  new myException();
                throw new ArithmeticException("This is arithmetic exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
               System.out.println(e.getStackTrace());
                System.out.println("Hello world end of this session");

            }
        }
    }
}
