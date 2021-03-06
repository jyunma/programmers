package level1;

public class _3진법_뒤집기 {
	public int solution(int n) {
        String rst = "";
        while(n>0){
            rst += n%3;
            n/=3;
        }
        return Integer.parseInt(rst,3);
    }
}
/*
 문제 설명
	자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
	n은 1 이상 100,000,000 이하인 자연수입니다.
 */
 