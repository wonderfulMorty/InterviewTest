public class MyLoop {
    public static void main(String[] args) {
        myTag:for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
              if(i==2&&j==1){
                  break myTag;
              }
            }
        }
    }
}
