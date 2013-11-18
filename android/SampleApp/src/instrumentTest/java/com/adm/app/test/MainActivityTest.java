package com.adm.app.test;
import android.annotation.TargetApi;
import android.os.Build;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ActivityTestCase;

import com.adm.app.MainActivity;

/**
 * Created by lukas on 17.11.13.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mTestActivity;

    @TargetApi(Build.VERSION_CODES.FROYO)
    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mTestActivity = getActivity();

    }

    public void testPreconditions() {
        assertNotNull("mTestActivity is null", mTestActivity);
    }

    public void testCalc() {
        assertEquals(3+3,6);
    }

    public void testShow() {
        assertEquals(true,true);
    }

    public void testString() {
        assertSame("Hello", "Hello");
    }

    public void testSuccess() {
        assertEquals(true, true);
    }
}
