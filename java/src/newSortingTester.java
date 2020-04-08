import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class newSortingTester {

    @Test
    public void newSorting1(){
        newSorting ns = new newSorting();
        int[] A = {2, 4, 6, 1, 5};
        int[] B = {1, 2, 4, 5, 6};

        ns.newSorting(A, 3);
        assertArrayEquals(B, A);
    }

}