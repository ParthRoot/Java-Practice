public class array_3d {
    public static void main(String[] args) {
        int [][] a = new int[2][3];
        a[0][0] = 101;
        a[0][1] = 102;
        a[0][2] = 103;
        a[1][0] = 104;
        a[1][1] = 105;
        a[1][2] = 106;

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }

        }


        // 2d array
        int i = 0;
        int l = 0;
        while(i<a.length) {
            int j = 0;

            if (l == 0) {
                System.out.print("\t  ");
                for (int k = 0; k < 3; k++) {
                    System.out.print("Col ");
                }
                l++;
            }
            System.out.println("");
            System.out.print("Row - ");
            while (j < a[i].length) {
                System.out.print(a[i][j]+" ");
                j++;
            }
            i++;

        }






    }
}
