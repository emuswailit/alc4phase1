package ke.co.mobiticket.alc4phase1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ke.co.mobiticket.Learner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btn_about_alc=findViewById(R.id.button_about_alc);
        btn_about_alc.setOnClickListener(this);
        Button btn_my_profile=findViewById(R.id.button_my_profile);
btn_my_profile.setOnClickListener(this);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.button_about_alc:
                Intent intent=new Intent(this,AboutALCActivity.class);
                startActivity(intent);
                break;
            case R.id.button_my_profile:
              //  Learner learner=new Learner("Android","Kenya","emuswailit@gmail.com","0722217348","@Emuswailit");
               // Toast.makeText(this,learner.toString(),Toast.LENGTH_LONG).show();
                Intent intent1=new Intent(this,MyProfileActivity.class);
                startActivity(intent1);
                break;
                default:
                    break;
        }
    }

 /*   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

 /*   @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

}
