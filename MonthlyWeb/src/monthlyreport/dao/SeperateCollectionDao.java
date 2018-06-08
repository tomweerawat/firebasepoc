package monthlyreport.dao;

import java.util.ArrayList;
import java.util.List;

public class SeperateCollectionDao {
    private static final long serialVersionUID = 1L;
    private List<SeparateIncome> separateIncomes;

    public SeperateCollectionDao(){
        separateIncomes = null;
    }

    public List<SeparateIncome> getSeparateIncome() {
        return separateIncomes==null?new ArrayList<SeparateIncome>():separateIncomes;
    }

    public void setSeparateIncomes(List<SeparateIncome> separateIncomes) {
        this.separateIncomes = separateIncomes;
    }
}
