package Pattern;


public class Homework_pattern {
    public static void main(String args[]){
        int tracker=10;
        for(int i =0 ; i<1;i++){
            String frist_pattern_string="";
            for(int j =0 ; j<tracker;j++){
                if(j<(tracker/2)){

                    frist_pattern_string+="_";
                }else{
                    frist_pattern_string+="*";
                }
            }
            System.out.println(frist_pattern_string);
        }
    }
}
