package com.example.android.fragmentapplication;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callingFragment1(View view) {
        TextView txt=(TextView)findViewById(R.id.targetTextView);
        Button Frag1=(Button)findViewById(R.id.callFragment1);
        Frag1.setText(Frag1.getText()+" (clicked)");
        Button Frag2=(Button)findViewById(R.id.callFragment2);
        Frag2.setText("Fragment 2");
        View view1=getLayoutInflater().inflate(R.layout.fragment1,null);
        TextView fragText=(TextView)view1.findViewById(R.id.sourceText);
        txt.setText(fragText.getText().toString());

    }

    public void callingFragment2(View view) {
        TextView txt=(TextView)findViewById(R.id.targetTextView);
        Button Frag2=(Button)findViewById(R.id.callFragment2);
        Button Frag1=(Button)findViewById(R.id.callFragment1);

        Frag2.setText(Frag2.getText()+" (clicked)");
        Frag1.setText("Fragment 1");
        View view1=getLayoutInflater().inflate(R.layout.fragment2,null);
        TextView fragText=(TextView)view1.findViewById(R.id.sourceText2);
        txt.setText(fragText.getText().toString());
    }
}
