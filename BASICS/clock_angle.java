import java.text.ListFormat.Style;
import java.util.*;
public class clock_angle {
    clock_angle(String s)
    {
        int h=Integer.parseInt(s.substring(0,2));
        int m=Integer.parseInt(s.substring(3,5));
        double hour_angle=(30*h)+(0.5*m);
        double min_angle=6*m;
        double angle=Math.abs(hour_angle-min_angle);
        System.out.print(Math.min(angle, 360-angle));
    }
    public static void main(String[] args) {
        System.out.println("enter the time");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        clock_angle c=new clock_angle(s);
    }
}
