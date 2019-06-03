import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/6/3 18:48
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int col = input.nextInt();
        int row =(int) Math.round(col / 2.0);
        String str = input.next();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == row - 1) {
                    System.out.print(str);
                } else
                if (i < col - 2) {
                    if (j == 0 || j == col - 1) {
                        System.out.print(str);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
