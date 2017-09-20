package com.cnpeng.cnpeng_demos2017_01.b_23_RefreshFragmentInViewPager;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cnpeng.cnpeng_demos2017_01.R;
import com.cnpeng.cnpeng_demos2017_01.databinding.FragmentRefreshFmInVpBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：CnPeng
 * <p>
 * 时间：2017/9/20:上午11:49
 * <p>
 * 说明：嵌套在ViewPager 中的Fragment。ViewPager中多个页面布局一致时，可以只创建一个Fragment类
 */

public class Fragment_VpItem extends Fragment {
    public final static String       KEY_POSITION             = "position"; //被点击条目的位置
    public final static String       KEY_PAGE_INDEX           = "pageIndex";//页面索引
    public final static String       FLAG_BROADCAST_TO_UPDATE = "itemClickedToUpdateOtherPages";  //本地广播标志位
    private             List<String> items                    = new ArrayList<>();

    private FragmentRefreshFmInVpBinding binding;
    private int                          pagePosition;    //当前页面的索引
    private View                         fragmentView;
    private LvAdapter                    adapter;
    //    private LocalBroadcastManager        localBroadCastManager;
    //    private UpdateDataReceiver           receiver;


    public static Fragment newInstance(int position) {
        Bundle budle = new Bundle();
        budle.putInt(KEY_PAGE_INDEX, position);

        Fragment_VpItem fragment = new Fragment_VpItem();
        fragment.setArguments(budle);
        return fragment;
    }

    @Override
    public void onCreate(
            @Nullable
                    Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pagePosition = null != getArguments() ? getArguments().getInt(KEY_PAGE_INDEX) : 0;

        //        initLocalBroadCastReceiver();
    }

    //    private void initLocalBroadCastReceiver() {
    //        localBroadCastManager = LocalBroadcastManager.getInstance(getContext());
    //        IntentFilter intentFilter = new IntentFilter(FLAG_BROADCAST_TO_UPDATE);
    //
    //        receiver = new UpdateDataReceiver();
    //        localBroadCastManager.registerReceiver(receiver, intentFilter);
    //    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable
                                     ViewGroup container,
                             @Nullable
                                     Bundle savedInstanceState) {
        if (null == fragmentView) {        //OnCreateView会被多次调用所以判断是否为空
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_refresh_fm_in_vp, container, false);
            fragmentView = binding.getRoot();
            initView();
        }

        return fragmentView;
    }

    private void initView() {
        for (int i = 0; i < 20; i++) {
            items.add("第" + pagePosition + "页，第" + i + "条数据");
        }

        adapter = new LvAdapter(getActivity());
        binding.lvRefreshFmInVp.setAdapter(adapter);
        adapter.setData(items);
    }

    public void refreshData(int position, int curPageIndex) {
        if (curPageIndex != pagePosition) {
            items.set(position, "第" + (curPageIndex+1) + "页的第"+position+"条被点击了");
        } else {
            items.set(position,  "被点击了");
        }
        adapter.setData(items);
    }


    //    private class UpdateDataReceiver extends BroadcastReceiver {
    //        @Override
    //        public void onReceive(Context context, Intent intent) {
    //            int position = intent.getIntExtra(KEY_POSITION, 0);
    //            items.set(position, items.get(position) + "其他页面的该条被点击了");
    //
    //            adapter.setData(items);
    //        }
    //    }

    //    @Override
    //    public void onDestroy() {
    //        super.onDestroy();
    //        localBroadCastManager.unregisterReceiver(receiver);
    //    }
}
