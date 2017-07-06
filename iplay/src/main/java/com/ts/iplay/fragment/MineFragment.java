package com.ts.iplay.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ts.iplay.R;
import com.ts.iplay.activities.SettingActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 我的Fragment
 */
public class MineFragment extends Fragment {

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_mine, container, false);
        ButterKnife.bind(this, view);
        initData();
        initView();
        setListener();
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    private void initData() {

    }

    //获取控件
    private void initView() {

    }

    private void setListener() {

    }

    @OnClick({R.id.rl_top, R.id.iv_setting, R.id.iv_icon_head_bg, R.id.signIn, R.id.tvLevel, R.id.ll_integral,
            R.id.rl_task, R.id.rl_msg, R.id.rl_collection, R.id.rl_article, R.id.rl_post,
            R.id.rl_browse, R.id.rl_card_collection})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_top:
                break;
            case R.id.iv_setting:
                Intent setting = new Intent(this.getActivity(), SettingActivity.class);
                startActivity(setting);
                break;
            case R.id.iv_icon_head_bg:
                break;
            case R.id.signIn:
                break;
            case R.id.tvLevel:
                break;
            case R.id.ll_integral:
                break;
            case R.id.rl_task:
                break;
            case R.id.rl_msg:
                break;
            case R.id.rl_collection:
                break;
            case R.id.rl_article:
                break;
            case R.id.rl_post:
                break;
            case R.id.rl_browse:
                break;
            case R.id.rl_card_collection:
                break;
        }
    }
}
