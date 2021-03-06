package company.co.mediprac;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;


public class BaresultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setCaptureActivity(CustomScannerActivity.class);
        integrator.initiateScan();
    }

    protected void onResume(){
        super.onResume();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        Log.d("onActivityResult", "onActivityResult: .");
        if (resultCode == Activity.RESULT_OK) {
            IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
            String re = scanResult.getContents();

            String substr = re.substring(0, 10);

            //String message = re;
            Log.d("onActivityResult", "onActivityResult: ." + re);

            // 여기서 약 정보 리스트로 가게하기
            Intent barmedinfo  = new Intent(this, TextresultActivity.class);
            barmedinfo.putExtra("BAR_CODE_info", substr);
            startActivity(barmedinfo);
            finish();
        }else {
            finish();
        }
    }

}
