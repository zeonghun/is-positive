package zeonghun;

import java.util.Scanner;

/**
 * @brief 양수/음수/0 판별하는 클래스
 * 
 * @author jhkim
 * @date 230310
 */
public class Main {
    public static void main(String[] args) {
        Judgement jud = new Judgement(); // 객체 생성
        Scanner sc = new Scanner(System.in);
        try { // 예외 발생시 catch 블록 실행
            System.out.print("number: ");
            int num = sc.nextInt(); // 키보드로 입력한 문자를 받아옴
            jud.judgement(num); // judgement 메소드로 num 전달
        } catch (Exception e) {
            System.out.println("숫자만 입력하세요");
        }
        sc.close();
    }
}