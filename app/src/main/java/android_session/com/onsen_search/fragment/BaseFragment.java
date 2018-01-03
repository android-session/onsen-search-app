package android_session.com.onsen_search.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import java.lang.ref.WeakReference;

import android_session.com.onsen_search.activity.MainActivity;
import android_session.com.onsen_search.activity.MainActivity.ScreenKind;

/**
 * Created by Kohei on 12/29/17.
 */

public abstract class BaseFragment extends Fragment {
    protected MainActivity.ScreenKind mReturnDestinationScreen = null;
    protected WeakReference<MainActivity> mMainActivity = null;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setupReturnDestinationScreen();
        setupTitleContainer();
    }

    protected abstract void setupReturnDestinationScreen();

    protected abstract void setupTitleContainer();

    final protected boolean transitionScreen(ScreenKind nextScreen) {
        boolean ret = false;
        if (mMainActivity != null) {
            ret = mMainActivity.get().transitionScreen(nextScreen);
        }
        return ret;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MainActivity) {
            mMainActivity = new WeakReference<MainActivity>((MainActivity) context);
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mMainActivity.clear();
        mMainActivity = null;
    }

    public boolean onBackPressed() {
        return transitionScreen(mReturnDestinationScreen);
    }



}
