package company.co.mediprac;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BasicinfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicinfo);

        String ITEM_NAME = getIntent().getStringExtra("item_name");
        String ENTP_NAME = getIntent().getStringExtra("entp_name");
        String ETC_OTC_CODE = getIntent().getStringExtra("etc_otc_code");
        String ITEM_PERMIT_DATE = getIntent().getStringExtra("item_permit_date");
        String ENTP_NO = getIntent().getStringExtra("ENTP_NO");
        String BAR_CODE = getIntent().getStringExtra("bar_code");
        String ITEM_SEQ = getIntent().getStringExtra("item_seq");
        String CHART = getIntent().getStringExtra("chart");
        String PACK_UNIT = getIntent().getStringExtra("PACK_UNIT");
        String PERMIT_KIND_NAME = getIntent().getStringExtra("PERMIT_KIND_NAME");
        String CANCEL_DATE = getIntent().getStringExtra("CANCEL_DATE");
        String MAKE_MATERIAL_FLAG = getIntent().getStringExtra("MAKE_MATERIAL_FLAG");
        String INDUTY_TYPE = getIntent().getStringExtra("INDUTY_TYPE");
        String CHANGE_DATE = getIntent().getStringExtra("CHANGE_DATE");
        String INGR_NAME = getIntent().getStringExtra("INGR_NAME");

        TextView textView5 = (TextView)findViewById(R.id.textView5);
        TextView textView7 = (TextView)findViewById(R.id.textView7);
        TextView textView9 = (TextView)findViewById(R.id.textView9);
        TextView textView11 = (TextView)findViewById(R.id.textView11);
        TextView textView13 = (TextView)findViewById(R.id.textView13);
        TextView textView15 = (TextView)findViewById(R.id.textView15);
        TextView textView17 = (TextView)findViewById(R.id.textView17);
        TextView textView19 = (TextView)findViewById(R.id.textView19);
        TextView textView21 = (TextView)findViewById(R.id.textView21);
        TextView textView23 = (TextView)findViewById(R.id.textView23);
        TextView textView25 = (TextView)findViewById(R.id.textView25);
        TextView textView27 = (TextView)findViewById(R.id.textView27);
        TextView textView29 = (TextView)findViewById(R.id.textView29);
        TextView textView31 = (TextView)findViewById(R.id.textView31);
        TextView textView33 = (TextView)findViewById(R.id.textView33);

        textView5.setText(ITEM_NAME);
        textView7.setText(ENTP_NAME);
        textView9.setText(ETC_OTC_CODE);
        textView11.setText(ITEM_PERMIT_DATE);
        textView13.setText(ENTP_NO);
        textView15.setText(BAR_CODE);
        textView17.setText(ITEM_SEQ);
        textView19.setText(CHART);
        textView21.setText(PACK_UNIT);
        textView23.setText(PERMIT_KIND_NAME);
        textView25.setText(CANCEL_DATE);
        textView27.setText(MAKE_MATERIAL_FLAG);
        textView29.setText(INDUTY_TYPE);
        textView31.setText(CHANGE_DATE);
        textView33.setText(INGR_NAME);
    }
}
