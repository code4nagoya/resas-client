package nagoya.code4.examples;

import nagoya.code4.resas.CityResult;
import nagoya.code4.resas.PopulationCompositionPerYearResult;

public class CityResultWithPopulation extends CityResult{
    private String population;
    
    public void setPopulation(PopulationCompositionPerYearResult pcpyr) {
        Integer i_sum = 0; // where 総人口 is stored
        Integer i_2015 = 7; // is the hard-coded index value for 2015
        PopulationCompositionPerYearResult x = pcpyr;
        this.population = x.getResult().getData().get(i_sum).getData().get(i_2015).getValue();
    }

    public String getPopulation() {
        return this.population;
    }
}
