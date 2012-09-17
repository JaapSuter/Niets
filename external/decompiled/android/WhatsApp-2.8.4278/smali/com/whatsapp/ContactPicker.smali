.class public Lcom/whatsapp/ContactPicker;
.super Lcom/whatsapp/VerifyMessageStoreListActivity;
.source "ContactPicker.java"

# interfaces
.implements Lcom/whatsapp/uk;
.implements Lcom/whatsapp/k2;


# static fields
.field private static D:Z

.field private static final T:[Ljava/lang/String;

.field private static final h:Lcom/whatsapp/zq;

.field private static final i:Lcom/whatsapp/zq;

.field private static final j:Lcom/whatsapp/zq;


# instance fields
.field private A:Ljava/lang/String;

.field private B:Ljava/lang/String;

.field private C:Landroid/content/Intent;

.field private E:I

.field private F:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation
.end field

.field private G:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation
.end field

.field private H:Landroid/widget/ListView;

.field private I:Landroid/view/inputmethod/InputMethodManager;

.field private J:Landroid/widget/EditText;

.field private K:Landroid/widget/TextView;

.field private L:Landroid/widget/ImageButton;

.field private M:Landroid/widget/ImageButton;

.field private N:Landroid/widget/ImageButton;

.field private O:Landroid/widget/ImageButton;

.field private P:Z

.field private Q:Lcom/whatsapp/pj;

.field private R:Z

.field final S:Landroid/text/TextWatcher;

.field private k:Landroid/os/Handler;

.field private l:Landroid/widget/ProgressBar;

.field private m:Lcom/whatsapp/fe;

.field private n:Lcom/whatsapp/zq;

.field private o:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Ljava/lang/String;

.field private x:B

.field private y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field private z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v1, 0x68

    const/16 v2, 0x65

    const/16 v4, 0x57

    const/16 v3, 0x46

    const/4 v8, 0x0

    const/16 v0, 0x36

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0006\nk:\u001d\u001c\u0006.2\u000f"

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

    const/4 v10, 0x1

    const-string v0, "\u0001\u000b22\u0012\u001c"

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

    aput-object v0, v9, v10

    const/4 v10, 0x2

    const-string v0, "\u0002\u000c\""

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

    const-string v0, "\u000b\n(#\u001d\u000b\u00116>\u001f\u0003\u00004x\u0015\u001b\u0011#;\u0010\t\u00034>\u0019\u0006\u000148\u000bG\u0007\'3#\u0018\n5>\u0008\u0001\n(w"

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

    const-string v0, "\u000b\n(#\u001d\u000b\u00116>\u001f\u0003\u00004x\u0015\u001b\r#;\u000c\u001a\n1x\u001e\t\u0001\u0019\'\u0013\u001b\u000c2>\u0013\u0006E"

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

    const-string v0, "\u001c\u0000>#"

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

    const-string v0, "\u0001\u0008\'0\u0019"

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

    const-string v0, "\u001e\u000c\"2\u0013"

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

    const-string v0, "\t\u0010\">\u0013"

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

    const-string v0, "\u000b\n(#\u001d\u000b\u00116>\u001f\u0003\u00004x\u000f\r\u0011f \u001d7\u0011?\'\u0019HXf"

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

    const-string v0, "\u001c\u0000>#S\u0010H04\u001d\u001a\u0001"

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

    const-string v0, "\u000b\n(#\u001d\u000b\u00116>\u001f\u0003\u00004x\u001f\u001a\u0000\'#\u0019"

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

    const-string v0, "\u0005\n39\u0008\r\u0001"

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

    const-string v0, "\u0005\n39\u0008\r\u0001\u0019%\u0013"

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

    const-string v0, "\u000b\n(#\u001d\u000b\u00116>\u001f\u0003\u00004x\u0012\u0007:%8\u0012\u001c\u0004%#\u000fG\u0007\'3#\u0018\n5>\u0008\u0001\n(w"

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

    const/16 v10, 0xf

    const-string v0, "\u000b\n+y\u001d\u0006\u000148\u0015\u000cK%8\u0012\u001c\u0004%#\u000f"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_f
    if-gt v6, v7, :cond_f

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x10

    const-string v0, "\u000b\n(#\u001d\u000b\u0011\u0019\'\u0015\u000b\u000e#%S\u0007\u00152>\u0013\u0006\u0016i$\u0005\u001b\u0011#:\\\u000b\n(#\u001d\u000b\u00115w\u001d\u0018\u0015f4\u0013\u001d\t\"w\u0012\u0007\u0011f1\u0013\u001d\u000b\""

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_10
    if-gt v6, v7, :cond_10

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x11

    const-string v0, "\t\u000b\"%\u0013\u0001\u0001h>\u0012\u001c\u0000(#R\t\u00062>\u0013\u0006K\u0010\u001e9?"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_11
    if-gt v6, v7, :cond_11

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x12

    const-string v0, "\u001b\r\'%\u00197\u000850"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_12
    if-gt v6, v7, :cond_12

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x13

    const-string v0, "\t\u000b\"%\u0013\u0001\u0001h>\u0012\u001c\u0000(#R\r\u001d2%\u001dF6\u0012\u00059)("

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_13
    if-gt v6, v7, :cond_13

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x14

    const-string v0, "\u001a\u00002\"\u000e\u0006E/9\u0008\r\u000b2"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_14
    if-gt v6, v7, :cond_14

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x15

    const-string v0, "\u0000\u00045\u0008\u000f\u0000\u000442"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_15
    if-gt v6, v7, :cond_15

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x16

    const-string v0, "\u000b\n(#\u001d\u000b\u0011"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_16
    if-gt v6, v7, :cond_16

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x17

    const-string v0, "\u001f\u0004\u0019#\u0005\u0018\u0000"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_17
    if-gt v6, v7, :cond_17

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x18

    const-string v0, "\u001e\u0006\'%\u00187\u000b\':\u0019"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_18
    if-gt v6, v7, :cond_18

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x19

    const-string v0, "\u001e\u0006\'%\u00187\u00162%"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_19
    if-gt v6, v7, :cond_19

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1a

    const-string v0, "\u000b\n(#\u001d\u000b\u00116>\u001f\u0003\u00004x\u000e\r\u00163;\u0008H\u0006)9\u0008\t\u00062w\u0012\u0007\u0011f6\u0018\u000c\u0000\""

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1a
    if-gt v6, v7, :cond_1a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1b

    const-string v0, "(\u0016h \u0014\t\u001156\u000c\u0018K(2\u0008"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1b
    if-gt v6, v7, :cond_1b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1c

    const-string v0, "\u0018\u0004\u0019;\u0015\u001b\u0011"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1c
    if-gt v6, v7, :cond_1c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1d

    const-string v0, "\u000b\n(#\u001d\u000b\u00116>\u001f\u0003\u00004x\u000f\u0000\u000442S\u000b\n(#\u001d\u000b\u0011i2\u000e\u001a\n4w"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1d
    if-gt v6, v7, :cond_1d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1e

    const-string v0, "=1\u0000zD"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1e
    if-gt v6, v7, :cond_1e

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1f

    const-string v0, "\u000b\n(#\u001d\u000b\u00116>\u001f\u0003\u00004x\u000f\u0000\u000442S\u000b\n(#\u001d\u000b\u0011i1\u0015\u0004\u0000f3\u0013\r\u0016(p\u0008H\u0000>>\u000f\u001cE"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1f
    if-gt v6, v7, :cond_1f

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x20

    const-string v0, "\t\u000b\"%\u0013\u0001\u0001h>\u0012\u001c\u0000(#R\t\u00062>\u0013\u0006K\u0005\u00059)1\u0003\u0008/ *\u0014\u0003?=1"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_20
    if-gt v6, v7, :cond_20

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x21

    const-string v0, "\u000b\n(#\u001d\u000b\u00116>\u001f\u0003\u00004x\u000f\u0000\u000442S\u0007\u000622\u0008E\u00162%\u0019\t\u0008f"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_21
    if-gt v6, v7, :cond_21

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x22

    const-string v0, "\u000b\n(#\u001d\u000b\u00116>\u001f\u0003\u00004x\u0008\u0011\u0015#x\u0012\u001d\t*w"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_22
    if-gt v6, v7, :cond_22

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x23

    const-string v0, "\r\u0008\'>\u00107\r/$\u0008\u0007\u0017?"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_23
    if-gt v6, v7, :cond_23

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x24

    const-string v0, "\u000f\u000c\""

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_24
    if-gt v6, v7, :cond_24

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x25

    const-string v0, "\u0001\u000b6\"\u00087\u0008##\u0014\u0007\u0001"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_25
    if-gt v6, v7, :cond_25

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x26

    const-string v0, "+\n3;\u0018H\u000b)#\\\u0018\u00044$\u0019H\u0013\u00056\u000e\u000cE >\u0010\r_f"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_26
    if-gt v6, v7, :cond_26

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x27

    const-string v0, "\u000b\u0017#6\u0008\r:!%\u0013\u001d\u0015"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_27
    if-gt v6, v7, :cond_27

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x28

    const-string v0, "\u000b\n(#\u001d\u000b\u00116>\u001f\u0003\u00004x\u000f\u0000\u000442#\u001d\u0017/$S\u0006\u0010*;\\"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_28
    if-gt v6, v7, :cond_28

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x29

    const-string v0, "\u000e\n4 \u001d\u001a\u0001"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_29
    if-gt v6, v7, :cond_29

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2a

    const-string v0, "\n\t)4\u00177\u0006)9\u0008\t\u00062"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2a
    if-gt v6, v7, :cond_2a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2b

    const-string v0, "\u000b\n(#\u001d\u000b\u00116>\u001f\u0003\u00004x\u000f\u0000\u000442S\u001b\u001142\u001d\u0005J"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2b
    if-gt v6, v7, :cond_2b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2c

    const-string v0, "\u0007\u000622\u0008E\u00162%\u0019\t\u0008"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2c
    if-gt v6, v7, :cond_2c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2d

    const-string v0, "\u000b\n(#\u001d\u000b\u00116>\u001f\u0003\u00004x\u000f\u0000\u000442S\u001d\u0017/w"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2d
    if-gt v6, v7, :cond_2d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2e

    const-string v0, "\u000e\u000c*2"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2e
    if-gt v6, v7, :cond_2e

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2f

    const-string v0, "\t\u000b\"%\u0013\u0001\u0001h>\u0012\u001c\u0000(#R\r\u001d2%\u001dF1\u0003\u000f("

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2f
    if-gt v6, v7, :cond_2f

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x30

    const-string v0, "HHf"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_30
    if-gt v6, v7, :cond_30

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x31

    const-string v0, "\t\u000b\"%\u0013\u0001\u0001h>\u0012\u001c\u0000(#R\r\u001d2%\u001dF6\u0013\u00156-&\u0012"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_31
    if-gt v6, v7, :cond_31

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x32

    const-string v0, "\u000b\n(#\u001d\u000b\u00116>\u001f\u0003\u00004x\u000f\u0000\u000442S\u001d\u0017/$\\"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_32
    if-gt v6, v7, :cond_32

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x33

    const-string v0, "\n\t)4\u0017\r\u0001\u0019;\u0015\u001b\u0011"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_33
    if-gt v6, v7, :cond_33

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x34

    const-string v0, "\u000b\n(#\u001d\u000b\u0011\u0019\'\u0015\u000b\u000e#%S\u001b\r\'%\u0019G\u00162%\u0019\t\u0008i1\u0018U\u000b3;\u0010"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_34
    if-gt v6, v7, :cond_34

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x35

    const-string v0, "\u001e\u0006\'%\u0018R"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_35
    if-gt v6, v7, :cond_35

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    sput-object v9, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    .line 541
    new-instance v0, Lcom/whatsapp/zq;

    const-string v1, ""

    invoke-direct {v0, v1}, Lcom/whatsapp/zq;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/whatsapp/ContactPicker;->h:Lcom/whatsapp/zq;

    .line 410
    new-instance v0, Lcom/whatsapp/zq;

    const-string v1, ""

    invoke-direct {v0, v1}, Lcom/whatsapp/zq;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/whatsapp/ContactPicker;->i:Lcom/whatsapp/zq;

    .line 225
    new-instance v0, Lcom/whatsapp/zq;

    const-string v1, ""

    invoke-direct {v0, v1}, Lcom/whatsapp/zq;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/whatsapp/ContactPicker;->j:Lcom/whatsapp/zq;

    .line 394
    sput-boolean v8, Lcom/whatsapp/ContactPicker;->D:Z

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x7c

    :goto_36
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_36

    :pswitch_1
    move v0, v2

    goto :goto_36

    :pswitch_2
    move v0, v3

    goto :goto_36

    :pswitch_3
    move v0, v4

    goto :goto_36

    :cond_1
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x7c

    :goto_37
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_37

    :pswitch_5
    move v0, v2

    goto :goto_37

    :pswitch_6
    move v0, v3

    goto :goto_37

    :pswitch_7
    move v0, v4

    goto :goto_37

    :cond_2
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    const/16 v0, 0x7c

    :goto_38
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_38

    :pswitch_9
    move v0, v2

    goto :goto_38

    :pswitch_a
    move v0, v3

    goto :goto_38

    :pswitch_b
    move v0, v4

    goto :goto_38

    :cond_3
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3

    const/16 v0, 0x7c

    :goto_39
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_39

    :pswitch_d
    move v0, v2

    goto :goto_39

    :pswitch_e
    move v0, v3

    goto :goto_39

    :pswitch_f
    move v0, v4

    goto :goto_39

    :cond_4
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4

    const/16 v0, 0x7c

    :goto_3a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_3a

    :pswitch_11
    move v0, v2

    goto :goto_3a

    :pswitch_12
    move v0, v3

    goto :goto_3a

    :pswitch_13
    move v0, v4

    goto :goto_3a

    :cond_5
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_5

    const/16 v0, 0x7c

    :goto_3b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_3b

    :pswitch_15
    move v0, v2

    goto :goto_3b

    :pswitch_16
    move v0, v3

    goto :goto_3b

    :pswitch_17
    move v0, v4

    goto :goto_3b

    :cond_6
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_6

    const/16 v0, 0x7c

    :goto_3c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_3c

    :pswitch_19
    move v0, v2

    goto :goto_3c

    :pswitch_1a
    move v0, v3

    goto :goto_3c

    :pswitch_1b
    move v0, v4

    goto :goto_3c

    :cond_7
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_7

    const/16 v0, 0x7c

    :goto_3d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_3d

    :pswitch_1d
    move v0, v2

    goto :goto_3d

    :pswitch_1e
    move v0, v3

    goto :goto_3d

    :pswitch_1f
    move v0, v4

    goto :goto_3d

    :cond_8
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_8

    const/16 v0, 0x7c

    :goto_3e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_3e

    :pswitch_21
    move v0, v2

    goto :goto_3e

    :pswitch_22
    move v0, v3

    goto :goto_3e

    :pswitch_23
    move v0, v4

    goto :goto_3e

    :cond_9
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_9

    const/16 v0, 0x7c

    :goto_3f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_3f

    :pswitch_25
    move v0, v2

    goto :goto_3f

    :pswitch_26
    move v0, v3

    goto :goto_3f

    :pswitch_27
    move v0, v4

    goto :goto_3f

    :cond_a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_a

    const/16 v0, 0x7c

    :goto_40
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_a

    :pswitch_28
    move v0, v1

    goto :goto_40

    :pswitch_29
    move v0, v2

    goto :goto_40

    :pswitch_2a
    move v0, v3

    goto :goto_40

    :pswitch_2b
    move v0, v4

    goto :goto_40

    :cond_b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_b

    const/16 v0, 0x7c

    :goto_41
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_41

    :pswitch_2d
    move v0, v2

    goto :goto_41

    :pswitch_2e
    move v0, v3

    goto :goto_41

    :pswitch_2f
    move v0, v4

    goto :goto_41

    :cond_c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_c

    const/16 v0, 0x7c

    :goto_42
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_c

    :pswitch_30
    move v0, v1

    goto :goto_42

    :pswitch_31
    move v0, v2

    goto :goto_42

    :pswitch_32
    move v0, v3

    goto :goto_42

    :pswitch_33
    move v0, v4

    goto :goto_42

    :cond_d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_d

    const/16 v0, 0x7c

    :goto_43
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_d

    :pswitch_34
    move v0, v1

    goto :goto_43

    :pswitch_35
    move v0, v2

    goto :goto_43

    :pswitch_36
    move v0, v3

    goto :goto_43

    :pswitch_37
    move v0, v4

    goto :goto_43

    :cond_e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_e

    const/16 v0, 0x7c

    :goto_44
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_e

    :pswitch_38
    move v0, v1

    goto :goto_44

    :pswitch_39
    move v0, v2

    goto :goto_44

    :pswitch_3a
    move v0, v3

    goto :goto_44

    :pswitch_3b
    move v0, v4

    goto :goto_44

    :cond_f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_f

    const/16 v0, 0x7c

    :goto_45
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_f

    :pswitch_3c
    move v0, v1

    goto :goto_45

    :pswitch_3d
    move v0, v2

    goto :goto_45

    :pswitch_3e
    move v0, v3

    goto :goto_45

    :pswitch_3f
    move v0, v4

    goto :goto_45

    :cond_10
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_10

    const/16 v0, 0x7c

    :goto_46
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_10

    :pswitch_40
    move v0, v1

    goto :goto_46

    :pswitch_41
    move v0, v2

    goto :goto_46

    :pswitch_42
    move v0, v3

    goto :goto_46

    :pswitch_43
    move v0, v4

    goto :goto_46

    :cond_11
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_11

    const/16 v0, 0x7c

    :goto_47
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_11

    :pswitch_44
    move v0, v1

    goto :goto_47

    :pswitch_45
    move v0, v2

    goto :goto_47

    :pswitch_46
    move v0, v3

    goto :goto_47

    :pswitch_47
    move v0, v4

    goto :goto_47

    :cond_12
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_12

    const/16 v0, 0x7c

    :goto_48
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_12

    :pswitch_48
    move v0, v1

    goto :goto_48

    :pswitch_49
    move v0, v2

    goto :goto_48

    :pswitch_4a
    move v0, v3

    goto :goto_48

    :pswitch_4b
    move v0, v4

    goto :goto_48

    :cond_13
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_13

    const/16 v0, 0x7c

    :goto_49
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_13

    :pswitch_4c
    move v0, v1

    goto :goto_49

    :pswitch_4d
    move v0, v2

    goto :goto_49

    :pswitch_4e
    move v0, v3

    goto :goto_49

    :pswitch_4f
    move v0, v4

    goto :goto_49

    :cond_14
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_14

    const/16 v0, 0x7c

    :goto_4a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_14

    :pswitch_50
    move v0, v1

    goto :goto_4a

    :pswitch_51
    move v0, v2

    goto :goto_4a

    :pswitch_52
    move v0, v3

    goto :goto_4a

    :pswitch_53
    move v0, v4

    goto :goto_4a

    :cond_15
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_15

    const/16 v0, 0x7c

    :goto_4b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_15

    :pswitch_54
    move v0, v1

    goto :goto_4b

    :pswitch_55
    move v0, v2

    goto :goto_4b

    :pswitch_56
    move v0, v3

    goto :goto_4b

    :pswitch_57
    move v0, v4

    goto :goto_4b

    :cond_16
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_16

    const/16 v0, 0x7c

    :goto_4c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_16

    :pswitch_58
    move v0, v1

    goto :goto_4c

    :pswitch_59
    move v0, v2

    goto :goto_4c

    :pswitch_5a
    move v0, v3

    goto :goto_4c

    :pswitch_5b
    move v0, v4

    goto :goto_4c

    :cond_17
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_17

    const/16 v0, 0x7c

    :goto_4d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_17

    :pswitch_5c
    move v0, v1

    goto :goto_4d

    :pswitch_5d
    move v0, v2

    goto :goto_4d

    :pswitch_5e
    move v0, v3

    goto :goto_4d

    :pswitch_5f
    move v0, v4

    goto :goto_4d

    :cond_18
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_18

    const/16 v0, 0x7c

    :goto_4e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_18

    :pswitch_60
    move v0, v1

    goto :goto_4e

    :pswitch_61
    move v0, v2

    goto :goto_4e

    :pswitch_62
    move v0, v3

    goto :goto_4e

    :pswitch_63
    move v0, v4

    goto :goto_4e

    :cond_19
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_19

    const/16 v0, 0x7c

    :goto_4f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_19

    :pswitch_64
    move v0, v1

    goto :goto_4f

    :pswitch_65
    move v0, v2

    goto :goto_4f

    :pswitch_66
    move v0, v3

    goto :goto_4f

    :pswitch_67
    move v0, v4

    goto :goto_4f

    :cond_1a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1a

    const/16 v0, 0x7c

    :goto_50
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1a

    :pswitch_68
    move v0, v1

    goto :goto_50

    :pswitch_69
    move v0, v2

    goto :goto_50

    :pswitch_6a
    move v0, v3

    goto :goto_50

    :pswitch_6b
    move v0, v4

    goto :goto_50

    :cond_1b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1b

    const/16 v0, 0x7c

    :goto_51
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1b

    :pswitch_6c
    move v0, v1

    goto :goto_51

    :pswitch_6d
    move v0, v2

    goto :goto_51

    :pswitch_6e
    move v0, v3

    goto :goto_51

    :pswitch_6f
    move v0, v4

    goto :goto_51

    :cond_1c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1c

    const/16 v0, 0x7c

    :goto_52
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1c

    :pswitch_70
    move v0, v1

    goto :goto_52

    :pswitch_71
    move v0, v2

    goto :goto_52

    :pswitch_72
    move v0, v3

    goto :goto_52

    :pswitch_73
    move v0, v4

    goto :goto_52

    :cond_1d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1d

    const/16 v0, 0x7c

    :goto_53
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1d

    :pswitch_74
    move v0, v1

    goto :goto_53

    :pswitch_75
    move v0, v2

    goto :goto_53

    :pswitch_76
    move v0, v3

    goto :goto_53

    :pswitch_77
    move v0, v4

    goto :goto_53

    :cond_1e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1e

    const/16 v0, 0x7c

    :goto_54
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1e

    :pswitch_78
    move v0, v1

    goto :goto_54

    :pswitch_79
    move v0, v2

    goto :goto_54

    :pswitch_7a
    move v0, v3

    goto :goto_54

    :pswitch_7b
    move v0, v4

    goto :goto_54

    :cond_1f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1f

    const/16 v0, 0x7c

    :goto_55
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1f

    :pswitch_7c
    move v0, v1

    goto :goto_55

    :pswitch_7d
    move v0, v2

    goto :goto_55

    :pswitch_7e
    move v0, v3

    goto :goto_55

    :pswitch_7f
    move v0, v4

    goto :goto_55

    :cond_20
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_20

    const/16 v0, 0x7c

    :goto_56
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_20

    :pswitch_80
    move v0, v1

    goto :goto_56

    :pswitch_81
    move v0, v2

    goto :goto_56

    :pswitch_82
    move v0, v3

    goto :goto_56

    :pswitch_83
    move v0, v4

    goto :goto_56

    :cond_21
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_21

    const/16 v0, 0x7c

    :goto_57
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_21

    :pswitch_84
    move v0, v1

    goto :goto_57

    :pswitch_85
    move v0, v2

    goto :goto_57

    :pswitch_86
    move v0, v3

    goto :goto_57

    :pswitch_87
    move v0, v4

    goto :goto_57

    :cond_22
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_22

    const/16 v0, 0x7c

    :goto_58
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_22

    :pswitch_88
    move v0, v1

    goto :goto_58

    :pswitch_89
    move v0, v2

    goto :goto_58

    :pswitch_8a
    move v0, v3

    goto :goto_58

    :pswitch_8b
    move v0, v4

    goto :goto_58

    :cond_23
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_23

    const/16 v0, 0x7c

    :goto_59
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_23

    :pswitch_8c
    move v0, v1

    goto :goto_59

    :pswitch_8d
    move v0, v2

    goto :goto_59

    :pswitch_8e
    move v0, v3

    goto :goto_59

    :pswitch_8f
    move v0, v4

    goto :goto_59

    :cond_24
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_24

    const/16 v0, 0x7c

    :goto_5a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_24

    :pswitch_90
    move v0, v1

    goto :goto_5a

    :pswitch_91
    move v0, v2

    goto :goto_5a

    :pswitch_92
    move v0, v3

    goto :goto_5a

    :pswitch_93
    move v0, v4

    goto :goto_5a

    :cond_25
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_25

    const/16 v0, 0x7c

    :goto_5b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_25

    :pswitch_94
    move v0, v1

    goto :goto_5b

    :pswitch_95
    move v0, v2

    goto :goto_5b

    :pswitch_96
    move v0, v3

    goto :goto_5b

    :pswitch_97
    move v0, v4

    goto :goto_5b

    :cond_26
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_26

    const/16 v0, 0x7c

    :goto_5c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_26

    :pswitch_98
    move v0, v1

    goto :goto_5c

    :pswitch_99
    move v0, v2

    goto :goto_5c

    :pswitch_9a
    move v0, v3

    goto :goto_5c

    :pswitch_9b
    move v0, v4

    goto :goto_5c

    :cond_27
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_27

    const/16 v0, 0x7c

    :goto_5d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_27

    :pswitch_9c
    move v0, v1

    goto :goto_5d

    :pswitch_9d
    move v0, v2

    goto :goto_5d

    :pswitch_9e
    move v0, v3

    goto :goto_5d

    :pswitch_9f
    move v0, v4

    goto :goto_5d

    :cond_28
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_28

    const/16 v0, 0x7c

    :goto_5e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_28

    :pswitch_a0
    move v0, v1

    goto :goto_5e

    :pswitch_a1
    move v0, v2

    goto :goto_5e

    :pswitch_a2
    move v0, v3

    goto :goto_5e

    :pswitch_a3
    move v0, v4

    goto :goto_5e

    :cond_29
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_29

    const/16 v0, 0x7c

    :goto_5f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_29

    :pswitch_a4
    move v0, v1

    goto :goto_5f

    :pswitch_a5
    move v0, v2

    goto :goto_5f

    :pswitch_a6
    move v0, v3

    goto :goto_5f

    :pswitch_a7
    move v0, v4

    goto :goto_5f

    :cond_2a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2a

    const/16 v0, 0x7c

    :goto_60
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2a

    :pswitch_a8
    move v0, v1

    goto :goto_60

    :pswitch_a9
    move v0, v2

    goto :goto_60

    :pswitch_aa
    move v0, v3

    goto :goto_60

    :pswitch_ab
    move v0, v4

    goto :goto_60

    :cond_2b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2b

    const/16 v0, 0x7c

    :goto_61
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2b

    :pswitch_ac
    move v0, v1

    goto :goto_61

    :pswitch_ad
    move v0, v2

    goto :goto_61

    :pswitch_ae
    move v0, v3

    goto :goto_61

    :pswitch_af
    move v0, v4

    goto :goto_61

    :cond_2c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2c

    const/16 v0, 0x7c

    :goto_62
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2c

    :pswitch_b0
    move v0, v1

    goto :goto_62

    :pswitch_b1
    move v0, v2

    goto :goto_62

    :pswitch_b2
    move v0, v3

    goto :goto_62

    :pswitch_b3
    move v0, v4

    goto :goto_62

    :cond_2d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2d

    const/16 v0, 0x7c

    :goto_63
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2d

    :pswitch_b4
    move v0, v1

    goto :goto_63

    :pswitch_b5
    move v0, v2

    goto :goto_63

    :pswitch_b6
    move v0, v3

    goto :goto_63

    :pswitch_b7
    move v0, v4

    goto :goto_63

    :cond_2e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2e

    const/16 v0, 0x7c

    :goto_64
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2e

    :pswitch_b8
    move v0, v1

    goto :goto_64

    :pswitch_b9
    move v0, v2

    goto :goto_64

    :pswitch_ba
    move v0, v3

    goto :goto_64

    :pswitch_bb
    move v0, v4

    goto :goto_64

    :cond_2f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2f

    const/16 v0, 0x7c

    :goto_65
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2f

    :pswitch_bc
    move v0, v1

    goto :goto_65

    :pswitch_bd
    move v0, v2

    goto :goto_65

    :pswitch_be
    move v0, v3

    goto :goto_65

    :pswitch_bf
    move v0, v4

    goto :goto_65

    :cond_30
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_30

    const/16 v0, 0x7c

    :goto_66
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_30

    :pswitch_c0
    move v0, v1

    goto :goto_66

    :pswitch_c1
    move v0, v2

    goto :goto_66

    :pswitch_c2
    move v0, v3

    goto :goto_66

    :pswitch_c3
    move v0, v4

    goto :goto_66

    :cond_31
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_31

    const/16 v0, 0x7c

    :goto_67
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_31

    :pswitch_c4
    move v0, v1

    goto :goto_67

    :pswitch_c5
    move v0, v2

    goto :goto_67

    :pswitch_c6
    move v0, v3

    goto :goto_67

    :pswitch_c7
    move v0, v4

    goto :goto_67

    :cond_32
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_32

    const/16 v0, 0x7c

    :goto_68
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_32

    :pswitch_c8
    move v0, v1

    goto :goto_68

    :pswitch_c9
    move v0, v2

    goto :goto_68

    :pswitch_ca
    move v0, v3

    goto :goto_68

    :pswitch_cb
    move v0, v4

    goto :goto_68

    :cond_33
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_33

    const/16 v0, 0x7c

    :goto_69
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_33

    :pswitch_cc
    move v0, v1

    goto :goto_69

    :pswitch_cd
    move v0, v2

    goto :goto_69

    :pswitch_ce
    move v0, v3

    goto :goto_69

    :pswitch_cf
    move v0, v4

    goto :goto_69

    :cond_34
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_34

    const/16 v0, 0x7c

    :goto_6a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_34

    :pswitch_d0
    move v0, v1

    goto :goto_6a

    :pswitch_d1
    move v0, v2

    goto :goto_6a

    :pswitch_d2
    move v0, v3

    goto :goto_6a

    :pswitch_d3
    move v0, v4

    goto :goto_6a

    :cond_35
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_35

    const/16 v0, 0x7c

    :goto_6b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_35

    :pswitch_d4
    move v0, v1

    goto :goto_6b

    :pswitch_d5
    move v0, v2

    goto :goto_6b

    :pswitch_d6
    move v0, v3

    goto :goto_6b

    :pswitch_d7
    move v0, v4

    goto :goto_6b

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

    :pswitch_data_14
    .packed-switch 0x0
        :pswitch_50
        :pswitch_51
        :pswitch_52
        :pswitch_53
    .end packed-switch

    :pswitch_data_15
    .packed-switch 0x0
        :pswitch_54
        :pswitch_55
        :pswitch_56
        :pswitch_57
    .end packed-switch

    :pswitch_data_16
    .packed-switch 0x0
        :pswitch_58
        :pswitch_59
        :pswitch_5a
        :pswitch_5b
    .end packed-switch

    :pswitch_data_17
    .packed-switch 0x0
        :pswitch_5c
        :pswitch_5d
        :pswitch_5e
        :pswitch_5f
    .end packed-switch

    :pswitch_data_18
    .packed-switch 0x0
        :pswitch_60
        :pswitch_61
        :pswitch_62
        :pswitch_63
    .end packed-switch

    :pswitch_data_19
    .packed-switch 0x0
        :pswitch_64
        :pswitch_65
        :pswitch_66
        :pswitch_67
    .end packed-switch

    :pswitch_data_1a
    .packed-switch 0x0
        :pswitch_68
        :pswitch_69
        :pswitch_6a
        :pswitch_6b
    .end packed-switch

    :pswitch_data_1b
    .packed-switch 0x0
        :pswitch_6c
        :pswitch_6d
        :pswitch_6e
        :pswitch_6f
    .end packed-switch

    :pswitch_data_1c
    .packed-switch 0x0
        :pswitch_70
        :pswitch_71
        :pswitch_72
        :pswitch_73
    .end packed-switch

    :pswitch_data_1d
    .packed-switch 0x0
        :pswitch_74
        :pswitch_75
        :pswitch_76
        :pswitch_77
    .end packed-switch

    :pswitch_data_1e
    .packed-switch 0x0
        :pswitch_78
        :pswitch_79
        :pswitch_7a
        :pswitch_7b
    .end packed-switch

    :pswitch_data_1f
    .packed-switch 0x0
        :pswitch_7c
        :pswitch_7d
        :pswitch_7e
        :pswitch_7f
    .end packed-switch

    :pswitch_data_20
    .packed-switch 0x0
        :pswitch_80
        :pswitch_81
        :pswitch_82
        :pswitch_83
    .end packed-switch

    :pswitch_data_21
    .packed-switch 0x0
        :pswitch_84
        :pswitch_85
        :pswitch_86
        :pswitch_87
    .end packed-switch

    :pswitch_data_22
    .packed-switch 0x0
        :pswitch_88
        :pswitch_89
        :pswitch_8a
        :pswitch_8b
    .end packed-switch

    :pswitch_data_23
    .packed-switch 0x0
        :pswitch_8c
        :pswitch_8d
        :pswitch_8e
        :pswitch_8f
    .end packed-switch

    :pswitch_data_24
    .packed-switch 0x0
        :pswitch_90
        :pswitch_91
        :pswitch_92
        :pswitch_93
    .end packed-switch

    :pswitch_data_25
    .packed-switch 0x0
        :pswitch_94
        :pswitch_95
        :pswitch_96
        :pswitch_97
    .end packed-switch

    :pswitch_data_26
    .packed-switch 0x0
        :pswitch_98
        :pswitch_99
        :pswitch_9a
        :pswitch_9b
    .end packed-switch

    :pswitch_data_27
    .packed-switch 0x0
        :pswitch_9c
        :pswitch_9d
        :pswitch_9e
        :pswitch_9f
    .end packed-switch

    :pswitch_data_28
    .packed-switch 0x0
        :pswitch_a0
        :pswitch_a1
        :pswitch_a2
        :pswitch_a3
    .end packed-switch

    :pswitch_data_29
    .packed-switch 0x0
        :pswitch_a4
        :pswitch_a5
        :pswitch_a6
        :pswitch_a7
    .end packed-switch

    :pswitch_data_2a
    .packed-switch 0x0
        :pswitch_a8
        :pswitch_a9
        :pswitch_aa
        :pswitch_ab
    .end packed-switch

    :pswitch_data_2b
    .packed-switch 0x0
        :pswitch_ac
        :pswitch_ad
        :pswitch_ae
        :pswitch_af
    .end packed-switch

    :pswitch_data_2c
    .packed-switch 0x0
        :pswitch_b0
        :pswitch_b1
        :pswitch_b2
        :pswitch_b3
    .end packed-switch

    :pswitch_data_2d
    .packed-switch 0x0
        :pswitch_b4
        :pswitch_b5
        :pswitch_b6
        :pswitch_b7
    .end packed-switch

    :pswitch_data_2e
    .packed-switch 0x0
        :pswitch_b8
        :pswitch_b9
        :pswitch_ba
        :pswitch_bb
    .end packed-switch

    :pswitch_data_2f
    .packed-switch 0x0
        :pswitch_bc
        :pswitch_bd
        :pswitch_be
        :pswitch_bf
    .end packed-switch

    :pswitch_data_30
    .packed-switch 0x0
        :pswitch_c0
        :pswitch_c1
        :pswitch_c2
        :pswitch_c3
    .end packed-switch

    :pswitch_data_31
    .packed-switch 0x0
        :pswitch_c4
        :pswitch_c5
        :pswitch_c6
        :pswitch_c7
    .end packed-switch

    :pswitch_data_32
    .packed-switch 0x0
        :pswitch_c8
        :pswitch_c9
        :pswitch_ca
        :pswitch_cb
    .end packed-switch

    :pswitch_data_33
    .packed-switch 0x0
        :pswitch_cc
        :pswitch_cd
        :pswitch_ce
        :pswitch_cf
    .end packed-switch

    :pswitch_data_34
    .packed-switch 0x0
        :pswitch_d0
        :pswitch_d1
        :pswitch_d2
        :pswitch_d3
    .end packed-switch

    :pswitch_data_35
    .packed-switch 0x0
        :pswitch_d4
        :pswitch_d5
        :pswitch_d6
        :pswitch_d7
    .end packed-switch
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 177
    invoke-direct {p0}, Lcom/whatsapp/VerifyMessageStoreListActivity;-><init>()V

    .line 358
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->k:Landroid/os/Handler;

    .line 334
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->o:Ljava/util/HashMap;

    .line 35
    iput-object v1, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    .line 174
    const-string v0, ""

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->z:Ljava/lang/String;

    .line 552
    iput-object v1, p0, Lcom/whatsapp/ContactPicker;->A:Ljava/lang/String;

    .line 251
    iput-object v1, p0, Lcom/whatsapp/ContactPicker;->B:Ljava/lang/String;

    .line 460
    const/4 v0, 0x0

    iput v0, p0, Lcom/whatsapp/ContactPicker;->E:I

    .line 252
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->F:Ljava/util/ArrayList;

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    .line 454
    new-instance v0, Lcom/whatsapp/pj;

    invoke-direct {v0}, Lcom/whatsapp/pj;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->Q:Lcom/whatsapp/pj;

    .line 407
    new-instance v0, Lcom/whatsapp/kk;

    invoke-direct {v0, p0}, Lcom/whatsapp/kk;-><init>(Lcom/whatsapp/ContactPicker;)V

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->S:Landroid/text/TextWatcher;

    .line 141
    return-void
.end method

.method static a(Lcom/whatsapp/ContactPicker;I)I
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 308
    iput p1, p0, Lcom/whatsapp/ContactPicker;->E:I

    return p1
.end method

.method private a(Ljava/lang/String;)I
    .locals 3
    .parameter

    .prologue
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 586
    const/4 v1, -0x1

    iput-byte v1, p0, Lcom/whatsapp/ContactPicker;->x:B

    .line 181
    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 223
    const/4 v1, 0x2

    iput-byte v1, p0, Lcom/whatsapp/ContactPicker;->x:B

    if-eqz v0, :cond_4

    .line 557
    :cond_0
    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 222
    const/4 v1, 0x3

    iput-byte v1, p0, Lcom/whatsapp/ContactPicker;->x:B

    if-eqz v0, :cond_4

    .line 267
    :cond_1
    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 353
    const/4 v1, 0x1

    iput-byte v1, p0, Lcom/whatsapp/ContactPicker;->x:B

    if-eqz v0, :cond_4

    .line 381
    :cond_2
    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 190
    const/4 v1, 0x4

    iput-byte v1, p0, Lcom/whatsapp/ContactPicker;->x:B

    if-eqz v0, :cond_4

    .line 20
    :cond_3
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 379
    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/whatsapp/ContactPicker;->x:B

    .line 28
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/whatsapp/ContactPicker;->x:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 46
    iget-byte v0, p0, Lcom/whatsapp/ContactPicker;->x:B

    return v0
.end method

.method static a(Lcom/whatsapp/ContactPicker;)Landroid/widget/ImageButton;
    .locals 1
    .parameter

    .prologue
    .line 47
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->L:Landroid/widget/ImageButton;

    return-object v0
.end method

.method static a(Lcom/whatsapp/ContactPicker;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 246
    invoke-direct {p0, p1}, Lcom/whatsapp/ContactPicker;->d(Ljava/lang/String;)V

    return-void
.end method

.method private a(Z)V
    .locals 4
    .parameter

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 508
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->l:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    .line 594
    :goto_0
    sget-object v3, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    if-nez v3, :cond_0

    .line 237
    const v3, 0x7f09016d

    invoke-static {p0, v3, v1}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_1

    .line 351
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->l:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 590
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/whatsapp/lk;

    invoke-direct {v2, p0, p1, v0}, Lcom/whatsapp/lk;-><init>(Lcom/whatsapp/ContactPicker;ZZ)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 449
    :cond_1
    return-void

    :cond_2
    move v0, v2

    .line 508
    goto :goto_0
.end method

.method private a(I)Z
    .locals 4
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 312
    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    if-gez p1, :cond_2

    .line 448
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 371
    :cond_1
    :goto_0
    return v0

    .line 268
    :cond_2
    sget-object v1, Lcom/whatsapp/ContactPicker;->h:Lcom/whatsapp/zq;

    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_0
.end method

.method static a(Lcom/whatsapp/ContactPicker;Lcom/whatsapp/zq;)Z
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 479
    invoke-direct {p0, p1}, Lcom/whatsapp/ContactPicker;->a(Lcom/whatsapp/zq;)Z

    move-result v0

    return v0
.end method

.method private a(Lcom/whatsapp/zq;)Z
    .locals 8
    .parameter

    .prologue
    const/high16 v7, 0x1400

    const/16 v6, 0x17

    const/16 v3, 0x15

    const/4 v5, 0x2

    const/4 v4, 0x1

    .line 404
    invoke-static {p1}, Lcom/whatsapp/ContactPicker;->b(Lcom/whatsapp/zq;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 583
    :cond_0
    :goto_0
    return v4

    .line 226
    :cond_1
    iget-object v0, p1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/App;->g(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 232
    iget-object v0, p1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    .line 253
    iput-object p1, p0, Lcom/whatsapp/ContactPicker;->n:Lcom/whatsapp/zq;

    .line 400
    iget-boolean v1, p0, Lcom/whatsapp/ContactPicker;->r:Z

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/whatsapp/ContactPicker;->v:Z

    if-eqz v1, :cond_2

    .line 419
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->showDialog(I)V

    goto :goto_0

    .line 349
    :cond_2
    iget-boolean v1, p0, Lcom/whatsapp/ContactPicker;->t:Z

    if-eqz v1, :cond_3

    .line 156
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v1, 0x14

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 539
    const/4 v0, -0x1

    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v1, p1}, Lcom/whatsapp/qp;->g(Lcom/whatsapp/zq;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/ContactPicker;->setResult(ILandroid/content/Intent;)V

    .line 445
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->finish()V

    goto :goto_0

    .line 15
    :cond_3
    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    if-eqz v1, :cond_4

    .line 184
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/whatsapp/Conversation;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v1, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    .line 411
    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v2, v2, v5

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 29
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v1, v1, v6

    iget-byte v2, p0, Lcom/whatsapp/ContactPicker;->x:B

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;B)Landroid/content/Intent;

    .line 24
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v1, v1, v3

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 505
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v2, 0x13

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 165
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    invoke-virtual {v0, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 123
    invoke-virtual {p0, v4}, Lcom/whatsapp/ContactPicker;->showDialog(I)V

    goto :goto_0

    .line 115
    :cond_4
    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->z:Ljava/lang/String;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->z:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_5

    .line 293
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/whatsapp/Conversation;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v1, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    .line 214
    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v2, v2, v5

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 500
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v1, v1, v6

    iget-byte v2, p0, Lcom/whatsapp/ContactPicker;->x:B

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;B)Landroid/content/Intent;

    .line 149
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v2, 0x12

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->z:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 33
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v1, v1, v3

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 337
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    invoke-virtual {v0, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 216
    invoke-virtual {p0, v4}, Lcom/whatsapp/ContactPicker;->showDialog(I)V

    goto/16 :goto_0

    .line 50
    :cond_5
    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->A:Ljava/lang/String;

    if-eqz v1, :cond_6

    .line 554
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/whatsapp/Conversation;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v1, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    .line 136
    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v2, v2, v5

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 364
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v2, 0x19

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->A:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 368
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v2, 0x18

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->B:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 431
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v1, v1, v6

    iget-byte v2, p0, Lcom/whatsapp/ContactPicker;->x:B

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;B)Landroid/content/Intent;

    .line 42
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v1, v1, v3

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 391
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    invoke-virtual {v0, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 437
    invoke-virtual {p0, v4}, Lcom/whatsapp/ContactPicker;->showDialog(I)V

    goto/16 :goto_0

    .line 64
    :cond_6
    iget-boolean v1, p0, Lcom/whatsapp/ContactPicker;->u:Z

    if-eqz v1, :cond_7

    .line 517
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    iput-object v1, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    .line 54
    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v3, 0x16

    aget-object v2, v2, v3

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 145
    invoke-virtual {p0, v5}, Lcom/whatsapp/ContactPicker;->showDialog(I)V

    goto/16 :goto_0

    .line 249
    :cond_7
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 53
    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v3, 0x16

    aget-object v2, v2, v3

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 113
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/ContactPicker;->setResult(ILandroid/content/Intent;)V

    .line 471
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->finish()V

    goto/16 :goto_0
.end method

.method static b(Lcom/whatsapp/ContactPicker;)Landroid/widget/EditText;
    .locals 1
    .parameter

    .prologue
    .line 548
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->J:Landroid/widget/EditText;

    return-object v0
.end method

.method private b(I)Z
    .locals 4
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 327
    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    if-gez p1, :cond_2

    .line 380
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 571
    :cond_1
    :goto_0
    return v0

    :cond_2
    sget-object v1, Lcom/whatsapp/ContactPicker;->i:Lcom/whatsapp/zq;

    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_0
.end method

.method static b(Lcom/whatsapp/ContactPicker;I)Z
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 305
    invoke-direct {p0, p1}, Lcom/whatsapp/ContactPicker;->a(I)Z

    move-result v0

    return v0
.end method

.method private static b(Lcom/whatsapp/zq;)Z
    .locals 2
    .parameter

    .prologue
    .line 233
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method static c(Lcom/whatsapp/ContactPicker;)I
    .locals 1
    .parameter

    .prologue
    .line 495
    iget v0, p0, Lcom/whatsapp/ContactPicker;->E:I

    return v0
.end method

.method private c(I)Z
    .locals 4
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 189
    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    if-gez p1, :cond_2

    .line 17
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v3, 0xe

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 195
    :cond_1
    :goto_0
    return v0

    :cond_2
    sget-object v1, Lcom/whatsapp/ContactPicker;->j:Lcom/whatsapp/zq;

    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_0
.end method

.method static c(Lcom/whatsapp/ContactPicker;I)Z
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 363
    invoke-direct {p0, p1}, Lcom/whatsapp/ContactPicker;->b(I)Z

    move-result v0

    return v0
.end method

.method static c(Lcom/whatsapp/zq;)Z
    .locals 1
    .parameter

    .prologue
    .line 118
    invoke-static {p0}, Lcom/whatsapp/ContactPicker;->b(Lcom/whatsapp/zq;)Z

    move-result v0

    return v0
.end method

.method static d(Lcom/whatsapp/ContactPicker;)Landroid/widget/ImageButton;
    .locals 1
    .parameter

    .prologue
    .line 482
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->N:Landroid/widget/ImageButton;

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 6
    .parameter

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 116
    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    monitor-enter v2

    .line 114
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 362
    iget-boolean v0, p0, Lcom/whatsapp/ContactPicker;->r:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/whatsapp/ContactPicker;->q:Z

    if-eqz v0, :cond_5

    .line 481
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 27
    iget-object v4, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v4, :cond_3

    invoke-virtual {v0}, Lcom/whatsapp/zq;->o()Z

    move-result v4

    if-nez v4, :cond_3

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_2
    iget-object v4, p0, Lcom/whatsapp/ContactPicker;->o:Ljava/util/HashMap;

    iget-object v5, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 393
    iget-object v4, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    if-eqz v1, :cond_1

    :cond_4
    if-eqz v1, :cond_d

    .line 429
    :cond_5
    iget-boolean v0, p0, Lcom/whatsapp/ContactPicker;->p:Z

    if-eqz v0, :cond_a

    .line 415
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 424
    sget-object v4, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v5, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/whatsapp/fq;->i(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    if-eqz p1, :cond_7

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 242
    :cond_7
    iget-object v4, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    if-eqz v1, :cond_6

    :cond_9
    if-eqz v1, :cond_d

    .line 274
    :cond_a
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 95
    iget v4, p0, Lcom/whatsapp/ContactPicker;->E:I

    packed-switch v4, :pswitch_data_0

    .line 104
    :cond_c
    :goto_0
    if-eqz v1, :cond_b

    .line 207
    :cond_d
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 509
    iget v0, p0, Lcom/whatsapp/ContactPicker;->E:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_e

    .line 270
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    new-instance v2, Lcom/whatsapp/uu;

    invoke-direct {v2}, Lcom/whatsapp/uu;-><init>()V

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    if-eqz v1, :cond_f

    .line 278
    :cond_e
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    new-instance v1, Lcom/whatsapp/ej;

    invoke-direct {v1}, Lcom/whatsapp/ej;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 490
    :cond_f
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_10

    .line 23
    new-instance v0, Lcom/whatsapp/zq;

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Lcom/whatsapp/zq;-><init>(Ljava/lang/String;)V

    .line 171
    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 547
    :cond_10
    return-void

    .line 492
    :pswitch_0
    if-eqz p1, :cond_11

    :try_start_1
    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_c

    .line 377
    :cond_11
    iget-object v4, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_c

    .line 503
    :pswitch_1
    iget-object v4, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v4, :cond_c

    if-eqz p1, :cond_12

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_c

    .line 173
    :cond_12
    iget-object v4, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_c

    .line 542
    :pswitch_2
    invoke-virtual {v0}, Lcom/whatsapp/zq;->o()Z

    move-result v4

    if-eqz v4, :cond_c

    iget-object v4, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    if-eqz v4, :cond_c

    if-eqz p1, :cond_13

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_c

    .line 519
    :cond_13
    iget-object v4, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 207
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 95
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method static d(Lcom/whatsapp/ContactPicker;I)Z
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 452
    invoke-direct {p0, p1}, Lcom/whatsapp/ContactPicker;->c(I)Z

    move-result v0

    return v0
.end method

.method static e(Lcom/whatsapp/ContactPicker;)Landroid/widget/ImageButton;
    .locals 1
    .parameter

    .prologue
    .line 423
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->O:Landroid/widget/ImageButton;

    return-object v0
.end method

.method static f(Lcom/whatsapp/ContactPicker;)Landroid/widget/ImageButton;
    .locals 1
    .parameter

    .prologue
    .line 324
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->M:Landroid/widget/ImageButton;

    return-object v0
.end method

.method private f()V
    .locals 3

    .prologue
    .line 585
    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->F:Ljava/util/ArrayList;

    monitor-enter v1

    .line 361
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 438
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->F:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Lcom/whatsapp/qp;->c(Ljava/util/ArrayList;)V

    .line 250
    invoke-direct {p0}, Lcom/whatsapp/ContactPicker;->g()V

    .line 543
    monitor-exit v1

    .line 298
    return-void

    .line 543
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static g(Lcom/whatsapp/ContactPicker;)Landroid/widget/TextView;
    .locals 1
    .parameter

    .prologue
    .line 90
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->K:Landroid/widget/TextView;

    return-object v0
.end method

.method private g()V
    .locals 10

    .prologue
    const v9, 0x7f0d0085

    const v8, 0x7f0d003d

    const/16 v7, 0x8

    const/4 v6, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 82
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 518
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 43
    :cond_0
    const v0, 0x7f0d0087

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 572
    iget-boolean v0, p0, Lcom/whatsapp/ContactPicker;->r:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/whatsapp/ContactPicker;->q:Z

    if-eqz v0, :cond_5

    .line 202
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 399
    iget-object v4, p0, Lcom/whatsapp/ContactPicker;->o:Ljava/util/HashMap;

    iget-object v5, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 206
    invoke-virtual {v0}, Lcom/whatsapp/zq;->o()Z

    move-result v4

    if-nez v4, :cond_3

    iget-object v4, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v4, :cond_3

    .line 502
    iget-object v4, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    if-eqz v1, :cond_2

    .line 532
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    new-instance v3, Lcom/whatsapp/ej;

    invoke-direct {v3}, Lcom/whatsapp/ej;-><init>()V

    invoke-static {v0, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 382
    iput v6, p0, Lcom/whatsapp/ContactPicker;->E:I

    .line 158
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    if-eqz v1, :cond_15

    .line 540
    :cond_5
    iget-boolean v0, p0, Lcom/whatsapp/ContactPicker;->p:Z

    if-eqz v0, :cond_9

    .line 160
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 72
    sget-object v4, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v5, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/whatsapp/fq;->i(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 185
    iget-object v4, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    if-eqz v1, :cond_6

    .line 453
    :cond_8
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    new-instance v3, Lcom/whatsapp/uu;

    invoke-direct {v3}, Lcom/whatsapp/uu;-><init>()V

    invoke-static {v0, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 440
    const/4 v0, 0x2

    iput v0, p0, Lcom/whatsapp/ContactPicker;->E:I

    .line 176
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    if-eqz v1, :cond_15

    .line 384
    :cond_9
    iget-boolean v0, p0, Lcom/whatsapp/ContactPicker;->t:Z

    if-nez v0, :cond_a

    iget-boolean v0, p0, Lcom/whatsapp/ContactPicker;->u:Z

    if-nez v0, :cond_a

    iget-boolean v0, p0, Lcom/whatsapp/ContactPicker;->s:Z

    if-eqz v0, :cond_10

    .line 599
    :cond_a
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 470
    iget v4, p0, Lcom/whatsapp/ContactPicker;->E:I

    packed-switch v4, :pswitch_data_0

    .line 287
    :cond_c
    :goto_0
    if-eqz v1, :cond_b

    .line 413
    :cond_d
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_e

    .line 487
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    sget-object v3, Lcom/whatsapp/ContactPicker;->j:Lcom/whatsapp/zq;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    :cond_e
    iget v0, p0, Lcom/whatsapp/ContactPicker;->E:I

    packed-switch v0, :pswitch_data_1

    .line 169
    :cond_f
    :goto_1
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    if-eqz v1, :cond_15

    .line 139
    :cond_10
    iput v6, p0, Lcom/whatsapp/ContactPicker;->E:I

    .line 483
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 52
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 257
    invoke-virtual {v0}, Lcom/whatsapp/zq;->o()Z

    move-result v3

    if-nez v3, :cond_12

    iget-object v3, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v3, :cond_12

    .line 406
    iget-object v3, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_12
    if-eqz v1, :cond_11

    .line 565
    :cond_13
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_14

    .line 512
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    sget-object v2, Lcom/whatsapp/ContactPicker;->j:Lcom/whatsapp/zq;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    :cond_14
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    new-instance v2, Lcom/whatsapp/ej;

    invoke-direct {v2}, Lcom/whatsapp/ej;-><init>()V

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 12
    iget-boolean v0, p0, Lcom/whatsapp/ContactPicker;->P:Z

    if-nez v0, :cond_15

    .line 515
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    sget-object v2, Lcom/whatsapp/ContactPicker;->h:Lcom/whatsapp/zq;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 357
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    sget-object v2, Lcom/whatsapp/ContactPicker;->i:Lcom/whatsapp/zq;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    :cond_15
    invoke-direct {p0}, Lcom/whatsapp/ContactPicker;->h()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 282
    invoke-virtual {p0, v9}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 556
    invoke-virtual {p0, v8}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    if-eqz v1, :cond_17

    .line 421
    :cond_16
    invoke-virtual {p0, v9}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 465
    invoke-virtual {p0, v8}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 389
    :cond_17
    return-void

    .line 534
    :pswitch_0
    iget-object v4, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v4, :cond_c

    .line 417
    iget-object v4, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_c

    .line 5
    :pswitch_1
    invoke-virtual {v0}, Lcom/whatsapp/zq;->o()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-virtual {v0}, Lcom/whatsapp/zq;->p()Z

    move-result v4

    if-nez v4, :cond_c

    iget-object v4, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    if-eqz v4, :cond_c

    .line 340
    iget-object v4, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_c

    .line 102
    :pswitch_2
    invoke-virtual {v0}, Lcom/whatsapp/zq;->o()Z

    move-result v4

    if-eqz v4, :cond_18

    .line 455
    invoke-virtual {v0}, Lcom/whatsapp/zq;->p()Z

    move-result v4

    if-nez v4, :cond_c

    iget-object v4, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    if-eqz v4, :cond_c

    .line 474
    iget-object v4, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_c

    .line 426
    :cond_18
    sget-object v4, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v5, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/whatsapp/fq;->i(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_c

    .line 467
    iget-object v4, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 497
    :pswitch_3
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    new-instance v3, Lcom/whatsapp/ej;

    invoke-direct {v3}, Lcom/whatsapp/ej;-><init>()V

    invoke-static {v0, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 2
    if-eqz v1, :cond_f

    .line 524
    :pswitch_4
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    new-instance v3, Lcom/whatsapp/ej;

    invoke-direct {v3}, Lcom/whatsapp/ej;-><init>()V

    invoke-static {v0, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 549
    if-eqz v1, :cond_f

    .line 501
    :pswitch_5
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    new-instance v3, Lcom/whatsapp/uu;

    invoke-direct {v3}, Lcom/whatsapp/uu;-><init>()V

    invoke-static {v0, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto/16 :goto_1

    .line 470
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    .line 100
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method static h(Lcom/whatsapp/ContactPicker;)Landroid/widget/ListView;
    .locals 1
    .parameter

    .prologue
    .line 355
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->H:Landroid/widget/ListView;

    return-object v0
.end method

.method private h()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 111
    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    if-nez v2, :cond_1

    .line 288
    :cond_0
    :goto_0
    return v0

    .line 183
    :cond_1
    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_2

    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/ContactPicker;->j:Lcom/whatsapp/zq;

    if-ne v2, v3, :cond_2

    move v0, v1

    .line 55
    goto :goto_0

    .line 311
    :cond_2
    iget-boolean v2, p0, Lcom/whatsapp/ContactPicker;->q:Z

    if-nez v2, :cond_3

    iget-boolean v2, p0, Lcom/whatsapp/ContactPicker;->r:Z

    if-nez v2, :cond_3

    iget-boolean v2, p0, Lcom/whatsapp/ContactPicker;->t:Z

    if-nez v2, :cond_3

    iget-boolean v2, p0, Lcom/whatsapp/ContactPicker;->p:Z

    if-eqz v2, :cond_0

    .line 125
    :cond_3
    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method static i(Lcom/whatsapp/ContactPicker;)Lcom/whatsapp/fe;
    .locals 1
    .parameter

    .prologue
    .line 570
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->m:Lcom/whatsapp/fe;

    return-object v0
.end method

.method private i()V
    .locals 2

    .prologue
    .line 186
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/ContactPickerHelp;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 129
    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->startActivity(Landroid/content/Intent;)V

    .line 370
    return-void
.end method

.method private j()V
    .locals 7

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 375
    sget-object v0, Lcom/whatsapp/gp;->a:Ljava/util/ArrayList;

    .line 345
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 247
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 373
    sget-object v4, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v5, 0x0

    invoke-virtual {v4, v0, v5}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v4

    .line 8
    if-eqz v4, :cond_1

    iget-object v5, v4, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-nez v5, :cond_1

    sget-object v5, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v6, 0x1b

    aget-object v5, v5, v6

    invoke-virtual {v0, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 461
    iget-object v0, v4, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz v2, :cond_0

    .line 22
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 198
    sget-object v4, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v4, v0}, Lcom/whatsapp/qp;->b(Ljava/lang/String;)I

    if-eqz v2, :cond_3

    .line 148
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 535
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 560
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v1}, Lcom/whatsapp/qp;->h()Ljava/util/ArrayList;

    move-result-object v3

    .line 197
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/zq;

    .line 221
    iget-object v5, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    if-eqz v5, :cond_6

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    :cond_6
    if-eqz v2, :cond_5

    .line 301
    :cond_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 576
    :cond_8
    return-void
.end method

.method static j(Lcom/whatsapp/ContactPicker;)Z
    .locals 1
    .parameter

    .prologue
    .line 112
    iget-boolean v0, p0, Lcom/whatsapp/ContactPicker;->P:Z

    return v0
.end method

.method static k(Lcom/whatsapp/ContactPicker;)V
    .locals 0
    .parameter

    .prologue
    .line 597
    invoke-direct {p0}, Lcom/whatsapp/ContactPicker;->g()V

    return-void
.end method

.method static l(Lcom/whatsapp/ContactPicker;)V
    .locals 0
    .parameter

    .prologue
    .line 200
    invoke-direct {p0}, Lcom/whatsapp/ContactPicker;->i()V

    return-void
.end method

.method static m(Lcom/whatsapp/ContactPicker;)Lcom/whatsapp/pj;
    .locals 1
    .parameter

    .prologue
    .line 477
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->Q:Lcom/whatsapp/pj;

    return-object v0
.end method

.method static n(Lcom/whatsapp/ContactPicker;)V
    .locals 0
    .parameter

    .prologue
    .line 525
    invoke-direct {p0}, Lcom/whatsapp/ContactPicker;->j()V

    return-void
.end method

.method static o(Lcom/whatsapp/ContactPicker;)Landroid/widget/ProgressBar;
    .locals 1
    .parameter

    .prologue
    .line 589
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->l:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static p(Lcom/whatsapp/ContactPicker;)V
    .locals 0
    .parameter

    .prologue
    .line 563
    invoke-direct {p0}, Lcom/whatsapp/ContactPicker;->f()V

    return-void
.end method

.method static q(Lcom/whatsapp/ContactPicker;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 367
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->k:Landroid/os/Handler;

    return-object v0
.end method

.method static r(Lcom/whatsapp/ContactPicker;)Lcom/whatsapp/zq;
    .locals 1
    .parameter

    .prologue
    .line 199
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->n:Lcom/whatsapp/zq;

    return-object v0
.end method

.method static s(Lcom/whatsapp/ContactPicker;)Landroid/content/Intent;
    .locals 1
    .parameter

    .prologue
    .line 63
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 486
    invoke-direct {p0}, Lcom/whatsapp/ContactPicker;->f()V

    .line 143
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->m:Lcom/whatsapp/fe;

    invoke-virtual {v0}, Lcom/whatsapp/fe;->notifyDataSetChanged()V

    .line 466
    return-void
.end method

.method public a(Lcom/whatsapp/j2;)V
    .locals 1
    .parameter

    .prologue
    .line 254
    iget-boolean v0, p1, Lcom/whatsapp/j2;->j:Z

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->m:Lcom/whatsapp/fe;

    invoke-virtual {v0}, Lcom/whatsapp/fe;->notifyDataSetChanged()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 307
    :cond_0
    const/16 v0, 0x6c

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->showDialog(I)V

    .line 520
    :cond_1
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 299
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 147
    if-eqz v0, :cond_0

    .line 168
    new-instance v1, Lcom/whatsapp/vq;

    invoke-direct {v1, v0}, Lcom/whatsapp/vq;-><init>(Lcom/whatsapp/zq;)V

    .line 603
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->F:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/whatsapp/zq;->a(Ljava/util/List;Lcom/whatsapp/wq;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->m:Lcom/whatsapp/fe;

    invoke-virtual {v0}, Lcom/whatsapp/fe;->notifyDataSetChanged()V

    .line 459
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 330
    return-void
.end method

.method protected c()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 354
    sput-boolean v0, Lcom/whatsapp/eu;->h:Z

    .line 573
    sput-boolean v0, Lcom/whatsapp/eu;->j:Z

    .line 34
    return-void
.end method

.method protected d()V
    .locals 14

    .prologue
    const/4 v8, 0x2

    const v12, 0x7f020043

    const/16 v11, 0x1d

    const/4 v10, 0x1

    const/4 v3, 0x0

    sget-boolean v4, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 347
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 602
    invoke-virtual {v5}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v5}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v2, 0x20

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    iput-boolean v10, p0, Lcom/whatsapp/ContactPicker;->t:Z

    .line 172
    iput v8, p0, Lcom/whatsapp/ContactPicker;->E:I

    if-eqz v4, :cond_24

    .line 109
    :cond_0
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v1, 0x29

    aget-object v0, v0, v1

    invoke-virtual {v5, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 316
    iput-boolean v10, p0, Lcom/whatsapp/ContactPicker;->u:Z

    .line 566
    const v0, 0x7f0d0083

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 329
    const v1, 0x7f090099

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 273
    iput v8, p0, Lcom/whatsapp/ContactPicker;->E:I

    .line 152
    if-eqz v4, :cond_24

    :cond_1
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v1, 0x27

    aget-object v0, v0, v1

    invoke-virtual {v5, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 85
    iput-boolean v10, p0, Lcom/whatsapp/ContactPicker;->r:Z

    .line 476
    iput-boolean v3, p0, Lcom/whatsapp/ContactPicker;->v:Z

    .line 277
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v1, 0x1c

    aget-object v0, v0, v1

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 442
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v10, :cond_4

    .line 122
    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 163
    array-length v2, v1

    move v0, v3

    :cond_2
    if-ge v0, v2, :cond_4

    aget-object v6, v1, v0

    .line 243
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_3

    .line 13
    iget-object v7, p0, Lcom/whatsapp/ContactPicker;->o:Ljava/util/HashMap;

    invoke-virtual {v7, v6, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    :cond_3
    add-int/lit8 v0, v0, 0x1

    if-eqz v4, :cond_2

    .line 94
    :cond_4
    if-eqz v4, :cond_24

    :cond_5
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v1, 0x24

    aget-object v0, v0, v1

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->w:Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 61
    iput-boolean v10, p0, Lcom/whatsapp/ContactPicker;->r:Z

    .line 579
    iput-boolean v10, p0, Lcom/whatsapp/ContactPicker;->v:Z

    .line 439
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->w:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/eu;->i(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->o:Ljava/util/HashMap;

    if-eqz v4, :cond_24

    .line 295
    :cond_6
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v1, 0x23

    aget-object v0, v0, v1

    invoke-virtual {v5, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 561
    const v0, 0x7f0d0083

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 92
    const v1, 0x7f090098

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 73
    iput-boolean v10, p0, Lcom/whatsapp/ContactPicker;->p:Z

    .line 18
    iput v8, p0, Lcom/whatsapp/ContactPicker;->E:I

    .line 530
    if-eqz v4, :cond_24

    :cond_7
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v1, 0x2a

    aget-object v0, v0, v1

    invoke-virtual {v5, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 292
    iput-boolean v10, p0, Lcom/whatsapp/ContactPicker;->q:Z

    .line 451
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v1, 0x33

    aget-object v0, v0, v1

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 30
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v10, :cond_a

    .line 175
    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 166
    array-length v2, v1

    move v0, v3

    :cond_8
    if-ge v0, v2, :cond_a

    aget-object v6, v1, v0

    .line 531
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_9

    .line 605
    iget-object v7, p0, Lcom/whatsapp/ContactPicker;->o:Ljava/util/HashMap;

    invoke-virtual {v7, v6, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    :cond_9
    add-int/lit8 v0, v0, 0x1

    if-eqz v4, :cond_8

    .line 325
    :cond_a
    if-eqz v4, :cond_24

    :cond_b
    invoke-virtual {v5}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_24

    .line 126
    iput-boolean v10, p0, Lcom/whatsapp/ContactPicker;->s:Z

    .line 275
    iput v8, p0, Lcom/whatsapp/ContactPicker;->E:I

    .line 296
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v0

    .line 228
    if-nez v0, :cond_d

    .line 291
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v2, 0x22

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Landroid/content/Intent;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 69
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090169

    invoke-static {v0, v1, v3}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 196
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->finish()V

    .line 446
    :cond_c
    :goto_0
    return-void

    .line 219
    :cond_d
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/whatsapp/ContactPicker;->a(Ljava/lang/String;)I

    .line 271
    const v0, 0x7f0d0083

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 144
    const v1, 0x7f090099

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 208
    iget-byte v0, p0, Lcom/whatsapp/ContactPicker;->x:B

    if-nez v0, :cond_11

    .line 231
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v2, 0x31

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 489
    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_e

    .line 230
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v2, 0x30

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->z:Ljava/lang/String;

    .line 88
    :cond_e
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v2, 0x2f

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 119
    if-eqz v0, :cond_10

    .line 333
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    .line 220
    array-length v2, v1

    const/16 v6, 0x1000

    if-le v2, v6, :cond_f

    .line 545
    new-instance v0, Ljava/lang/String;

    const/16 v2, 0x1000

    invoke-direct {v0, v1, v3, v2}, Ljava/lang/String;-><init>([BII)V

    .line 568
    :cond_f
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->z:Ljava/lang/String;

    .line 569
    :cond_10
    if-eqz v4, :cond_24

    :cond_11
    iget-byte v0, p0, Lcom/whatsapp/ContactPicker;->x:B

    const/4 v1, 0x4

    if-ne v0, v1, :cond_14

    .line 137
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v1, 0x13

    aget-object v0, v0, v1

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 323
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    .line 213
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v2, 0x2b

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 261
    const/4 v1, 0x0

    .line 441
    const/4 v0, -0x1

    .line 494
    const/4 v2, 0x0

    .line 194
    :try_start_0
    invoke-virtual {v6}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v9, 0x2e

    aget-object v8, v8, v9

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1a

    .line 302
    new-instance v7, Ljava/io/File;

    invoke-virtual {v6}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x2

    invoke-virtual {v6, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v7, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 433
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_12

    .line 244
    new-instance v1, Ljava/io/FileInputStream;

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 32
    invoke-virtual {v7}, Ljava/io/File;->length()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lb; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_9

    move-result-wide v6

    long-to-int v0, v6

    :goto_1
    move-object v13, v2

    move-object v2, v1

    move-object v1, v13

    .line 369
    :goto_2
    if-gtz v0, :cond_1c

    .line 484
    :try_start_1
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f090208

    const/4 v6, 0x0

    invoke-static {v0, v2, v6}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 16
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->finish()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_10
    .catch Lb; {:try_start_1 .. :try_end_1} :catch_f
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_e
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_d

    .line 283
    if-eqz v1, :cond_c

    .line 511
    :try_start_2
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_0

    .line 478
    :catch_0
    move-exception v0

    .line 107
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v2, v2, v11

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 304
    :cond_12
    :try_start_3
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v9, 0x1f

    aget-object v8, v8, v9

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v7}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Lb; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_9

    goto :goto_1

    .line 443
    :catch_1
    move-exception v0

    move-object v1, v2

    .line 303
    :goto_4
    :try_start_4
    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 283
    if-eqz v1, :cond_13

    .line 511
    :try_start_5
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_c

    .line 376
    :cond_13
    :goto_5
    if-eqz v4, :cond_24

    .line 468
    :cond_14
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v1, 0x13

    aget-object v0, v0, v1

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    .line 40
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    if-nez v0, :cond_16

    .line 331
    invoke-virtual {v5}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v2, 0x13

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 335
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v6, 0x2d

    aget-object v2, v2, v6

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 436
    if-eqz v0, :cond_15

    .line 239
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    .line 161
    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 575
    :cond_15
    if-eqz v4, :cond_18

    .line 600
    :cond_16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v2, 0x32

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 339
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 133
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v7, 0x2d

    aget-object v6, v6, v7

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    if-eqz v4, :cond_17

    .line 529
    :cond_18
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_19

    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_20

    .line 70
    :cond_19
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v2, 0x28

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Landroid/content/Intent;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 592
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090209

    invoke-static {v0, v1, v3}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 544
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->finish()V

    goto/16 :goto_0

    .line 564
    :cond_1a
    :try_start_6
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    const-string v1, "r"

    invoke-virtual {v0, v6, v1}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Lb; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_7
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_9

    move-result-object v1

    .line 416
    if-nez v1, :cond_1b

    .line 188
    :try_start_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v7, 0x34

    aget-object v2, v2, v7

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/whatsapp/App;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 310
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->finish()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_7 .. :try_end_7} :catch_10
    .catch Lb; {:try_start_7 .. :try_end_7} :catch_f
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_e
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_d

    .line 283
    if-eqz v1, :cond_c

    .line 511
    :try_start_8
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    goto/16 :goto_0

    .line 478
    :catch_2
    move-exception v0

    .line 107
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v2, v2, v11

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_3

    .line 86
    :cond_1b
    :try_start_9
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    move-result-object v2

    .line 204
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->getDeclaredLength()J

    move-result-wide v6

    long-to-int v0, v6

    goto/16 :goto_2

    .line 472
    :cond_1c
    new-array v0, v0, [B

    .line 101
    invoke-virtual {v2, v0}, Ljava/io/FileInputStream;->read([B)I

    move-result v2

    if-lez v2, :cond_1e

    .line 387
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([B)V

    .line 320
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v7, 0x35

    aget-object v6, v6, v7

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 533
    new-instance v0, Ln;

    invoke-direct {v0}, Ln;-><init>()V

    .line 398
    new-instance v6, Lq;

    invoke-direct {v6}, Lq;-><init>()V

    .line 598
    sget-object v7, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v8, 0x1e

    aget-object v7, v7, v8

    invoke-virtual {v0, v2, v7, v6}, Ln;->a(Ljava/lang/String;Ljava/lang/String;Lq;)Z

    move-result v0

    .line 4
    if-nez v0, :cond_1d

    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v7, 0x26

    aget-object v6, v6, v7

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 19
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f090125

    const/4 v6, 0x0

    invoke-static {v0, v2, v6}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_9 .. :try_end_9} :catch_10
    .catch Lb; {:try_start_9 .. :try_end_9} :catch_f
    .catch Ljava/io/FileNotFoundException; {:try_start_9 .. :try_end_9} :catch_e
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_d

    .line 283
    if-eqz v1, :cond_c

    .line 511
    :try_start_a
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3

    goto/16 :goto_0

    .line 478
    :catch_3
    move-exception v0

    .line 107
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v2, v2, v11

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_3

    .line 121
    :cond_1d
    const/4 v0, 0x4

    :try_start_b
    iput-byte v0, p0, Lcom/whatsapp/ContactPicker;->x:B

    .line 62
    iput-object v2, p0, Lcom/whatsapp/ContactPicker;->A:Ljava/lang/String;

    .line 546
    iget-object v0, v6, Lq;->b:Ljava/util/List;

    const/4 v6, 0x0

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr;

    .line 447
    const/4 v6, 0x0

    invoke-static {v0, v6, v2}, Lg;->a(Lr;ILjava/lang/String;)Lg;

    move-result-object v0

    .line 346
    iget-object v0, v0, Lg;->c:Lj;

    iget-object v0, v0, Lj;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->B:Ljava/lang/String;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_b .. :try_end_b} :catch_10
    .catch Lb; {:try_start_b .. :try_end_b} :catch_f
    .catch Ljava/io/FileNotFoundException; {:try_start_b .. :try_end_b} :catch_e
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_d

    .line 283
    :cond_1e
    if-eqz v1, :cond_13

    .line 511
    :try_start_c
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_4

    goto/16 :goto_5

    .line 478
    :catch_4
    move-exception v0

    .line 107
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v2, v2, v11

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_6
    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    goto/16 :goto_5

    .line 322
    :catch_5
    move-exception v0

    move-object v1, v2

    .line 167
    :goto_7
    :try_start_d
    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/Throwable;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 283
    if-eqz v1, :cond_13

    .line 511
    :try_start_e
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_6

    goto/16 :goto_5

    .line 478
    :catch_6
    move-exception v0

    .line 107
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v2, v2, v11

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    .line 581
    :catch_7
    move-exception v0

    move-object v1, v2

    .line 238
    :goto_8
    :try_start_f
    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/Throwable;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    .line 283
    if-eqz v1, :cond_13

    .line 511
    :try_start_10
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_8

    goto/16 :goto_5

    .line 478
    :catch_8
    move-exception v0

    .line 107
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v2, v2, v11

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    .line 146
    :catch_9
    move-exception v0

    move-object v1, v2

    .line 127
    :goto_9
    :try_start_11
    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/Throwable;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 283
    if-eqz v1, :cond_13

    .line 511
    :try_start_12
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_a

    goto/16 :goto_5

    .line 478
    :catch_a
    move-exception v0

    .line 107
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v2, v2, v11

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    .line 283
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_a
    if-eqz v1, :cond_1f

    .line 511
    :try_start_13
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_b

    .line 283
    :cond_1f
    :goto_b
    throw v0

    .line 427
    :cond_20
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0xa

    if-le v0, v1, :cond_21

    .line 68
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f09016a

    invoke-static {v0, v1, v3}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 279
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->finish()V

    goto/16 :goto_0

    .line 315
    :cond_21
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_24

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 87
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v5, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v6, 0x2c

    aget-object v5, v5, v6

    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_23

    .line 135
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v4, 0x21

    aget-object v2, v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 425
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090169

    invoke-static {v0, v1, v3}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 328
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    .line 262
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->finish()V

    goto/16 :goto_0

    .line 78
    :cond_23
    if-eqz v4, :cond_22

    .line 193
    :cond_24
    invoke-direct {p0}, Lcom/whatsapp/ContactPicker;->f()V

    .line 180
    new-instance v0, Lcom/whatsapp/fe;

    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->G:Ljava/util/ArrayList;

    invoke-direct {v0, p0, p0, v1}, Lcom/whatsapp/fe;-><init>(Lcom/whatsapp/ContactPicker;Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->m:Lcom/whatsapp/fe;

    .line 397
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->m:Lcom/whatsapp/fe;

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->setListAdapter(Landroid/widget/ListAdapter;)V

    .line 388
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v1, 0x25

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->I:Landroid/view/inputmethod/InputMethodManager;

    .line 338
    const v0, 0x7f0d0080

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->J:Landroid/widget/EditText;

    .line 155
    const v0, 0x7f0d0081

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->L:Landroid/widget/ImageButton;

    .line 366
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->J:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->S:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 11
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->J:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->J:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/TextEmojiLabel;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setGravity(I)V

    .line 344
    const v0, 0x7f0d0083

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->K:Landroid/widget/TextView;

    .line 229
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->L:Landroid/widget/ImageButton;

    new-instance v1, Lcom/whatsapp/tj;

    invoke-direct {v1, p0}, Lcom/whatsapp/tj;-><init>(Lcom/whatsapp/ContactPicker;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    const v0, 0x7f0d0088

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->M:Landroid/widget/ImageButton;

    .line 522
    const v0, 0x7f0d0089

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->N:Landroid/widget/ImageButton;

    .line 159
    const v0, 0x7f0d008a

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->O:Landroid/widget/ImageButton;

    .line 604
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->M:Landroid/widget/ImageButton;

    new-instance v1, Lcom/whatsapp/dk;

    invoke-direct {v1, p0}, Lcom/whatsapp/dk;-><init>(Lcom/whatsapp/ContactPicker;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 480
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->N:Landroid/widget/ImageButton;

    new-instance v1, Lcom/whatsapp/fk;

    invoke-direct {v1, p0}, Lcom/whatsapp/fk;-><init>(Lcom/whatsapp/ContactPicker;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 286
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->O:Landroid/widget/ImageButton;

    new-instance v1, Lcom/whatsapp/gk;

    invoke-direct {v1, p0}, Lcom/whatsapp/gk;-><init>(Lcom/whatsapp/ContactPicker;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    iget v0, p0, Lcom/whatsapp/ContactPicker;->E:I

    packed-switch v0, :pswitch_data_0

    .line 469
    :cond_25
    :goto_c
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getListView()Landroid/widget/ListView;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->H:Landroid/widget/ListView;

    .line 348
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->H:Landroid/widget/ListView;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 203
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->H:Landroid/widget/ListView;

    const v1, 0x7f020412

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelector(I)V

    .line 91
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->H:Landroid/widget/ListView;

    invoke-virtual {v0, v10}, Landroid/widget/ListView;->setFastScrollEnabled(Z)V

    .line 266
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->H:Landroid/widget/ListView;

    invoke-virtual {v0, v10}, Landroid/widget/ListView;->setScrollbarFadingEnabled(Z)V

    .line 321
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->H:Landroid/widget/ListView;

    const v1, 0x7f0d0086

    invoke-virtual {p0, v1}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 516
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->H:Landroid/widget/ListView;

    invoke-virtual {v0, v10}, Landroid/widget/ListView;->setTextFilterEnabled(Z)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->H:Landroid/widget/ListView;

    new-instance v1, Lcom/whatsapp/hk;

    invoke-direct {v1, p0}, Lcom/whatsapp/hk;-><init>(Lcom/whatsapp/ContactPicker;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 98
    const v0, 0x7f0d0085

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/ik;

    invoke-direct {v1, p0}, Lcom/whatsapp/ik;-><init>(Lcom/whatsapp/ContactPicker;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    new-instance v0, Lcom/whatsapp/jk;

    invoke-direct {v0, p0}, Lcom/whatsapp/jk;-><init>(Lcom/whatsapp/ContactPicker;)V

    .line 396
    const v1, 0x7f0d0105

    invoke-virtual {p0, v1}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 108
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->H:Landroid/widget/ListView;

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->registerForContextMenu(Landroid/view/View;)V

    .line 128
    invoke-static {p0}, Lcom/whatsapp/App;->i(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/whatsapp/ContactPicker;->R:Z

    goto/16 :goto_0

    .line 551
    :pswitch_0
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->O:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 80
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->N:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 284
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->M:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020044

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 162
    if-eqz v4, :cond_25

    .line 37
    :pswitch_1
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->O:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020044

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 343
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->N:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 235
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->M:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 71
    if-eqz v4, :cond_25

    .line 300
    :pswitch_2
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->O:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 574
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->N:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020044

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 297
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->M:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_c

    .line 478
    :catch_b
    move-exception v1

    .line 107
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v3, v3, v11

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    goto/16 :goto_b

    .line 478
    :catch_c
    move-exception v0

    .line 107
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    aget-object v2, v2, v11

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_6

    .line 283
    :catchall_1
    move-exception v0

    goto/16 :goto_a

    .line 146
    :catch_d
    move-exception v0

    goto/16 :goto_9

    .line 581
    :catch_e
    move-exception v0

    goto/16 :goto_8

    .line 322
    :catch_f
    move-exception v0

    goto/16 :goto_7

    .line 443
    :catch_10
    move-exception v0

    goto/16 :goto_4

    .line 120
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .parameter

    .prologue
    .line 317
    :try_start_0
    invoke-super {p0, p1}, Lcom/whatsapp/VerifyMessageStoreListActivity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    .line 314
    :catch_0
    move-exception v0

    .line 170
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected e()V
    .locals 2

    .prologue
    .line 218
    invoke-static {p0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/uk;)V

    .line 412
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->m:Lcom/whatsapp/fe;

    invoke-virtual {v0}, Lcom/whatsapp/fe;->notifyDataSetChanged()V

    .line 491
    const/4 v0, 0x0

    sput-boolean v0, Lcom/whatsapp/ContactPicker;->D:Z

    .line 507
    invoke-static {p0}, Lcom/whatsapp/App;->i(Landroid/content/Context;)Z

    move-result v0

    iget-boolean v1, p0, Lcom/whatsapp/ContactPicker;->R:Z

    if-eq v0, v1, :cond_0

    .line 578
    invoke-static {p0}, Lcom/whatsapp/App;->i(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/whatsapp/ContactPicker;->R:Z

    .line 350
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->a()V

    .line 313
    :cond_0
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 582
    packed-switch p1, :pswitch_data_0

    .line 414
    :goto_0
    return-void

    .line 83
    :pswitch_0
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 240
    invoke-direct {p0, v2}, Lcom/whatsapp/ContactPicker;->a(Z)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 493
    :cond_0
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v1, 0x1a

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 385
    :cond_1
    invoke-static {v2}, Lcom/whatsapp/g;->a(Z)V

    goto :goto_0

    .line 582
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 209
    iget-boolean v0, p0, Lcom/whatsapp/ContactPicker;->P:Z

    if-eqz v0, :cond_0

    .line 318
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->a()V

    .line 401
    const v0, 0x7f0d007e

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 36
    const v0, 0x7f0d0082

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 269
    iput-boolean v2, p0, Lcom/whatsapp/ContactPicker;->P:Z

    .line 584
    invoke-direct {p0}, Lcom/whatsapp/ContactPicker;->g()V

    .line 58
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->m:Lcom/whatsapp/fe;

    invoke-virtual {v0}, Lcom/whatsapp/fe;->notifyDataSetChanged()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 117
    :cond_0
    invoke-super {p0}, Lcom/whatsapp/VerifyMessageStoreListActivity;->onBackPressed()V

    .line 265
    :cond_1
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0
    .parameter

    .prologue
    .line 236
    invoke-super {p0, p1}, Lcom/whatsapp/VerifyMessageStoreListActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 192
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 4
    .parameter

    .prologue
    .line 96
    invoke-interface {p1}, Landroid/view/MenuItem;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    check-cast v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 498
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getListView()Landroid/widget/ListView;

    move-result-object v1

    iget v0, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 372
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 26
    invoke-super {p0, p1}, Lcom/whatsapp/VerifyMessageStoreListActivity;->onContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    .line 550
    :goto_0
    return v0

    .line 593
    :pswitch_0
    invoke-static {}, Lcom/whatsapp/App;->sb()Z

    move-result v1

    if-nez v1, :cond_0

    .line 234
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f09010d

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_1

    .line 201
    :cond_0
    const/16 v1, 0x6b

    invoke-virtual {p0, v1}, Lcom/whatsapp/ContactPicker;->showDialog(I)V

    .line 105
    new-instance v1, Lcom/whatsapp/q8;

    invoke-direct {v1, p0, v0}, Lcom/whatsapp/q8;-><init>(Lcom/whatsapp/ContactPicker;Lcom/whatsapp/zq;)V

    invoke-virtual {v1}, Lcom/whatsapp/q8;->start()V

    .line 550
    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    .line 372
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x1

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 124
    invoke-super {p0, p1}, Lcom/whatsapp/VerifyMessageStoreListActivity;->onCreate(Landroid/os/Bundle;)V

    .line 587
    const v0, 0x7f03000f

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->setContentView(I)V

    .line 77
    invoke-static {p0}, Lcom/whatsapp/j2;->a(Lcom/whatsapp/k2;)V

    .line 56
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v2, 0xb

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 49
    sget-object v0, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/whatsapp/App;->c(Landroid/content/Context;)I

    move-result v0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    .line 434
    :cond_0
    const v0, 0x7f09016d

    invoke-static {p0, v0, v3}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 272
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/Main;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 528
    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->startActivity(Landroid/content/Intent;)V

    .line 567
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->finish()V

    .line 84
    :cond_1
    :goto_0
    return-void

    .line 513
    :cond_2
    const v0, 0x7f0d0084

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->l:Landroid/widget/ProgressBar;

    .line 352
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v0}, Lcom/whatsapp/fq;->l()Z

    move-result v0

    if-nez v0, :cond_5

    .line 263
    sput-boolean v3, Lcom/whatsapp/ContactPicker;->D:Z

    .line 31
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    .line 187
    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v3, 0xc

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v3, 0xd

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 191
    const/16 v0, 0x6b

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->showDialog(I)V

    if-eqz v1, :cond_4

    .line 591
    :cond_3
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->b()V

    .line 48
    :cond_4
    if-eqz v1, :cond_1

    .line 306
    :cond_5
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->d()V

    goto :goto_0
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 4
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v3, 0x0

    .line 210
    move-object v0, p3

    check-cast v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 408
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getListView()Landroid/widget/ListView;

    move-result-object v1

    iget v0, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 514
    iget-object v1, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/whatsapp/App;->g(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 510
    :goto_0
    return-void

    .line 97
    :cond_0
    const v1, 0x7f090229

    invoke-virtual {p0, v1}, Lcom/whatsapp/ContactPicker;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v0, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v3, v3, v0}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 60
    invoke-super {p0, p1, p2, p3}, Lcom/whatsapp/VerifyMessageStoreListActivity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    goto :goto_0
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 9
    .parameter

    .prologue
    const v8, 0x7f09000c

    const/4 v7, 0x2

    const v6, 0x7f09000e

    const/4 v5, 0x0

    const/4 v4, 0x1

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 383
    sparse-switch p1, :sswitch_data_0

    .line 527
    invoke-super {p0, p1}, Lcom/whatsapp/VerifyMessageStoreListActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    :goto_0
    return-object v0

    .line 402
    :sswitch_0
    const v0, 0x7f09016e

    new-array v1, v7, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->n:Lcom/whatsapp/zq;

    invoke-virtual {v2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v5

    sget-object v2, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v3, p0, Lcom/whatsapp/ContactPicker;->w:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/whatsapp/qp;->c(Ljava/lang/String;)Lcom/whatsapp/zq;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/ContactPicker;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 245
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 276
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    if-nez v1, :cond_0

    :goto_1
    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/wj;

    invoke-direct {v1, p0}, Lcom/whatsapp/wj;-><init>(Lcom/whatsapp/ContactPicker;)V

    invoke-virtual {v0, v8, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/vj;

    invoke-direct {v1, p0}, Lcom/whatsapp/vj;-><init>(Lcom/whatsapp/ContactPicker;)V

    invoke-virtual {v0, v6, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/uj;

    invoke-direct {v1, p0}, Lcom/whatsapp/uj;-><init>(Lcom/whatsapp/ContactPicker;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    goto :goto_1

    .line 79
    :sswitch_1
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->n:Lcom/whatsapp/zq;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 435
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v4, :cond_1

    .line 258
    sget-object v0, Lcom/whatsapp/App;->Z:Lcom/whatsapp/vu;

    const v2, 0x7f0b0008

    iget-object v3, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/whatsapp/vu;->a(II)Ljava/lang/String;

    move-result-object v0

    new-array v2, v7, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    iget-object v3, p0, Lcom/whatsapp/ContactPicker;->n:Lcom/whatsapp/zq;

    invoke-virtual {v3}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_4

    .line 179
    :cond_1
    const v0, 0x7f090171

    new-array v2, v4, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/whatsapp/ContactPicker;->n:Lcom/whatsapp/zq;

    invoke-virtual {v3}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {p0, v0, v2}, Lcom/whatsapp/ContactPicker;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_4

    .line 309
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v4, :cond_3

    .line 395
    sget-object v0, Lcom/whatsapp/App;->Z:Lcom/whatsapp/vu;

    const v2, 0x7f0b0007

    iget-object v3, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/whatsapp/vu;->a(II)Ljava/lang/String;

    move-result-object v0

    new-array v2, v7, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/whatsapp/ContactPicker;->y:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    iget-object v3, p0, Lcom/whatsapp/ContactPicker;->n:Lcom/whatsapp/zq;

    invoke-virtual {v3}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_4

    .line 212
    :cond_3
    const v0, 0x7f090170

    new-array v1, v4, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->n:Lcom/whatsapp/zq;

    invoke-virtual {v2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v5

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/ContactPicker;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 588
    :cond_4
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 7
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    if-nez v1, :cond_5

    :goto_2
    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/zj;

    invoke-direct {v1, p0}, Lcom/whatsapp/zj;-><init>(Lcom/whatsapp/ContactPicker;)V

    invoke-virtual {v0, v8, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/yj;

    invoke-direct {v1, p0}, Lcom/whatsapp/yj;-><init>(Lcom/whatsapp/ContactPicker;)V

    invoke-virtual {v0, v6, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/xj;

    invoke-direct {v1, p0}, Lcom/whatsapp/xj;-><init>(Lcom/whatsapp/ContactPicker;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    :cond_5
    move-object v0, v1

    goto :goto_2

    .line 285
    :sswitch_2
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->n:Lcom/whatsapp/zq;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->o()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 555
    const v0, 0x7f090173

    new-array v2, v4, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/whatsapp/ContactPicker;->n:Lcom/whatsapp/zq;

    invoke-virtual {v3}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {p0, v0, v2}, Lcom/whatsapp/ContactPicker;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_7

    .line 580
    :cond_6
    const v0, 0x7f090172

    new-array v1, v4, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/whatsapp/ContactPicker;->n:Lcom/whatsapp/zq;

    invoke-virtual {v2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v5

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/ContactPicker;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 264
    :cond_7
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 496
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    if-nez v1, :cond_8

    :goto_3
    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/ck;

    invoke-direct {v1, p0}, Lcom/whatsapp/ck;-><init>(Lcom/whatsapp/ContactPicker;)V

    invoke-virtual {v0, v8, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/bk;

    invoke-direct {v1, p0}, Lcom/whatsapp/bk;-><init>(Lcom/whatsapp/ContactPicker;)V

    invoke-virtual {v0, v6, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/ak;

    invoke-direct {v1, p0}, Lcom/whatsapp/ak;-><init>(Lcom/whatsapp/ContactPicker;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    :cond_8
    move-object v0, v1

    goto :goto_3

    .line 365
    :sswitch_3
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 536
    const v1, 0x7f09008a

    invoke-virtual {p0, v1}, Lcom/whatsapp/ContactPicker;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 420
    invoke-virtual {v0, v4}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 59
    invoke-virtual {v0, v5}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    goto/16 :goto_0

    .line 326
    :sswitch_4
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0902af

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/ek;

    invoke-direct {v1, p0}, Lcom/whatsapp/ek;-><init>(Lcom/whatsapp/ContactPicker;)V

    invoke-virtual {v0, v6, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 383
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x6b -> :sswitch_3
        0x6c -> :sswitch_4
    .end sparse-switch
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 6
    .parameter

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 405
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 215
    const v1, 0x7f090042

    invoke-virtual {p0, v1}, Lcom/whatsapp/ContactPicker;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 6
    const v2, 0x7f0900cd

    invoke-interface {p1, v4, v5, v4, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f0203d1

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 341
    const/4 v2, 0x2

    const v3, 0x7f09003e

    invoke-interface {p1, v4, v2, v4, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f0203c2

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 392
    invoke-interface {p1, v4, v4, v4, v1}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v1

    .line 444
    const v2, 0x7f0203ce

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 601
    const/4 v0, 0x3

    const v1, 0x7f0901a4

    invoke-interface {p1, v4, v0, v4, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    .line 205
    const v1, 0x7f0203c6

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 332
    return v5
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 81
    invoke-super {p0}, Lcom/whatsapp/VerifyMessageStoreListActivity;->onDestroy()V

    .line 106
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->Q:Lcom/whatsapp/pj;

    invoke-virtual {v0}, Lcom/whatsapp/pj;->a()V

    .line 485
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 5
    .parameter

    .prologue
    const/4 v4, 0x1

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 359
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 596
    :cond_0
    :goto_0
    return v4

    .line 356
    :pswitch_0
    invoke-direct {p0, v4}, Lcom/whatsapp/ContactPicker;->a(Z)V

    goto :goto_0

    .line 558
    :pswitch_1
    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v3, 0x11

    aget-object v2, v2, v3

    sget-object v3, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 260
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 14
    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 38
    invoke-virtual {p0, v1}, Lcom/whatsapp/ContactPicker;->startActivity(Landroid/content/Intent;)V

    if-eqz v0, :cond_0

    .line 256
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v3, 0xf

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 217
    if-nez v1, :cond_2

    .line 378
    invoke-static {}, Lcom/whatsapp/App;->i()V

    if-eqz v0, :cond_0

    .line 134
    :cond_2
    invoke-virtual {p0, v1}, Lcom/whatsapp/ContactPicker;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 418
    :catch_0
    move-exception v0

    .line 577
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 458
    invoke-static {}, Lcom/whatsapp/App;->i()V

    goto :goto_0

    .line 386
    :pswitch_2
    invoke-static {p0, p0}, Lcom/whatsapp/App;->a(Landroid/app/Activity;Lcom/whatsapp/lr;)V

    goto :goto_0

    .line 74
    :pswitch_3
    invoke-direct {p0}, Lcom/whatsapp/ContactPicker;->i()V

    goto :goto_0

    .line 359
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 473
    invoke-static {p0}, Lcom/whatsapp/App;->b(Lcom/whatsapp/uk;)V

    .line 65
    invoke-static {p0}, Lcom/whatsapp/j2;->b(Lcom/whatsapp/k2;)V

    .line 138
    invoke-super {p0}, Lcom/whatsapp/VerifyMessageStoreListActivity;->onPause()V

    .line 430
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 3
    .parameter

    .prologue
    .line 110
    invoke-super {p0, p1}, Lcom/whatsapp/VerifyMessageStoreListActivity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 227
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 51
    if-eqz v0, :cond_0

    .line 75
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->n:Lcom/whatsapp/zq;

    .line 606
    :cond_0
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    iput-object v0, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    .line 464
    return-void
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 537
    invoke-super {p0}, Lcom/whatsapp/VerifyMessageStoreListActivity;->onResume()V

    .line 432
    sget-boolean v0, Lcom/whatsapp/ContactPicker;->D:Z

    if-nez v0, :cond_0

    .line 562
    invoke-virtual {p0}, Lcom/whatsapp/ContactPicker;->e()V

    .line 475
    :cond_0
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .parameter

    .prologue
    .line 553
    invoke-super {p0, p1}, Lcom/whatsapp/VerifyMessageStoreListActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 140
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->n:Lcom/whatsapp/zq;

    if-eqz v0, :cond_0

    .line 457
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->n:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    if-eqz v0, :cond_1

    .line 157
    sget-object v0, Lcom/whatsapp/ContactPicker;->T:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/whatsapp/ContactPicker;->C:Landroid/content/Intent;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 45
    :cond_1
    return-void
.end method

.method public onSearchRequested()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 150
    iget-boolean v0, p0, Lcom/whatsapp/ContactPicker;->P:Z

    if-nez v0, :cond_0

    .line 182
    const v0, 0x7f0d007e

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 319
    const v0, 0x7f0d0082

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 521
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->I:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v0, v2, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 526
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->J:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 504
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->J:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 374
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/ContactPicker;->P:Z

    .line 281
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->H:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->clearTextFilter()V

    .line 153
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whatsapp/ContactPicker;->d(Ljava/lang/String;)V

    .line 39
    iget-object v0, p0, Lcom/whatsapp/ContactPicker;->m:Lcom/whatsapp/fe;

    invoke-virtual {v0}, Lcom/whatsapp/fe;->notifyDataSetChanged()V

    .line 178
    :cond_0
    return v2
.end method
