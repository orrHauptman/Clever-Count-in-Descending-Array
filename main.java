public static int getAppearance(int [] arr , int num)
    {
        return binarySearch(arr , num + 0.1) - binarySearch(arr , num - 0.1);
    }
    
    private static int binarySearch(int [] arr , double num)
    {
        int lo = 0 ;
        int hi = arr.length - 1;
        int mid;
        
        while(lo <= hi)
        {
            mid = (lo + hi) / 2;
            
            // Note: In a regular binary search, we would check if arr[mid] == num.
            // However, in this case, 'num' is a double (e.g., 6.5), while 'arr' contains only integers.
            // Ergo, the condition can never be true and is unnecessary here.
  
                
            if(arr[mid] > num)
                hi = mid - 1;
            
            else
                lo = mid + 1;  
        }
        
        return lo;
        
        
    }
