package toptalPractice;

public class Algos {
    /* arr[]  ---> Input Array
    data[] ---> Temporary array to store current combination
    start & end ---> Staring and Ending indexes in arr[]
    index  ---> Current index in data[]
    r ---> Size of a combination to be printed */
    void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
        // Current combination is ready to be printed, print it
        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }
 
        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }
 
    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    public void printCombination()
    {
        // A temporary array to store all combination one by one
        int data[]=new int[_r];
 
        // Print all combination using temprary array 'data[]'
        combinationUtil(_arr, data, 0, _n-1, 0, _r);
    }
    int _arr[];
    int _r;
    int _n;
    /*Driver function to check for above function*/
    Algos(int[] arr, int r, int n) {
    	_arr = arr;
    	_r = r;
    	_n = arr.length;        
    }
}
