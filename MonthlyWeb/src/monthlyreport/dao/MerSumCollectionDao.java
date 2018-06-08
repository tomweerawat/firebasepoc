package monthlyreport.dao;

import java.util.ArrayList;
import java.util.List;

public class MerSumCollectionDao {
    private static final long serialVersionUID = 1L;
    private List<MerSumIncome> separateIncomes;

    public MerSumCollectionDao(){
        separateIncomes = null;
    }

    public List<MerSumIncome> getSumIncome() {
        return separateIncomes==null?new ArrayList<MerSumIncome>():separateIncomes;
    }

    public void setSumIncome(List<MerSumIncome> separateIncomes) {
        this.separateIncomes = separateIncomes;
    }
}
