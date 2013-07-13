package com.example.wu_mball;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Result extends Activity {

	String[] answers = { "응", "아니", "믿어봐", "기회가 좋지 않아", "그럴 것 같아", "의심스러워",
			"나중에 대답해줄게", "계속하는게 좋을 것 같아", "최고야", "아직 알 수 없어", "운이 좋다면?",
			"너무 이르지 않아?", "조사 좀 해봐", "준비된 것 같은데", "새로운 걸 시도해봐", "집중해야해",
			"의심할 필요 없어", "망할 것 같아", "좀 아닌데", "역시 너다워", "너가 너를 구속하고 있어", "즐겨",
			"받아 들여", "확실해", "마무리 해야지", "노력하면 돼", "좀 쉬어", "그만해", "잘 될 것 같아",
			"조급해 하지마", "다른 것도 좀 생각해봐", "너가 하고 싶은대로 해", "안정적인 길로 가는게 좋아",
			"기회는 많아" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		
		
		
		ImageButton btn;
		btn	= (ImageButton) findViewById(R.id.imageButton1);
		
		btn.setOnClickListener(new OnClickListener()
        {
            // 파라미터로 넘어오는 View는 현재 클릭된 View이다. 현재 클릭된 View는 button이다.
            public void onClick(View v)
            {
            	//클릭이벤트
            	EditText et;
        		et = (EditText)findViewById(R.id.Edit1);
        		et.setText("test!!");
                 
            }
        });
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result, menu);
		return true;
	}

}
