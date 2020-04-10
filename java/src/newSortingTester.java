import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class newSortingTester {

    /*
    Test case 1 - newSorting();

        This test case is meant to ensure proper functions of the method quickSort using an array of size equal to that of
    "size". The method is immediately sent to the base case which calls for quickSort and returns a fully sorted array.
     */
    @Test//Passed
    public void newSorting1(){
        int[] A = {2, 4, 6, 1, 5};
        int[] B = {1, 2, 4, 5, 6};

        newSorting ns = new newSorting();
        ns.newSorting(A, 5);
        assertArrayEquals(B, A);
    }

    /*
    Test case 2 - newSorting();

        This test case is meant to ensure proper functions of the method as a whole, including the mergeSortedHalves, and
    the populate helper method. The same array is used but is instead split using a size of two to further break down
    the use of the newSorting method. The expected outcome should be the same.
     */
    @Test//Passed
    public void newSorting2(){
        int[] A = {2, 4, 6, 1, 5};
        int[] B = {1, 2, 4, 5, 6};

        newSorting ns = new newSorting();
        ns.newSorting(A, 2);
        assertArrayEquals(B, A);
    }

    /*
    Test case 3 - newSorting();

       This test case creates the instance in which there is negative values within the array that must still be sorted
    accordingly. The test case works the same as before and should not be confused with the values presented to it.
    Negative values should come out in front of the array as the least and positives at the end of the array as the
    greater values.
    */
    @Test//Passed
    public void newSorting3(){
        int[] A = {2, -4, 3, -3, 6, -1, 5};
        int[] B = {-4, -3, -1, 2, 3, 5, 6};

        newSorting ns = new newSorting();
        ns.newSorting(A, 2);
        assertArrayEquals(B, A);
    }

    /*
    Test case 4 - newSorting();

       This test case should encounter the obstacle of having two or more integers of the same value. The values should
    be compared and placed next to each other with no errors, considering the method simply traverses the list and places
    values accordingly. The array is also split perfectly to the point where both sides fit the size parameter perfectly
    unlike the previous two cases.
    */
    @Test//Passed
    public void newSorting4(){
        int[] A = {2, 3, 6, 3, 1, 8};
        int[] B = {1, 2, 3, 3, 6, 8};

        newSorting ns = new newSorting();
        ns.newSorting(A, 3);
        assertArrayEquals(B, A);
    }

    /*
    Test case 5 - newSorting();

       The final test case implements both the occurrences of duplicate values and negative integers. The values should
    be compared normally as before and return the ordered array. The test also includes an array originally set in
    reverse order, with the greatest in the beginning of the array. The array is then broken down into splits of one at
    a time, making sure there is no confusion in any methods when newSorting is run.
    */
    @Test//Passed
    public void newSorting5(){
        int[] A = {9, 5, 5, 4, 2, -1, -1, -10};
        int[] B = {-10, -1, -1, 2, 4, 5, 5, 9};

        newSorting ns = new newSorting();
        ns.newSorting(A, 1);
        assertArrayEquals(B, A);
    }

}