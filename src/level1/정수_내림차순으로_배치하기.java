package level1;

import java.util.Arrays;

public class 정수_내림차순으로_배치하기 {
	public long solution(long n) {
        String tmp = n+"";
        char[] cArr = tmp.toCharArray();
        Arrays.sort(cArr);
        tmp = "";
        for(char c:cArr){
            tmp=c+tmp;
        }
        long answer = Long.parseLong(tmp);
        return answer;
    }
}
/*
문제 설명
	함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
	n은 1이상 8000000000 이하인 자연수입니다.
 
 */
