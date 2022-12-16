package JavaCourse.IntroductionToDataStructures.DynamicArray;

public class StaticNDynamicArray {
    
    public class StaticArray{
        /*

        Static Array

            A Static Array is a fixed length container
                containing n elements indexable from
                the range [0, n-1].

                indexable - each slot/index in the array
                    can be reference with a number

            A Static Array is used when and where:

                Storing and accessing sequential data
                Temporarily storing objects
                Used by IO routines as buffers
                Lookup tables and inverse lookup tables
                To return multiple values form a function
                Used in Dynamic Programming to cache answers to subproblem.

            Example:

                Position:

                    A = [44 , 12, -5, 17, 6, 0, 3, 9, 100]
                        |     |   |   |  |  |  |  |   |
                        0     1   2   3  4  5  6  7   8
                    
                        Elements in A are reference by their index.
                            There is no other way to access elements
                            in an array. Array indexing is zero-based,
                            meaning the first element is found in pos 0

                        A[0] = 44
                        A[1] = 12
                        A[4] = 6
                        A[7] = 9
                        A[9] = index out of bounds
                
                Assign:

                    A = [44 , 12, -5, 17, 6, 0, 3, 9, 100]
                        |     |   |   |  |  |  |  |   |
                        0     1   2   3  4  5  6  7   8

                        Can Assign elements within the array according to
                            the index position within array [a]
                        
                        A[0] := -1
                        A[5] := 18
                        A[2] := 25

                        A = [-1 , 12, 25, 17, 6, 18, 3, 9, 100]
                            |    |   |   |  |   |  |  |   |
                            0    1   2   3  4   5  6  7   8
        */
    }

    public class DynamicArray{

        /*
        
        Operations On Dynamic Arrays:

            The Dynamic Array can grow and shrink in size.

                A = [34, 4]

                // .add(#) (grows) to the end of the array
                A.add(-7)

                    A = [34, 4, -7]

                A.add(34)
                    
                    A = [34, 4, -7, 34]
                
                // (shrink) .removes(#) (shrinks) within array
                A.remove(4)

                    A = [34, -7, 34]
        
        Implementation:

            By creating a static array

                Create a static array with an initial capacity
                Add elements to the underlying static array, keeping
                    track of the number of elements.
                If adding another elements wil exceed the capacity,
                    then create a new static array with twice the 
                    capacity by copying the original elements into it. 

            Example:

                Suppose we create a dynamic carey with an initial capacity 
                    of two and then begin adding elements to it.

                
        */
    }
    
}
