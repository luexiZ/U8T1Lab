public class FunWith2DArrays {

    public static int totalElements(int[][] arr)
    {
        return arr.length * arr[0].length;
    }

    public static void fourCorners(String[][] arr)
    {
        String leftUpper = arr[0][0];
        String leftDown = arr[arr.length -1][0];
        String rightUpper = arr[0][arr[0].length -1];
        String rightDown = arr[arr.length -1][arr[arr.length -1].length -1];
//        if(leftDown.equals(leftUpper) || rightDown.equals(rightUpper))
//        {
//            System.out.println(leftDown);
//            System.out.println(rightDown);
//        }
//        else
//        {
            System.out.println(leftUpper);
            System.out.println(rightUpper);
            System.out.println(leftDown);
            System.out.println(rightDown);
//        }
    }
    public static double average(int[][] list)
    {
        double sum = 0;

        for(int[] row : list)
        {
            for(int element : row)
            {
                sum += element;
            }
        }
        return sum / (list.length * list[0].length);
    }

    public static int[] indexFound(String[][] arr, String target)
    {
        int[] location = new int[2];
        location[0] = -1;
        location[1] = -1;
        for(int i = 0;i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j].equals(target))
                {
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }
}
