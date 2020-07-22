import java.util.Scanner;
public class Demo2c {
    
    public static void main(String[] args){
        int w,h;
        double s;
        Scanner k;
        
        k=new Scanner(System.in);
        System.out.print("请输入底边宽度：");
        w=k.nextInt();
        System.out.print("请输入高度    ：");
        h=k.nextInt();
        
        s=w*h/2.0;
        System.out.println("底边宽度"+w+"高度"+h+"的三角形的面积是"+s);
        
    }
    
}
