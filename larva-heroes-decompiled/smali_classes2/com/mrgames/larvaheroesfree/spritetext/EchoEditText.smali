.class public Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;
.super Landroid/widget/EditText;
.source "EchoEditText.java"


# static fields
.field private static final ENG_FORMAT_ID:Ljava/lang/String; = "^[a-zA-Z0-9]+$"

.field public static final INPUT_MODE_EMAIL:I = 0x4

.field public static final INPUT_MODE_ENG:I = 0x0

.field public static final INPUT_MODE_KOR:I = 0x3

.field public static final INPUT_MODE_MAX:I = 0x6

.field public static final INPUT_MODE_NUMBER:I = 0x1

.field public static final INPUT_MODE_PHONE:I = 0x5

.field public static final INPUT_MODE_SPECIAL:I = 0x2

.field private static final KOR_FORMAT_ID:Ljava/lang/String; = "^[\u5360\uc38c\uc959\ufffd\u24b3\ud3ba\ufffd\uade3\uc1c0\u5360\uc388\ucd50\ufffd\ube9d\ub71d\ufffd\ub6af\ub4a0\u5360\uc38c\uad8d\ufffd\uc57e\uc619\ufffd\ub349\ub1e2\u5360\uc38c\uc959\u7337\uc691\uc619\ufffd\ub085\uaf5e\ufffd\uc59c\ufffd\u63f4\ub010\uc619\u91ab\ub86b\uc72a\u9d09\ub506\ub2b9\ufffd\ub310\uc619\u81fe\ubbea\uad72\u5360\uc38c\uc95c\ufffd\ufffd"

.field private static final MAIL_FORMAT_ID:Ljava/lang/String; = "^(?:\\w+\\.?)*\\w+@(?:\\w+\\.)+\\w+$"

.field private static final NUM_FORMAT_ID:Ljava/lang/String; = "^[0-9]+$"

.field private static final SPE_FORMAT_ID:Ljava/lang/String; = "^[a-zA-Z0-9$]"

.field private static final TAG:Ljava/lang/String; = "EchoEditText"

.field private static mInputManager:Landroid/view/inputmethod/InputMethodManager;

.field public static mSingleton:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

.field private static mView:Landroid/view/View;


# instance fields
.field filterKorEng:Landroid/text/InputFilter;

.field mActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

.field private mEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;

.field public mFormat:Ljava/lang/String;

.field private mInputModeChangable:Z

.field private mInputPasswordMode:Z

.field private mMaxTextSize:I

.field private mTextWatcher:Landroid/text/TextWatcher;

.field private mVisible:I


# direct methods
.method public constructor <init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;)V
    .locals 1

    .line 53
    invoke-direct {p0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    .line 40
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mInputModeChangable:Z

    const/4 v0, 0x0

    .line 41
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mInputPasswordMode:Z

    const/4 v0, 0x4

    .line 42
    iput v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mVisible:I

    const/16 v0, 0xa

    .line 43
    iput v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mMaxTextSize:I

    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    .line 87
    new-instance v0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$2;

    invoke-direct {v0, p0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$2;-><init>(Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;)V

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->filterKorEng:Landroid/text/InputFilter;

    .line 119
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0}, Ljava/lang/String;-><init>()V

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mFormat:Ljava/lang/String;

    .line 221
    new-instance v0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$6;

    invoke-direct {v0, p0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$6;-><init>(Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;)V

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;

    .line 233
    new-instance v0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$7;

    invoke-direct {v0, p0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$7;-><init>(Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;)V

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mTextWatcher:Landroid/text/TextWatcher;

    .line 54
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    .line 55
    sput-object p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mSingleton:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    .line 57
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x106000d

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setBackgroundColor(I)V

    .line 59
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;

    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 60
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mTextWatcher:Landroid/text/TextWatcher;

    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const p1, 0x10000006

    .line 61
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setImeOptions(I)V

    .line 62
    iget p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mVisible:I

    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setVisibility(I)V

    .line 64
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    const-string v0, "input_method"

    invoke-virtual {p1, v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    sput-object p1, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mInputManager:Landroid/view/inputmethod/InputMethodManager;

    .line 66
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getCurrentFocus()Landroid/view/View;

    move-result-object p1

    sput-object p1, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mView:Landroid/view/View;

    const/4 p1, 0x3

    .line 67
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setMode(I)V

    const/16 p1, 0x8

    .line 68
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setMaxTextSize(I)V

    return-void
.end method

.method static synthetic access$000(Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;)I
    .locals 0

    .line 28
    iget p0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mVisible:I

    return p0
.end method

.method static synthetic access$002(Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;I)I
    .locals 0

    .line 28
    iput p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mVisible:I

    return p1
.end method

.method static synthetic access$100()Landroid/view/View;
    .locals 1

    .line 28
    sget-object v0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mView:Landroid/view/View;

    return-object v0
.end method

.method static synthetic access$102(Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 28
    sput-object p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$200()Landroid/view/inputmethod/InputMethodManager;
    .locals 1

    .line 28
    sget-object v0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mInputManager:Landroid/view/inputmethod/InputMethodManager;

    return-object v0
.end method


# virtual methods
.method public getFormat()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mFormat:Ljava/lang/String;

    return-object v0
.end method

.method public hideInputKeyboard()V
    .locals 2

    .line 188
    iget v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mVisible:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    return-void

    .line 189
    :cond_0
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    new-instance v1, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$5;

    invoke-direct {v1, p0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$5;-><init>(Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;)V

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onKeyPreIme(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 214
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 215
    invoke-static {p1, p1}, Lcom/mrgames/larvaheroesfree/Natives;->nativeTextEnter(II)V

    const/4 p1, 0x1

    return p1

    .line 218
    :cond_0
    invoke-super {p0, p2}, Landroid/widget/EditText;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public setChangable(Z)V
    .locals 0

    .line 125
    iput-boolean p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mInputModeChangable:Z

    return-void
.end method

.method public setEnable(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 129
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->showInputKeyboard()V

    goto :goto_0

    .line 130
    :cond_0
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->hideInputKeyboard()V

    :goto_0
    return-void
.end method

.method public setFormat(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mFormat:Ljava/lang/String;

    return-void
.end method

.method public setMaxTextSize(I)V
    .locals 2

    .line 99
    iput p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mMaxTextSize:I

    const/4 p1, 0x2

    new-array p1, p1, [Landroid/text/InputFilter;

    const/4 v0, 0x0

    .line 101
    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->filterKorEng:Landroid/text/InputFilter;

    aput-object v1, p1, v0

    new-instance v0, Landroid/text/InputFilter$LengthFilter;

    iget v1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mMaxTextSize:I

    invoke-direct {v0, v1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v1, 0x1

    aput-object v0, p1, v1

    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setMode(I)V
    .locals 2

    .line 134
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    new-instance v1, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$3;

    invoke-direct {v1, p0, p1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$3;-><init>(Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;I)V

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setPasswordMode(Z)V
    .locals 0

    .line 105
    iput-boolean p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mInputPasswordMode:Z

    if-eqz p1, :cond_0

    const/16 p1, 0x80

    .line 107
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setInputType(I)V

    .line 108
    new-instance p1, Landroid/text/method/PasswordTransformationMethod;

    invoke-direct {p1}, Landroid/text/method/PasswordTransformationMethod;-><init>()V

    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    :cond_0
    return-void
.end method

.method public setText([B)V
    .locals 2

    .line 72
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    new-instance v1, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$1;

    invoke-direct {v1, p0, p1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$1;-><init>(Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;[B)V

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public showInputKeyboard()V
    .locals 2

    .line 174
    iget v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mVisible:I

    if-nez v0, :cond_0

    return-void

    .line 175
    :cond_0
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    new-instance v1, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$4;

    invoke-direct {v1, p0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$4;-><init>(Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;)V

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
