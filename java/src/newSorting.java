public class newSorting {
    public void newSorting(int[] A, int size){
        if(A.length <= size){
            quickSort(A);
        }
        else{
            int mid = A.length / 2;
            int[] left = new int[mid];
            int[] right = new int[A.length - mid];
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

    private void quickSort(int[] nums, int start, int end){
        int less = start;
        int more = end;

        if(nums.length <= 1){
            return;
        }
        int pivot = nums[0];

        while(less < more){
            while(less <= end && nums[less] <= pivot){
                less++;
            }
            while(more >= start && nums[more] > pivot){
                more--;
            }
            if(less < more){
                int temp = nums[less];
                nums[less] = nums[more];
                nums[more] = temp;
            }
        }
        int temp = nums[start - 1];
        nums[start - 1] = nums[more];
        nums[more] = temp;

        quickSort(nums, start, more - 1);
        quickSort(nums, less + 1, end);
    }

}
