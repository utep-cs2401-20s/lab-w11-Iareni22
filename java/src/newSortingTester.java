import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class newSortingTester {

    /*
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
    This test case is meant to ensure proper functions of the method quickSort using an array of size equal to that of
    "size". The method is immediately sent to the base case which calls for quickSort and returns a fully sorted array.
     */
    @Test//Passed
    public void newSorting2(){
        int[] A = {2, 4, 6, 1, 5};
        int[] B = {1, 2, 4, 5, 6};

        newSorting ns = new newSorting();
        ns.newSorting(A, 2);
        assertArrayEquals(B, A);
    }

}