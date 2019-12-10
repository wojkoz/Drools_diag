package droolsy;

import java.util.ArrayList;
import java.util.List;

public class Results {
    private List diseases = new ArrayList<String>();

    private List tests = new ArrayList<String>();
    public List getTests() {
        return tests;
    }

    public void setTests(List tests) {
        this.tests = tests;
    }



    public void addDisease(String tmp){
        diseases.add(tmp);
    }

    public void addTest(String tmp){tests.add(tmp);}

    public List getDiseases() {
        return diseases;
    }

    public void setDiseases(List diseases) {
        this.diseases = diseases;
    }
}
