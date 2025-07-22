public class GradeManager {
    public static void main(String[] a) {
        String[] n = {"Almuatsam", "Said", "Salem", "Dana"};
        int[] s = {95, 67, 45, 78};

        for (String x : n) System.out.println(new StringBuilder(x).reverse());
        for (int i = 0; i < n.length; i++)
            System.out.println(n[i] + ": " + (s[i] >= 90 ? 'A' : s[i] >= 80 ? 'B' : s[i] >= 70 ? 'C' : s[i] >= 60 ? 'D' : 'F'));
        for (int i = 0; i < s.length; i++)
            if (s[i] < 60) System.out.println("Fail: " + n[i]);
    }
}

