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

public class AppTopFragment extends BaseFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setupReturnDestinationScreen() {
        mReturnDestinationScreen = null;
    }

    @Override
    protected void setupTitleContainer() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.app_top_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.onsen_search).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transitionScreen(MainActivity.ScreenKind.ONSEN_SEARCH);
            }
        });
    }
}
