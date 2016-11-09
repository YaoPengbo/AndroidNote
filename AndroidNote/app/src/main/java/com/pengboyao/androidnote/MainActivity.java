package com.pengboyao.androidnote;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.pengboyao.androidnote.CustomView.CheckView;
import com.pengboyao.androidnote.CustomView.PieView;

public class MainActivity extends AppCompatActivity {
    private PieView pieView;
    private CheckView checkView;
    private Button btn_check;
    private Button btn_unCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //PieView Test
//        PieViewTest();

        //CheckView Test
//        CheckViewTest();
    }

//    private void PieViewTest(){
//        pieView = (PieView)findViewById(R.id.checkView);
//        ArrayList<PieData> datas = new ArrayList<>();
//        PieData pieData = new PieData("sloop", 60);
//        PieData pieData2 = new PieData("sloop", 30);
//        PieData pieData3 = new PieData("sloop", 40);
//        PieData pieData4 = new PieData("sloop", 20);
//        PieData pieData5 = new PieData("sloop", 20);
//        datas.add(pieData);
//        datas.add(pieData2);
//        datas.add(pieData3);
//        datas.add(pieData4);
//        datas.add(pieData5);
//        pieView.setData(datas);
//
//        pieView.setStartAngle(0);
//    }

//    private void CheckViewTest(){
//        final boolean check = false;
//        checkView = (CheckView)findViewById(R.id.checkView);
//        btn_check = (Button)findViewById(R.id.btn_check);
//        btn_unCheck = (Button)findViewById(R.id.btn_unCheck);
//        btn_check.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                checkView.check();
//            }
//        });
//
//        btn_unCheck.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                checkView.unCheck();
//            }
//        });
//    }
}
