package edu.ru.lab03;

/**
 *
 * @author upall
 */
public class BinarySearchExample {
    
/**Method goes through a sorted array, starting at the middle first, to 
 * find the key number it is looking for.  The four paramenters used in the
 * array are stated below.
 * @param arr
 * @param first
 * @param last
 * @param key 
 */    
    
public static void binarySearch(int arr[], int first, int last, int key)
/**The above statement creates the function for the array, and lists the
 * four parameters used in it from the main program.
 */
{
    int mid = (first + last)/2;
    //The above statement defines the variable mid with a calculation that 
    //will be used in the function.
    
    //The below while loop uses the variable mid to search for the 
    //key in the arr array, starting from the middle.  The while loop 
    //will stop when the key is found in the array, or the array 
    //has no more numbers to search through.  
    
    while (first <= last){
        //The next if lines of code moves the search array to the right, 
        //if the mid number does not match the key.
        if (arr[mid] < key){
            first = mid + 1;
        //The next else if lines of code prints out the index of the 
        //array that contains the key, if it is found.  Then it stops
        //the while loop with the break command.
        } else if (arr[mid] == key){
            System.out.println("Element is found at index: " + mid);
            break;
        //The next two lines of code moves the search  array to the left,
        //if the mid number does not match the key.
        } else{
            last = mid - 1;
        }
        //The next time of the code resets mid to the original calculation.
        mid = (first + last)/2;
    }
    //the last if loop prints out a failure message if the key is not found.
    if (first > last){
        System.out.println("Element is not found!");
    }
}
//This is the main function of the program, which declares the values of the
//arr array, last, and the key, and runs the function binarySearch.
 public static void main(String args[]) {
                int arr[] = {10,20,30,40,50};
                int key = 30;
                int last=arr.length-1;
                binarySearch(arr,0,last,key);
 }  
}
