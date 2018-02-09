package com.lynn.bookxiaobai;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import android.widget.Toast;

import com.lynn.bookxiaobai.entity.BookBean;
import com.lynn.bookxiaobai.presenter.BookPresenter;
import com.lynn.bookxiaobai.ui.BookDetailActivity;
import com.lynn.bookxiaobai.ui.MainActivity;
import com.lynn.bookxiaobai.view.BookView;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.lynn.bookxiaobai", appContext.getPackageName());
    }



}
