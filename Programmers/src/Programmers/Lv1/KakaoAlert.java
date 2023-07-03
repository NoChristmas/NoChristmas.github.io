package Programmers.Lv1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class KakaoAlert {
    public static void main(String[] args) {
        KakaoAlert kakao = new KakaoAlert();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        kakao.solution(id_list,report,k);

    } 
    
    public int[] solution(String[] id_list, String[] report, int k) { //신고자, 신고받은자
        int[] answer = {};
	    answer = new int[id_list.length];
        
		Map<String, HashSet<String>> reportedMap = new HashMap<>(); //신고한 사람(key), 신고된 사람 (value={"여러","아이디"})
		Map<String, Integer> answerMap = new HashMap<>(); // 신고한 사람(key) , 받는 메세지(value=?)
        
		//초기 세팅
        for (int i = 0; i < id_list.length; i++) {
			HashSet<String> reportingId = new HashSet<>(); //신고된 유저의 key = 신고한 사람 배열 새로 선언
			reportedMap.put(id_list[i], reportingId); //신고된 사람(key), 신고한 사람 배열 null값으로 넣기
			answerMap.put(id_list[i], 0);  // answerMap은 초기값이 0임
		}
		
        //신고 기록을 세팅하자
        for (String s : report) {
			String[] reportStr = s.split(" ");
			String reportingID = reportStr[0]; // 신고한 사람
			String reportedID = reportStr[1]; // 신고된 사람
            reportedMap.get(reportedID).add(reportingID); // 신고된 사람 key값 : value= 신고한사람을 넣자
		}

		/*
		 * 3. 유저가 받은 이용 정지 결과 메일 세팅
		 */

		for (String reportedUser : reportedMap.keySet()) { // reportedUser 는 신고된ID유저
			
            HashSet<String> userForSend = reportedMap.get(reportedUser); // reportedUser(신고된유저)를 신고한 유저
			
            if (userForSend.size() >= k) { // 신고된 횟수가 K번 이상일 경우
				
                for (String userId : userForSend) {
					answerMap.put(userId, answerMap.get(userId) + 1); // answerMap 에 신고된Id 별 메일 수 넣기
				}
			}
		}
				
		/*
		 * 4. 유저ID 별 받은 메일 수를 answer 에 세팅
		 */

		for (int i = 0; i < id_list.length; i++) {
			answer[i] = answerMap.get(id_list[i]);
		}

		return answer;
	
    }
}