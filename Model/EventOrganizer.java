package TM.Model;

import java.util.ArrayList;

public class EventOrganizer {
    private int custId;
    private String custName, custEmail, custPhone, custAddres;

    public EventOrganizer() {
    }
    public EventOrganizer(int custId, String custName, String custEmail, String custAddres, String custPhone) {
        setCustId(custId);
        setCustName(custName);
        setCustEmail(custEmail);
        setCustAddres(custAddres);
        setCustPhone(custPhone);
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustAddres() {
        return custAddres;
    }
    public void setCustAddres(String custAddres) {
        this.custAddres = custAddres;
    }
    public static void PrintQuest(ArrayList<EventOrganizer> list_quests) {
       System.out.println("[[-------------<< Daftar Tamu >>-------------]]");
       for (EventOrganizer quest : list_quests) {
           System.out.println("- ID \t\t: " + quest.getCustId());
           System.out.println("- Nama \t\t: " + quest.getCustName());
           System.out.println("- Alamat \t: " + quest.getCustAddres());
           System.out.println("- Nomor HP \t: " + quest.getCustPhone());
           System.out.println("- Email \t: " + quest.getCustEmail());
           System.out.println("-------------------------------------------------");
       }
    }

}
