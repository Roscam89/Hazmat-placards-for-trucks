package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    EditText etClassNumber;
    EditText etProductWeight;
    EditText etUnNr;
    ImageView ivPlacard;
    TextView tvPlacardUnNr;
    Button cbBulk;
    TextView tvCheck;
  //  ArrayList<Double> classNrs = new ArrayList<>();

   // int [] productWeights;
   // int [] unNrs;
   // double[] classNrs;
   // boolean isBulk;


     double htExplos=1.1;
     double htNonFlamgas=2.2;
     double htInhalhazgas=2.3;
     double htFlamgas=2.1;
     double htOxygas=2.2;
     double htFlammable=3;
     double htFlamsolid=4.1;
     double htSpontanCombust=4.2;
     double htDangerWhenWet=4.3;
     double htOxidizer=5.1;
     double htOrganPeroxide=5.2;
     double htPoison=6.1;
     double htRadioactive=7;
     double htCorrosive=8;
     double htMisc=10;




     public void getIt(View view){
         try {

             double cn = Double.parseDouble(etClassNumber.getText().toString());
             int pw = Integer.parseInt(etProductWeight.getText().toString());
             int un = Integer.parseInt(etUnNr.getText().toString());

             ArrayList<Double> classNrs = new ArrayList<>();
             ArrayList<Double> classNr = new ArrayList<>();
             ArrayList<Integer> productWeights= new ArrayList<>();
             ArrayList<Integer> unNrs= new ArrayList<>();


             classNrs.add(htExplos);
             classNrs.add(htNonFlamgas);
             classNrs.add(htFlamgas);
             classNrs.add(htInhalhazgas);



             if(classNrs.contains(cn)){
                 classNr.add(cn);

             }




             tvCheck.setText(String.valueOf(productWeights));





         }catch (Exception e){
             Toast.makeText(this,"oops",Toast.LENGTH_SHORT).show();
         }

    }





    public void btGetPlacard(View view) {
        try {
        double cn = Double.parseDouble(etClassNumber.getText().toString());
        int pw = Integer.parseInt(etProductWeight.getText().toString());
        int un = Integer.parseInt(etUnNr.getText().toString());
            tvPlacardUnNr.setAlpha(0);








          if (cn == htExplos&& pw >= 1) {
              ivPlacard.setBackgroundResource(R.drawable.explosive);

          } else if (cn == htNonFlamgas && pw > 1000) {
              ivPlacard.setBackgroundResource(R.drawable.nonflamgas);
              if(pw>4500){
                  ivPlacard.setBackgroundResource(R.drawable.bnonflamgas);
                  tvPlacardUnNr.setText(String.valueOf(un));
                  tvPlacardUnNr.setAlpha(1);
              }

          } else if (cn == htInhalhazgas&& pw >=1) {

              ivPlacard.setBackgroundResource(R.drawable.inhalhaz);
              if(pw>4500){
                  ivPlacard.setBackgroundResource(R.drawable.binhalhaz);
                  tvPlacardUnNr.setText(String.valueOf(un));
                  tvPlacardUnNr.setAlpha(1);
              }

          } else if (cn == htFlamgas && pw > 1000) {

              ivPlacard.setBackgroundResource(R.drawable.flamgas);
              if(pw>4500){
                  ivPlacard.setBackgroundResource(R.drawable.bflamgas);
                  tvPlacardUnNr.setText(String.valueOf(un));
                  tvPlacardUnNr.setAlpha(1);
              }

          } else if (cn == htOxygas && pw > 1000) {

              ivPlacard.setBackgroundResource(R.drawable.oxygengas);
              if(pw>4500){
                  ivPlacard.setBackgroundResource(R.drawable.boxygas);
                  tvPlacardUnNr.setText(String.valueOf(un));
                  tvPlacardUnNr.setAlpha(1);
              }

          } else if (cn == htFlammable && pw > 1000) {

              ivPlacard.setBackgroundResource(R.drawable.flammab);
              if(pw>4500){
                  ivPlacard.setBackgroundResource(R.drawable.bflamable);
                  tvPlacardUnNr.setText(String.valueOf(un));
                  tvPlacardUnNr.setAlpha(1);
              }

          } else if (cn == htFlamsolid && pw > 1000) {

              ivPlacard.setBackgroundResource(R.drawable.flamsolid);
              if(pw>4500){
                  ivPlacard.setBackgroundResource(R.drawable.bflamsolid);
                  tvPlacardUnNr.setText(String.valueOf(un));
                  tvPlacardUnNr.setAlpha(1);
              }

          } else if (cn == htSpontanCombust && pw > 1000) {

              ivPlacard.setBackgroundResource(R.drawable.spontancombust);
              if(pw>4500){
                  ivPlacard.setBackgroundResource(R.drawable.bspontancombust);
                  tvPlacardUnNr.setText(String.valueOf(un));
                  tvPlacardUnNr.setAlpha(1);
              }

          } else if (cn == htDangerWhenWet&& pw >=1) {

              ivPlacard.setBackgroundResource(R.drawable.dangerouswhenwet);
              if(pw>4500){
                  ivPlacard.setBackgroundResource(R.drawable.ndangwhenwet);
                  tvPlacardUnNr.setText(String.valueOf(un));
                  tvPlacardUnNr.setAlpha(1);
              }

          } else if (cn == htOxidizer && pw > 1000) {

              ivPlacard.setBackgroundResource(R.drawable.oxidizer);
              if(pw>4500){
                  ivPlacard.setBackgroundResource(R.drawable.boxidizer);
                  tvPlacardUnNr.setText(String.valueOf(un));
                  tvPlacardUnNr.setAlpha(1);
              }


              tvPlacardUnNr.setText(un);
          } else if (cn == htOrganPeroxide&& pw >=1) {

              ivPlacard.setBackgroundResource(R.drawable.orgperoxide);
              if(pw>4500){
                  ivPlacard.setBackgroundResource(R.drawable.borgperoxid);
                  tvPlacardUnNr.setText(String.valueOf(un));
                  tvPlacardUnNr.setAlpha(1);
              }


          } else if (cn == htPoison && pw > 1000) {

              ivPlacard.setBackgroundResource(R.drawable.poison);
              if(pw>4500){
                  ivPlacard.setBackgroundResource(R.drawable.bpoison);
                  tvPlacardUnNr.setText(String.valueOf(un));
                  tvPlacardUnNr.setAlpha(1);
              }


          } else if (cn == htRadioactive&& pw >=1) {

              ivPlacard.setBackgroundResource(R.drawable.radioactive);



          } else if (cn == htCorrosive && pw > 1000) {


              ivPlacard.setBackgroundResource(R.drawable.corosive);
              if(pw>4500){
                  ivPlacard.setBackgroundResource(R.drawable.bcorosive);
                  tvPlacardUnNr.setText(String.valueOf(un));
                  tvPlacardUnNr.setAlpha(1);
              }


          }  else if (cn == htMisc) {

              ivPlacard.setBackgroundResource(R.drawable.misc);
              if(pw>4500){
                  ivPlacard.setBackgroundResource(R.drawable.bmisc);
                  tvPlacardUnNr.setText(String.valueOf(un));
                  tvPlacardUnNr.setAlpha(1);
              }

          }

      }catch (Exception e){
          Toast.makeText(this,"Oops something went wrong",Toast.LENGTH_SHORT).show();

      }


    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etClassNumber= findViewById(R.id.etClassNumber);
        etProductWeight= findViewById(R.id.etProductWeight);
        etUnNr=findViewById(R.id.etUnNr);
        ivPlacard=findViewById(R.id.ivPlacard);
        tvPlacardUnNr=findViewById(R.id.tvPlacardUnNr);
        cbBulk=findViewById(R.id.cbBulk);
        tvCheck=findViewById(R.id.tvCheck);



        cbBulk.setOnClickListener(v -> {
            try {
                boolean checked = ((CheckBox) v).isChecked();
                double cn = Double.parseDouble(etClassNumber.getText().toString());
                int un = Integer.parseInt(etUnNr.getText().toString());

                if (checked && cn == htNonFlamgas) {
                    ivPlacard.setBackgroundResource(R.drawable.bnonflamgas);
                    tvPlacardUnNr.setAlpha(1);
                    tvPlacardUnNr.setText(String.valueOf(un));


                } else if (checked && cn == htInhalhazgas) {
                    ivPlacard.setBackgroundResource(R.drawable.binhalhaz);
                    tvPlacardUnNr.setAlpha(1);
                    tvPlacardUnNr.setText(String.valueOf(un));


                } else if (checked && cn == htFlamgas) {
                    ivPlacard.setBackgroundResource(R.drawable.bflamgas);
                    tvPlacardUnNr.setAlpha(1);
                    tvPlacardUnNr.setText(String.valueOf(un));
                } else if (checked && cn == htFlammable) {
                    ivPlacard.setBackgroundResource(R.drawable.bflamable);
                    tvPlacardUnNr.setAlpha(1);
                    tvPlacardUnNr.setText(String.valueOf(un));

                } else if (checked && cn == htCorrosive) {
                    ivPlacard.setBackgroundResource(R.drawable.bcorosive);
                    tvPlacardUnNr.setAlpha(1);
                    tvPlacardUnNr.setText(String.valueOf(un));

                } else if (checked && cn == htMisc) {
                    ivPlacard.setBackgroundResource(R.drawable.bmisc);
                    tvPlacardUnNr.setAlpha(1);
                    tvPlacardUnNr.setText(String.valueOf(un));
                } else {
                    tvPlacardUnNr.setAlpha(0);
                }
            }catch (Exception e){
                Toast.makeText(this,"Oops",Toast.LENGTH_SHORT).show();
            } });



}


}
