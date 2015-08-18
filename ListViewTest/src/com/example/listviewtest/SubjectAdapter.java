package com.example.listviewtest;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SubjectAdapter extends ArrayAdapter<Subject> {
private int  resourceId;
public SubjectAdapter(Context context,int textViewResourceId,
		List<Subject> objects){
	super(context, textViewResourceId,objects);
	resourceId=textViewResourceId;
}

   public View getView(int position,View convertView,ViewGroup parent){
	   Subject subject=getItem(position);//获得当前项的Subject实例
	   View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
//	   View view;
//	 if(convertView=null {
//		   view=LayoutInflater.from(getContext()).inflate(resourceId, null);
//	   }else {
//		view=convertView;
//	}

		TextView subjectName = (TextView) view.findViewById(R.id.subject_name);
		ImageView subjectImage = (ImageView) view.findViewById(R.id.subject_image);
       subjectName.setText(subject.getName());
		subjectImage.setImageResource(subject.getimageId());
		return view;

   }
}