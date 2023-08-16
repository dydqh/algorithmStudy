class Solution {
    public String solution(String m, String[] musicinfos) {
        String result = "";
        int length = 0;

        String editM = "";
        for(int i = 0 ; i < m.length() ; i++){
            if(!m.substring(i, i + 1).equals("#")){
                editM += m.substring(i, i + 1);
            }
            else{
                String last = editM.substring(editM.length() - 1, editM.length());
                editM = editM.substring(0, editM.length() - 1);
                editM += last.toLowerCase();
            }
        }
        m = editM;

        for(int i = 0 ; i < musicinfos.length ; i++){
            String[] curInfo = musicinfos[i].split(",");
            String[] startTemp = curInfo[0].split(":");
            String[] endTemp = curInfo[1].split(":");
            int startHour = Integer.parseInt(startTemp[0]);
            int startMinute = Integer.parseInt(startTemp[1]);
            int startTotalMinute = startHour * 60 + startMinute;
            int endHour = Integer.parseInt(endTemp[0]);
            int endMinute = Integer.parseInt(endTemp[1]);
            int endTotalMinute = endHour * 60 + endMinute;
            int curTotalMinute = endTotalMinute - startTotalMinute;
            String curTempPart = curInfo[3];
            String curPart = "";
            for(int j = 0 ; j < curTempPart.length() ; j++){
                if(!curTempPart.substring(j, j + 1).equals("#")){
                    curPart += curTempPart.substring(j, j + 1);
                }
                else{
                    String last = curPart.substring(curPart.length() - 1, curPart.length());
                    curPart = curPart.substring(0, curPart.length() - 1);
                    curPart += last.toLowerCase();
                }
            }
            int curPartLength = curPart.length();
            String curMusic = "";
            for(int j = 0 ; j < curTotalMinute / curPartLength ; j++){
                curMusic += curPart;
            }
            curMusic += curPart.substring(0, curTotalMinute % curPartLength);
            if(curMusic.indexOf(m) > -1){
                if(curTotalMinute > length){
                    result = curInfo[2];
                    length = curTotalMinute;
                }
            }
        }

        return result.length() == 0 ? "(None)" : result;
    }
}