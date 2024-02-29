public class Deal {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack","Queen","King","Ace"};
        int whole = suits.length * ranks.length;
        if(n*5 > whole)
            throw new RuntimeException("Too many players");

        String[] deck = new String[whole];
        for(int i=0; i<suits.length; ++i){
            for(int j=0; j<ranks.length; ++j){
                deck[i*ranks.length+j] = ranks[j] + " of " + suits[i];
            }
        }

        int[] cnt = new int[whole];
        for(int i=0; i<whole; ++i)
            cnt[i]=0;
        int r=0;
        for(int i=0; i<n*5; ++i){
            boolean check = false;
            while(!check) {
                r = 0 + (int) (Math.random() * (whole-1));
                if (cnt[r] == 1) {
                    check=false;
                } else {
                    check=true;
                }
            }
            cnt[r]=1;
            System.out.println(deck[r]);
            if((i+1)%5==0)
                System.out.println();
        }
    }
}
