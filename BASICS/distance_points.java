public class distance_points {  
    void point(int x1, int y1,int x2,int y2){
        double sum;
        sum=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2));
        System.out.print("answer : "+sum);
    }
    public static void main(String[] args) {
        distance_points d=new distance_points();
        d.point(12,13,14,15);
    }
}
