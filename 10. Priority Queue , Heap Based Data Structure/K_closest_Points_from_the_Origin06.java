import java.util.*;


public class K_closest_Points_from_the_Origin06 {
    public class Point implements Comparable<Point>{
        
        int x ;
        int y ;
        double distance ;
        int i ;

        public Point(int x ,int y , double distance , int i ){
            this.x = x ;
            this.y = y ;
            this.distance = distance ;
            this.i = i ;


        }

        @Override
        public int compareTo(Point p1) {
           // return ascending order distance data 

           return Double.compare(this.distance, p1.distance);
        }
    }

    public int [][] kclosestpoint(int [][] points , int k){

        PriorityQueue<Point> minheap = new PriorityQueue<>();

        for(int i = 0 ; i<points.length; i++){
            double distance = Math.sqrt(points[i][0]*points[i][0] + points[i][1]*points[i][1] );
            minheap.add(new Point(points[i][0] ,points[i][1] , distance, i));
        }

        int [][] result = new int[k][];
        for(int i = 0 ; i<k; i++ ){
            Point point = minheap.remove();
            result[i] = new int[]{points[point.i][0] , points[point.i][1]};


        }

        return result ; 

    }
    public static void main(String[] args) {
      //  int point = new Point(1, 2, 0, 0)
    }
    
}
