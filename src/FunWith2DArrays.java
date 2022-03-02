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
}
