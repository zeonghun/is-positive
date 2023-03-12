package zeonghun;

/**
 * @brief 양수/음수/0 판별하는 메소드
 * 
 * @author jhkim
 * @date 230310
 */
public class Judgement {
    public void judgement(int num) {
        String result = num > 0 ? "Plus" : num < 0 ? "Minus" : "Zero"; // 삼항연산자를 통해 result값 결정
        System.out.println(result);
    }
}