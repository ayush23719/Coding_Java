public class no_of_bits {
    public int numSetBits(long a) {
        int counter = 0;
        while(a!=0){
            a = a&(a-1);
            counter++;
        }
        return counter;
	}
}
}
