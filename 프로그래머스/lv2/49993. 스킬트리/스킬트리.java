class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int curSkillIndex = 0;
        boolean isPossible = true;

        for(int i = 0 ; i < skill_trees.length ; i++){
            curSkillIndex = 0;
            isPossible = true;
            String curSkillTrees = skill_trees[i];

            for(int j = 0 ; j < curSkillTrees.length() ; j++){
                if(skill.indexOf(curSkillTrees.substring(j, j + 1)) > curSkillIndex){
                    isPossible = false;
                    break;
                }
                else if(skill.indexOf(curSkillTrees.substring(j, j + 1)) != -1){
                    curSkillIndex++;
                }
            }

            if(isPossible){
                answer++;
            }
        }

        return answer;
    }
}