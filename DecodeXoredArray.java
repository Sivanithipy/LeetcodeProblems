public class DecodeXoredArray {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length+1;
        int[] arr=new int[n];
        arr[0]=first;
        for(int i=0;i<encoded.length;i++)
        {
            arr[i+1]=arr[i]^encoded[i];
        }
        return arr;
    }
}
