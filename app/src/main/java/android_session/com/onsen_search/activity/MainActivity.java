package android_session.com.onsen_search.activity;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android_session.com.onsen_search.R;
import android_session.com.onsen_search.fragment.BaseFragment;

public class MainActivity extends FragmentActivity {
    private static final String KEY_FRAGMENT = "key_fragment";
    private BaseFragment mCurrentFragment;
    public enum ScreenKind{
        APP_TOP,
        ONSEN_SEARCH,
        SEARCH_RESULT,
        SEARCH_DETAIL
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCurrentFragment = (BaseFragment) getSupportFragmentManager().findFragmentByTag(KEY_FRAGMENT);
        if (mCurrentFragment == null){
            transitionScreen(ScreenKind.APP_TOP);
        }
    }

    public boolean transitionScreen(ScreenKind nextScreen){
        if (nextScreen == null){
            finish();
            return true;
        }
        switch (nextScreen){
            case APP_TOP:
                break;
            case ONSEN_SEARCH:
                break;
            case SEARCH_RESULT:
                break;
            case SEARCH_DETAIL:
                break;
            default:
                return false;
        }
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        transaction.replace(R.id.container, mCurrentFragment, KEY_FRAGMENT);
        transaction.commit();
        return true;
    }
}



