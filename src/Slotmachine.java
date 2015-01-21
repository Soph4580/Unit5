
public class Slotmachine {
     int payoutcycle, payoutamount, paycount;
    
    public Slotmachine(int cycle,int amount,int pay){
        payoutcycle=cycle;
        payoutamount=amount;
        paycount=0;
    }

    public int play(){
        paycount=paycount+1;
        if(paycount==payoutcycle){
            paycount=0;
            return payoutamount;
        }
        else return 0;
    }
    
}
