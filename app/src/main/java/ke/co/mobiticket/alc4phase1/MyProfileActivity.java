package ke.co.mobiticket.alc4phase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import ke.co.mobiticket.Learner;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        TextView tvProfile=findViewById(R.id.tvProfileDetails);
        ImageView imageViewProfilePicture=findViewById(R.id.imageViewProfilePicture);


        //Create a learner instance
        Learner learner=new Learner("Android","Kenya","emuswailit@gmail.com","+254722217348","Michael Omaria");

        tvProfile.setText(
                "Track: "+ learner.getTrack()+"\n\n"+
                "Country: "+ learner.getCountry()+"\n\n"+
                "Email: "+ learner.getEmail()+"\n\n"+
                "Phone number: "+ learner.getPhone_number()+"\n\n"+
                "Slack username: "+ learner.getSlack_username()+"\n\n"

                );
    }
}
