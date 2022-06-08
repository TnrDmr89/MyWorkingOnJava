
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@ManagedBean
@SessionScoped
public class PassWordBean {
    private Password ps;
    private List<Password> passList;



    @PostConstruct
    public void init() {
        ps = new Password();
        passList = new ArrayList<>();
    }

    public Password getPs() {
        return ps;
    }

    public void setPs(Password ps) {
        this.ps = ps;
    }

    public List<Password> getPassList() {
        return passList;
    }

    public void setPassList(List<Password> passList) {
        this.passList = passList;
    }

    public void addPassword(){


        if(control()) {
            passList.add(ps);

        }
        else
            ps = new Password();


    }

    public boolean control() {

        if (ps.getPassword().length() >= 8) {
            ps.setPassLen(ps.getPassword());
            return true;
        }
        else {
            ps.setPassLen(ps.getPassword());
            return false;
        }
    }






}
