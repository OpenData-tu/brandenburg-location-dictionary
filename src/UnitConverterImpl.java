import java.util.StringTokenizer;

/**
 * Created by rohullahayobi on 6/28/17.
 this class reduce the minutes and seconds into just degree such as: 51° 44' 46.84 N -> 51.746°
 */
public class UnitConverterImpl implements UnitConverter {
    @Override
    public double standardToFloatingPointCoordinates(String coordinate) {


        Coordinate coordinates = getTokenizedCoordinates(coordinate);

        return reducesToDegrees(coordinates.getDegrees(), coordinates.getMinutes(), coordinates.getSeconds());

    }

    private double reducesToDegrees(float degrees, float minutes, float seconds) {

        return degrees + minutes / 60 + seconds / 3600;
    }

    private Coordinate getTokenizedCoordinates(String coordinate) {

        StringTokenizer stringTokenizer = new StringTokenizer(coordinate, " °'\"");
        Coordinate coordinates = new Coordinate();
        coordinates.setDegrees(Float.parseFloat(stringTokenizer.nextToken()));
        coordinates.setMinutes(Float.parseFloat(stringTokenizer.nextToken()));
        coordinates.setSeconds(Float.parseFloat(stringTokenizer.nextToken()));


        return coordinates;
    }
}
