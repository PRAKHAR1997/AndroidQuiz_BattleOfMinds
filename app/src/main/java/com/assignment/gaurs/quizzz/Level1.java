package com.assignment.gaurs.quizzz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;
public class Level1 extends Activity{

    List<Question> quesList;
    static int score=0;
    int qid=0;
    Question currentQ;
    TextView txtQuestion;
    TextView res;
    static TextView textView;
    RadioButton rda, rdb, rdc, rdd;
    Button butNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        DatabaseCreate db = new DatabaseCreate(this);
        quesList = db.getAllQuestions();
        currentQ = quesList.get(qid);
        final Intent intent1=new Intent(Level1.this,SongService.class);
        txtQuestion = (TextView) findViewById(R.id.textView2);
        textView = (TextView) findViewById(R.id.textView);
        rda = (RadioButton) findViewById(R.id.radioButton);
        rdb = (RadioButton) findViewById(R.id.radioButton2);
        rdc = (RadioButton) findViewById(R.id.radioButton3);
        rdd = (RadioButton) findViewById(R.id.radioButton4);
        butNext = (Button) findViewById(R.id.next);
        res = (TextView) findViewById(R.id.textView3);
        setQuestionView();
        String name = "Level 1";
        textView.setText(name);
        startService(intent1);
        res.setText("Your Score : "+score);
        butNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup grp = (RadioGroup) findViewById(R.id.radioGroup);
                RadioButton answer = (RadioButton) findViewById(grp.getCheckedRadioButtonId());
                try {
                    if (currentQ.getANSWER().equals(answer.getText())) {
                        score++;
                        res.setText("Your score : " + score);
                    }
                    if ((qid == 5) || (qid == 10)||(qid==15)||(qid==20)||(qid==25)||(qid==30)||(qid==35)) {
                        Toast.makeText(Level1.this, "Final Score For Last Level Was: " + score, Toast.LENGTH_SHORT).show();
                        if(qid==5){
                            textView.setText("LEVEL 2");
                        }else
                        if(qid==10){
                            textView.setText("LEVEL 3");
                        }else
                        if(qid==15){
                            textView.setText("LEVEL 4");
                        }else
                        if(qid==20){
                            textView.setText("LEVEL 5");
                        }else
                        if(qid==25){
                            textView.setText("LEVEL 6");
                        }else
                        if(qid==30){
                            textView.setText("LEVEL 7");
                        }else
                        if(qid==35){
                            textView.setText("LEVEL 8");
                        }
                        grp.clearCheck();
                    }

                    if (qid < 40) {
                        currentQ = quesList.get(qid);
                        setQuestionView();
                    }
                    else{
                        Bundle b=new Bundle();
                        b.putInt("score", score);
                        Intent i1=new Intent(Level1.this, MainScreen.class);
                        i1.putExtras(b);
                        stopService(intent1);
                        finish();
                        score=0;
                        startActivity(i1);
                    }
                } catch (Exception e) {
                    Toast.makeText(Level1.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        if(qid==40){
            qid=0;
        }
    }
    private void setQuestionView()
    {
        txtQuestion.setText(currentQ.getQUESTION());
        rda.setText(currentQ.getOPTA());
        rdb.setText(currentQ.getOPTB());
        rdc.setText(currentQ.getOPTC());
        rdd.setText(currentQ.getOPTD());
        qid++;
    }
}