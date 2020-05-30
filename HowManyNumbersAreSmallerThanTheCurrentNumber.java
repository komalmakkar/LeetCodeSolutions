class Solution {
    /// Test cases for TDD.
    /// [8,1,2,2,3]
    /// [1,2]
    /// [1,1,1,1,1,1]
    /// [5,4,5,4,5]
    
    private boolean isValidInput(int sizeOfArray)
    {
        /// The following two cases are optimizing for the performance,
        /// for constraints, 
        /// In real world, these cases should return false.
        /// 
        /// The other constraints that can be checked is nums[i] <= 100
        /*if (sizeOfArray <= 0)
        {
             return nums;
        } 
        int [] numberOfSmallerElements = new int [sizeOfArray];
        if(sizeOfArray == 1)
        {
            numberOfSmallerElements[0] = 0;
        } 
        */
        if (sizeOfArray < 2  || sizeOfArray > 500)
        {
             return false;
        } 
        return true;
    }
        
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int sizeOfArray = nums.length;
        int [] numberOfSmallerElements = new int [sizeOfArray];
        if(!isValidInput(sizeOfArray))
        {
            // Throw in real world
        }
        else 
        {
            for (int i = 0 ; i < sizeOfArray; i++)
            {
                int countOfSmallerElements = 0;
                for (int j = 0; j < sizeOfArray; j++)
                {
                    if(i != j)
                    {
                        if(nums[i] > nums[j])
                        {
                            countOfSmallerElements++;
                        }
                    }
                }
                numberOfSmallerElements[i] = countOfSmallerElements;
            }
        }
        return numberOfSmallerElements;
    }
}
