package in.semicolonindia.kopykitabtsk;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    private Button btn_SixSize,btn_SevenSize,btn_EightSize,btn_NineSize,btn_addCart;
    AnimatorSet set;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_SixSize = (Button)findViewById(R.id.btn_SixSize);
        btn_SevenSize = (Button)findViewById(R.id.btn_SevenSize);
        btn_EightSize = (Button)findViewById(R.id.btn_EightSize);
        btn_NineSize = (Button)findViewById(R.id.btn_NineSize);
        btn_addCart = (Button)findViewById(R.id.btn_addCart);


        btn_SixSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                set=(AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this,R.animator.flip);
                set.setTarget(btn_addCart);
                set.start();
                btn_addCart.setText("Go to BAG");

            }
        });

        btn_SevenSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                set=(AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this,R.animator.flip);
                set.setTarget(btn_addCart);
                set.start();
                btn_addCart.setText("Go to BAG");

            }
        });
        btn_EightSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                set=(AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this,R.animator.flip);
                set.setTarget(btn_addCart);
                set.start();
                btn_addCart.setText("Go to BAG");

            }
        });
        btn_NineSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                set=(AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this,R.animator.flip);
                set.setTarget(btn_addCart);
                set.start();
                btn_addCart.setText("Go to BAG");

            }
        });

        btn_addCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                set=(AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this,R.animator.flip);
                set.setTarget(v
                );
                set.start();
                btn_addCart.setText("Go to BAG");
            }
        });


    }
}
