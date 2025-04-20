public class Array
{
    
    public static void main(String[] args)
    {
        try
        {
            Arr1();
            Arr2();
            Arr3();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }   
    }

    public static void Arr1()
    {
        //One D Array
        System.out.println("---One D Array Example---");
        int arr[] = {1,2,3,4,5};
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }

    public static void Arr2()
    {
        //Rectangular Array
        System.out.println("---Rectangular Array Example---");
        int[][] arr ={{1,2,3,4,5},{6,7,8,9,10}};
        for(int i = 0 ; i<arr.length ; i++)
        {
            for(int j = 0 ; j<arr[i].length ; j++)
            {
                System.out.print(arr[i][j]);
        
            }
        }
        System.out.println("");
    }

    public static void Arr3()
    {
        //Jagged Array
        System.out.println("---Jagged Array Example---");
        int arr[][] = new int[3][];
        arr[0] = new int[] {1,2,3,4};
        arr[1] = new int[] {5,6,7,8};
        arr[2] = new int[] {9,10};
        for(int i = 0 ; i<arr.length ; i++)
        {
            for(int j = 0 ; j<arr[i].length ; j++)
            {
                System.out.print(arr[i][j]);
            }
        }
        System.out.println("");
    }
}


/* Output
---One D Array Example---
12345
---Rectangular Array Example---
12345678910
---Jagged Array Example---     
12345678910
 */