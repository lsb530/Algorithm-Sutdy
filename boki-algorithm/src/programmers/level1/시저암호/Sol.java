package programmers.level1.시저암호;

public class Sol {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        // A ~ Z => 26 cnt
        // a: 97 / z: 122
        // A: 65 / Z: 90
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            int nextCharNo = (int) c + n;
            if (c >= 'a' && c <= 'z') {
                if (nextCharNo > (int)'z') {
                    int i = nextCharNo - (int) 'z' + (int) 'a' - 1;
                    sb.append((char)i);
                }
                else {
                    sb.append((char)nextCharNo);
                }
            }
            else if (c >= 'A' && c <= 'Z') {
                if (nextCharNo > (int)'Z') {
                    int i = nextCharNo - (int) 'Z' + (int) 'A' - 1;
                    sb.append((char)i);
                }
                else {
                    sb.append((char)nextCharNo);
                }
            }
            else { // 공백인 경우
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String solution2(String s, int n) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            }
            else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
//        System.out.println(s.solution("AB", 1));
//        System.out.println(s.solution("z", 1));
//        System.out.println(s.solution("a B z", 4));

        System.out.println(s.solution2("AB", 1));
        System.out.println(s.solution2("z", 1));
        System.out.println(s.solution2("a B z", 4));
    }
}
