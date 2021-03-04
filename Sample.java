    class Sample {
    public static void main(String[] args) {
        Sample sol = new Sample();
        String s = "The sky is blue";
        sol.reverseWords(s);
    }

    public void reverseWords(String s) {
        char[] a = s.toCharArray();
        int i = 0;

        for (int j = 0; j < a.length; j++) {
            if (a[j] == ' ') {
                reverse(a, i, j - 1);
                i = j + 1;
            }
        }
        System.out.println(String.valueOf(a));

        reverse(a, i, a.length - 1);
        System.out.println(String.valueOf(a));


        reverse(a, 0, a.length - 1);
        System.out.println(String.valueOf(a));
    }

    public void reverse(char[] s, int i, int j) {
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}