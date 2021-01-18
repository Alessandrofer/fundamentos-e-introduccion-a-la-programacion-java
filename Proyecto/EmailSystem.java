public class EmailSystem{
    private UserSystem[] users;
    private Messaging messaging;
    private ContactBook contactBook;
    public EmailSystem(Messaging messaging, ContactBook contactBook){
        this.messaging=messaging;
        this.contactBook=contactBook;
        users= new UserSystem[5];
    }
    public boolean addContactSys(UserSystem us){
        boolean res=false;
        for(int i=0;i<users.length;i++){
            if(users[i]==null){
                users[i]=us;
                res=true;
                break;
            }
        }
        return res;
    }
    public void outboxMess(){//destinatario y mensaje
        this.messaging.outboxMess();
    }
    public void watchMessRecipientFriend(int numberFriend){
        this.messaging.watchMessRecipientFriend(numberFriend);
    }
    public void sendMessage(String mess, User usy){
       this.messaging.sendMessage(mess,usy);
    }
    public boolean addContact(User us){
        return this.contactBook.addContact(us);
    }
    public boolean deleteContact(int num){
        return this.contactBook.deleteContact(num);
    }
    public User searchContactFName(String name){
        return this.contactBook.searchContactFName(name);
    }
    public User searchContactFNumb(int numberS){
        return this.contactBook.searchContactFNumb(numberS);
    }
    public void showAllContacts(){
        this.contactBook.showAllContacts();
    }
}
