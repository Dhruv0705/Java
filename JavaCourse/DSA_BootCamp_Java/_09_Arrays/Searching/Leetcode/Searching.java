public class Searching {

    /*
     *  If you see a sorted array: [arr = [2,4,6,8,9,11,15]]
     *      Try applying binary search first
     * 
    */

    // Celling of a number: arr = [2,4,6,8,9,11,15]
    //      Ceiling = smallest element in array greater or = target
    //      Ceiling (arr, target = 14) = 14
    //      Ceiling (arr, target = 10) = 11
    //      Ceiling (arr, target = 16) = -1
    // return arr index start because start is the smallest element in array greater or = target
    static int Ceiling(int [] arr, int target){

        // If target is greater than all elements in array return -1
        if(target > arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int midpoint = start + (end - start) / 2;
            if(target > arr[midpoint]){
                start = midpoint + 1;
            }
            else if (target < arr[midpoint]){
                end = midpoint - 1;
            }  
            else{
                return midpoint;
            }
        }
        // If target is greater than all elements in array return the last element
        return arr[start];
    }

    // Floor of a number: arr = [2,4,6,8,9,11,15]
    //      Floor = largest element in array smaller or = target
    //      Floor (arr, target = 14) = 11
    //      Floor (arr, target = 10) = 9
    //      Floor (arr, target = 16) = 15
    // return arr index end because end is the largest element in array smaller or = target
    static int Floor(int [] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int midpoint = start + (end - start) / 2;
            if(target > arr[midpoint]){
                start = midpoint + 1;
            }
            else if (target < arr[midpoint]){
                end = midpoint - 1;
            }  
            else{
                return midpoint;
            }
        }
        // If target is greater than all elements in array return the last element
        // return the index
        return end;
    }

    static int nextGreatestLetter744(char [] letters, char target){
        

    }
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(Ceiling( arr, target));
        System.out.println(Floor( arr, target));
        
    }
}
