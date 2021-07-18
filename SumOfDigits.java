public class SumOfDigits {
    public static int[] sum(int[] arr, int x) {
        int[] outInt = new int[2];
        for(int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    outInt[0] = i;
                    outInt[1] = j;
                }
                else {
                    outInt[0] = -1;
                    outInt[1] = -1;
                }
            }
        }
        return outInt;
    }
    public static void main(String[] args) {
        //Driver code
        int arr[] = {8, 3, 1};
        int x = 12;
        int[] oof = sum(arr, x);
        for (int i = 0; i < oof.length; i++) {
            System.out.println(oof[i]);
        }
    }
}
