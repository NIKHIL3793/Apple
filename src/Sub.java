public class Sub
{
    public int ask(){
        int a=12;
        int v=99;
        int vv=90;
        int c=a+v+vv;
        return(c);
    }

    public static void main(String[] args) {
        Sub q=new Sub();
        q.ask();
        System.out.println(q.ask());

    }
}
