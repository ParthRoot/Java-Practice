public class break_continue {

    public static void main(String[] args){
        int i = 0;
        for(i=0;i<50;++i){

            if (i == 15 || i == 17){
                continue;
            }
            System.out.println(i);
            System.out.println("It is great");

            if(i == 25){
                System.out.println("Break Loop Here");
                break;
            }
        }
    }
}

