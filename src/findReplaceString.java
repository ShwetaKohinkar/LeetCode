public class findReplaceString {

    public static String replaceSubstrings(String s, int[] indices, String[] sources, String[] targets) {
        StringBuilder res = new StringBuilder(s);
        int index = 0;
        for(int i = 0; i<sources.length; i++){

            if(sources[i].equals(s.substring(indices[i], indices[i] + sources[i].length()))){

                res = res.replace(indices[i] + index, indices[i]+index + sources[i].length(), targets[i]);
                index = sources[i].length() - targets[i].length();
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abcd";
        int[] indices = {0, 2};
        String[] sources = {"a", "cd"};
        String[] targets = {"eee", "ffff"};

        String result = replaceSubstrings(s, indices, sources, targets);

        System.out.println(result); // Output: "eeebffff"
    }

}
