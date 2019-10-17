boolean almostIncreasingSequence(int[] sequence) {
    int errors = 0;    
    for (int i = 1; i < sequence.length; i++) {
        int value = sequence[i];
        if (value > sequence[i - 1])
            continue;
        if (++errors > 1)
            return false;
        if (i - 2 >= 0 && i + 1 < sequence.length) {
            // and check whether we can make the sequence consecutive
            // if we can't, then there is no solution due there is an unsolvable error.
            if (value <= sequence[i - 2] && sequence[i + 1] <= sequence[i - 1])
                return false;
        }
            
    }
    return true;
}