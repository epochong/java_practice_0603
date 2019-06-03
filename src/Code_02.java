import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/6/3 19:37
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_02 {
    public static String AddLongInteger(String addend, String augend) {
        BigDecimal A = new BigDecimal(addend);
        BigDecimal B = new BigDecimal(augend);
        return A.add(B).toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();

        System.out.println(AddLongInteger(a,b));
    }
}
