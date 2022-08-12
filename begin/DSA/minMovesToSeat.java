class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
     Arrays.sort(seats);
        Arrays.sort(students);
        int moves=0;
        int start=0;
        while(start<seats.length)
        {
            moves+=Math.abs(seats[start]-students[start]);
            ++start;
        }
        return moves;
    }
}