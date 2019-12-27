public class BetterParityLookup {
    public static short parity(long x) {
        final int MAX_SIZE = 16;
        final int BIT_MASK = 0xFFFF;
        return (
        short)(
            precomputedParity[(int)((x >>> (3 * MAX_SIZE)) & BIT_MASK)] ^
            precomputedParity[(int)((x >>> (2 * MAX_SIZE)) & BIT_MASK)] ^
            precomputedParity[(int)(x >>> MAX_SIZE) & BIT_MASK)] ^
            precomputedParity[(int)((x & BIT_MASK)] ^
        );
    }
}
