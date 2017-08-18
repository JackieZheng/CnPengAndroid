package com.cnpeng.cnpeng_demos2017_01;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cnpeng.cnpeng_demos2017_01.A_16_ImageBrowserV2.ImageBrowserV2Activtiy;
import com.cnpeng.cnpeng_demos2017_01.a_01_WebView01.WebViewTestActivity01;
import com.cnpeng.cnpeng_demos2017_01.a_02_ViewStubTest.ViewStubTestActivitiy;
import com.cnpeng.cnpeng_demos2017_01.a_03_CreateViewWithoutXML.CreateViewWithoutXMLActivity;
import com.cnpeng.cnpeng_demos2017_01.a_04_ImageBrowser_V1.ImageBrowserActivityV1;
import com.cnpeng.cnpeng_demos2017_01.a_05_scrollBallWithFinger.ScrollBallActivity;
import com.cnpeng.cnpeng_demos2017_01.a_06_tablelayoutTest.TableLayoutTestActivity;
import com.cnpeng.cnpeng_demos2017_01.a_07_frameLayout_NoenLamp.NeonLampActivity;
import com.cnpeng.cnpeng_demos2017_01.a_08_relativeLayout_plumBlossom.PlumBlossomActivity;
import com.cnpeng.cnpeng_demos2017_01.a_09_gridLayout_caculater.CaculaterActivity;
import com.cnpeng.cnpeng_demos2017_01.a_10_textView_01.TextView01Activtiy;
import com.cnpeng.cnpeng_demos2017_01.a_11_9PatchTest.NinePatchActivity;
import com.cnpeng.cnpeng_demos2017_01.a_12_RadioButtonAndCheckBox.RadioButtonAndCheckBoxActivity;
import com.cnpeng.cnpeng_demos2017_01.a_13_ToogleButtonAndSwitch.TBAndSwitchActivity;
import com.cnpeng.cnpeng_demos2017_01.a_14_TextClockAndAnalogClock.TcAndAcActivity;
import com.cnpeng.cnpeng_demos2017_01.a_15_chronometer.ChronometerActivity;
import com.cnpeng.cnpeng_demos2017_01.a_17_imageButtonAndZoomButton.ImageButtonAndZoomButtonActivity;
import com.cnpeng.cnpeng_demos2017_01.a_18_QuickContactBadge.QuickContactBadgeActivity;
import com.cnpeng.cnpeng_demos2017_01.a_19_ListView01.ListView01Activity;
import com.cnpeng.cnpeng_demos2017_01.a_20_showLvWithArrayAdapter.ArrayAdapterActivity;
import com.cnpeng.cnpeng_demos2017_01.a_21_ListActivity.MyListActivity;
import com.cnpeng.cnpeng_demos2017_01.a_22_simpleAdapter.SimpleAdapterActivity;
import com.cnpeng.cnpeng_demos2017_01.a_23_autoCompleteTextView.AutoCompleteTextViewActivity;
import com.cnpeng.cnpeng_demos2017_01.a_24_gridView.GridViewActivity;
import com.cnpeng.cnpeng_demos2017_01.a_25_expandableListView.ExpandableListViewActivity;
import com.cnpeng.cnpeng_demos2017_01.a_26_spinner.SpinnerActivity;
import com.cnpeng.cnpeng_demos2017_01.a_27_AdapterViewFlipper.AdapterViewFlipperActivity;
import com.cnpeng.cnpeng_demos2017_01.a_28_stackView.StackViewActivity;
import com.cnpeng.cnpeng_demos2017_01.a_29_progressBar.ProgressBarActivity;
import com.cnpeng.cnpeng_demos2017_01.a_30_SeekBar.SeekBarActivtiy;
import com.cnpeng.cnpeng_demos2017_01.a_31_RatingBar.RatingBarActivity;
import com.cnpeng.cnpeng_demos2017_01.a_32_ViewSwitcher.ViewSwitcherActivity;
import com.cnpeng.cnpeng_demos2017_01.a_32_ViewSwitcher.ViewSwitcherActivity2;
import com.cnpeng.cnpeng_demos2017_01.a_33_ImageSwitcher.ImageSwitcherActivity;
import com.cnpeng.cnpeng_demos2017_01.a_34_textSwitcher.TextSwitcherActvity;
import com.cnpeng.cnpeng_demos2017_01.a_35_viewFlipper.ViewFlipperActviity;
import com.cnpeng.cnpeng_demos2017_01.a_36_Toast.ImageToastActivity;
import com.cnpeng.cnpeng_demos2017_01.a_37_calendarView.CalendarViewActivity;
import com.cnpeng.cnpeng_demos2017_01.a_38_DatePiackerAndTimePicker.DatePickerAndTimerPickerActivity;
import com.cnpeng.cnpeng_demos2017_01.a_39_DatePickerDialogAndTimerPickerDialg
        .DatePickerDialogAndTimerPickerDialogActvitiy;
import com.cnpeng.cnpeng_demos2017_01.a_40_NumberPicker.NumberPickerActivity;
import com.cnpeng.cnpeng_demos2017_01.a_41_SearchView.SearchViewActivtiy;
import com.cnpeng.cnpeng_demos2017_01.a_42_tabHost.TabHostActivity;
import com.cnpeng.cnpeng_demos2017_01.a_43_scrollView.ScrollViewActivity;
import com.cnpeng.cnpeng_demos2017_01.a_44_notification.NotificationActivity;
import com.cnpeng.cnpeng_demos2017_01.a_45_alertDialog.AlertDialogActivity;
import com.cnpeng.cnpeng_demos2017_01.b_01_spannableString_ImageSpan.SpannableStringAndImageSpanActivity;
import com.cnpeng.cnpeng_demos2017_01.b_02_DrawerLayoutAndImmersion.DrawerLayoutActivity;
import com.cnpeng.cnpeng_demos2017_01.b_04_suspendAndListView.SuspendAndListViewActivity;
import com.cnpeng.cnpeng_demos2017_01.b_04_suspendAndListView.SuspendAndListViewActivity2;
import com.cnpeng.cnpeng_demos2017_01.b_05_alertDialog_dismiss.DissmissAlertDialog;
import com.cnpeng.cnpeng_demos2017_01.b_06_ObjectAnimator.ObjectAnimatorAndListViewActivity;
import com.cnpeng.cnpeng_demos2017_01.b_07_bottomNavigationView.BottomNavigationViewActivity;
import com.cnpeng.cnpeng_demos2017_01.b_08_CL_TB_VP_RV.ClTbVpRvActivity;
import com.cnpeng.cnpeng_demos2017_01.b_09_TextureView.TextureViewActivity;
import com.cnpeng.cnpeng_demos2017_01.b_10_AndroidDrawables.CustomDrawableActivity;
import com.cnpeng.cnpeng_demos2017_01.b_10_AndroidDrawables.TransitionDrawableActivity;
import com.cnpeng.cnpeng_demos2017_01.b_11_AddAppToSysShare.AddAppToSysShareActivity;
import com.cnpeng.cnpeng_demos2017_01.b_12_customCalendar.CustomCalendarActivity;
import com.cnpeng.cnpeng_demos2017_01.b_13_customUserAgent.CustomUserAgentActivity;
import com.cnpeng.cnpeng_demos2017_01.b_14_screenShotInApp.ScreenShotActivity;
import com.cnpeng.cnpeng_demos2017_01.b_15_cornerAlertDialog.CornerAlertDialogActivity;
import com.cnpeng.cnpeng_demos2017_01.b_16_customDialog.CustomDialogActivity;
import com.cnpeng.cnpeng_demos2017_01.b_17_shake.ShakeActivity;
import com.cnpeng.cnpeng_demos2017_01.b_18_customSwitchButton.CustomSwitchButtonActivity;
import com.cnpeng.cnpeng_demos2017_01.b_19_vectorTest.VectorDrawableActivity;
import com.cnpeng.cnpeng_demos2017_01.b_20_shortCut.ShortCutActivity;
import com.cnpeng.cnpeng_demos2017_01.c_01_customView.CustomViewActivity;
import com.cnpeng.cnpeng_demos2017_01.databinding.ActivityMainBinding;
import com.cnpeng.cnpeng_demos2017_01.utils.CommonUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.btTempActivity.setOnClickListener(this);
        binding.btWebviewTest01.setOnClickListener(this);
        binding.btViewStub02.setOnClickListener(this);
        binding.btWithoutXML.setOnClickListener(this);
        binding.btImageBrowserV1.setOnClickListener(this);
        binding.btScrollBall.setOnClickListener(this);
        binding.btTableLayout.setOnClickListener(this);
        binding.btNeonLamp.setOnClickListener(this);
        binding.btPlumBlossom.setOnClickListener(this);
        binding.btCaculater.setOnClickListener(this);
        binding.btTextView01.setOnClickListener(this);
        binding.bt9Patch.setOnClickListener(this);
        binding.btRBAndCB.setOnClickListener(this);
        binding.btTbAndSwitch.setOnClickListener(this);
        binding.btTcAndAc.setOnClickListener(this);
        binding.btChronometer.setOnClickListener(this);
        binding.btImageBrowserV2.setOnClickListener(this);
        binding.btImageButtonAndZoomButton.setOnClickListener(this);
        binding.btQucikContactBadge.setOnClickListener(this);
        binding.btListView01.setOnClickListener(this);
        binding.btArrayAdapter01.setOnClickListener(this);
        binding.btListActivity.setOnClickListener(this);
        binding.btSimpleAdapterActivity.setOnClickListener(this);
        binding.btAutoCompleteTextView.setOnClickListener(this);
        binding.btGridView.setOnClickListener(this);
        binding.btExpandableListView.setOnClickListener(this);
        binding.btSpinner.setOnClickListener(this);
        binding.btAdapterViewFlipperActivity.setOnClickListener(this);
        binding.btStackView.setOnClickListener(this);
        binding.btProgressBar.setOnClickListener(this);
        binding.btProgressBar2.setOnClickListener(this);
        binding.btRatingBar.setOnClickListener(this);
        binding.btViewSwitcher.setOnClickListener(this);
        binding.btViewSwitcher2.setOnClickListener(this);
        binding.btImageSwitcher.setOnClickListener(this);
        binding.btImageSpanAndSpannableString.setOnClickListener(this);
        binding.btTextSwitcher.setOnClickListener(this);
        binding.btViewFlipper.setOnClickListener(this);
        binding.btImageToast.setOnClickListener(this);
        binding.btCalendarView.setOnClickListener(this);
        binding.btCalendarPicker.setOnClickListener(this);
        binding.btDatePickerDialog.setOnClickListener(this);
        binding.btNumberPicker.setOnClickListener(this);
        binding.btSearchView.setOnClickListener(this);
        binding.btDrawerLayout.setOnClickListener(this);
        binding.btTabhost.setOnClickListener(this);
        binding.btScrollview.setOnClickListener(this);
        binding.btNotification.setOnClickListener(this);
        binding.btSuspendAndLv.setOnClickListener(this);
        binding.btAlertDialog.setOnClickListener(this);
        binding.btSuspendAndLv2.setOnClickListener(this);
        binding.btDismissAlertDialog.setOnClickListener(this);
        binding.btObjectAnimator.setOnClickListener(this);
        binding.btBottomNavigationView.setOnClickListener(this);
        binding.btClTbVpRV.setOnClickListener(this);
        binding.btTextureView.setOnClickListener(this);
        binding.btTransitionDrawable.setOnClickListener(this);
        binding.btTransitionDrawable2.setOnClickListener(this);
        binding.btAddAppToSysShare.setOnClickListener(this);
        binding.btCustomCalendar.setOnClickListener(this);
        binding.btCustomUserAgent.setOnClickListener(this);
        binding.btScreenShotInAPP.setOnClickListener(this);
        binding.btCornerAlertDialog.setOnClickListener(this);
        binding.btCustomDialog.setOnClickListener(this);
        binding.btShake.setOnClickListener(this);
        binding.btCustomSwitchButton.setOnClickListener(this);
        binding.btVector.setOnClickListener(this);
        binding.btShortCut.setOnClickListener(this);

        binding.btCustomView.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_tempActivity:
                CommonUtils.mStartActivity(this, TempActivity.class);
                break;
            case R.id.bt_webview_Test01:
                CommonUtils.mStartActivity(this, WebViewTestActivity01.class);
                break;
            case R.id.bt_viewStub_02:
                CommonUtils.mStartActivity(this, ViewStubTestActivitiy.class);
                break;
            case R.id.bt_withoutXML:
                CommonUtils.mStartActivity(this, CreateViewWithoutXMLActivity.class);
                break;
            case R.id.bt_ImageBrowserV1:
                CommonUtils.mStartActivity(this, ImageBrowserActivityV1.class);
                break;
            case R.id.bt_ScrollBall:
                CommonUtils.mStartActivity(this, ScrollBallActivity.class);
                break;
            case R.id.bt_TableLayout:
                CommonUtils.mStartActivity(this, TableLayoutTestActivity.class);
                break;
            case R.id.bt_neonLamp:
                CommonUtils.mStartActivity(this, NeonLampActivity.class);
                break;
            case R.id.bt_plumBlossom:
                CommonUtils.mStartActivity(this, PlumBlossomActivity.class);
                break;
            case R.id.bt_caculater:
                CommonUtils.mStartActivity(this, CaculaterActivity.class);
                break;
            case R.id.bt_textView01:
                CommonUtils.mStartActivity(this, TextView01Activtiy.class);
                break;
            case R.id.bt_9Patch:
                CommonUtils.mStartActivity(this, NinePatchActivity.class);
                break;
            case R.id.bt_RBAndCB:
                CommonUtils.mStartActivity(this, RadioButtonAndCheckBoxActivity.class);
                break;
            case R.id.bt_TbAndSwitch:
                CommonUtils.mStartActivity(this, TBAndSwitchActivity.class);
                break;
            case R.id.bt_TcAndAc:
                CommonUtils.mStartActivity(this, TcAndAcActivity.class);
                break;
            case R.id.bt_chronometer:
                CommonUtils.mStartActivity(this, ChronometerActivity.class);
                break;
            case R.id.bt_ImageBrowserV2:
                CommonUtils.mStartActivity(this, ImageBrowserV2Activtiy.class);
                break;
            case R.id.bt_ImageButtonAndZoomButton:
                CommonUtils.mStartActivity(this, ImageButtonAndZoomButtonActivity.class);
                break;
            case R.id.bt_QucikContactBadge:
                CommonUtils.mStartActivity(this, QuickContactBadgeActivity.class);
                break;
            case R.id.bt_ListView01:
                CommonUtils.mStartActivity(this, ListView01Activity.class);
                break;
            case R.id.bt_ArrayAdapter01:
                CommonUtils.mStartActivity(this, ArrayAdapterActivity.class);
                break;
            case R.id.bt_ListActivity:
                CommonUtils.mStartActivity(this, MyListActivity.class);
                break;
            case R.id.bt_simpleAdapterActivity:
                CommonUtils.mStartActivity(this, SimpleAdapterActivity.class);
                break;
            case R.id.bt_autoCompleteTextView:
                CommonUtils.mStartActivity(this, AutoCompleteTextViewActivity.class);
                break;
            case R.id.bt_GridView:
                CommonUtils.mStartActivity(this, GridViewActivity.class);
                break;
            case R.id.bt_ExpandableListView:
                CommonUtils.mStartActivity(this, ExpandableListViewActivity.class);
                break;
            case R.id.bt_Spinner:
                CommonUtils.mStartActivity(this, SpinnerActivity.class);
                break;
            case R.id.bt_AdapterViewFlipperActivity:
                CommonUtils.mStartActivity(this, AdapterViewFlipperActivity.class);
                break;
            case R.id.bt_StackView:
                CommonUtils.mStartActivity(this, StackViewActivity.class);
                break;
            case R.id.bt_progressBar:
                CommonUtils.mStartActivity(this, ProgressBarActivity.class);
                break;
            case R.id.bt_progressBar2:
                CommonUtils.mStartActivity(this, SeekBarActivtiy.class);
                break;
            case R.id.bt_RatingBar:
                CommonUtils.mStartActivity(this, RatingBarActivity.class);
                break;
            case R.id.bt_ViewSwitcher:
                CommonUtils.mStartActivity(this, ViewSwitcherActivity.class);
                break;
            case R.id.bt_ViewSwitcher2:
                CommonUtils.mStartActivity(this, ViewSwitcherActivity2.class);
                break;
            case R.id.bt_ImageSwitcher:
                CommonUtils.mStartActivity(this, ImageSwitcherActivity.class);
                break;
            case R.id.bt_ImageSpanAndSpannableString:
                CommonUtils.mStartActivity(this, SpannableStringAndImageSpanActivity.class);
                break;
            case R.id.bt_TextSwitcher:
                CommonUtils.mStartActivity(this, TextSwitcherActvity.class);
                break;
            case R.id.bt_ViewFlipper:
                CommonUtils.mStartActivity(this, ViewFlipperActviity.class);
                break;
            case R.id.bt_imageToast:
                CommonUtils.mStartActivity(this, ImageToastActivity.class);
                break;
            case R.id.bt_calendarView:
                CommonUtils.mStartActivity(this, CalendarViewActivity.class);
                break;
            case R.id.bt_calendarPicker:
                CommonUtils.mStartActivity(this, DatePickerAndTimerPickerActivity.class);
                break;
            case R.id.bt_datePickerDialog:
                CommonUtils.mStartActivity(this, DatePickerDialogAndTimerPickerDialogActvitiy.class);
                break;
            case R.id.bt_NumberPicker:
                CommonUtils.mStartActivity(this, NumberPickerActivity.class);
                break;
            case R.id.bt_SearchView:
                CommonUtils.mStartActivity(this, SearchViewActivtiy.class);
                break;
            case R.id.bt_drawerLayout:
                CommonUtils.mStartActivity(this, DrawerLayoutActivity.class);
                break;
            case R.id.bt_tabhost:
                CommonUtils.mStartActivity(this, TabHostActivity.class);
                break;
            case R.id.bt_scrollview:
                CommonUtils.mStartActivity(this, ScrollViewActivity.class);
                break;
            case R.id.bt_notification:
                CommonUtils.mStartActivity(this, NotificationActivity.class);
                break;
            case R.id.bt_suspendAndLv:
                CommonUtils.mStartActivity(this, SuspendAndListViewActivity.class);
                break;
            case R.id.bt_alertDialog:
                CommonUtils.mStartActivity(this, AlertDialogActivity.class);
                break;
            case R.id.bt_suspendAndLv2:
                CommonUtils.mStartActivity(this, SuspendAndListViewActivity2.class);
                break;
            case R.id.bt_dismissAlertDialog:
                CommonUtils.mStartActivity(this, DissmissAlertDialog.class);
                break;
            case R.id.bt_objectAnimator:
                CommonUtils.mStartActivity(this, ObjectAnimatorAndListViewActivity.class);
                break;
            case R.id.bt_bottomNavigationView:
                CommonUtils.mStartActivity(this, BottomNavigationViewActivity.class);
                break;
            case R.id.bt_ClTbVpRV:
                CommonUtils.mStartActivity(this, ClTbVpRvActivity.class);
                break;
            case R.id.bt_textureView:
                CommonUtils.mStartActivity(this, TextureViewActivity.class);
                break;
            case R.id.bt_TransitionDrawable:
                CommonUtils.mStartActivity(this, TransitionDrawableActivity.class);
                break;
            case R.id.bt_TransitionDrawable2:
                CommonUtils.mStartActivity(this, CustomDrawableActivity.class);
                break;
            case R.id.bt_AddAppToSysShare:
                CommonUtils.mStartActivity(this, AddAppToSysShareActivity.class);
                break;
            case R.id.bt_CustomCalendar:
                CommonUtils.mStartActivity(this, CustomCalendarActivity.class);
                break;
            case R.id.bt_CustomUserAgent:
                CommonUtils.mStartActivity(this, CustomUserAgentActivity.class);
                break;
            case R.id.bt_ScreenShotInAPP:
                CommonUtils.mStartActivity(this, ScreenShotActivity.class);
                break;
            case R.id.bt_cornerAlertDialog:
                CommonUtils.mStartActivity(this, CornerAlertDialogActivity.class);
                break;
            case R.id.bt_customDialog:
                CommonUtils.mStartActivity(this, CustomDialogActivity.class);
                break;
            case R.id.bt_CustomView:
                CommonUtils.mStartActivity(this, CustomViewActivity.class);
                break;
            case R.id.bt_customSwitchButton:
                CommonUtils.mStartActivity(this, CustomSwitchButtonActivity.class);
                break;

            case R.id.bt_shake:
                CommonUtils.mStartActivity(this, ShakeActivity.class);
                break;
            case R.id.bt_vector:
                CommonUtils.mStartActivity(this, VectorDrawableActivity.class);
                break;
            case R.id.bt_shortCut:
                CommonUtils.mStartActivity(this, ShortCutActivity.class);
                break;

            default:
                break;
        }
    }
}
