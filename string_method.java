public class string_method
{
    public static void main(String[] args)
    {
        String s1 = "Hello World";
        System.out.println(s1);
        // length()
        int a = s1.length();
        System.out.println(a);
        //charAt(int index)
        char b = s1.charAt(7);
        System.out.println(b);
        //toLowerCase()
        System.out.println(s1.toLowerCase());
        //toUpperCase()
        System.out.println(s1.toUpperCase());
        // trim()
        String s2 = new String("          Hello               ");
        System.out.println(s2.trim());
        System.out.println(s2.trim());
        // substring(int Start)
        System.out.println(s1.substring(2));
        // substring(int start, int end)
        System.out.println(s1.substring(2, 5));
        // replace('char', 'char')
        System.out.println(s1.replace('l', ' '));
        System.out.println(s1.replace("l", "parth"));
        // contains()
        System.out.println(s1.contains("l"));
        //string.join
        String s = String.join(":","25","85");
        System.out.println(s);
        //startsWith("string")
        System.out.println(s1.startsWith("He"));
        //endsWith("string")
        System.out.println(s1.endsWith("ld"));
        //indexOf(str)
        System.out.println(s1.indexOf("l"));
        System.out.println(s1.indexOf("l", 3));
        System.out.println(s1.indexOf(" W"));
        System.out.println(s1.indexOf("lo", 3));
        //lastindexOf("str")
        String sh = "harrayrray";
        System.out.println(sh.lastIndexOf("rray"));
        System.out.println(sh.lastIndexOf("rray", 2));
        //eqauls("str")
        System.out.println(s1.equals("Hello World"));
        //equalsIgnoreCase()
        System.out.println(s1.equalsIgnoreCase("HELLO WORLD"));
        //compareTo()
        System.out.println(s1.compareTo("Hello orld"));


        // escape sequence
        System.out.println("\\n = Helo\nWorld");
        System.out.println("\\t = Helo\tWorld");
        System.out.println("\\b = Hello\bworld");
        System.out.println("\\r = Hello\rworld");
        System.out.println("\\f = Hello\fworld");
        System.out.println("\"\'\\");


    


    }
}