class Solution {
    public String solution(String rsp) {
        return rsp.replace("2", "t").replace("0", "z").replace("5", "f").replace("t", "0").replace("z", "5").replace("f", "2");
    }
}