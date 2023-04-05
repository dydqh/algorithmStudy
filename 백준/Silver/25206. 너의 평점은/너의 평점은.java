import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        double total = 0;

        for(int i = 0 ; i < 20 ; i++){
            String[] input = br.readLine().split(" ");
            double score = Double.parseDouble(input[1]);
            if(input[2].equals("P")){
                continue;
            }
            total += score;
            sum += (getGrade(input[2]) * score);
        }

        System.out.println(String.format("%.6f", sum / total));
    }
    
    public static double getGrade(String grade){
        double gradeScore = 0;
        switch (grade) {
            case "A+":
                gradeScore = 4.5;
                break;
            case "A0":
                gradeScore = 4.0;
                break;
            case "B+":
                gradeScore = 3.5;
                break;
            case "B0":
                gradeScore = 3.0;
                break;
            case "C+":
                gradeScore = 2.5;
                break;
            case "C0":
                gradeScore = 2.0;
                break;
            case "D+":
                gradeScore = 1.5;
                break;
            case "D0":
                gradeScore = 1.0;
                break;
            case "F":
                gradeScore = 0.0;
                break;
            default:
                break;
        }
        return gradeScore;
    }
}