package org.gdgkobe.livedoorweatherprovider.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by katsuki-nakatani on 2017/05/16.
 */

public class Result {
    public String publicTime;
    public String title;
    public Description description;
    public List<Forecast> forecasts = new ArrayList<>();
}
