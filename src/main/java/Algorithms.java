import java.util.Arrays;

public class Algorithms {
        public static void main(String[] args) {
        }

        public static int bagOfTokensScore(int[] tokens, int P) {
            Arrays.sort(tokens);

            if (tokens.length == 0 || P < tokens[0]) return 0;
            int left = 0, right = tokens.length - 1, points = 0;

            while (left <= right) {
                if (P >= tokens[left]) {

                    points++;

                    P -= tokens[left];

                    left++;

                } else {
                    if (right - left > 1) {

                        P += tokens[right];

                        right--;

                        points--;
                    } else break;
                }
            }
            return points;
        }


        


}