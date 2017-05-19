package org.gdgkobe.livedoorweatherprovider;

import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.ComplicationManager;
import android.support.wearable.complications.ComplicationProviderService;
import android.support.wearable.complications.ComplicationText;

/**
 * Created by katsuki-nakatani on 2017/05/15.
 */

public class ProviderService extends ComplicationProviderService {
    @Override
    public void onComplicationUpdate(final int complicationId, final int dataType, final ComplicationManager complicationManager) {
        ComplicationData complicationData = new ComplicationData.Builder(dataType)
                .setShortText(ComplicationText.plainText("test"))
                .build();

        complicationManager.updateComplicationData(complicationId,complicationData);
    }
}
