package LeetCodeConcept;

public class ContigousSubStringDivisibleCheck {
    public static int divisorSubstrings(int num, int k) {
        int count = 0;
        String str = String.valueOf(num);   //convert num to string
        for (int i = 0; i < str.length(); i++) {
            int currNum = 0;
            for (int j = i; j < i + k && j < str.length(); j++) {
                currNum = currNum * 10 + (str.charAt(j) - '0');

            }
            if (currNum != 0 && num % currNum == 0) {
                count++;
            }
            if(i==(str.length()-k)){
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num=240;
        int k=2;
        System.out.println(divisorSubstrings(240,k));
    }
}
