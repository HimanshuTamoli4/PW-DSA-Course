public class Largest_Rectangle_Area03   
{  
  
// a method that finds the   
// minimum between a & b  
int findMin(int a, int b)  
{  
  int min = (a > b) ? b : a;   
  return min;  
}  
  
// a method that finds the   
// maximum between a & b  
int findMax(int a, int b)  
{  
  int max = (a > b) ? a : b;   
  return max;  
}  
  
// the main method  
public static void main(String argvs[])  
{  
// creating an object of the class LargestRectArea  
Largest_Rectangle_Area03 obj = new Largest_Rectangle_Area03();  
  
// input array in which each element represents the  
// height of the bar of the histogram  
int arr[] = {7, 3, 6, 5, 6, 2, 7};  
int size = arr.length;  
  
int maxArea = 0;  
  
for(int i = 0; i < size; i++)  
{  
// arr[i] is the first bar of the   
// maximum rectangular area  
int temp = arr[i];  
maxArea = obj.findMax(temp, maxArea);  
for(int j = i + 1; j < size; j++)  
{  
    temp = obj.findMin(temp, arr[j]);  
    maxArea = obj.findMax(maxArea, temp * (j - i + 1));  
}  
}  
System.out.println("The maximum rectangular area is: " + maxArea);  
}  
}  