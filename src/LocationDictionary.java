import java.util.HashMap;
import java.util.Map;

/**
 * Created by rohullahayobi on 6/28/17.
 */
public interface LocationDictionary {

    void addToDictionary(String locationName, Location location);
    void fillDictionary();
    Location getFromDictionary(String locationName);

}
