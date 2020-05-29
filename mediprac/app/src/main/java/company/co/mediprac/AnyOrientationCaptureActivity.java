package company.co.mediprac;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.journeyapps.barcodescanner.CaptureActivity;

/**
 * This Activity is exactly the same as CaptureActivity, but has a different orientation
 * setting in AndroidManifest.xml.
 */

public class AnyOrientationCaptureActivity extends CaptureActivity {
    //바코드를 manifest에서 orientation을 세로로 만들기 위한 class
}
