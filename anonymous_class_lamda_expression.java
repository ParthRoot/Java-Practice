interface hello_1{
    void meth1();
    void meth2();
}

interface hello_2{
    void meth3(int a);

}


public class anonymous_class_lamda_expression {
    public static void main(String[] args) {
/*
       // anonymous_class
        hello_1 h1 = new hello_1() {
            @Override
            public void meth1() {
                System.out.println("meth1");
            }

            @Override
            public void meth2() {
                System.out.println("meth 2");
            }
        };

        h1.meth1();
        h1.meth2();*/


        //Lambda Expression

        hello_2 h1 = (a) -> {
            System.out.println("I am method 3:-"+a);
        };

        h1.meth3(25000);
    }
}
