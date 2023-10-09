package ArrayAssignments;

import java.util.Arrays;
//occurance of each element in array
public class EachOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    int[] arr = {5, 8, 5, 7, 8, 10,11,8,5};
    int size = arr.length;
    Arrays.sort(arr);

    countFrequency(arr, size);
}

static void countFrequency(int[] arr, int n)
{


    // Traverse the sorted array
    for (int i = 0; i < n; i++)
    {
        int count = 1;

        // Move the index ahead whenever
        // you encounter duplicates
        while (i < n - 1 && arr[i] == arr[i + 1]) {
            i++;
            count++;
        }

        System.out.println(arr[i] + ": " + count);


        count++;
    }
}
}

