import java.util.Calendar;
import java.util.GregorianCalendar;
public class Message{
    private int senderMess;//num remitente
    private int recipientMess;//num destinatario
    private boolean statusMess;
    private String contentMess;
    private String sendingTime;
    public void messageNew(int recipientMess, String contentMess){
        this.recipientMess=recipientMess;
        this.contentMess=contentMess;
    }

    public int getSenderMess(){
        return senderMess;
    }

    public int getRecipientMess(){
        return recipientMess;
    }

    public boolean getstatusMess(){//agregar condicion para true
        boolean recipientMess=false;
        return recipientMess;
    }

    public String getContentMess(){
        return contentMess;
    }

    public String sendingTime(){
        Calendar calendario = new GregorianCalendar();
        int hr= calendario.get(Calendar.HOUR_OF_DAY);
        int min= calendario.get(Calendar.MINUTE);
        return hr+":"+min;
    }
}
