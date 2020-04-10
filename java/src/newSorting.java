public class newSorting {
    public void newSorting(int[] A, int size){
        if(A.length <= size){
            quickSort(A);
        }
        else{
            int mid = A.length / 2;
            int[] left = new int[mid];
            int[] right = new int[A.length - mid];

            for(int i = 0; i < left.length; i++){
                left[i] = A[i];
            }
            for(int i = 0; i < right.length; i++){
                right[i] = A[i + mid];
            }
            newSorting(left, size);
            newSorting(right, size);

            mergeSortedHalves(A, left, right);
        }
    }

    private void mergeSortedHalves(int[] A, int[] L, int[] R){
        int k = 0;
        int i = 0;
        int j = 0;
        while(i < L.length && j < R.length){
            if(L[i] <= R[j]){
                A[k] = L[i];
            }
            else{
                A[k] = R[j];
            }
        }
        while(i < L.length){
            A[k] = L[i];
        }
        while(j < R.length){
            A[k] = R[j];
        }

    }

    private void quickSort(int[] A){
        quickSort(A, 0, A.length - 1);
    }

    private void quickSort(int[] A, int start, int end){
        if(start < end){
            int part = partition(A, start, end);
            quickSort(A, start, part - 1);
            quickSort(A, part + 1, end);
        }

    }

    private int partition(int[] nums, int start, int end){
        int less = start + 1;
        int more = end;

        int pivot = nums[start];

        while(less <= more){
            while(less <= end && nums[less] < pivot){
                less++;
            }
            while(more >= start && nums[more] > pivot){
                more--;
            }
            if(less < more){
                int temp = nums[less];
                nums[less] = nums[more];
                nums[more] = temp;
                less++;
                more--;
            }

        }
        int temp = pivot;
        nums[start] = nums[more];
        nums[more] = temp;

        return more;
    }

}
