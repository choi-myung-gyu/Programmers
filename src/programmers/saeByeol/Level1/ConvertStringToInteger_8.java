package programmers.saeByeol.Level1;

/**
 * 문자열을 정수로 바꾸기
 * 문제 설명
 * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
 *
 * 제한 조건
 * s의 길이는 1 이상 5이하입니다.
 * s의 맨앞에는 부호(+, -)가 올 수 있습니다.
 * s는 부호와 숫자로만 이루어져있습니다.
 * s는 "0"으로 시작하지 않습니다.
 */
public class ConvertStringToInteger_8 {
    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        ConvertStringToInteger_8 convertStringToInteger8 = new ConvertStringToInteger_8();
        int solution = convertStringToInteger8.getStrToInt("-1234");
        System.out.println("solution = " + solution);
    }

    /**
     * 다른사람의 풀이
     * @param str
     * @return
     */
    public int getStrToInt(String str) {
        boolean plus = true;
        int value = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '-') {
                plus = false;
            } else {
                int num = ch - 48;
                value = num + value * 10;
            }
        }
        return plus ? value : -1 * value;
    }
}
