package droolsy;

import java.util.ArrayList;
import java.util.List;

public class Results {
    private List diseases = new ArrayList<String>();

    public void addDisease(String tmp){
        diseases.add(tmp);
    }

    public List getDiseases() {
        return diseases;
    }

    public void setDiseases(List diseases) {
        this.diseases = diseases;
    }
}
