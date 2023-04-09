import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");
        int parent1 = Integer.parseInt(input1[1]);
        int parent2 = Integer.parseInt(input2[1]);
        int child1 = Integer.parseInt(input1[0]);
        int child2 = Integer.parseInt(input2[0]);

        long smallParent = parent1 > parent2 ? parent2 : parent1;
        long largeParent = parent1 > parent2 ? parent1 : parent2;
        long gcdParent = gcd(largeParent, smallParent);
        long parent = parent1 * parent2 / gcdParent;
        long child = child1 * parent / parent1 + child2 * parent / parent2;

        long large = parent > child ? parent : child;
        long small = parent > child ? child : parent;
        long gcd = gcd(large, small);
        if(gcd > 1){
            parent /= gcd;
            child /= gcd;
        }
        sb.append(child).append(" ").append(parent);

        System.out.println(sb.toString());
    }

    public static long gcd(long large, long small){
        if(large % small == 0){
            return small;
        }
        else{
            return gcd(small, large % small);
        }
    }
}