class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int time = 0;
        int max = health;

        for (int i = 0; i < attacks.length; i++) {
            int curTime = attacks[i][0] - time;
            time = attacks[i][0];
            health += bandage[1] * (curTime - 1);
            health += (bandage[2] * ((curTime - 1) / bandage[0]));
            health = health > max ? max : health;
            health -= attacks[i][1];

            if (health <= 0) {
                health = -1;
                break;
            }
        }

        return health;
    }
}