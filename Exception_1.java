public class Exception_1 {
    public static void main(String[] args) {
        float a = 12;
        float b = 7;

        try{
            float c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println("End of the programme");
    }
}
