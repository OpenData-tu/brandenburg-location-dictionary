import java.util.HashMap;

/**
 * Created by rohullahayobi on 6/28/17.
 */
public class LocationDictionaryImpl implements LocationDictionary {

    private HashMap<String, Location> locationDictionary = new HashMap<>();


    @Override
    public void addToDictionary(String locationName, Location location) {

        locationDictionary.put(locationName, location);

    }

    @Override
    public void fillDictionary() {

        locationDictionary.put("Cottbus", new Location("51 ° 44 '46.84 \"N", "14 ° 20 '04.38 \"E"));
        locationDictionary.put("Blankenfelde-Mahlow", new Location("52 ° 20 '58.93 \"N", "13 ° 25 '27.50 \"E"));
        locationDictionary.put("Brandenburg a.d.Havel", new Location("52 ° 25 '13.59 \"N", "112 ° 33 '08.29 \"E"));
        locationDictionary.put("Eisenhüttenstadt", new Location("52 ° 08 '46.54 \"N", "14 ° 38 '17.40 \"E"));
        locationDictionary.put("Elsterwerda", new Location("51 ° 27 '45.84 \"N", "13 ° 31 '36.46 \"E"));
        locationDictionary.put("Frankfurt (Oder)", new Location("52 ° 20 '04.81 \"N", "52 ° 20 '04.81 \"N"));
        locationDictionary.put("Hasenholz (Buckow) +", new Location("52 ° 33 '49.80 \"N", "14 ° 00 '54.90 \"E"));
        locationDictionary.put("Lütte (Belzig) +", new Location("52 ° 11 '39.20 \"N", "12 ° 33 '41.00 \"E"));
        locationDictionary.put("Nauen", new Location("52 ° 36 '30.99 \"N", "12 ° 53 '06.70 \"E"));
        locationDictionary.put("Neuruppin", new Location("52 ° 55 '54.80 \"N", "12 ° 48 '34.13 \"E"));
        locationDictionary.put("Potsdam, Groß Glienicke", new Location("52 ° 29 '03.00 \"N", "13 ° 07 '25.31 \"E"));
        locationDictionary.put("Potsdam-Zentrum", new Location("52 ° 24 '04.86 \"N", "13 ° 03 '35.75 \"E"));
        locationDictionary.put("Schönefeld, Flughafen 1v", new Location("52 ° 22 '36.46 \"N", "13 ° 31 '57.46 \"E"));
        locationDictionary.put("Schwedt/Oder", new Location("53 ° 03 '51.34 \"N", "14 ° 17 '06.50 \"E"));
        locationDictionary.put("Spreewald +", new Location("51 ° 53 '50.92 \"N", "14 ° 03 '24.81 \"E"));
        locationDictionary.put("Spremberg", new Location("51 ° 33 '52.02 \"N", "14 ° 22 '35.17 \"E"));
        locationDictionary.put("Wittenberge", new Location("52 ° 59 '55.51 \"N", "11 ° 44 '18.45 \"E"));
        locationDictionary.put("Bernau, Lohmühlenstr. v", new Location("52 ° 40 '39.54 \"N", "13 ° 34 '56.16 \"E"));
        locationDictionary.put("Brandenburg, Neuendorfer Str. v", new Location("52 ° 24 '33.51 \"N", "12 ° 32 '54.15 \"E"));
        locationDictionary.put("Cottbus, Bahnhofstr. v", new Location("51 ° 45 '23.31 \"N", "14 ° 19 '40.79 \"E"));
        locationDictionary.put("Eberswalde, Breite Str. v", new Location("52 ° 49 '56.88 \"N", "13 ° 49 '19.96 \"E"));
        locationDictionary.put("Herzfelde, Hauptstraße v", new Location("52 ° 28 '54.76 \"N", "13 ° 50 '53.70 \"E"));
        locationDictionary.put("Lütte (Belzig) +", new Location("52° 11' 39,20\" N", "12° 33' 41,00\" E"));
        locationDictionary.put("Potsdam, Großbeerenstr. v", new Location("52° 23' 19,93\" N", "13° 05' 40,62\" E"));
        locationDictionary.put("Potsdam, Zeppelinstr. v", new Location("52° 23' 38,50\" N", "13° 02' 16,26\" E"));
        locationDictionary.put("Frankfurt (O), Leipziger Str. v", new Location("52° 20' 14,41\" N", "14° 32' 18,94\" E"));
        locationDictionary.put("Cottbus, W.-Külz-Str. v", new Location("51° 45' 14,88\" N", "14° 19' 31,89\" E"));
        locationDictionary.put("Premnitz, OT Döberitz", new Location("52° 31' 26,43\" N", "12° 22' 12,58\" E"));




    }

    @Override
    public Location getFromDictionary(String locationName) {
        return locationDictionary.get(locationName);
    }
}
