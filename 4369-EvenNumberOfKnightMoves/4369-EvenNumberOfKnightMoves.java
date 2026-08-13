// Last updated: 13/08/2026, 15:05:31
class Solution {
    public boolean canReach(int[] start, int[] target) {
       return ((start[0]+start[1]) %2)==((target[0]+target[1])%2);
    }
}