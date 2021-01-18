public class UserSystem{
    private String name;
    private int number, year;
    public UserSystem(){
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
    public boolean equals(UserSystem other){
        return name.equals(other.getName()) && number==other.getNumber() && year==other.getYear();
    }
}
