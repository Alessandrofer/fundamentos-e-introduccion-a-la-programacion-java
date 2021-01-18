public class User{
    private String name;
    private String[] inbox;
    private String mensaje;
    private int number, year;
    private int control;
    public User(){
        inbox=new String [5];
        number=0;
        year=0;
    }

    public void addUser(String name, int year, int number){
        this.name=name;
        this.year=year;
        this.number=number;
    }

    public String getName(){
        return name;
    }

    public int getNumber(){
        return number;
    }

    public int getYear(){
        return year;
    }

    public boolean equals(User other){
        return name.equals(other.getName()) && number==other.getNumber() && year==other.getYear();
    }

    public void receiveMessage(String mjs){
        mensaje=mjs;
        inbox[control]=mensaje;
        control++;
    }

    public void checkInbox(){
        System.out.println("Inbox");
        System.out.println("------------------");
        for(int i=0;i<inbox.length;i++){
            System.out.println("Message #: "+(i+1)+" Time to received: ");
            System.out.println(inbox[i]);
        }
    }
}
