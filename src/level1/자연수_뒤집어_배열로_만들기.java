package level1;

public class 자연수_뒤집어_배열로_만들기 {
	public int[] solution(long n) {
        String tmp = Long.toString(n);
        int[] arr = new int[tmp.length()];
        int a = 0;
  
        for(int i = tmp.length()-1; i>=0; i--){
            arr[a++] = Character.getNumericValue(tmp.charAt(i));
        }
        return arr;
    }
}
/*
문제 설명
	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
	n은 10,000,000,000이하인 자연수입니다. 
 */
