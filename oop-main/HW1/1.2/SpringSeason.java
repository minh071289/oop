
public class SpringSeason {
    public static void main(String[] args){
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        boolean check = false;
        if(m==3 || m==6){
            if(d<=20 && d>0) {
                check = true;
            }
        }
        else if(m==4 && d>0 && d<=30){
            check = true;
        }
        else if(m==5 && d>0 && d<=31){
            check=true;
        } else {
            check = false;
        }
        System.out.println(check);
    }
}
