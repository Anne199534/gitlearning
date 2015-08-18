package com.example.listviewtest;

import java.util.ArrayList;
import java.util.List;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
import android.os.Bundle;
public class MainActivity extends Activity {
	private List<Subject>subjectList =new ArrayList<Subject>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initSubjects();//初始化课程数据
        SubjectAdapter adapter=new SubjectAdapter(MainActivity.this,
        R.layout.subject_item,subjectList);
        ListView listView=(ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        //注册点击事件
        new AdapterView.OnItemClickListener(){
        	public void onItemClick(AdapterView<?>parent,View view,int position,long id){
        		Subject subject=subjectList.get(position);
        		Toast.makeText(MainActivity.this,subject.getName(), Toast.LENGTH_SHORT).show();
        	}
        };
      }
   
   private void  initSubjects() {
	   Subject chinese=new Subject(R.drawable.chinese,"Chinese");
	   subjectList.add(chinese);
	   Subject chemistry=new Subject( R.drawable.chemistry,"Chemistry");
	   subjectList.add(chemistry);
	   Subject maths=new Subject(R.drawable.maths,"Maths");
	   subjectList.add(maths);
	   Subject  english=new Subject(R.drawable.english,"English");
	   subjectList.add(english);
	   Subject physics=new Subject( R.drawable.physics,"Physics");
        subjectList.add(physics);
	
}
}
