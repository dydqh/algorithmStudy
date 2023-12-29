import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        int maxSize = 10000000;
        boolean[] isPrime = new boolean[maxSize + 1];
        List<Integer> allPrimeList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i <= Math.sqrt(isPrime.length); i++) {
            if (!isPrime[i]) {
                continue;
            } else {
                int number = i;
                int index = 2;
                while (number * index < isPrime.length) {
                    isPrime[number * index] = false;
                    index++;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            if (isPrime[i]) {
                allPrimeList.add(i);
            }
        }

        for (int i = 10; i < isPrime.length; i++) {
            if (!isPrime[i]) {
                continue;
            } else {
                setAllPrimeList(allPrimeList, isPrime, i);
            }
        }

        setResult(result, allPrimeList, isPrime);
        Collections.sort(result);

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            int target = -1;
            for (int j = result.size() - 1; j >= 0; j--) {
                int curResult = result.get(j);
                if (curResult <= n) {
                    target = curResult;
                    break;
                }
            }
            sb.append(target).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void setAllPrimeList(List<Integer> allPrimeList, boolean[] isPrime, int number) {
        int length = (int) Math.log10(number) + 1;
        int item1 = number / 10;
        int item2 = number % (int) Math.pow(10, length - 1);

        if (length > 2) {
            if (allPrimeList.indexOf(item1) > -1 && allPrimeList.indexOf(item2) > -1)
                allPrimeList.add(number);
        } else {
            if (isPrime[number])
                allPrimeList.add(number);
        }
    }

    public static void setResult(List<Integer> result, List<Integer> allPrimeList, boolean[] isPrime) {
        for (int rightIndex = allPrimeList.size() - 1; rightIndex >= 0; rightIndex--) {
            int curRight = allPrimeList.get(rightIndex);
            int rightLength = (int) Math.log10(curRight) + 1;
            for (int leftIndex = allPrimeList.size() - 1; leftIndex >= 0; leftIndex--) {
                int curLeft = allPrimeList.get(leftIndex);
                int leftLength = (int) Math.log10(curLeft) + 1;
                if (rightLength < leftLength) {
                    continue;
                }
                if (rightLength > leftLength) {
                    break;
                }
                if (curRight % (int) Math.pow(10, rightLength - 1) == curLeft / 10
                        && curRight * 10 + curLeft % 10 < isPrime.length && curRight * 10 + curLeft % 10 >= 100
                        && !isPrime[curRight * 10 + curLeft % 10]) {
                    result.add(curRight * 10 + curLeft % 10);
                }
            }
        }
    }
}