package wxj.swipeablecardstack;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.wenchao.cardstack.CardStack;
import com.wenchao.cardstack.CardStack.CardEventListener;


public class MyActivity extends Activity implements CardEventListener {
    private CardStack mCardStack;
    private CardsDataAdapter mCardAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        mCardStack = (CardStack)findViewById(R.id.container);

        //
        mCardStack.setContentResource(R.layout.card_content);
        mCardStack.setStackMargin(20);
        mCardStack.setListener(this);

        //
        mCardAdapter = new CardsDataAdapter(getApplicationContext(),0);
        mCardAdapter.add("https://www.secureworldexpo.com/sites/secureworld/files/Anonymous%20Image%202%20-%20Labeled%20for%20Reuse.png");
        mCardAdapter.add("http://i.imgur.com/p0H6u9t.jpg");
        mCardAdapter.add("https://s-media-cache-ak0.pinimg.com/736x/47/40/3b/47403b35b3806152544eafa01e5c3851.jpg");
        mCardAdapter.add("http://www.lyfaces.com/wallpaper/nature/nature-desktop-wallpaper-portrait-orientation-big-desktop-wallpaper-wallpapers-free-download-nature-hd-size-bang-lebowski-buck.jpg");
        mCardAdapter.add("https://pbs.twimg.com/profile_images/547761488237039616/XIkqKmm4.png");
        mCardAdapter.add("http://i.kinja-img.com/gawker-media/image/upload/j4sqzptisqrct6hd4klt.jpg");
        mCardAdapter.add("http://www.lyfaces.com/wallpaper/nature/nature-desktop-wallpaper-portrait-orientation-big-desktop-wallpaper-wallpapers-free-download-nature-hd-size-bang-lebowski-buck.jpg");
        mCardAdapter.add("https://pbs.twimg.com/profile_images/547761488237039616/XIkqKmm4.png");
        mCardAdapter.add("https://www.secureworldexpo.com/sites/secureworld/files/Anonymous%20Image%202%20-%20Labeled%20for%20Reuse.png");
        mCardAdapter.add("http://i.imgur.com/p0H6u9t.jpg");
        mCardAdapter.add("https://s-media-cache-ak0.pinimg.com/736x/47/40/3b/47403b35b3806152544eafa01e5c3851.jpg");
        mCardAdapter.add("https://www.secureworldexpo.com/sites/secureworld/files/Anonymous%20Image%202%20-%20Labeled%20for%20Reuse.png");
        mCardAdapter.add("http://i.imgur.com/p0H6u9t.jpg");
        mCardAdapter.add("https://s-media-cache-ak0.pinimg.com/736x/47/40/3b/47403b35b3806152544eafa01e5c3851.jpg");
        mCardAdapter.add("http://www.lyfaces.com/wallpaper/nature/nature-desktop-wallpaper-portrait-orientation-big-desktop-wallpaper-wallpapers-free-download-nature-hd-size-bang-lebowski-buck.jpg");
        mCardAdapter.add("https://pbs.twimg.com/profile_images/547761488237039616/XIkqKmm4.png");
        mCardAdapter.add("http://i.kinja-img.com/gawker-media/image/upload/j4sqzptisqrct6hd4klt.jpg");
        mCardAdapter.add("http://www.lyfaces.com/wallpaper/nature/nature-desktop-wallpaper-portrait-orientation-big-desktop-wallpaper-wallpapers-free-download-nature-hd-size-bang-lebowski-buck.jpg");
        mCardAdapter.add("https://pbs.twimg.com/profile_images/547761488237039616/XIkqKmm4.png");
        mCardAdapter.add("https://www.secureworldexpo.com/sites/secureworld/files/Anonymous%20Image%202%20-%20Labeled%20for%20Reuse.png");
        mCardAdapter.add("http://i.imgur.com/p0H6u9t.jpg");
        mCardAdapter.add("https://s-media-cache-ak0.pinimg.com/736x/47/40/3b/47403b35b3806152544eafa01e5c3851.jpg");




        mCardStack.setAdapter(mCardAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override public boolean swipeEnd(int section, float distance) {
        Log.d("swipeevent" ,"swipe end");


        return (distance>300)? true : false;
    }

    @Override public boolean swipeStart(int section, float distance) {
        Log.d("swipeevent", "swipeStart");
        return true;
    }

    @Override public boolean swipeContinue(int section, float distanceX, float distanceY) {
        Log.d("swipeevent", "swipeContinue");
        return true;
    }

    @Override public void discarded(int mIndex, int direction) {

        switch (direction)
        {
            case 0:
                Toast.makeText(getBaseContext(), "Top left", Toast.LENGTH_SHORT).show();
                break;

            case 1:
                Toast.makeText(getBaseContext(), "Top right", Toast.LENGTH_SHORT).show();
                break;

            case 2:
                Toast.makeText(getBaseContext(), "Bottom left", Toast.LENGTH_SHORT).show();
                break;

            case 3:
                Toast.makeText(getBaseContext(), "Bottom right", Toast.LENGTH_SHORT).show();
                break;
        }

    }

    @Override public void topCardTapped() {
        Log.d("swipeevent", "topCardTapped");

    }
}
