// time complexity = O(n)

public class Building_Min_Heap02{

public static void heapify(int[] arr , int n , int i){
    int largest = i ; // let the parent node as a largest node 
    int leftIdx = 2*i+1 ;
    int RightIdx = 2*i+2 ;

    if(leftIdx < n && arr[leftIdx] < arr[largest]){
        largest = leftIdx ;

    }

       if(RightIdx < n && arr[RightIdx] < arr[largest]){
        largest = RightIdx ;
        
    }
    
    if(largest!= i ){
        // swap between value pff arr[largest ] and arr[i] 

        int temp = arr[largest] ;
        arr[largest] = arr[i];
        arr[i] = temp ;

        heapify(arr, n, largest);
    }


}

public static void buildHeap(int[] arr , int n ){
    int startIdx = n/2-1 ;

    for(int i = startIdx ; i>=0 ; i--){
        heapify(arr, n , i);

    }

}

public static void displayHeap(int[] arr , int n ){
    System.out.println("Array Representation of Maxheap ");

    for(int i= 0 ; i<n ;i++){
        System.out.println(arr[i]  + " ");
    }
    System.out.println();
}

    public static void main(String[] args) {
        
        int arr[] = {10,13,15,16,7,9,11,5,4,6,20};
        int n = arr.length ;
        


        buildHeap(arr,n);
        displayHeap(arr,n);

    }
}