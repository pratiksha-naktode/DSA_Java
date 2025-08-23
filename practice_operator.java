public class practice_operator{
    public static void main(String args[]){

       /* int x=2, y=5;
        int e1=(x*y/x);//* has higher precedence than /
        int e2=(x*(y/x));

        System.out.println(e1+",");
        System.out.println(e2);*/

        /*int x=200,y=50,z=100;
        if(x>y&& y>z){
            System.out.println("Hello");

        }
        if(z>y && z<x){
           System.out.println("Java"); 
        }
        if((y+200)<x&&(y+150)<z){
            System.out.println("Hello Java!!!!");

            int x, y,z;
            x=y=z=2;
            x+=y;
            y-=z;
            z/=(x+y);
            System.out.println(x+" "+y+" "+z);*/

            int x=9, y=12;
            int a=2, b=4, c=6;
            
            int exp=4/3*(x+34)+9*(a*b*c)+(3+y*(2+a))/(a+b*y);
            System.out.println(exp);

            x=10;
            y=5;
            exp=(y*(x/y+x/y));
           int exp2=(y*x/y+y*x/y);
            System.out.println(exp);
              System.out.println(exp2);
        }
    }
