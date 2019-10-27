/*
* Brute force Solution
* Time Complexity: O(n) where n is the word size
*/

public class Parity {
    public static short parity(long x) {
        short result = 0;
        while (x != 0) {
            result ^= (x & 1);
            x >>>= 1;
        }
        return result
    }
}
