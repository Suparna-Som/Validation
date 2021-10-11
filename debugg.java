public class debugg {
    public static int add(int x, int y)
{
    return x+y;
}
    public static int multiply(int x,int y){
        int m=0;
        for(int i=0; i<x;i++){
            m = add(x,y);
        }
        return m;
    }
    public static void main (String args[]){
        int s;
        System.out.println(multiply(4,5));
    }
}

