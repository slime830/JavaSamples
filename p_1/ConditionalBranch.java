package p_1;

public class ConditionalBranch {
    public static void main(String[] args) {
        int intNum1 = 3;
        int intNum2 = 10;
        /*
         * 基本構成は
         * if(条件式1){
         * 条件式1に該当するときに行う処理
         * }else if(条件式2){
         * 条件式1には該当せず，条件式2に該当するときに行う処理
         * }else if(条件式3){
         * 条件式1,2には該当せず，条件式3に該当するときに行う処理
         * }
         * ………
         * }else if(条件式n){
         * 条件式1~n-1には該当せず，条件式nに該当するときに行う処理
         * }else{
         * 条件式1~nには該当しない時に行う処理
         * }
         * 
         * else if と else はそれぞれなくてもよい．
         * 例えばif とelseだけでもよいし，ifだけでもよい
         */

        if (intNum1 == 3) {// もしintNum1が3なら
            System.out.println("intnum1 is 3!!");
        } else if (intNum1 == 10) {// それ以外で（3以外で）intNum1が10なら
            System.out.println("intnum1 is 10!!");
        } else {
            System.out.println("intnum1 is not 3 and 10");
        }

        System.out.println("----------");

        if (intNum2 > 100) {// もしintNum2が100以上なら
            System.out.println("intnum2 is bigger than 100!!");
        } else {
            System.out.println("intnum2 is not bigger than 100 !!");
        }
    }
}
