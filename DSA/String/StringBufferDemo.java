package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer("sagar patil");
        StringBuffer sb2 = new StringBuffer(38);


        sb.append("We are the Engineers");
        sb.append(" Mayur");
        sb.insert(20,":");

        String str = sb.toString();
        System.out.println(str);
    }
}
