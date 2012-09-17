.class public Lcom/whatsapp/EditGroupSubject;
.super Lcom/whatsapp/DialogToastActivity;
.source "EditGroupSubject.java"


# static fields
.field static B:Landroid/os/Handler;

.field private static final J:[Ljava/lang/String;

.field static s:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/whatsapp/xr;",
            ">;"
        }
    .end annotation
.end field

.field static t:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Lcom/whatsapp/yr;",
            "Lcom/whatsapp/xr;",
            ">;"
        }
    .end annotation
.end field

.field static u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/xr;",
            ">;"
        }
    .end annotation
.end field

.field static w:Z

.field static x:Z

.field static y:Z


# instance fields
.field A:I

.field C:Z

.field D:Ljava/lang/String;

.field E:Lcom/whatsapp/j4;

.field final F:Landroid/widget/TextView$OnEditorActionListener;

.field G:Landroid/widget/AdapterView$OnItemClickListener;

.field final H:Landroid/text/TextWatcher;

.field final I:Landroid/text/TextWatcher;

.field final f:Landroid/view/inputmethod/InputMethodManager;

.field g:Landroid/widget/EditText;

.field h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/xr;",
            ">;"
        }
    .end annotation
.end field

.field i:Landroid/widget/MultiAutoCompleteTextView;

.field j:Landroid/widget/TextView;

.field k:Landroid/widget/TextView;

.field l:Landroid/widget/TextView;

.field m:Landroid/widget/TextView;

.field n:Ljava/lang/String;

.field o:Landroid/widget/ScrollView;

.field p:Landroid/widget/ImageButton;

.field q:Landroid/widget/ImageButton;

.field r:Landroid/widget/Button;

.field public v:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/yr;",
            ">;"
        }
    .end annotation
.end field

.field z:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v3, 0x2b

    const/16 v2, 0x20

    const/16 v1, 0x18

    const/4 v4, 0x1

    const/4 v8, 0x0

    const/16 v0, 0xf

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "K8"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_0
    if-gt v6, v7, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    const-string v0, "\u0000jO^q8{RN`\u0013}\u000fEnGvE_v\u0008jK\u000b`\u0004{EXrK8FJh\u000b8TD!\u0004jEJu\u00028GYn\u0012h"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1
    if-gt v6, v7, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v4

    const/4 v10, 0x2

    const-string v0, "\u0000jO^q8{RN`\u0013}\u000fLnG{RN`\u0013}\u0000Ls\u0008mP\u0011"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2
    if-gt v6, v7, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x3

    const-string v0, "JC"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_3
    if-gt v6, v7, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x4

    const-string v0, "\u0004wN_`\u0004l"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_4
    if-gt v6, v7, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x5

    const-string v0, "E6\n\u0014#O\'\u001d\u0007("

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_5
    if-gt v6, v7, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x6

    const-string v0, "\u000evP^u8uE_i\u0008|"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_6
    if-gt v6, v7, :cond_6

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x7

    const-string v0, "\u0000jO^q8{RN`\u0013}\u000fJt\u0013w\u0000_d\u001fl\u001a"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_7
    if-gt v6, v7, :cond_7

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x8

    const-string v0, "\u0000jO^q8{RN`\u0013}\u000f[`GrIOr]"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_8
    if-gt v6, v7, :cond_8

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x9

    const-string v0, ",}YX,<"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_9
    if-gt v6, v7, :cond_9

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xa

    const-string v0, "\u0002|I_f\u0015wU[r\u0012zJNb\u00137CYd\u0006lE"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_a
    if-gt v6, v7, :cond_a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xb

    const-string v0, "\u000byS_!\u0017wS\u0011"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_b
    if-gt v6, v7, :cond_b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xc

    const-string v0, "\u0000jO^q8{RN`\u0013}\u000fMn\u0012vD\u000bo\u0008l\u0000F`\u0013{H\u0004"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_c
    if-gt v6, v7, :cond_c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xd

    const-string v0, "\u0001qNO;"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_d
    if-gt v6, v7, :cond_d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xe

    const-string v0, "HjE[m\u0006{E\u0004"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_e
    if-gt v6, v7, :cond_e

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    sput-object v9, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    .line 162
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/whatsapp/EditGroupSubject;->s:Ljava/util/HashMap;

    .line 136
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/whatsapp/EditGroupSubject;->t:Ljava/util/HashMap;

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/whatsapp/EditGroupSubject;->u:Ljava/util/ArrayList;

    .line 71
    sput-boolean v8, Lcom/whatsapp/EditGroupSubject;->w:Z

    .line 27
    sput-boolean v8, Lcom/whatsapp/EditGroupSubject;->y:Z

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_f
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_0

    :pswitch_0
    const/16 v0, 0x67

    goto :goto_f

    :pswitch_1
    move v0, v1

    goto :goto_f

    :pswitch_2
    move v0, v2

    goto :goto_f

    :pswitch_3
    move v0, v3

    goto :goto_f

    :cond_1
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_10
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1

    :pswitch_4
    const/16 v0, 0x67

    goto :goto_10

    :pswitch_5
    move v0, v1

    goto :goto_10

    :pswitch_6
    move v0, v2

    goto :goto_10

    :pswitch_7
    move v0, v3

    goto :goto_10

    :cond_2
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_11
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2

    :pswitch_8
    const/16 v0, 0x67

    goto :goto_11

    :pswitch_9
    move v0, v1

    goto :goto_11

    :pswitch_a
    move v0, v2

    goto :goto_11

    :pswitch_b
    move v0, v3

    goto :goto_11

    :cond_3
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_12
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3

    :pswitch_c
    const/16 v0, 0x67

    goto :goto_12

    :pswitch_d
    move v0, v1

    goto :goto_12

    :pswitch_e
    move v0, v2

    goto :goto_12

    :pswitch_f
    move v0, v3

    goto :goto_12

    :cond_4
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_13
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_4

    :pswitch_10
    const/16 v0, 0x67

    goto :goto_13

    :pswitch_11
    move v0, v1

    goto :goto_13

    :pswitch_12
    move v0, v2

    goto :goto_13

    :pswitch_13
    move v0, v3

    goto :goto_13

    :cond_5
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_14
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_5

    :pswitch_14
    const/16 v0, 0x67

    goto :goto_14

    :pswitch_15
    move v0, v1

    goto :goto_14

    :pswitch_16
    move v0, v2

    goto :goto_14

    :pswitch_17
    move v0, v3

    goto :goto_14

    :cond_6
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_15
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_6

    :pswitch_18
    const/16 v0, 0x67

    goto :goto_15

    :pswitch_19
    move v0, v1

    goto :goto_15

    :pswitch_1a
    move v0, v2

    goto :goto_15

    :pswitch_1b
    move v0, v3

    goto :goto_15

    :cond_7
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_16
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_7

    :pswitch_1c
    const/16 v0, 0x67

    goto :goto_16

    :pswitch_1d
    move v0, v1

    goto :goto_16

    :pswitch_1e
    move v0, v2

    goto :goto_16

    :pswitch_1f
    move v0, v3

    goto :goto_16

    :cond_8
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_17
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_8

    :pswitch_20
    const/16 v0, 0x67

    goto :goto_17

    :pswitch_21
    move v0, v1

    goto :goto_17

    :pswitch_22
    move v0, v2

    goto :goto_17

    :pswitch_23
    move v0, v3

    goto :goto_17

    :cond_9
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_18
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_9

    :pswitch_24
    const/16 v0, 0x67

    goto :goto_18

    :pswitch_25
    move v0, v1

    goto :goto_18

    :pswitch_26
    move v0, v2

    goto :goto_18

    :pswitch_27
    move v0, v3

    goto :goto_18

    :cond_a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_19
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_a

    :pswitch_28
    const/16 v0, 0x67

    goto :goto_19

    :pswitch_29
    move v0, v1

    goto :goto_19

    :pswitch_2a
    move v0, v2

    goto :goto_19

    :pswitch_2b
    move v0, v3

    goto :goto_19

    :cond_b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_1a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_b

    :pswitch_2c
    const/16 v0, 0x67

    goto :goto_1a

    :pswitch_2d
    move v0, v1

    goto :goto_1a

    :pswitch_2e
    move v0, v2

    goto :goto_1a

    :pswitch_2f
    move v0, v3

    goto :goto_1a

    :cond_c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_1b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_c

    :pswitch_30
    const/16 v0, 0x67

    goto :goto_1b

    :pswitch_31
    move v0, v1

    goto :goto_1b

    :pswitch_32
    move v0, v2

    goto :goto_1b

    :pswitch_33
    move v0, v3

    goto :goto_1b

    :cond_d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_d

    move v0, v4

    :goto_1c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_d

    :pswitch_34
    const/16 v0, 0x67

    goto :goto_1c

    :pswitch_35
    move v0, v1

    goto :goto_1c

    :pswitch_36
    move v0, v2

    goto :goto_1c

    :pswitch_37
    move v0, v3

    goto :goto_1c

    :cond_e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_e

    move v0, v4

    :goto_1d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_e

    :pswitch_38
    const/16 v0, 0x67

    goto :goto_1d

    :pswitch_39
    move v0, v1

    goto :goto_1d

    :pswitch_3a
    move v0, v2

    goto :goto_1d

    :pswitch_3b
    move v0, v3

    goto :goto_1d

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x0
        :pswitch_20
        :pswitch_21
        :pswitch_22
        :pswitch_23
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0x0
        :pswitch_24
        :pswitch_25
        :pswitch_26
        :pswitch_27
    .end packed-switch

    :pswitch_data_a
    .packed-switch 0x0
        :pswitch_28
        :pswitch_29
        :pswitch_2a
        :pswitch_2b
    .end packed-switch

    :pswitch_data_b
    .packed-switch 0x0
        :pswitch_2c
        :pswitch_2d
        :pswitch_2e
        :pswitch_2f
    .end packed-switch

    :pswitch_data_c
    .packed-switch 0x0
        :pswitch_30
        :pswitch_31
        :pswitch_32
        :pswitch_33
    .end packed-switch

    :pswitch_data_d
    .packed-switch 0x0
        :pswitch_34
        :pswitch_35
        :pswitch_36
        :pswitch_37
    .end packed-switch

    :pswitch_data_e
    .packed-switch 0x0
        :pswitch_38
        :pswitch_39
        :pswitch_3a
        :pswitch_3b
    .end packed-switch
.end method

.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 145
    invoke-direct {p0}, Lcom/whatsapp/DialogToastActivity;-><init>()V

    .line 47
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v1, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->f:Landroid/view/inputmethod/InputMethodManager;

    .line 197
    const-string v0, ""

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->n:Ljava/lang/String;

    .line 186
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->v:Ljava/util/ArrayList;

    .line 119
    iput v3, p0, Lcom/whatsapp/EditGroupSubject;->A:I

    .line 185
    iput-boolean v3, p0, Lcom/whatsapp/EditGroupSubject;->C:Z

    .line 95
    new-instance v0, Lcom/whatsapp/sr;

    invoke-direct {v0, p0}, Lcom/whatsapp/sr;-><init>(Lcom/whatsapp/EditGroupSubject;)V

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->F:Landroid/widget/TextView$OnEditorActionListener;

    .line 153
    new-instance v0, Lcom/whatsapp/tr;

    invoke-direct {v0, p0}, Lcom/whatsapp/tr;-><init>(Lcom/whatsapp/EditGroupSubject;)V

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->G:Landroid/widget/AdapterView$OnItemClickListener;

    .line 214
    new-instance v0, Lcom/whatsapp/ur;

    invoke-direct {v0, p0}, Lcom/whatsapp/ur;-><init>(Lcom/whatsapp/EditGroupSubject;)V

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->H:Landroid/text/TextWatcher;

    .line 121
    new-instance v0, Lcom/whatsapp/vr;

    invoke-direct {v0, p0}, Lcom/whatsapp/vr;-><init>(Lcom/whatsapp/EditGroupSubject;)V

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->I:Landroid/text/TextWatcher;

    .line 85
    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .parameter

    .prologue
    .line 86
    .line 23
    const-string v0, "\""

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    .line 94
    const-string v1, "\""

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    .line 89
    if-ltz v1, :cond_0

    if-le v0, v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 79
    const-string v0, "\""

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const-string v1, "\""

    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 199
    :cond_0
    return-object p1
.end method

.method private a()V
    .locals 3

    .prologue
    .line 61
    sget-object v0, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditGroupSubject;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 11
    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 165
    return-void
.end method

.method static a(Lcom/whatsapp/EditGroupSubject;)V
    .locals 0
    .parameter

    .prologue
    .line 74
    invoke-direct {p0}, Lcom/whatsapp/EditGroupSubject;->g()V

    return-void
.end method

.method static a(Lcom/whatsapp/EditGroupSubject;Ljava/lang/CharSequence;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 134
    invoke-direct {p0, p1}, Lcom/whatsapp/EditGroupSubject;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method static a(Lcom/whatsapp/EditGroupSubject;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 227
    invoke-direct {p0, p1}, Lcom/whatsapp/EditGroupSubject;->b(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/CharSequence;)V
    .locals 3
    .parameter

    .prologue
    .line 207
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->k:Landroid/widget/TextView;

    sget v1, Lcom/whatsapp/eu;->c:I

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 188
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 10
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/yr;",
            ">;)V"
        }
    .end annotation

    .prologue
    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 77
    sget-object v0, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 1
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 161
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    .line 103
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 124
    :goto_0
    if-eqz v2, :cond_2

    .line 50
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->end()I

    move-result v2

    .line 215
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/whatsapp/EditGroupSubject;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 127
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/16 v8, 0xd

    aget-object v7, v7, v8

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 223
    sget-object v5, Lcom/whatsapp/EditGroupSubject;->s:Ljava/util/HashMap;

    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/xr;

    if-eqz v0, :cond_1

    .line 129
    iget-object v0, v0, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    iget v0, p0, Lcom/whatsapp/EditGroupSubject;->z:I

    const/4 v5, -0x1

    if-ne v0, v5, :cond_0

    .line 125
    iput v1, p0, Lcom/whatsapp/EditGroupSubject;->z:I

    .line 193
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/16 v6, 0xb

    aget-object v5, v5, v6

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v5, p0, Lcom/whatsapp/EditGroupSubject;->z:I

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 131
    :cond_0
    sget-boolean v0, Lcom/whatsapp/EditGroupSubject;->w:Z

    if-eqz v0, :cond_1

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/16 v6, 0xc

    aget-object v5, v5, v6

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v5, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/16 v6, 0xe

    aget-object v5, v5, v6

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 128
    :cond_1
    add-int/lit8 v0, v1, 0x1

    .line 29
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    .line 181
    if-eqz v3, :cond_5

    move v1, v0

    move v0, v2

    .line 4
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-eq v0, v2, :cond_4

    .line 38
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/whatsapp/EditGroupSubject;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 139
    sget-object v2, Lcom/whatsapp/EditGroupSubject;->s:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/xr;

    if-eqz v0, :cond_4

    .line 73
    iget-object v0, v0, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    iget v0, p0, Lcom/whatsapp/EditGroupSubject;->z:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_3

    .line 97
    iput v1, p0, Lcom/whatsapp/EditGroupSubject;->z:I

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lcom/whatsapp/EditGroupSubject;->z:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 159
    :cond_3
    sget-boolean v0, Lcom/whatsapp/EditGroupSubject;->w:Z

    if-eqz v0, :cond_4

    .line 217
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/16 v3, 0xc

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/16 v2, 0xe

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 221
    :cond_4
    return-void

    :cond_5
    move v9, v0

    move v0, v2

    move v2, v1

    move v1, v9

    goto/16 :goto_0
.end method

.method private b()V
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 213
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 169
    invoke-direct {p0}, Lcom/whatsapp/EditGroupSubject;->c()Ljava/util/Vector;

    move-result-object v1

    .line 44
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    sget v3, Lcom/whatsapp/eu;->c:I

    if-gt v2, v3, :cond_0

    .line 37
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v2

    if-nez v2, :cond_1

    .line 52
    const v0, 0x7f09027c

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditGroupSubject;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v4}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 173
    :goto_0
    return-void

    .line 7
    :cond_0
    const v0, 0x7f090254

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditGroupSubject;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-array v1, v5, [Ljava/lang/Object;

    sget v2, Lcom/whatsapp/eu;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v4}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    .line 41
    :cond_1
    invoke-static {v0}, Lcom/whatsapp/eu;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 108
    invoke-static {v2, v1}, Lcom/whatsapp/eu;->b(Ljava/lang/String;Ljava/util/Vector;)V

    .line 220
    new-instance v3, Landroid/content/Intent;

    const-class v4, Lcom/whatsapp/Conversations;

    invoke-direct {v3, p0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 91
    invoke-virtual {p0, v3}, Lcom/whatsapp/EditGroupSubject;->startActivity(Landroid/content/Intent;)V

    .line 16
    invoke-static {}, Lcom/whatsapp/App;->sb()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 180
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    aget-object v4, v4, v6

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 204
    sget-object v3, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-static {v2, v0, v1, v6}, Lcom/whatsapp/eu;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;I)Lcom/whatsapp/sz;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/sz;)V

    .line 84
    new-instance v3, Lcom/whatsapp/j9;

    invoke-direct {v3, p0, v2, v0, v1}, Lcom/whatsapp/j9;-><init>(Lcom/whatsapp/EditGroupSubject;Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;)V

    invoke-virtual {v3}, Lcom/whatsapp/j9;->start()V

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v3, :cond_3

    .line 51
    :cond_2
    sget-object v3, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    aget-object v3, v3, v5

    invoke-static {v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 210
    sget-object v3, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    const/4 v4, 0x3

    invoke-static {v2, v0, v1, v4}, Lcom/whatsapp/eu;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;I)Lcom/whatsapp/sz;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/sz;)V

    .line 6
    :cond_3
    invoke-virtual {p0}, Lcom/whatsapp/EditGroupSubject;->finish()V

    goto :goto_0
.end method

.method static b(Lcom/whatsapp/EditGroupSubject;)V
    .locals 0
    .parameter

    .prologue
    .line 225
    invoke-direct {p0}, Lcom/whatsapp/EditGroupSubject;->b()V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 5
    .parameter

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 93
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 224
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v3, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/4 v4, 0x3

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    sget-object v0, Lcom/whatsapp/EditGroupSubject;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/xr;

    .line 192
    iget-object v0, v0, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ","

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_0

    .line 48
    :cond_1
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 12
    return-void
.end method

.method static b(Lcom/whatsapp/EditGroupSubject;Ljava/lang/String;)[Ljava/lang/String;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 133
    invoke-direct {p0, p1}, Lcom/whatsapp/EditGroupSubject;->c(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static c(Lcom/whatsapp/EditGroupSubject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 104
    invoke-direct {p0, p1}, Lcom/whatsapp/EditGroupSubject;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c()Ljava/util/Vector;
    .locals 6

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 67
    new-instance v2, Ljava/util/Vector;

    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    .line 100
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 10
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/4 v5, 0x7

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 189
    sget-object v0, Lcom/whatsapp/EditGroupSubject;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/xr;

    .line 15
    iget-object v0, v0, Lcom/whatsapp/xr;->a:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_0

    .line 39
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2}, Ljava/util/Vector;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 228
    return-object v2
.end method

.method static c(Lcom/whatsapp/EditGroupSubject;)V
    .locals 0
    .parameter

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/whatsapp/EditGroupSubject;->i()V

    return-void
.end method

.method private c(Ljava/lang/String;)[Ljava/lang/String;
    .locals 6
    .parameter

    .prologue
    const/4 v0, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 135
    new-instance v4, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 70
    sget-object v1, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 102
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 142
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    move v2, v1

    move v1, v0

    .line 113
    :cond_0
    if-eqz v2, :cond_1

    .line 59
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->end()I

    move-result v0

    .line 156
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/whatsapp/EditGroupSubject;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 198
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    add-int/lit8 v1, v1, 0x1

    .line 2
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    .line 126
    if-eqz v3, :cond_0

    .line 66
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 144
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/whatsapp/EditGroupSubject;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 76
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    .line 216
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method private d()Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/xr;",
            ">;"
        }
    .end annotation

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 195
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v0}, Lcom/whatsapp/qp;->c()Ljava/util/List;

    move-result-object v0

    .line 218
    sget-object v2, Lcom/whatsapp/EditGroupSubject;->s:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 184
    sget-object v2, Lcom/whatsapp/EditGroupSubject;->t:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 202
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 36
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 194
    invoke-virtual {v0}, Lcom/whatsapp/zq;->o()Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v4, :cond_1

    .line 123
    new-instance v4, Lcom/whatsapp/xr;

    iget-object v5, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whatsapp/EditGroupSubject;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/whatsapp/zq;->a(Landroid/content/res/Resources;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    iget-object v0, v0, Lcom/whatsapp/zq;->c:Ljava/lang/String;

    invoke-direct {v4, v5, v6, v7, v0}, Lcom/whatsapp/xr;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    sget-object v0, Lcom/whatsapp/EditGroupSubject;->s:Ljava/util/HashMap;

    iget-object v5, v4, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    iget-object v5, v5, Lcom/whatsapp/yr;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    sget-object v0, Lcom/whatsapp/EditGroupSubject;->t:Ljava/util/HashMap;

    iget-object v5, v4, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    :cond_1
    if-eqz v1, :cond_0

    .line 187
    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_3

    .line 205
    :try_start_0
    new-instance v0, Lcom/whatsapp/wr;

    invoke-direct {v0, p0}, Lcom/whatsapp/wr;-><init>(Lcom/whatsapp/EditGroupSubject;)V

    .line 109
    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    :cond_3
    :goto_0
    return-object v2

    .line 13
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static d(Lcom/whatsapp/EditGroupSubject;)V
    .locals 0
    .parameter

    .prologue
    .line 151
    invoke-direct {p0}, Lcom/whatsapp/EditGroupSubject;->h()V

    return-void
.end method

.method private e()V
    .locals 5

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 82
    sget-object v0, Lcom/whatsapp/EditGroupSubject;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 172
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/yr;

    .line 178
    sget-object v3, Lcom/whatsapp/EditGroupSubject;->u:Ljava/util/ArrayList;

    sget-object v4, Lcom/whatsapp/EditGroupSubject;->t:Ljava/util/HashMap;

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_0

    .line 35
    :cond_1
    return-void
.end method

.method static e(Lcom/whatsapp/EditGroupSubject;)V
    .locals 0
    .parameter

    .prologue
    .line 72
    invoke-direct {p0}, Lcom/whatsapp/EditGroupSubject;->f()V

    return-void
.end method

.method private f()V
    .locals 5

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 226
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    sget-object v0, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/16 v3, 0x9

    aget-object v0, v0, v3

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/yr;

    .line 99
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ","

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_0

    .line 42
    :cond_1
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 101
    return-void
.end method

.method static f(Lcom/whatsapp/EditGroupSubject;)V
    .locals 0
    .parameter

    .prologue
    .line 164
    invoke-direct {p0}, Lcom/whatsapp/EditGroupSubject;->e()V

    return-void
.end method

.method private g()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 158
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 83
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/yr;

    .line 229
    new-instance v4, Landroid/text/SpannableStringBuilder;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, v0, Lcom/whatsapp/yr;->a:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 116
    new-instance v5, Landroid/text/style/StyleSpan;

    invoke-direct {v5, v7}, Landroid/text/style/StyleSpan;-><init>(I)V

    iget-object v0, v0, Lcom/whatsapp/yr;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/16 v6, 0x21

    invoke-virtual {v4, v5, v7, v0, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 24
    invoke-virtual {v2, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    sget-object v4, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/4 v5, 0x0

    aget-object v4, v4, v5

    invoke-virtual {v0, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 64
    if-eqz v1, :cond_0

    .line 63
    :cond_1
    iput-boolean v7, p0, Lcom/whatsapp/EditGroupSubject;->C:Z

    .line 117
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v0, v2}, Landroid/widget/MultiAutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/MultiAutoCompleteTextView;->requestFocus()Z

    .line 182
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/MultiAutoCompleteTextView;->setSelection(I)V

    .line 34
    invoke-direct {p0}, Lcom/whatsapp/EditGroupSubject;->h()V

    .line 208
    return-void
.end method

.method private h()V
    .locals 3

    .prologue
    .line 196
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->m:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/EditGroupSubject;->u:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/whatsapp/eu;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    sget-object v0, Lcom/whatsapp/EditGroupSubject;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/whatsapp/EditGroupSubject;->x:Z

    if-nez v0, :cond_1

    .line 57
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->r:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_2

    .line 122
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->r:Landroid/widget/Button;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 58
    :cond_2
    return-void
.end method

.method private i()V
    .locals 3

    .prologue
    .line 106
    sget-object v0, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditGroupSubject;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 137
    iget-object v1, p0, Lcom/whatsapp/EditGroupSubject;->g:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 179
    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 5
    .parameter
    .parameter
    .parameter

    .prologue
    .line 147
    packed-switch p1, :pswitch_data_0

    .line 167
    :cond_0
    :goto_0
    return-void

    .line 112
    :pswitch_0
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 96
    sget-object v0, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 160
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v1}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 209
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 130
    invoke-direct {p0, v1, v2}, Lcom/whatsapp/EditGroupSubject;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 31
    new-instance v1, Lcom/whatsapp/yr;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whatsapp/EditGroupSubject;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/whatsapp/zq;->a(Landroid/content/res/Resources;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Lcom/whatsapp/yr;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 81
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->v:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 183
    const/4 v0, 0x1

    sput-boolean v0, Lcom/whatsapp/EditGroupSubject;->y:Z

    .line 22
    invoke-direct {p0}, Lcom/whatsapp/EditGroupSubject;->e()V

    .line 115
    invoke-direct {p0}, Lcom/whatsapp/EditGroupSubject;->a()V

    .line 148
    invoke-direct {p0}, Lcom/whatsapp/EditGroupSubject;->g()V

    goto :goto_0

    .line 147
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0
    .parameter

    .prologue
    .line 132
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 18
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5
    .parameter

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 211
    sget-object v0, Lcom/whatsapp/EditGroupSubject;->J:[Ljava/lang/String;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 201
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onCreate(Landroid/os/Bundle;)V

    .line 191
    const v0, 0x7f030037

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditGroupSubject;->setContentView(I)V

    .line 69
    invoke-virtual {p0}, Lcom/whatsapp/EditGroupSubject;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->E:Lcom/whatsapp/j4;

    .line 107
    new-instance v0, Lcom/whatsapp/fd;

    invoke-direct {v0, p0}, Lcom/whatsapp/fd;-><init>(Lcom/whatsapp/EditGroupSubject;)V

    sput-object v0, Lcom/whatsapp/EditGroupSubject;->B:Landroid/os/Handler;

    .line 21
    sget-object v0, Lcom/whatsapp/EditGroupSubject;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 54
    const v0, 0x7f0d008d

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditGroupSubject;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->o:Landroid/widget/ScrollView;

    .line 56
    const v0, 0x7f0d010b

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditGroupSubject;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->j:Landroid/widget/TextView;

    .line 40
    const v0, 0x7f0d010c

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditGroupSubject;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->k:Landroid/widget/TextView;

    .line 26
    const-string v0, ""

    invoke-direct {p0, v0}, Lcom/whatsapp/EditGroupSubject;->a(Ljava/lang/CharSequence;)V

    .line 212
    const v0, 0x7f0d010f

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditGroupSubject;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->l:Landroid/widget/TextView;

    .line 163
    const v0, 0x7f0d0110

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditGroupSubject;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->m:Landroid/widget/TextView;

    .line 154
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->l:Landroid/widget/TextView;

    const v1, 0x7f090284

    invoke-virtual {p0, v1}, Lcom/whatsapp/EditGroupSubject;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->j:Landroid/widget/TextView;

    const v1, 0x7f090283

    invoke-virtual {p0, v1}, Lcom/whatsapp/EditGroupSubject;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    new-array v1, v3, [Landroid/text/InputFilter;

    .line 138
    new-instance v0, Landroid/text/InputFilter$LengthFilter;

    sget v2, Lcom/whatsapp/eu;->c:I

    invoke-direct {v0, v2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v0, v1, v4

    .line 60
    const v0, 0x7f0d010e

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditGroupSubject;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->p:Landroid/widget/ImageButton;

    .line 155
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->p:Landroid/widget/ImageButton;

    new-instance v2, Lcom/whatsapp/pr;

    invoke-direct {v2, p0}, Lcom/whatsapp/pr;-><init>(Lcom/whatsapp/EditGroupSubject;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    const v0, 0x7f0d0112

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditGroupSubject;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->q:Landroid/widget/ImageButton;

    .line 65
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->q:Landroid/widget/ImageButton;

    new-instance v2, Lcom/whatsapp/qr;

    invoke-direct {v2, p0}, Lcom/whatsapp/qr;-><init>(Lcom/whatsapp/EditGroupSubject;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 30
    const v0, 0x7f0d010d

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditGroupSubject;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->g:Landroid/widget/EditText;

    .line 118
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->g:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/whatsapp/EditGroupSubject;->H:Landroid/text/TextWatcher;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 90
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->g:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 87
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->g:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/whatsapp/EditGroupSubject;->g:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/TextEmojiLabel;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setGravity(I)V

    .line 219
    invoke-direct {p0}, Lcom/whatsapp/EditGroupSubject;->d()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->h:Ljava/util/ArrayList;

    .line 32
    new-instance v1, Lcom/whatsapp/oe;

    invoke-direct {v1, p0}, Lcom/whatsapp/oe;-><init>(Lcom/whatsapp/EditGroupSubject;)V

    .line 75
    const v0, 0x7f0d0111

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditGroupSubject;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/MultiAutoCompleteTextView;

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    .line 92
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v0, v1}, Landroid/widget/MultiAutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 171
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    new-instance v1, Lcom/whatsapp/as;

    invoke-direct {v1}, Lcom/whatsapp/as;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/MultiAutoCompleteTextView;->setTokenizer(Landroid/widget/MultiAutoCompleteTextView$Tokenizer;)V

    .line 203
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    iget-object v1, p0, Lcom/whatsapp/EditGroupSubject;->G:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/MultiAutoCompleteTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 88
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v0, v3}, Landroid/widget/MultiAutoCompleteTextView;->setThreshold(I)V

    .line 78
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    iget-object v1, p0, Lcom/whatsapp/EditGroupSubject;->F:Landroid/widget/TextView$OnEditorActionListener;

    invoke-virtual {v0, v1}, Landroid/widget/MultiAutoCompleteTextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 53
    new-array v0, v3, [Landroid/text/InputFilter;

    .line 157
    new-instance v1, Lcom/whatsapp/zr;

    sget v2, Lcom/whatsapp/eu;->b:I

    invoke-direct {v1, v2}, Lcom/whatsapp/zr;-><init>(I)V

    aput-object v1, v0, v4

    .line 105
    iget-object v1, p0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v1, v0}, Landroid/widget/MultiAutoCompleteTextView;->setFilters([Landroid/text/InputFilter;)V

    .line 206
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    iget-object v1, p0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v1}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/TextEmojiLabel;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/MultiAutoCompleteTextView;->setGravity(I)V

    .line 120
    const v0, 0x7f0d010a

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditGroupSubject;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/whatsapp/EditGroupSubject;->r:Landroid/widget/Button;

    .line 146
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->r:Landroid/widget/Button;

    new-instance v1, Lcom/whatsapp/rr;

    invoke-direct {v1, p0}, Lcom/whatsapp/rr;-><init>(Lcom/whatsapp/EditGroupSubject;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    invoke-direct {p0}, Lcom/whatsapp/EditGroupSubject;->h()V

    .line 114
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    iget-object v1, p0, Lcom/whatsapp/EditGroupSubject;->I:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/MultiAutoCompleteTextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 174
    iget-object v0, p0, Lcom/whatsapp/EditGroupSubject;->E:Lcom/whatsapp/j4;

    invoke-virtual {v0}, Lcom/whatsapp/j4;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 166
    invoke-direct {p0}, Lcom/whatsapp/EditGroupSubject;->a()V

    .line 150
    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 3
    invoke-super {p0}, Lcom/whatsapp/DialogToastActivity;->onPause()V

    .line 45
    invoke-direct {p0}, Lcom/whatsapp/EditGroupSubject;->i()V

    .line 9
    return-void
.end method
