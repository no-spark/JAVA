public class ArrayTest{
    public static void main(String[]args){
        String[][]name={{"zhaoyi","qianr","sunsan"},{"lisi","zhouwu","wuliu"}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println(name[i][j]);
            }
        }
    }
}