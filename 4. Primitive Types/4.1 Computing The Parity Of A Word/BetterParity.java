public class BetterParity {
    public static short parity(long x) {
        short result = 0;
        while (x != 0) {
            result ^= 1;
            x &= (x - 1);   // drops the lowest set bit in x
        }
        return result;
    }
}
