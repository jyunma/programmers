package level1;

public class 제일_작은_수_제거하기 {
	public int[] solution(int[] arr) {
        int[] rst = {-1};
        if(arr.length==1) return rst;
        
        int[] answer = new int[arr.length-1];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<=min) min = arr[i];
        }
        int a = 0;
        for(int i:arr){
            if(i == min) continue;
            answer[a++]=i;
        }
        return answer;
    }
}
/*
문제 설명
	정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

제한 조건
	arr은 길이 1 이상인 배열입니다.
	인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
 */
