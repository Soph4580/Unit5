public class RadioShow {

   
    public static void main(String[] args) {
        LinkedQueue phoneline = new LinkedQueue();
        
        //3 ppl call in
        phoneline.enqueue  (new Caller("Bob"));
        phoneline.enqueue  (new Caller("Cindy"));
        phoneline.enqueue  (new Caller("Joe"));
        
        //Take the next caller
        System.out.println("Take the next caller");
        System.out.println(phoneline.dequeue());
        
        //2 more ppl call in
        phoneline.enqueue  (new Caller("Mindy"));
        phoneline.enqueue  (new Caller("Alex"));
        
        //Take the next caller
        System.out.println("Take the next caller");
        System.out.println(phoneline.dequeue());
        System.out.println(phoneline.dequeue());
        System.out.println(phoneline.dequeue());
        
        //Who is next?
        System.out.println("Next caller will be: " + phoneline.peekFront());
        //How many callers left?
        System.out.println("Callers still waiting: " + phoneline.size());
    }
    
}
