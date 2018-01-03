package android_session.com.onsen_search.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android_session.com.onsen_search.R;
import android_session.com.onsen_search.activity.MainActivity;

/**
 * Created by Kohei on 1/3/18.
 */

public class OnsenSearchFragment extends BaseFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setupReturnDestinationScreen() {
        mReturnDestinationScreen = MainActivity.ScreenKind.APP_TOP;
    }

    @Override
    protected void setupTitleContainer() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.onsen_search_fragment, container, false);
    }
}
