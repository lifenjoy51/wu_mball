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

	String[] answers = { "��", "�ƴ�", "�Ͼ��", "��ȸ�� ���� �ʾ�", "�׷� �� ����", "�ǽɽ�����",
			"���߿� ������ٰ�", "����ϴ°� ���� �� ����", "�ְ��", "���� �� �� ����", "���� ���ٸ�?",
			"�ʹ� �̸��� �ʾ�?", "���� �� �غ�", "�غ�� �� ������", "���ο� �� �õ��غ�", "�����ؾ���",
			"�ǽ��� �ʿ� ����", "���� �� ����", "�� �ƴѵ�", "���� �ʴٿ�", "�ʰ� �ʸ� �����ϰ� �־�", "���",
			"�޾� �鿩", "Ȯ����", "������ �ؾ���", "����ϸ� ��", "�� ����", "�׸���", "�� �� �� ����",
			"������ ������", "�ٸ� �͵� �� �����غ�", "�ʰ� �ϰ� ������� ��", "�������� ��� ���°� ����",
			"��ȸ�� ����" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		
		
		
		ImageButton btn;
		btn	= (ImageButton) findViewById(R.id.imageButton1);
		
		btn.setOnClickListener(new OnClickListener()
        {
            // �Ķ���ͷ� �Ѿ���� View�� ���� Ŭ���� View�̴�. ���� Ŭ���� View�� button�̴�.
            public void onClick(View v)
            {
            	//Ŭ���̺�Ʈ
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
