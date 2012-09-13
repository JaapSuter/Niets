.class public Lcom/whatsapp/GroupChatInfo;
.super Lcom/whatsapp/DialogToastListActivity;
.source "GroupChatInfo.java"

# interfaces
.implements Lcom/whatsapp/uk;


# static fields
.field private static F:Lcom/whatsapp/GroupChatInfo;

.field public static G:Lcom/whatsapp/wz;

.field public static H:Landroid/os/Handler;

.field static K:Lcom/whatsapp/zq;

.field private static final N:[Ljava/lang/String;


# instance fields
.field A:Landroid/view/View;

.field B:Landroid/view/View;

.field C:Landroid/view/View;

.field D:Landroid/widget/ListView;

.field E:Lcom/whatsapp/zq;

.field I:Landroid/view/View$OnTouchListener;

.field J:Landroid/view/View$OnClickListener;

.field L:Landroid/os/Handler;

.field private final M:Lcom/whatsapp/lq;

.field private g:I

.field private h:F

.field i:Ljava/lang/String;

.field j:Landroid/widget/TextView;

.field k:Landroid/widget/TextView;

.field l:Landroid/widget/TextView;

.field m:Landroid/widget/TextView;

.field n:Landroid/widget/TextView;

.field o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/sz;",
            ">;"
        }
    .end annotation
.end field

.field p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/sz;",
            ">;"
        }
    .end annotation
.end field

.field q:Lcom/whatsapp/ie;

.field r:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation
.end field

.field s:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation
.end field

.field t:Lcom/whatsapp/zq;

.field u:Lcom/whatsapp/gu;

.field v:Landroid/view/ViewGroup;

.field w:Landroid/widget/ImageButton;

.field x:Landroid/widget/ImageButton;

.field y:Landroid/widget/Button;

.field z:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v1, 0x47

    const/16 v4, 0x26

    const/16 v3, 0x13

    const/16 v2, 0x11

    const/4 v6, 0x0

    const/16 v0, 0x14

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, " \u0015~fVg\u000e\u007fuIh\u0004~}R\"\u001fe3U>\u0014evKg\u0004~}R&\u0004e3J.\u0014e3E(\u0012}w\u0006)\u0008e3@(\u0012\u007fw"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_0
    if-gt v7, v8, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v6

    const/4 v10, 0x1

    const-string v0, "7\u000f~}C"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1
    if-gt v7, v8, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x2

    const-string v0, "&\tuaI.\u0003?zH3\u0002\u007fg\u0008&\u0004ezI)IX]u\u00025E"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2
    if-gt v7, v8, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x3

    const-string v0, "7\u000f~}C\u0018\u0013hcC"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_3
    if-gt v7, v8, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x4

    const-string v0, "&\tuaI.\u0003?zH3\u0002\u007fg\u0008&\u0004ezI)IX]u\u00025ELi\u00158TWo\u0013"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_4
    if-gt v7, v8, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x5

    const-string v0, "1\tu=G)\u0003c|O#IrfT4\u0008c=O3\u0002|<E(\terE3"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_5
    if-gt v7, v8, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x6

    const-string v0, "3\u0002})"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_6
    if-gt v7, v8, :cond_6

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x7

    const-string v0, "&\tuaI.\u0003?zH3\u0002\u007fg\u0008&\u0004ezI)IRRj\u000b"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_7
    if-gt v7, v8, :cond_7

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x8

    const-string v0, " \u0015~fV$\u000fpgO)\u0001~<G#\u00031v^.\u0014ezH Gr|H3\u0006rg\u001cg\u0006rgO1\u000eej\u0006)\u0008e3@(\u0012\u007fw\ng\u0017c|D&\u0005}j\u00063\u0006s\u007fC3"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_8
    if-gt v7, v8, :cond_8

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x9

    const-string v0, " \u0015~fV\u0018\u000e\u007fuIh\u0003t`R5\u0008h"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_9
    if-gt v7, v8, :cond_9

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xa

    const-string v0, " \u000eu"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_a
    if-gt v7, v8, :cond_a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xb

    const-string v0, "+\u0006h|S38x}@+\u0006evT"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_b
    if-gt v7, v8, :cond_b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xc

    const-string v0, "g\u001b1H"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_c
    if-gt v7, v8, :cond_c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xd

    const-string v0, " \u0015~fV\u0018\u000e\u007fuIh\u0014tge(\terE3\u0014]zU30xgN\u0006\u0003uvB\u0001\u0006x\u007fC#]1"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_d
    if-gt v7, v8, :cond_d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xe

    const-string v0, " \u0015~fV\u0018\u000e\u007fuIh\u0014tg\u00062\tpwB\"\u0003+3"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_e
    if-gt v7, v8, :cond_e

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xf

    const-string v0, "!\u0017p>"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_f
    if-gt v7, v8, :cond_f

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x10

    const-string v0, ".\u0014NaC4\u0002e"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_10
    if-gt v7, v8, :cond_10

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const-string v0, " \u0015~fV\u0018\u000e\u007fuIh\u0015t`S+\u0013>`M.\u0017>pI)\u0013ppRg\t~g\u0006&\u0003uvB"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_11
    if-gt v7, v8, :cond_11

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v2

    const/16 v10, 0x12

    const-string v0, "$\u0008\u007fgG$\u0013"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_12
    if-gt v7, v8, :cond_12

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const-string v0, " \u0015~fV\u0018\u000e\u007fuIh\u0015t`S+\u0013>pI)\u0013ppRg\t~g\u0006&\u0003uvB"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_13
    if-gt v6, v7, :cond_13

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v3

    sput-object v9, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    .line 277
    new-instance v0, Lcom/whatsapp/kt;

    invoke-direct {v0}, Lcom/whatsapp/kt;-><init>()V

    sput-object v0, Lcom/whatsapp/GroupChatInfo;->G:Lcom/whatsapp/wz;

    .line 343
    new-instance v0, Lcom/whatsapp/hd;

    invoke-direct {v0}, Lcom/whatsapp/hd;-><init>()V

    sput-object v0, Lcom/whatsapp/GroupChatInfo;->H:Landroid/os/Handler;

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_14
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_14

    :pswitch_1
    const/16 v0, 0x67

    goto :goto_14

    :pswitch_2
    move v0, v2

    goto :goto_14

    :pswitch_3
    move v0, v3

    goto :goto_14

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_15
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_15

    :pswitch_5
    const/16 v0, 0x67

    goto :goto_15

    :pswitch_6
    move v0, v2

    goto :goto_15

    :pswitch_7
    move v0, v3

    goto :goto_15

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_16
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_16

    :pswitch_9
    const/16 v0, 0x67

    goto :goto_16

    :pswitch_a
    move v0, v2

    goto :goto_16

    :pswitch_b
    move v0, v3

    goto :goto_16

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_17
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_17

    :pswitch_d
    const/16 v0, 0x67

    goto :goto_17

    :pswitch_e
    move v0, v2

    goto :goto_17

    :pswitch_f
    move v0, v3

    goto :goto_17

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_18
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_18

    :pswitch_11
    const/16 v0, 0x67

    goto :goto_18

    :pswitch_12
    move v0, v2

    goto :goto_18

    :pswitch_13
    move v0, v3

    goto :goto_18

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_19
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_19

    :pswitch_15
    const/16 v0, 0x67

    goto :goto_19

    :pswitch_16
    move v0, v2

    goto :goto_19

    :pswitch_17
    move v0, v3

    goto :goto_19

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_1a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_1a

    :pswitch_19
    const/16 v0, 0x67

    goto :goto_1a

    :pswitch_1a
    move v0, v2

    goto :goto_1a

    :pswitch_1b
    move v0, v3

    goto :goto_1a

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_1b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_1b

    :pswitch_1d
    const/16 v0, 0x67

    goto :goto_1b

    :pswitch_1e
    move v0, v2

    goto :goto_1b

    :pswitch_1f
    move v0, v3

    goto :goto_1b

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_1c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_1c

    :pswitch_21
    const/16 v0, 0x67

    goto :goto_1c

    :pswitch_22
    move v0, v2

    goto :goto_1c

    :pswitch_23
    move v0, v3

    goto :goto_1c

    :cond_9
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_1d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_1d

    :pswitch_25
    const/16 v0, 0x67

    goto :goto_1d

    :pswitch_26
    move v0, v2

    goto :goto_1d

    :pswitch_27
    move v0, v3

    goto :goto_1d

    :cond_a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_1e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_a

    :pswitch_28
    move v0, v1

    goto :goto_1e

    :pswitch_29
    const/16 v0, 0x67

    goto :goto_1e

    :pswitch_2a
    move v0, v2

    goto :goto_1e

    :pswitch_2b
    move v0, v3

    goto :goto_1e

    :cond_b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_1f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_1f

    :pswitch_2d
    const/16 v0, 0x67

    goto :goto_1f

    :pswitch_2e
    move v0, v2

    goto :goto_1f

    :pswitch_2f
    move v0, v3

    goto :goto_1f

    :cond_c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_20
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_c

    :pswitch_30
    move v0, v1

    goto :goto_20

    :pswitch_31
    const/16 v0, 0x67

    goto :goto_20

    :pswitch_32
    move v0, v2

    goto :goto_20

    :pswitch_33
    move v0, v3

    goto :goto_20

    :cond_d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_d

    move v0, v4

    :goto_21
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_d

    :pswitch_34
    move v0, v1

    goto :goto_21

    :pswitch_35
    const/16 v0, 0x67

    goto :goto_21

    :pswitch_36
    move v0, v2

    goto :goto_21

    :pswitch_37
    move v0, v3

    goto :goto_21

    :cond_e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_e

    move v0, v4

    :goto_22
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_e

    :pswitch_38
    move v0, v1

    goto :goto_22

    :pswitch_39
    const/16 v0, 0x67

    goto :goto_22

    :pswitch_3a
    move v0, v2

    goto :goto_22

    :pswitch_3b
    move v0, v3

    goto :goto_22

    :cond_f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_f

    move v0, v4

    :goto_23
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_f

    :pswitch_3c
    move v0, v1

    goto :goto_23

    :pswitch_3d
    const/16 v0, 0x67

    goto :goto_23

    :pswitch_3e
    move v0, v2

    goto :goto_23

    :pswitch_3f
    move v0, v3

    goto :goto_23

    :cond_10
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_10

    move v0, v4

    :goto_24
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_10

    :pswitch_40
    move v0, v1

    goto :goto_24

    :pswitch_41
    const/16 v0, 0x67

    goto :goto_24

    :pswitch_42
    move v0, v2

    goto :goto_24

    :pswitch_43
    move v0, v3

    goto :goto_24

    :cond_11
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_11

    move v0, v4

    :goto_25
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_11

    :pswitch_44
    move v0, v1

    goto :goto_25

    :pswitch_45
    const/16 v0, 0x67

    goto :goto_25

    :pswitch_46
    move v0, v2

    goto :goto_25

    :pswitch_47
    move v0, v3

    goto :goto_25

    :cond_12
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_12

    move v0, v4

    :goto_26
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_12

    :pswitch_48
    move v0, v1

    goto :goto_26

    :pswitch_49
    const/16 v0, 0x67

    goto :goto_26

    :pswitch_4a
    move v0, v2

    goto :goto_26

    :pswitch_4b
    move v0, v3

    goto :goto_26

    :cond_13
    aget-char v8, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_13

    move v0, v4

    :goto_27
    xor-int/2addr v0, v8

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_13

    :pswitch_4c
    move v0, v1

    goto :goto_27

    :pswitch_4d
    const/16 v0, 0x67

    goto :goto_27

    :pswitch_4e
    move v0, v2

    goto :goto_27

    :pswitch_4f
    move v0, v3

    goto :goto_27

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

    :pswitch_data_f
    .packed-switch 0x0
        :pswitch_3c
        :pswitch_3d
        :pswitch_3e
        :pswitch_3f
    .end packed-switch

    :pswitch_data_10
    .packed-switch 0x0
        :pswitch_40
        :pswitch_41
        :pswitch_42
        :pswitch_43
    .end packed-switch

    :pswitch_data_11
    .packed-switch 0x0
        :pswitch_44
        :pswitch_45
        :pswitch_46
        :pswitch_47
    .end packed-switch

    :pswitch_data_12
    .packed-switch 0x0
        :pswitch_48
        :pswitch_49
        :pswitch_4a
        :pswitch_4b
    .end packed-switch

    :pswitch_data_13
    .packed-switch 0x0
        :pswitch_4c
        :pswitch_4d
        :pswitch_4e
        :pswitch_4f
    .end packed-switch
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 246
    invoke-direct {p0}, Lcom/whatsapp/DialogToastListActivity;-><init>()V

    .line 129
    const/4 v0, -0x1

    iput v0, p0, Lcom/whatsapp/GroupChatInfo;->g:I

    .line 203
    const/high16 v0, -0x4080

    iput v0, p0, Lcom/whatsapp/GroupChatInfo;->h:F

    .line 182
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    .line 117
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->s:Ljava/util/HashMap;

    .line 453
    new-instance v0, Lcom/whatsapp/cu;

    invoke-direct {v0, p0}, Lcom/whatsapp/cu;-><init>(Lcom/whatsapp/GroupChatInfo;)V

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->I:Landroid/view/View$OnTouchListener;

    .line 2
    new-instance v0, Lcom/whatsapp/mt;

    invoke-direct {v0, p0}, Lcom/whatsapp/mt;-><init>(Lcom/whatsapp/GroupChatInfo;)V

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->J:Landroid/view/View$OnClickListener;

    .line 401
    new-instance v0, Lcom/whatsapp/id;

    invoke-direct {v0, p0}, Lcom/whatsapp/id;-><init>(Lcom/whatsapp/GroupChatInfo;)V

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->L:Landroid/os/Handler;

    .line 391
    new-instance v0, Lcom/whatsapp/oq;

    invoke-direct {v0, p0}, Lcom/whatsapp/oq;-><init>(Lcom/whatsapp/GroupChatInfo;)V

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->M:Lcom/whatsapp/lq;

    return-void
.end method

.method static a(Lcom/whatsapp/GroupChatInfo;)I
    .locals 1
    .parameter

    .prologue
    .line 233
    iget v0, p0, Lcom/whatsapp/GroupChatInfo;->g:I

    return v0
.end method

.method private a(Lcom/whatsapp/sz;Landroid/widget/ImageView;)Landroid/widget/ImageView;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 314
    invoke-static {p1, p2, p0}, Lcom/whatsapp/j5;->a(Lcom/whatsapp/sz;Landroid/widget/ImageView;Landroid/app/Activity;)Landroid/widget/ImageView;

    move-result-object v0

    return-object v0
.end method

.method static a(Lcom/whatsapp/GroupChatInfo;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 190
    invoke-direct {p0, p1}, Lcom/whatsapp/GroupChatInfo;->g(Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/whatsapp/zq;)V
    .locals 13
    .parameter

    .prologue
    const/4 v12, 0x3

    const/4 v11, 0x4

    const/4 v10, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    sget-boolean v7, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 97
    invoke-virtual {p1}, Lcom/whatsapp/zq;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 187
    invoke-virtual {p0}, Lcom/whatsapp/GroupChatInfo;->finish()V

    .line 268
    :goto_0
    return-void

    .line 440
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->q()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 323
    const v0, 0x7f090263

    invoke-virtual {p0, v0}, Lcom/whatsapp/GroupChatInfo;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 153
    :goto_1
    :try_start_0
    iget-object v0, p1, Lcom/whatsapp/zq;->j:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {p0, v2, v3}, Lcom/whatsapp/t4;->d(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    .line 70
    iget-object v2, p0, Lcom/whatsapp/GroupChatInfo;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/whatsapp/GroupChatInfo;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0902a0

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    invoke-virtual {v3, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 210
    :goto_2
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v1, 0x7f0d000e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->l:Landroid/widget/TextView;

    .line 39
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/fq;->n(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->o:Ljava/util/ArrayList;

    .line 355
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 17
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->l:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/whatsapp/GroupChatInfo;->I:Landroid/view/View$OnTouchListener;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 64
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v2, 0x7f0d011b

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 87
    if-nez v0, :cond_1

    .line 89
    iget-object v2, p0, Lcom/whatsapp/GroupChatInfo;->l:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 390
    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    if-eqz v7, :cond_7

    .line 93
    :cond_1
    iget-object v2, p0, Lcom/whatsapp/GroupChatInfo;->l:Landroid/widget/TextView;

    const v3, 0x7f09027f

    new-array v4, v8, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v9

    invoke-virtual {p0, v3, v4}, Lcom/whatsapp/GroupChatInfo;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 348
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 220
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 356
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v1, 0x7f0d0075

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 376
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v2, 0x7f0d0076

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 59
    iget-object v2, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v3, 0x7f0d0077

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 200
    invoke-virtual {v0, v11}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 284
    invoke-virtual {v1, v11}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 71
    invoke-virtual {v2, v11}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 381
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 216
    const/4 v4, 0x0

    .line 400
    iget-object v3, p0, Lcom/whatsapp/GroupChatInfo;->o:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whatsapp/sz;

    .line 126
    iget-byte v6, v3, Lcom/whatsapp/sz;->l:B

    if-ne v6, v10, :cond_3

    .line 63
    if-eqz v7, :cond_a

    move-object v4, v3

    .line 206
    :cond_3
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v3, v12, :cond_4

    .line 61
    if-eqz v7, :cond_5

    :cond_4
    :goto_3
    if-eqz v7, :cond_2

    .line 332
    :cond_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    .line 53
    if-ltz v3, :cond_6

    .line 58
    add-int/lit8 v6, v3, -0x1

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whatsapp/sz;

    invoke-direct {p0, v3, v0}, Lcom/whatsapp/GroupChatInfo;->a(Lcom/whatsapp/sz;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 227
    invoke-virtual {v0, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 299
    if-ltz v6, :cond_9

    .line 252
    add-int/lit8 v5, v6, -0x1

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whatsapp/sz;

    invoke-direct {p0, v3, v1}, Lcom/whatsapp/GroupChatInfo;->a(Lcom/whatsapp/sz;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 195
    invoke-virtual {v1, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    move v1, v5

    .line 37
    :goto_4
    if-ltz v1, :cond_7

    .line 119
    add-int/lit8 v3, v1, -0x1

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/sz;

    invoke-direct {p0, v1, v2}, Lcom/whatsapp/GroupChatInfo;->a(Lcom/whatsapp/sz;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 107
    invoke-virtual {v2, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    if-eqz v7, :cond_7

    .line 81
    :cond_6
    if-eqz v4, :cond_7

    .line 136
    invoke-direct {p0, v4, v0}, Lcom/whatsapp/GroupChatInfo;->a(Lcom/whatsapp/sz;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 235
    invoke-virtual {v0, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 281
    :cond_7
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v1, 0x7f0d011c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->m:Landroid/widget/TextView;

    .line 322
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->m:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->I:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 304
    invoke-direct {p0}, Lcom/whatsapp/GroupChatInfo;->c()V

    goto/16 :goto_0

    .line 454
    :cond_8
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    invoke-virtual {v1}, Lcom/whatsapp/zq;->q()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 170
    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    goto/16 :goto_1

    .line 141
    :catch_0
    move-exception v0

    .line 179
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 116
    const v0, 0x7f090013

    invoke-virtual {p0, v0}, Lcom/whatsapp/GroupChatInfo;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 148
    iget-object v2, p0, Lcom/whatsapp/GroupChatInfo;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/whatsapp/GroupChatInfo;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0902a0

    new-array v5, v10, [Ljava/lang/Object;

    aput-object v0, v5, v9

    aput-object v1, v5, v8

    invoke-virtual {v3, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    :cond_9
    move v1, v6

    goto :goto_4

    :cond_a
    move-object v4, v3

    goto/16 :goto_3
.end method

.method public static a(Lcom/whatsapp/zq;Landroid/app/Activity;)V
    .locals 3
    .parameter
    .parameter

    .prologue
    .line 108
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/GroupChatInfo;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 373
    sget-object v1, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 171
    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 103
    return-void
.end method

.method static a(Lcom/whatsapp/GroupChatInfo;Lcom/whatsapp/zq;I)Z
    .locals 1
    .parameter
    .parameter
    .parameter

    .prologue
    .line 151
    invoke-direct {p0, p1, p2}, Lcom/whatsapp/GroupChatInfo;->a(Lcom/whatsapp/zq;I)Z

    move-result v0

    return v0
.end method

.method private a(Lcom/whatsapp/zq;I)Z
    .locals 5
    .parameter
    .parameter

    .prologue
    const/4 v3, 0x6

    const/4 v4, 0x1

    .line 337
    packed-switch p2, :pswitch_data_0

    .line 410
    :cond_0
    :goto_0
    return v4

    .line 160
    :pswitch_0
    iget-object v0, p1, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v0, :cond_0

    .line 316
    invoke-static {p1, p0}, Lcom/whatsapp/ContactInfo;->a(Lcom/whatsapp/zq;Landroid/app/Activity;)V

    goto :goto_0

    .line 451
    :pswitch_1
    if-nez p1, :cond_1

    .line 302
    const v0, 0x7f0900d5

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_0

    .line 6
    :cond_1
    sput-object p1, Lcom/whatsapp/GroupChatInfo;->K:Lcom/whatsapp/zq;

    .line 5
    invoke-direct {p0, p1}, Lcom/whatsapp/GroupChatInfo;->b(Lcom/whatsapp/zq;)V

    goto :goto_0

    .line 395
    :pswitch_2
    sput-object p1, Lcom/whatsapp/GroupChatInfo;->K:Lcom/whatsapp/zq;

    .line 266
    invoke-direct {p0}, Lcom/whatsapp/GroupChatInfo;->j()V

    goto :goto_0

    .line 118
    :pswitch_3
    invoke-static {p1}, Lcom/whatsapp/Conversation;->a(Lcom/whatsapp/zq;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/GroupChatInfo;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 251
    :pswitch_4
    invoke-virtual {p1}, Lcom/whatsapp/zq;->a()Ljava/lang/String;

    move-result-object v0

    .line 95
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 86
    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 417
    invoke-virtual {p0, v1}, Lcom/whatsapp/GroupChatInfo;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 294
    :pswitch_5
    invoke-virtual {p0, v3}, Lcom/whatsapp/GroupChatInfo;->showDialog(I)V

    goto :goto_0

    .line 337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method static b(Lcom/whatsapp/GroupChatInfo;)F
    .locals 1
    .parameter

    .prologue
    .line 384
    iget v0, p0, Lcom/whatsapp/GroupChatInfo;->h:F

    return v0
.end method

.method private b(Lcom/whatsapp/zq;)V
    .locals 5
    .parameter

    .prologue
    const/4 v4, 0x1

    .line 250
    invoke-virtual {p1}, Lcom/whatsapp/zq;->a()Ljava/lang/String;

    move-result-object v0

    .line 132
    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    sget-object v3, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 202
    sget-object v2, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    aget-object v2, v2, v4

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 176
    invoke-virtual {p0}, Lcom/whatsapp/GroupChatInfo;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 20
    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 380
    invoke-static {v4}, Lcom/whatsapp/g;->a(Z)V

    .line 259
    const/16 v0, 0xa

    invoke-virtual {p0, v1, v0}, Lcom/whatsapp/GroupChatInfo;->startActivityForResult(Landroid/content/Intent;I)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 149
    :cond_0
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 114
    invoke-static {}, Lcom/whatsapp/App;->h()V

    .line 12
    :cond_1
    return-void
.end method

.method private c()V
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/16 v7, 0x8

    const/4 v2, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 101
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/fq;->p(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->p:Ljava/util/ArrayList;

    .line 312
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 198
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v4, 0x7f0d011d

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 242
    if-nez v0, :cond_0

    .line 430
    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->m:Landroid/widget/TextView;

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 363
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    if-eqz v3, :cond_3

    .line 267
    :cond_0
    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->m:Landroid/widget/TextView;

    const v5, 0x7f090280

    new-array v6, v8, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v2

    invoke-virtual {p0, v5, v6}, Lcom/whatsapp/GroupChatInfo;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 167
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 68
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 154
    const/4 v0, 0x3

    new-array v4, v0, [Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v1, 0x7f0d011e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v4, v2

    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v1, 0x7f0d011f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v4, v8

    const/4 v1, 0x2

    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v5, 0x7f0d0120

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v4, v1

    move v1, v2

    .line 407
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    array-length v5, v4

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 261
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    aget-object v5, v4, v1

    invoke-direct {p0, v0, v5}, Lcom/whatsapp/GroupChatInfo;->a(Lcom/whatsapp/sz;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 135
    aget-object v0, v4, v1

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 88
    add-int/lit8 v0, v1, 0x1

    if-eqz v3, :cond_4

    .line 231
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :cond_2
    array-length v1, v4

    if-ge v0, v1, :cond_3

    .line 38
    aget-object v1, v4, v0

    invoke-virtual {v1, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 106
    add-int/lit8 v0, v0, 0x1

    if-eqz v3, :cond_2

    .line 254
    :cond_3
    return-void

    :cond_4
    move v1, v0

    goto :goto_0
.end method

.method static c(Lcom/whatsapp/GroupChatInfo;)V
    .locals 0
    .parameter

    .prologue
    .line 425
    invoke-direct {p0}, Lcom/whatsapp/GroupChatInfo;->c()V

    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 47
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    iget-object v0, v0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 311
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    invoke-direct {v0}, Lcom/whatsapp/GroupChatInfo;->i()V

    .line 197
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/whatsapp/GroupChatInfo;->removeDialog(I)V

    .line 36
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/whatsapp/GroupChatInfo;->removeDialog(I)V

    .line 45
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/whatsapp/GroupChatInfo;->removeDialog(I)V

    .line 375
    :cond_0
    return-void
.end method

.method public static d()Z
    .locals 1

    .prologue
    .line 164
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    if-eqz v0, :cond_0

    .line 324
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 207
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static e()Lcom/whatsapp/GroupChatInfo;
    .locals 1

    .prologue
    .line 175
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    return-object v0
.end method

.method public static e(Ljava/lang/String;)V
    .locals 3
    .parameter

    .prologue
    .line 341
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    iget-object v0, v0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v1

    iput-object v1, v0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    .line 226
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    sget-object v1, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    iget-object v1, v1, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    invoke-direct {v0, v1}, Lcom/whatsapp/GroupChatInfo;->a(Lcom/whatsapp/zq;)V

    .line 274
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    invoke-direct {v0}, Lcom/whatsapp/GroupChatInfo;->h()V

    .line 377
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    iget-object v0, v0, Lcom/whatsapp/GroupChatInfo;->B:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 291
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    iget-object v0, v0, Lcom/whatsapp/GroupChatInfo;->w:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 94
    :cond_0
    return-void
.end method

.method public static f()V
    .locals 2

    .prologue
    .line 423
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    if-eqz v0, :cond_0

    .line 273
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    iget-object v0, v0, Lcom/whatsapp/GroupChatInfo;->B:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 253
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    iget-object v0, v0, Lcom/whatsapp/GroupChatInfo;->w:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 52
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    iget-object v0, v0, Lcom/whatsapp/GroupChatInfo;->w:Landroid/widget/ImageButton;

    sget-object v1, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    iget-object v1, v1, Lcom/whatsapp/GroupChatInfo;->J:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 443
    :cond_0
    return-void
.end method

.method private f(Ljava/lang/String;)V
    .locals 1
    .parameter

    .prologue
    .line 112
    invoke-static {}, Lcom/whatsapp/App;->sb()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 159
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/GroupChatInfo;->showDialog(I)V

    .line 42
    new-instance v0, Lcom/whatsapp/k9;

    invoke-direct {v0, p0, p1}, Lcom/whatsapp/k9;-><init>(Lcom/whatsapp/GroupChatInfo;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/whatsapp/k9;->start()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 424
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/whatsapp/eu;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    invoke-direct {p0}, Lcom/whatsapp/GroupChatInfo;->i()V

    .line 402
    :cond_1
    return-void
.end method

.method public static g()V
    .locals 2

    .prologue
    .line 29
    sget-boolean v0, Lcom/whatsapp/eu;->d:Z

    if-eqz v0, :cond_0

    .line 208
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->H:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 224
    :cond_0
    return-void
.end method

.method private g(Ljava/lang/String;)V
    .locals 3
    .parameter

    .prologue
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 353
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->s:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 241
    new-instance v1, Ljava/util/Vector;

    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    .line 193
    invoke-virtual {v1, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 414
    iget-object v2, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-static {v2, v1}, Lcom/whatsapp/eu;->c(Ljava/lang/String;Ljava/util/Vector;)V

    .line 8
    if-eqz v0, :cond_2

    .line 437
    :cond_0
    invoke-static {}, Lcom/whatsapp/App;->sb()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 263
    const/4 v1, 0x5

    invoke-virtual {p0, v1}, Lcom/whatsapp/GroupChatInfo;->showDialog(I)V

    .line 168
    new-instance v1, Lcom/whatsapp/l9;

    invoke-direct {v1, p0, p1}, Lcom/whatsapp/l9;-><init>(Lcom/whatsapp/GroupChatInfo;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whatsapp/l9;->start()V

    if-eqz v0, :cond_2

    .line 349
    :cond_1
    invoke-direct {p0}, Lcom/whatsapp/GroupChatInfo;->i()V

    .line 184
    :cond_2
    return-void
.end method

.method private h()V
    .locals 2

    .prologue
    .line 62
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whatsapp/GroupChatInfo;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    .line 19
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->j:Landroid/widget/TextView;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    return-void
.end method

.method private i()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 305
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v2, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-virtual {v0, v2, v5}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    .line 427
    invoke-direct {p0}, Lcom/whatsapp/GroupChatInfo;->h()V

    .line 140
    invoke-virtual {p0}, Lcom/whatsapp/GroupChatInfo;->b()V

    .line 282
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 339
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/eu;->i(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    .line 109
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 429
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 115
    sget-object v3, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v3, v0, v5}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 69
    iget-object v3, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 222
    iget-object v3, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 450
    :cond_1
    if-eqz v1, :cond_0

    .line 188
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    new-instance v1, Lcom/whatsapp/du;

    invoke-direct {v1}, Lcom/whatsapp/du;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 290
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/GroupChatInfo;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 265
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->B:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 396
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->w:Landroid/widget/ImageButton;

    invoke-virtual {v0, v4}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 218
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->k:Landroid/widget/TextView;

    const v1, 0x7f09029b

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    const/4 v3, 0x1

    sget v4, Lcom/whatsapp/eu;->b:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {p0, v1, v2}, Lcom/whatsapp/GroupChatInfo;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 292
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->w:Landroid/widget/ImageButton;

    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->J:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 196
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->q:Lcom/whatsapp/ie;

    invoke-virtual {v0}, Lcom/whatsapp/ie;->notifyDataSetChanged()V

    .line 447
    return-void
.end method

.method private j()V
    .locals 4

    .prologue
    const/4 v3, 0x4

    .line 293
    const/4 v0, 0x1

    :try_start_0
    invoke-static {v0}, Lcom/whatsapp/g;->a(Z)V

    .line 412
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 13
    sget-object v1, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 178
    sget-object v1, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    sget-object v2, Lcom/whatsapp/GroupChatInfo;->K:Lcom/whatsapp/zq;

    invoke-virtual {v2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 44
    sget-object v1, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 194
    const/high16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 9
    const/16 v1, 0xb

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/GroupChatInfo;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    :goto_0
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 248
    invoke-virtual {p0, v3}, Lcom/whatsapp/GroupChatInfo;->showDialog(I)V

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 205
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 271
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v2, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/whatsapp/qp;->c(Ljava/lang/String;)Lcom/whatsapp/zq;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    .line 166
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/eu;->i(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    .line 211
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 285
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 18
    sget-object v3, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v4, 0x0

    invoke-virtual {v3, v0, v4}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 350
    iget-object v3, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 247
    iget-object v3, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    :cond_1
    if-eqz v1, :cond_0

    .line 134
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    new-instance v1, Lcom/whatsapp/du;

    invoke-direct {v1}, Lcom/whatsapp/du;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 49
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->q:Lcom/whatsapp/ie;

    invoke-virtual {v0}, Lcom/whatsapp/ie;->notifyDataSetChanged()V

    .line 449
    return-void
.end method

.method public a(Landroid/view/View;Z)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 428
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->D:Landroid/widget/ListView;

    new-instance v1, Lcom/whatsapp/lt;

    invoke-direct {v1, p0, p1, p2}, Lcom/whatsapp/lt;-><init>(Lcom/whatsapp/GroupChatInfo;Landroid/view/View;Z)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    .line 214
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 105
    invoke-static {p1}, Lcom/whatsapp/eu;->f(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 161
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 256
    if-eqz v0, :cond_0

    .line 369
    new-instance v1, Lcom/whatsapp/vq;

    invoke-direct {v1, v0}, Lcom/whatsapp/vq;-><init>(Lcom/whatsapp/zq;)V

    .line 41
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/whatsapp/zq;->a(Ljava/util/List;Lcom/whatsapp/wq;)Z

    .line 139
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->q:Lcom/whatsapp/ie;

    invoke-virtual {v0}, Lcom/whatsapp/ie;->notifyDataSetChanged()V

    .line 237
    :cond_0
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_2

    .line 121
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 219
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->C:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 419
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->j()V

    .line 452
    invoke-virtual {p0}, Lcom/whatsapp/GroupChatInfo;->b()V

    .line 177
    :cond_2
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 8
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 455
    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v3, 0x7f090002

    invoke-virtual {v2, v3}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 434
    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v3, v2, v0}, Lcom/whatsapp/App;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 441
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/16 v5, 0xf

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 446
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/16 v5, 0xd

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/16 v5, 0xc

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "]"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 385
    iget-object v3, p0, Lcom/whatsapp/GroupChatInfo;->s:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 444
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1

    .line 318
    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    :cond_0
    if-ge v0, v3, :cond_1

    aget-object v4, v2, v0

    .line 270
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/16 v7, 0xe

    aget-object v6, v6, v7

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 258
    sget-object v5, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v6, 0x0

    invoke-virtual {v5, v4, v6}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v5

    .line 240
    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 352
    iget-object v6, p0, Lcom/whatsapp/GroupChatInfo;->s:Ljava/util/HashMap;

    invoke-virtual {v6, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    .line 7
    :cond_1
    new-instance v0, Lcom/whatsapp/du;

    invoke-direct {v0}, Lcom/whatsapp/du;-><init>()V

    invoke-static {p2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 317
    return-void
.end method

.method public b()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    const/16 v2, 0x8

    const/4 v5, 0x4

    const/4 v4, 0x0

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 100
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->C:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 249
    invoke-static {}, Lcom/whatsapp/App;->o()Z

    move-result v1

    if-nez v1, :cond_1

    .line 156
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->x:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 459
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->y:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 461
    :cond_0
    :goto_0
    return-void

    .line 403
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/whatsapp/hz;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 110
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->C:Landroid/view/View;

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 307
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->x:Landroid/widget/ImageButton;

    invoke-virtual {v1, v5}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 234
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->y:Landroid/widget/Button;

    invoke-virtual {v1, v5}, Landroid/widget/Button;->setVisibility(I)V

    if-eqz v0, :cond_0

    .line 272
    :cond_2
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v2}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a0010

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v3}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v3

    iget v3, v3, Lcom/whatsapp/j4;->L:F

    invoke-virtual {v1, v2, v3, v4}, Lcom/whatsapp/zq;->a(IFZ)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 27
    iget-object v2, p0, Lcom/whatsapp/GroupChatInfo;->x:Landroid/widget/ImageButton;

    invoke-virtual {v2, v7}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 142
    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v2

    iget v2, v2, Lcom/whatsapp/j4;->K:F

    float-to-int v2, v2

    .line 442
    iget-object v3, p0, Lcom/whatsapp/GroupChatInfo;->x:Landroid/widget/ImageButton;

    invoke-virtual {v3, v2, v2, v2, v2}, Landroid/widget/ImageButton;->setPadding(IIII)V

    .line 345
    if-nez v1, :cond_3

    .line 22
    iget-object v2, p0, Lcom/whatsapp/GroupChatInfo;->y:Landroid/widget/Button;

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setVisibility(I)V

    .line 262
    iget-object v2, p0, Lcom/whatsapp/GroupChatInfo;->x:Landroid/widget/ImageButton;

    invoke-virtual {v2, v5}, Landroid/widget/ImageButton;->setVisibility(I)V

    if-eqz v0, :cond_0

    .line 387
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->y:Landroid/widget/Button;

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->x:Landroid/widget/ImageButton;

    invoke-virtual {v0, v4}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->x:Landroid/widget/ImageButton;

    new-instance v2, Lcom/whatsapp/p;

    invoke-virtual {p0}, Lcom/whatsapp/GroupChatInfo;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    iget v4, p0, Lcom/whatsapp/GroupChatInfo;->h:F

    invoke-direct {v2, v3, v1, v4, v7}, Lcom/whatsapp/p;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;FLjava/lang/CharSequence;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 383
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->x:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    .line 90
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->x:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V

    goto/16 :goto_0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 78
    return-void
.end method

.method public k()V
    .locals 2

    .prologue
    .line 209
    new-instance v0, Lcom/whatsapp/n9;

    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->L:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lcom/whatsapp/n9;-><init>(Landroid/os/Handler;)V

    .line 319
    invoke-virtual {v0}, Lcom/whatsapp/n9;->start()V

    .line 389
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 7
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x0

    const/4 v4, -0x1

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 127
    packed-switch p1, :pswitch_data_0

    .line 223
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 228
    :pswitch_1
    if-ne p2, v4, :cond_3

    .line 370
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 303
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/GroupChatInfo;->K:Lcom/whatsapp/zq;

    invoke-virtual {v1, v2, v3}, Lcom/whatsapp/qp;->a(Landroid/net/Uri;Lcom/whatsapp/zq;)V

    if-eqz v0, :cond_2

    .line 77
    :cond_1
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    sget-object v2, Lcom/whatsapp/GroupChatInfo;->K:Lcom/whatsapp/zq;

    invoke-virtual {v1, v2}, Lcom/whatsapp/qp;->b(Lcom/whatsapp/zq;)V

    .line 406
    :cond_2
    invoke-direct {p0}, Lcom/whatsapp/GroupChatInfo;->i()V

    .line 217
    sget-object v1, Lcom/whatsapp/GroupChatInfo;->K:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/whatsapp/Conversation;->e(Ljava/lang/String;)V

    if-eqz v0, :cond_4

    .line 99
    :cond_3
    sget-object v1, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/16 v2, 0x13

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 73
    :cond_4
    invoke-static {v5}, Lcom/whatsapp/g;->a(Z)V

    .line 130
    if-eqz v0, :cond_0

    .line 55
    :pswitch_2
    if-ne p2, v4, :cond_5

    .line 21
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    sget-object v2, Lcom/whatsapp/GroupChatInfo;->K:Lcom/whatsapp/zq;

    invoke-virtual {v1, v2}, Lcom/whatsapp/qp;->b(Lcom/whatsapp/zq;)V

    .line 145
    invoke-direct {p0}, Lcom/whatsapp/GroupChatInfo;->i()V

    .line 330
    sget-object v1, Lcom/whatsapp/GroupChatInfo;->K:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/whatsapp/Conversation;->e(Ljava/lang/String;)V

    if-eqz v0, :cond_6

    .line 309
    :cond_5
    sget-object v1, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/16 v2, 0x11

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 368
    :cond_6
    invoke-static {v5}, Lcom/whatsapp/g;->a(Z)V

    .line 336
    if-eqz v0, :cond_0

    .line 31
    :pswitch_3
    if-ne p2, v4, :cond_0

    .line 456
    sget-object v1, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/16 v2, 0x12

    aget-object v1, v1, v2

    invoke-virtual {p3, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 399
    invoke-direct {p0, v1}, Lcom/whatsapp/GroupChatInfo;->f(Ljava/lang/String;)V

    .line 408
    if-eqz v0, :cond_0

    .line 72
    :pswitch_4
    if-ne p2, v4, :cond_0

    .line 23
    if-eqz p3, :cond_7

    sget-object v1, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/16 v2, 0x10

    aget-object v1, v1, v2

    invoke-virtual {p3, v1, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 364
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->C:Landroid/view/View;

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 351
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->x:Landroid/widget/ImageButton;

    invoke-virtual {v1, v6}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 359
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->y:Landroid/widget/Button;

    invoke-virtual {v1, v6}, Landroid/widget/Button;->setVisibility(I)V

    .line 35
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    invoke-static {v1, p0}, Lcom/whatsapp/iz;->b(Lcom/whatsapp/zq;Landroid/app/Activity;)V

    if-eqz v0, :cond_0

    .line 10
    :cond_7
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    const/16 v2, 0xd

    invoke-static {p3, v1, p0, v2, p0}, Lcom/whatsapp/iz;->a(Landroid/content/Intent;Lcom/whatsapp/zq;Landroid/app/Activity;ILcom/whatsapp/lr;)V

    if-eqz v0, :cond_0

    .line 144
    :pswitch_5
    invoke-static {}, Lcom/whatsapp/iz;->a()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 306
    if-ne p2, v4, :cond_8

    .line 344
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    invoke-static {v1, p0}, Lcom/whatsapp/iz;->a(Lcom/whatsapp/zq;Landroid/app/Activity;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 420
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->C:Landroid/view/View;

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 221
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->x:Landroid/widget/ImageButton;

    invoke-virtual {v1, v6}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 257
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->y:Landroid/widget/Button;

    invoke-virtual {v1, v6}, Landroid/widget/Button;->setVisibility(I)V

    if-eqz v0, :cond_0

    .line 183
    :cond_8
    if-nez p2, :cond_0

    if-eqz p3, :cond_0

    .line 66
    invoke-static {p3, p0}, Lcom/whatsapp/iz;->a(Landroid/content/Intent;Lcom/whatsapp/lr;)V

    if-eqz v0, :cond_0

    .line 435
    :pswitch_6
    invoke-virtual {p0}, Lcom/whatsapp/GroupChatInfo;->b()V

    goto/16 :goto_0

    .line 127
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0
    .parameter

    .prologue
    .line 289
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 365
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 2
    .parameter

    .prologue
    .line 162
    invoke-interface {p1}, Landroid/view/MenuItem;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    check-cast v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 43
    iget-object v0, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->targetView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->E:Lcom/whatsapp/zq;

    .line 173
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->E:Lcom/whatsapp/zq;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/whatsapp/GroupChatInfo;->a(Lcom/whatsapp/zq;I)Z

    .line 91
    const/4 v0, 0x1

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8
    .parameter

    .prologue
    const/4 v7, 0x0

    const v6, 0x7f0d0114

    const/4 v2, 0x1

    const/4 v1, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 123
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onCreate(Landroid/os/Bundle;)V

    .line 315
    const v0, 0x7f030038

    invoke-virtual {p0, v0}, Lcom/whatsapp/GroupChatInfo;->setContentView(I)V

    .line 82
    sput-boolean v1, Lcom/whatsapp/eu;->d:Z

    .line 131
    invoke-virtual {p0}, Lcom/whatsapp/GroupChatInfo;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v4, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/16 v5, 0xa

    aget-object v4, v4, v5

    invoke-virtual {v0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    .line 213
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-virtual {v0, v4, v7}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    .line 113
    iget v0, p0, Lcom/whatsapp/GroupChatInfo;->g:I

    const/4 v4, -0x1

    if-ne v0, v4, :cond_0

    .line 155
    invoke-virtual {p0}, Lcom/whatsapp/GroupChatInfo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0a0004

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/GroupChatInfo;->g:I

    .line 11
    :cond_0
    iget v0, p0, Lcom/whatsapp/GroupChatInfo;->h:F

    const/high16 v4, -0x4080

    cmpl-float v0, v0, v4

    if-nez v0, :cond_1

    .line 165
    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/j4;->L:F

    iput v0, p0, Lcom/whatsapp/GroupChatInfo;->h:F

    .line 313
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->s:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 264
    sget-object v0, Lcom/whatsapp/eu;->e:Ljava/util/HashMap;

    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/gu;

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->u:Lcom/whatsapp/gu;

    .line 374
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/eu;->i(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    .line 329
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 286
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_3

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 124
    sget-object v5, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v5, v0, v7}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 143
    iget-object v5, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 92
    iget-object v5, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    :cond_3
    if-eqz v3, :cond_2

    .line 84
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    new-instance v4, Lcom/whatsapp/du;

    invoke-direct {v4}, Lcom/whatsapp/du;-><init>()V

    invoke-static {v0, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 278
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    invoke-virtual {p0, v0, v4}, Lcom/whatsapp/GroupChatInfo;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 283
    invoke-virtual {p0}, Lcom/whatsapp/GroupChatInfo;->getListView()Landroid/widget/ListView;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->D:Landroid/widget/ListView;

    .line 46
    new-instance v0, Lcom/whatsapp/ie;

    const v4, 0x7f03004c

    iget-object v5, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    invoke-direct {v0, p0, p0, v4, v5}, Lcom/whatsapp/ie;-><init>(Lcom/whatsapp/GroupChatInfo;Landroid/content/Context;ILjava/util/List;)V

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->q:Lcom/whatsapp/ie;

    .line 276
    invoke-virtual {p0}, Lcom/whatsapp/GroupChatInfo;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    sget-object v4, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/16 v5, 0xb

    aget-object v4, v4, v5

    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 321
    const v4, 0x7f030039

    iget-object v5, p0, Lcom/whatsapp/GroupChatInfo;->D:Landroid/widget/ListView;

    invoke-virtual {v0, v4, v5, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    iput-object v4, p0, Lcom/whatsapp/GroupChatInfo;->z:Landroid/view/View;

    .line 295
    const v4, 0x7f03003a

    iget-object v5, p0, Lcom/whatsapp/GroupChatInfo;->D:Landroid/widget/ListView;

    invoke-virtual {v0, v4, v5, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    .line 15
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->D:Landroid/widget/ListView;

    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->z:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V

    .line 334
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->D:Landroid/widget/ListView;

    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 445
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->D:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 438
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->D:Landroid/widget/ListView;

    new-instance v4, Lcom/whatsapp/vt;

    invoke-direct {v4, p0}, Lcom/whatsapp/vt;-><init>(Lcom/whatsapp/GroupChatInfo;)V

    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 287
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 398
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 338
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->q()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 320
    const v0, 0x7f0d003d

    invoke-virtual {p0, v0}, Lcom/whatsapp/GroupChatInfo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 331
    invoke-virtual {p0, v6}, Lcom/whatsapp/GroupChatInfo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 416
    invoke-virtual {p0, v6}, Lcom/whatsapp/GroupChatInfo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v4, Lcom/whatsapp/wt;

    invoke-direct {v4, p0}, Lcom/whatsapp/wt;-><init>(Lcom/whatsapp/GroupChatInfo;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 325
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v4, 0x7f0d0118

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->n:Landroid/widget/TextView;

    .line 28
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    iget-object v4, v4, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iget-object v5, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    iget-object v5, v5, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    const-string v6, "@"

    invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v4, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->j:Ljava/lang/String;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->j:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_7

    .line 308
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/App;->l(Ljava/lang/String;)V

    if-eqz v3, :cond_8

    .line 137
    :cond_7
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    invoke-direct {p0, v0}, Lcom/whatsapp/GroupChatInfo;->a(Lcom/whatsapp/zq;)V

    .line 191
    :cond_8
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->z:Landroid/view/View;

    const v4, 0x7f0d0115

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v4, Lcom/whatsapp/yt;

    invoke-direct {v4, p0}, Lcom/whatsapp/yt;-><init>(Lcom/whatsapp/GroupChatInfo;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 413
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v4, 0x7f0d011b

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v4, Lcom/whatsapp/zt;

    invoke-direct {v4, p0}, Lcom/whatsapp/zt;-><init>(Lcom/whatsapp/GroupChatInfo;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 418
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v4, 0x7f0d011d

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v4, Lcom/whatsapp/au;

    invoke-direct {v4, p0}, Lcom/whatsapp/au;-><init>(Lcom/whatsapp/GroupChatInfo;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v4, 0x7f0d0116

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->x:Landroid/widget/ImageButton;

    .line 280
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v4, 0x7f0d0117

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->y:Landroid/widget/Button;

    .line 111
    new-instance v0, Lcom/whatsapp/bu;

    invoke-direct {v0, p0}, Lcom/whatsapp/bu;-><init>(Lcom/whatsapp/GroupChatInfo;)V

    .line 245
    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->x:Landroid/widget/ImageButton;

    invoke-virtual {v4, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 192
    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->y:Landroid/widget/Button;

    invoke-virtual {v4, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 30
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v4, 0x7f0d00a6

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->C:Landroid/view/View;

    .line 335
    invoke-virtual {p0}, Lcom/whatsapp/GroupChatInfo;->b()V

    .line 85
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->D:Landroid/widget/ListView;

    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->q:Lcom/whatsapp/ie;

    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 279
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->D:Landroid/widget/ListView;

    invoke-virtual {p0, v0}, Lcom/whatsapp/GroupChatInfo;->registerForContextMenu(Landroid/view/View;)V

    .line 269
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v4, 0x7f0d0070

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->v:Landroid/view/ViewGroup;

    .line 392
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v4, 0x7f0d010b

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->j:Landroid/widget/TextView;

    .line 371
    invoke-direct {p0}, Lcom/whatsapp/GroupChatInfo;->h()V

    .line 426
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v4, 0x7f0d011a

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->w:Landroid/widget/ImageButton;

    .line 102
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v4, 0x7f0d0119

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->B:Landroid/view/View;

    .line 378
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->w:Landroid/widget/ImageButton;

    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->J:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v4}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 367
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->A:Landroid/view/View;

    const v4, 0x7f0d0121

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/GroupChatInfo;->k:Landroid/widget/TextView;

    .line 48
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->k:Landroid/widget/TextView;

    const v4, 0x7f09029b

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v1

    sget v6, Lcom/whatsapp/eu;->b:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-virtual {p0, v4, v5}, Lcom/whatsapp/GroupChatInfo;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 432
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->k:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->I:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 56
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/m5;->b(Ljava/lang/String;)V

    .line 158
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->M:Lcom/whatsapp/lq;

    invoke-virtual {v0, v4}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/lq;)V

    .line 340
    invoke-static {p0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/uk;)V

    .line 128
    sget v0, Lcom/whatsapp/App;->wc:I

    if-eqz v0, :cond_9

    if-eqz v3, :cond_a

    move v0, v1

    :goto_0
    sput-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    :cond_9
    return-void

    :cond_a
    move v0, v2

    goto :goto_0
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 7
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 232
    invoke-super {p0, p1, p2, p3}, Lcom/whatsapp/DialogToastListActivity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 358
    check-cast p3, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    iget-object v0, p3, Landroid/widget/AdapterView$AdapterContextMenuInfo;->targetView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 436
    if-nez v0, :cond_1

    .line 296
    :cond_0
    :goto_0
    return-void

    .line 76
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->s:Ljava/util/HashMap;

    iget-object v2, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 146
    const v1, 0x7f09029c

    new-array v2, v6, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->d()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {p0, v1, v2}, Lcom/whatsapp/GroupChatInfo;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v5, v6, v5, v1}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 431
    const/4 v1, 0x4

    const v2, 0x7f09029e

    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->d()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/GroupChatInfo;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v5, v1, v5, v2}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 238
    iget-object v1, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-nez v1, :cond_2

    .line 361
    const/4 v1, 0x2

    const v2, 0x7f09022a

    invoke-virtual {p0, v2}, Lcom/whatsapp/GroupChatInfo;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v5, v1, v5, v2}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 382
    const/4 v1, 0x3

    const v2, 0x7f09022b

    invoke-virtual {p0, v2}, Lcom/whatsapp/GroupChatInfo;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v5, v1, v5, v2}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_3

    .line 150
    :cond_2
    const v1, 0x7f0900ef

    new-array v2, v6, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->d()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {p0, v1, v2}, Lcom/whatsapp/GroupChatInfo;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v5, v5, v5, v1}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 328
    :cond_3
    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    invoke-virtual {v1}, Lcom/whatsapp/zq;->q()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 298
    const/4 v1, 0x5

    const v2, 0x7f09029f

    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->d()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v5

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/GroupChatInfo;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v5, v1, v5, v0}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    goto/16 :goto_0
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 8
    .parameter

    .prologue
    const/4 v7, 0x2

    const v2, 0x7f09008a

    const v3, 0x7f09000e

    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 379
    sparse-switch p1, :sswitch_data_0

    .line 204
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    .line 421
    :goto_0
    return-object v0

    .line 201
    :sswitch_0
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 172
    const v1, 0x7f09025f

    invoke-virtual {p0, v1}, Lcom/whatsapp/GroupChatInfo;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 439
    invoke-virtual {p0, v2}, Lcom/whatsapp/GroupChatInfo;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 180
    invoke-virtual {v0, v5}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 362
    invoke-virtual {v0, v6}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    goto :goto_0

    .line 415
    :sswitch_1
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 122
    const v1, 0x7f090260

    invoke-virtual {p0, v1}, Lcom/whatsapp/GroupChatInfo;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 185
    invoke-virtual {p0, v2}, Lcom/whatsapp/GroupChatInfo;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 411
    invoke-virtual {v0, v5}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 360
    invoke-virtual {v0, v6}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    goto :goto_0

    .line 327
    :sswitch_2
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 372
    const v1, 0x7f090261

    invoke-virtual {p0, v1}, Lcom/whatsapp/GroupChatInfo;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 409
    invoke-virtual {p0, v2}, Lcom/whatsapp/GroupChatInfo;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 138
    invoke-virtual {v0, v5}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 366
    invoke-virtual {v0, v6}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    goto :goto_0

    .line 54
    :sswitch_3
    new-instance v4, Lcom/whatsapp/nt;

    invoke-direct {v4, p0}, Lcom/whatsapp/nt;-><init>(Lcom/whatsapp/GroupChatInfo;)V

    .line 333
    new-instance v0, Lcom/whatsapp/b;

    const v2, 0x7f090264

    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v3, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    iget-object v3, v3, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/whatsapp/qp;->c(Ljava/lang/String;)Lcom/whatsapp/zq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    sget v5, Lcom/whatsapp/eu;->c:I

    const v6, 0x7f090286

    const v7, 0x7f0902a1

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Lcom/whatsapp/b;-><init>(Landroid/app/Activity;ILjava/lang/String;Lcom/whatsapp/ms;III)V

    goto :goto_0

    .line 243
    :sswitch_4
    const v0, 0x7f0900d8

    new-array v1, v5, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    invoke-virtual {v2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v6

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/GroupChatInfo;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 98
    invoke-virtual {p0}, Lcom/whatsapp/GroupChatInfo;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 275
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    if-nez v1, :cond_0

    :goto_1
    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09000c

    new-instance v2, Lcom/whatsapp/pt;

    invoke-direct {v2, p0}, Lcom/whatsapp/pt;-><init>(Lcom/whatsapp/GroupChatInfo;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/ot;

    invoke-direct {v1, p0}, Lcom/whatsapp/ot;-><init>(Lcom/whatsapp/GroupChatInfo;)V

    invoke-virtual {v0, v3, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    :cond_0
    move-object v0, v1

    goto :goto_1

    .line 225
    :sswitch_5
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->E:Lcom/whatsapp/zq;

    if-eqz v0, :cond_2

    .line 422
    const v0, 0x7f09016f

    new-array v1, v7, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/whatsapp/GroupChatInfo;->E:Lcom/whatsapp/zq;

    invoke-virtual {v2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v6

    iget-object v2, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    invoke-virtual {v2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v5

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/GroupChatInfo;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 462
    invoke-virtual {p0}, Lcom/whatsapp/GroupChatInfo;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 199
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    if-nez v1, :cond_1

    :goto_2
    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09000c

    new-instance v2, Lcom/whatsapp/rt;

    invoke-direct {v2, p0}, Lcom/whatsapp/rt;-><init>(Lcom/whatsapp/GroupChatInfo;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/qt;

    invoke-direct {v1, p0}, Lcom/whatsapp/qt;-><init>(Lcom/whatsapp/GroupChatInfo;)V

    invoke-virtual {v0, v3, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    :cond_1
    move-object v0, v1

    goto :goto_2

    .line 181
    :cond_2
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    goto/16 :goto_0

    .line 120
    :sswitch_6
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 67
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f090115

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/st;

    invoke-direct {v1, p0}, Lcom/whatsapp/st;-><init>(Lcom/whatsapp/GroupChatInfo;)V

    invoke-virtual {v0, v3, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 40
    :sswitch_7
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->E:Lcom/whatsapp/zq;

    if-eqz v0, :cond_6

    .line 460
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 74
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 388
    const v2, 0x7f09029c

    new-array v3, v5, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->E:Lcom/whatsapp/zq;

    invoke-virtual {v4}, Lcom/whatsapp/zq;->d()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/GroupChatInfo;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 386
    const v2, 0x7f09029e

    new-array v3, v5, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->E:Lcom/whatsapp/zq;

    invoke-virtual {v4}, Lcom/whatsapp/zq;->d()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/GroupChatInfo;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    iget-object v2, p0, Lcom/whatsapp/GroupChatInfo;->E:Lcom/whatsapp/zq;

    iget-object v2, v2, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v2, :cond_3

    .line 169
    const v2, 0x7f0900ef

    new-array v3, v5, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->E:Lcom/whatsapp/zq;

    invoke-virtual {v4}, Lcom/whatsapp/zq;->d()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/GroupChatInfo;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v2, :cond_4

    .line 394
    :cond_3
    const v2, 0x7f09022a

    invoke-virtual {p0, v2}, Lcom/whatsapp/GroupChatInfo;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    const v2, 0x7f09022b

    invoke-virtual {p0, v2}, Lcom/whatsapp/GroupChatInfo;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 357
    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 300
    :cond_4
    iget-object v2, p0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    invoke-virtual {v2}, Lcom/whatsapp/zq;->q()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 57
    const v2, 0x7f09029f

    new-array v3, v5, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/whatsapp/GroupChatInfo;->E:Lcom/whatsapp/zq;

    invoke-virtual {v4}, Lcom/whatsapp/zq;->d()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/GroupChatInfo;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    .line 433
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 354
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 393
    new-instance v3, Lcom/whatsapp/tt;

    invoke-direct {v3, p0, v1}, Lcom/whatsapp/tt;-><init>(Lcom/whatsapp/GroupChatInfo;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 186
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 457
    new-instance v1, Lcom/whatsapp/ut;

    invoke-direct {v1, p0}, Lcom/whatsapp/ut;-><init>(Lcom/whatsapp/GroupChatInfo;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 34
    invoke-virtual {v0, v5}, Landroid/app/AlertDialog;->requestWindowFeature(I)Z

    goto/16 :goto_0

    .line 212
    :cond_6
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    goto/16 :goto_0

    .line 379
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_2
        0x2 -> :sswitch_4
        0x3 -> :sswitch_7
        0x4 -> :sswitch_6
        0x5 -> :sswitch_1
        0x6 -> :sswitch_5
        0x32 -> :sswitch_3
    .end sparse-switch
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 448
    sget-object v0, Lcom/whatsapp/GroupChatInfo;->N:[Ljava/lang/String;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 458
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onDestroy()V

    .line 96
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v1, p0, Lcom/whatsapp/GroupChatInfo;->M:Lcom/whatsapp/lq;

    invoke-virtual {v0, v1}, Lcom/whatsapp/fq;->b(Lcom/whatsapp/lq;)V

    .line 16
    invoke-static {p0}, Lcom/whatsapp/App;->b(Lcom/whatsapp/uk;)V

    .line 260
    iget-object v0, p0, Lcom/whatsapp/GroupChatInfo;->i:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/m5;->c(Ljava/lang/String;)V

    .line 244
    return-void
.end method

.method public onStart()V
    .locals 0

    .prologue
    .line 50
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onStart()V

    .line 133
    sput-object p0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    .line 104
    return-void
.end method

.method public onStop()V
    .locals 1

    .prologue
    .line 405
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onStop()V

    .line 51
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/GroupChatInfo;->F:Lcom/whatsapp/GroupChatInfo;

    .line 346
    return-void
.end method
