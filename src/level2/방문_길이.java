package level2;
import java.util.*;
public class 방문_길이 {
	public int solution(String dirs) {
        int[] now = {0, 0};
        HashSet<String> hSet = new HashSet<>();
        for(int i = 0; i<dirs.length(); i++){
            int[] pre = now.clone();
            now = move(dirs.charAt(i), now);
            if(Arrays.equals(now,pre)) continue;
            hSet.add(pre[0]+","+pre[1]+"&"+now[0]+","+now[1]);
            hSet.add(now[0]+","+now[1]+"&"+pre[0]+","+pre[1]);
        }
        return hSet.size()/2;
    }
    public static int[] move(char c, int[] now){
        int[] tmp = now.clone();
        switch(c){
            case 'U' :
                now[1]++;
                break;
            case 'D' :
                now[1]--;
                break;
            case 'R' :
                now[0]++;
                break;
            case 'L' :
                now[0]--;
                break;
        }if(now[0]<-5 || now[0]>5 || now[1]<-5 || now[1]>5)
            return tmp;
        else return now;
    }
}
/*
문제 설명
	참조
	https://programmers.co.kr/learn/courses/30/lessons/49994
	
*/