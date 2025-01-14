class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] split_video_len = video_len.split(":");
        String[] split_pos = pos.split(":");
        String[] split_op_start = op_start.split(":");
        String[] split_op_end = op_end.split(":");
        int sec_video_len = Integer.parseInt(split_video_len[0]) * 60 + Integer.parseInt(split_video_len[1]);
        int sec_pos = Integer.parseInt(split_pos[0]) * 60 + Integer.parseInt(split_pos[1]);
        int sec_op_start = Integer.parseInt(split_op_start[0]) * 60 + Integer.parseInt(split_op_start[1]);
        int sec_op_end = Integer.parseInt(split_op_end[0]) * 60 + Integer.parseInt(split_op_end[1]);
        
        for(int i = 0 ; i < commands.length ; i++){
            if(sec_pos >= sec_op_start && sec_pos < sec_op_end){
                sec_pos = sec_op_end;
            }
            
            if(commands[i].equals("next")){
                sec_pos += 10;
            }
            else{
                sec_pos -= 10;
            }
            
            if(sec_pos < 0){
                sec_pos = 0;
            }
            else if(sec_pos > sec_video_len){
                sec_pos = sec_video_len;
            }
            else if(sec_pos >= sec_op_start && sec_pos < sec_op_end){
                sec_pos = sec_op_end;
            }
        }
        String minute = String.valueOf(sec_pos / 60);
        String second = String.valueOf(sec_pos % 60);
        
        StringBuilder sb = new StringBuilder();
        sb.append(sec_pos / 60 < 10 ? "0" : "").append(minute).append(":");
        sb.append(sec_pos % 60 < 10 ? "0" : "").append(second);
        return sb.toString();
    }
}