package in.co.thakur.deltaabstraction;

import android.util.Log;

public class Fan  extends Device{


    public Fan()
    {
        setDeviceName("FAN");
    }

    public void breakDevice()
    {
        Log.e(getDeviceName(),"BANG, CRASH!.....oops");

    }


}
