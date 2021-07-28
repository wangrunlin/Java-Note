package list;

import java.util.*;

public class Lottery {
    private static final int NUMBER= 6;
    private static final int MAX_NUMBER=40;
    private static final int BASE_PRISE=100;

    private static Set<Integer>getWinner(){
        Random random=new Random();
        Set<Integer>winner=new TreeSet<>();
        while (winner.size()<NUMBER){
            winner.add(random.nextInt(MAX_NUMBER+1));
        }
        return winner;
    }

    private static Set<Integer> getTicket(){
        Integer[]a = new  Integer[NUMBER];
        Set<Integer> ticket;
        try (Scanner in = new Scanner(System.in)){
            for (int i=1;i<=NUMBER;i++){
                System.out.printf("%d : ",i);
                a[i-1]=in.nextInt();
            }
            ticket=new TreeSet<>(Arrays.asList(a));
        }
        return ticket;
//        Collections
    }

    public static void main(String[] args) {
        Set<Integer> winner = getWinner();
        Set<Integer> ticket = getTicket();
        ticket.retainAll(winner);
        int count = ticket.size();
        int prise = 0;
        if (count>0){
            prise=(int)Math.pow(2,count-1);
        }
//        prise = count > 0 ? (int) Math.pow(2, count - 1) * BASE_PRISE : prise ;
        System.out.println(winner);
        System.out.println(ticket);
        System.out.println(prise);


    }
}
