package paintlike.com.paintlike;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class SimpsonActivity extends Activity {


    private PaintView paintView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpson);
        Toast.makeText(this, "Simpsons", Toast.LENGTH_SHORT).show();
        paintView = (PaintView) findViewById(R.id.paintView);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        paintView.init(metrics);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.normal:
                paintView.normal();
                return true;
            case R.id.emboss:
                paintView.emboss();
                return true;
            case R.id.blur:
                paintView.blur();
                return true;
            case R.id.clear:
                paintView.clear();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void chooseColor(View view)
    {
        String color =  view.getTag().toString();

        if (color.equals("1"))
        {
            paintView.setColor(Color.BLUE);
        }
        else if(color.equals("2"))
        {
            paintView.setColor(Color.RED);
        }
        else if(color.equals("3"))
        {

        }
        else if(color.equals("3"))
        {

        }
        else if(color.equals("4"))
        {

        }
        else if(color.equals("5"))
        {

        }
        else
        {

        }
    }
}
