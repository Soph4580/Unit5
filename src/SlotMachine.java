public class SlotMachine {
    private int payoutcycle, payoutamount, timetillnextpay;
    
  
    public SlotMachine(){
        payoutcycle = 0;
        payoutamount = 0;
        timetillnextpay = 0;
    }
    
    public SlotMachine(int poc, int poa, int ttnp){
        payoutcycle = poc;
        payoutamount = poa;
        timetillnextpay = ttnp;
    }
   
    public int pull(){
        
        timetillnextpay--;
        if(timetillnextpay == 0){
            timetillnextpay = payoutcycle;
            return payoutamount;
        }
      
        else return 0;
    }
}
