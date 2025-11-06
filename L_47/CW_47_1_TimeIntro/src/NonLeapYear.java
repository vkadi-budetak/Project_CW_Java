import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class NonLeapYear implements TemporalAdjuster {
    int nYear;

    //Конструктор
    public NonLeapYear(int nYear) {
        this.nYear = nYear;
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {
        int count = 0;
        while(count<nYear){
            temporal = temporal.plus(1, ChronoUnit.YEARS);
            if (!Year.isLeap(temporal.get(ChronoField.YEAR)))
                count++;
        }
        return temporal;
    }
}
