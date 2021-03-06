package level2;
public class 숫자의_표현 {
	public int solution(int n) {
        int answer = 1;
        for(int i = n/2+1; i>=1; i--){
            int tmp = i;
            for(int j = i-1; j>=1; j--){
                tmp+=j;
                if(tmp>n) break;
                if(tmp==n) answer++;
            }
        }
        return answer;
    }
	/*
	 
	 
	 * 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다
	 public int expressions(int num) {
        int answer = 0;
        for (int i = 1; i <= num; i += 2) {
            if (num % i == 0) {
                answer++;
            }
        }
        return answer;
    }
	 */
	
}
/*
문제 설명
	Finn은 요즘 수학공부에 빠져 있습니다. 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다. 예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.
	
	1 + 2 + 3 + 4 + 5 = 15
	4 + 5 + 6 = 15
	7 + 8 = 15
	15 = 15
	자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.
	
제한사항
	n은 10,000 이하의 자연수 입니다.
*/