package level1;

public class 문자열을_정수로_바꾸기 {
	public int solution(String s) {
        int answer = 0;
        boolean minus=false;
        if(s.charAt(0)=='-' || s.charAt(0)=='+') {
        	if(s.charAt(0)=='-') minus=true;
        	answer=Integer.parseInt(s.substring(1));
        }else answer=Integer.parseInt(s);
        if(minus) answer-=answer*2;
        
        return answer;
    }
}
/*
문제 설명
	문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

제한 조건
	s의 길이는 1 이상 5이하입니다.
	s의 맨앞에는 부호(+, -)가 올 수 있습니다.
	s는 부호와 숫자로만 이루어져있습니다.
	s는 "0"으로 시작하지 않습니다.
 */
