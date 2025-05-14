package inflearn.kimtaewon1.e_stackandqueue.d_postfix;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/05-04
 */
public class Main {

    private static int postfix(String input) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                Integer rt = stack.pop();
                Integer lt = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(lt + rt);
                        break;
                    case '-':
                        stack.push(lt - rt);
                        break;
                    case '*':
                        stack.push(lt * rt);
                        break;
                    case '/':
                        stack.push(lt / rt);
                        break;
                    default:
                        throw new IllegalArgumentException("can't process two numbers");
                }
            }
        }
        return stack.getFirst();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String input = sc.next();
        System.out.println(postfix(input));
    }

}
