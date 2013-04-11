package net.enib.myandroid;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A dummy fragment representing a section of the app, but that simply
 * displays dummy text.
 */
public class Onglet extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    public static final String ARG_SECTION_NUMBER = "section_number";
    
    private boolean attachToRoot;
    private int layout;
    private ViewGroup container;
    
    public Onglet(){
    	this.attachToRoot = false;
    }

//    public Onglet(int layout, ViewGroup container, boolean attachToRoot) {
//    	this.attachToRoot = attachToRoot;
//    	this.layout = layout;
//    	this.container = container;
//    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
            Bundle savedInstanceState) {
        
        int number = getArguments().getInt(ARG_SECTION_NUMBER);
        final View rootView;
        switch (number){
        	case 2:
        		rootView = inflater.inflate(R.layout.tp2, container, false);
        		break;
        	case 3:
        		rootView = inflater.inflate(R.layout.tp3, container, false);
        		break;
        	default:
        		rootView = inflater.inflate(R.layout.tp1, container, false);
        		Button buttonOk = (Button) rootView.findViewById(R.id.button1);
        		buttonOk.setOnClickListener(new View.OnClickListener()
        		{

					@Override
					public void onClick(View v) {
						
						TextView affiche = (TextView) rootView.findViewById(R.id.textView2);
						EditText prenom = (EditText) rootView.findViewById(R.id.editText1);
						EditText nom = (EditText) rootView.findViewById(R.id.EditText01);
						affiche.setText("Bonjour " + prenom.getText().toString()+" "+ nom.getText().toString() +"!");
						
						
					}});
        		break;
        }
        
//        TextView dummyTextView = (TextView) rootView.findViewById(R.id.section_label);
//        dummyTextView.setText(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)));
        return rootView;
    }
}