package learn.java.day7.loop;

public class Loop_13 { // Java continue Statement with Inner Loop

    public static void main(String []args) {
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    continue;
                    }
                System.out.println(i+" "+j);
                }
        }
    }

}
