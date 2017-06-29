
/**
 * Created by rohullahayobi on 6/28/17.
 */
public class Main {


    public static void main(String[] args) {

       LocationDictionary locationDictionary = new LocationDictionaryImpl();

       UnitConverter unitConverter = new UnitConverterImpl();
        System.out.println(unitConverter.standardToFloatingPointCoordinates("51 ° 44 '46.84 \""));

      //  locationDictionary.fillDictionary();
    }
}
