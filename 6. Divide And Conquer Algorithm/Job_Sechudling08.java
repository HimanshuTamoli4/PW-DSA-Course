// time complexity: O(n^2)
// space complexity: O(n)

import java.util.*;

import javax.print.attribute.standard.JobHoldUntil;


public class Job_Sechudling08 {
    char id;
    int deadline, profit;

    public Job_Sechudling08(){}

    public Job_Sechudling08(char id, int deadline, int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    void printJobSequence(ArrayList<Job_Sechudling08> arr, int maxDeadline){
        //1. Sort the arr in decreasing order of the profit
        // lambda expressions
        // n log n
        int n = arr.size();
        Collections.sort(arr, (a,b) -> b.profit - a.profit);

        //2. Store the job ids on the basis of the max profit and the given deadline

        // to track the alloted jobs
        boolean result[] = new boolean[maxDeadline];

        // to store the job ids
        char job[] = new char[maxDeadline];

        // O(n^2)
        for(int i=0; i<n; i++){
            for(int j=Math.min(maxDeadline-1, arr.get(i).deadline-1); j>=0; j--){
                if(result[j]==false){
                    result[j] = true;
                    job[j] = arr.get(i).id;
                    break;
                }
        }
    }
    for(char id: job){
        System.out.print(id+" ");
    }
    System.out.println();
}

    public static void main(String[] args){
        ArrayList<Job_Sechudling08> arr = new ArrayList<>();
        arr.add(new Job_Sechudling08('1', 5, 55));
        arr.add(new Job_Sechudling08('2', 2, 65));
        arr.add(new Job_Sechudling08('3', 7, 75));
        arr.add(new Job_Sechudling08('4', 3, 60));
        arr.add(new Job_Sechudling08('5', 2, 70));
        arr.add(new Job_Sechudling08('6', 1, 50));
        arr.add(new Job_Sechudling08('7', 4, 85));
        arr.add(new Job_Sechudling08('8', 5, 68));
        arr.add(new Job_Sechudling08('9', 3, 45));

        System.out.println("Job Sequence order to get the maximum profit is: ");

        Job_Sechudling08 job = new Job_Sechudling08();

        job.printJobSequence(arr, 7);

    }

    
}
