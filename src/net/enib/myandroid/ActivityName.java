package net.enib.myandroid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class ActivityName extends Activity{

	public static final int ACTIVITY_MAIN = 1;
	
	String nom;
	String prenom;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {         

       super.onCreate(savedInstanceState);    
       setContentView(R.layout.name_main);
       
       Bundle objetBunble  = this.getIntent().getExtras();
       
       if (objetBunble != null && objetBunble.containsKey("nom") && objetBunble.containsKey("prenom")) {
    	   
       		nom = this.getIntent().getStringExtra("nom");
            prenom = this.getIntent().getStringExtra("prenom");
       }else {
       	//Erreur
       	nom = "Error";
       	prenom = "Error";
       }
       
       TextView affiche = (TextView) findViewById(R.id.TextView01);
       affiche.setText("Bonjour " + prenom+" "+ nom +"!");
       
   }
	
}
