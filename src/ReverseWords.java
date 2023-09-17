public class ReverseWords {

    public void main(String[] args) {
        String s = "the sky is blue";
        reverseWords(s);
    }
    public String reverseWords(String s) {

        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length - 1; i >=0 ; i--)
        {
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
