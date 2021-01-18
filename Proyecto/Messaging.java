public class Messaging{
    private Message[] menssages;
    public Messaging(){
        menssages= new Message[50];
    }

    public boolean sendMenssage(Message mes){
        boolean res=false;
        for(int i=0;i<menssages.length;i++){
            if(menssages[i]==null){
                menssages[i]=mes;
                res=true;
                break;
            }
        }
        return res;
    }
    
    public void sendMessage(String mess, User usy){
        usy.receiveMessage(mess);
    }

    public void outboxMess(){
        System.out.println("OUTBOX MESSAGES");
        System.out.println("------------------");
        for(int i=0;i<menssages.length;i++){
            if(menssages[i]!=null){
                Message inf=menssages[i];
                inf.getRecipientMess();
                System.out.println("Message #: "+(i+1)+" Time to send: "+inf.sendingTime());
                System.out.println("For: "+inf.getRecipientMess());
                System.out.println("Message: "+inf.getContentMess());
                System.out.println("------------------");
            }
        }
    } 

    public void watchMessRecipientFriend(int numberFriend){
        Message res=null;
        System.out.println("Messages sent to: "+numberFriend);
        System.out.println("------------------");
        for(int i=0;i<menssages.length;i++){
            if(menssages[i]!=null){
                Message nu=menssages[i];
                if(nu.getRecipientMess()==numberFriend){
                    res=nu;
                    System.out.println("Message #: "+(i+1)+" Time to received: "+nu.sendingTime());
                    System.out.println("Message: "+nu.getContentMess());
                    System.out.println("------------------");
                }
            }
        }
    }
}

