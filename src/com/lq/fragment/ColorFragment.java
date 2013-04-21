package com.lq.fragment;

import java.util.Random;

import com.lq.activity.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class ColorFragment extends Fragment {

	private int mColorRes = -1;

	public ColorFragment() {
		switch (new Random().nextInt(5)) {
		case 0:
			mColorRes = R.color.holo_blue_dark;
			break;
		case 1:
			mColorRes = R.color.holo_green_dark;
			break;
		case 2:
			mColorRes = R.color.holo_orange_dark;
			break;
		case 3:
			mColorRes = R.color.holo_purple;
			break;
		case 4:
			mColorRes = R.color.holo_red_dark;
			break;
		default:
			mColorRes = R.color.holo_red_light;
			break;
		}

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (savedInstanceState != null)
			mColorRes = savedInstanceState.getInt("mColorRes");
		int color = getResources().getColor(mColorRes);
		// construct the RelativeLayout
		RelativeLayout v = new RelativeLayout(getActivity());
		v.setBackgroundColor(color);
		return v;
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt("mColorRes", mColorRes);
	}

}
