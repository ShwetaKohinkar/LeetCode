public class Decode {

    public static void main(String[] args)
    {
        int[] encoded = {1,2,3};

        decode(encoded, 1);

    }
    public static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length+1];
        arr[0] = first;
        for(int i = 0; i < arr.length - 1; i++){
            arr[i+1] = encoded[i]^arr[i];
        }
        return arr;
    }
}
