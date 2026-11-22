package com.mrgames.larvaheroesfree.spritetext;

import android.R;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.mrgames.larvaheroesfree.Natives;
import com.mrgames.larvaheroesfree.gptouchplus.GpTouchActivity;
import java.io.UnsupportedEncodingException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class EchoEditText extends EditText {
    private static final String ENG_FORMAT_ID = "^[a-zA-Z0-9]+$";
    public static final int INPUT_MODE_EMAIL = 4;
    public static final int INPUT_MODE_ENG = 0;
    public static final int INPUT_MODE_KOR = 3;
    public static final int INPUT_MODE_MAX = 6;
    public static final int INPUT_MODE_NUMBER = 1;
    public static final int INPUT_MODE_PHONE = 5;
    public static final int INPUT_MODE_SPECIAL = 2;
    private static final String KOR_FORMAT_ID = "^[占쎌쥙�⒳펺�귣쇀占쎈쵐�뺝뜝�뚯뒠占쎌궍�앾옙�덉뇢占쎌쥙猷욑옙�낅꽞�얜�援뀐옙醫롫윪鴉딆늹�댐옙臾믪굲占쎌쥜��";
    private static final String MAIL_FORMAT_ID = "^(?:\\w+\\.?)*\\w+@(?:\\w+\\.)+\\w+$";
    private static final String NUM_FORMAT_ID = "^[0-9]+$";
    private static final String SPE_FORMAT_ID = "^[a-zA-Z0-9$]";
    private static final String TAG = "EchoEditText";
    private static InputMethodManager mInputManager;
    public static EchoEditText mSingleton;
    private static View mView;
    InputFilter filterKorEng;
    GpTouchActivity mActivity;
    private TextView.OnEditorActionListener mEditorActionListener;
    public String mFormat;
    private boolean mInputModeChangable;
    private boolean mInputPasswordMode;
    private int mMaxTextSize;
    private TextWatcher mTextWatcher;
    private int mVisible;

    public EchoEditText(GpTouchActivity gpTouchActivity) {
        super(gpTouchActivity);
        this.mInputModeChangable = true;
        this.mInputPasswordMode = false;
        this.mVisible = 4;
        this.mMaxTextSize = 10;
        this.mActivity = null;
        this.filterKorEng = new InputFilter() { // from class: com.mrgames.larvaheroesfree.spritetext.EchoEditText.2
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                if (Pattern.compile("^[a-zA-Z0-9ㄱ-ㅎ가-힣ㅏ-ㆌ]+$").matcher(charSequence).matches()) {
                    return null;
                }
                return "";
            }
        };
        this.mFormat = new String();
        this.mEditorActionListener = new TextView.OnEditorActionListener() { // from class: com.mrgames.larvaheroesfree.spritetext.EchoEditText.6
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6) {
                    return false;
                }
                Natives.nativeTextEnter(0, 0);
                return true;
            }
        };
        this.mTextWatcher = new TextWatcher() { // from class: com.mrgames.larvaheroesfree.spritetext.EchoEditText.7
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Natives.getTextEdit(editable.toString());
            }
        };
        this.mActivity = gpTouchActivity;
        mSingleton = this;
        setBackgroundColor(getResources().getColor(R.color.transparent));
        setOnEditorActionListener(this.mEditorActionListener);
        addTextChangedListener(this.mTextWatcher);
        setImeOptions(268435462);
        setVisibility(this.mVisible);
        mInputManager = (InputMethodManager) this.mActivity.getSystemService("input_method");
        mView = this.mActivity.getCurrentFocus();
        setMode(3);
        setMaxTextSize(8);
    }

    public void setText(final byte[] bArr) {
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.mrgames.larvaheroesfree.spritetext.EchoEditText.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String str = new String(bArr, "KSC5601");
                    int length = str.length();
                    EchoEditText.this.setText(str);
                    EchoEditText.this.setSelection(length);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void setMaxTextSize(int i) {
        this.mMaxTextSize = i;
        setFilters(new InputFilter[]{this.filterKorEng, new InputFilter.LengthFilter(this.mMaxTextSize)});
    }

    public void setPasswordMode(boolean z) {
        this.mInputPasswordMode = z;
        if (z) {
            setInputType(128);
            setTransformationMethod(new PasswordTransformationMethod());
        }
    }

    public void setFormat(String str) {
        this.mFormat = str;
    }

    public String getFormat() {
        return this.mFormat;
    }

    public void setChangable(boolean z) {
        this.mInputModeChangable = z;
    }

    public void setEnable(boolean z) {
        if (z) {
            showInputKeyboard();
        } else {
            hideInputKeyboard();
        }
    }

    public void setMode(final int i) {
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.mrgames.larvaheroesfree.spritetext.EchoEditText.3
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                if (i2 == 0) {
                    EchoEditText.this.setInputType(1);
                    EchoEditText.this.setPrivateImeOptions("defaultInputmode=english");
                    return;
                }
                if (i2 == 1) {
                    EchoEditText.this.setInputType(2);
                    return;
                }
                if (i2 == 2) {
                    EchoEditText.this.setInputType(1);
                    EchoEditText.this.setPrivateImeOptions("defaultInputmode=symbol=true");
                } else if (i2 == 3) {
                    EchoEditText.this.setInputType(1);
                    EchoEditText.this.setPrivateImeOptions("defaultInputmode=korea");
                } else if (i2 == 4) {
                    EchoEditText.this.setInputType(32);
                } else {
                    if (i2 != 5) {
                        return;
                    }
                    EchoEditText.this.setInputType(3);
                }
            }
        });
    }

    public void showInputKeyboard() {
        if (this.mVisible == 0) {
            return;
        }
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.mrgames.larvaheroesfree.spritetext.EchoEditText.4
            @Override // java.lang.Runnable
            public void run() {
                EchoEditText.this.mVisible = 0;
                View unused = EchoEditText.mView = EchoEditText.this.mActivity.getCurrentFocus();
                EchoEditText echoEditText = EchoEditText.this;
                echoEditText.setVisibility(echoEditText.mVisible);
                EchoEditText.mInputManager.showSoftInput(EchoEditText.mView, 0);
                EchoEditText.mSingleton.requestFocus();
            }
        });
    }

    public void hideInputKeyboard() {
        if (this.mVisible == 4) {
            return;
        }
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.mrgames.larvaheroesfree.spritetext.EchoEditText.5
            @Override // java.lang.Runnable
            public void run() {
                EchoEditText.this.mVisible = 4;
                EchoEditText echoEditText = EchoEditText.this;
                echoEditText.setVisibility(echoEditText.mVisible);
                EchoEditText.mInputManager.hideSoftInputFromWindow(EchoEditText.mView.getWindowToken(), 0);
                EchoEditText.this.requestFocus();
            }
        });
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i == 4) {
            Natives.nativeTextEnter(0, 0);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }
}
