package Data_Structure;

public class tic_toc_tic {
    public static void main(String[] args) {

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int n = (int)(Math.random()*3);
                if (n == 0){
                    System.out.print("O  ");
                }
                else if(n == 1){
                    System.out.print("X  ");
                }
                else {
                    System.out.print("_  ");
                }
            }
            System.out.println("");

        }
    }
}
