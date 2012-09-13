.class public Lcom/whatsapp/Conversations;
.super Lcom/whatsapp/DialogToastListActivity;
.source "Conversations.java"

# interfaces
.implements Lcom/whatsapp/uk;


# static fields
.field static A:Lcom/whatsapp/zq;

.field private static final C:[Ljava/lang/String;

.field private static h:Z

.field private static i:Lcom/whatsapp/Conversations;

.field private static j:Lcom/whatsapp/zq;

.field private static k:Lcom/whatsapp/zq;


# instance fields
.field final B:Landroid/text/TextWatcher;

.field private g:Landroid/os/Handler;

.field private l:Lcom/whatsapp/pj;

.field private m:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/whatsapp/fp;",
            ">;"
        }
    .end annotation
.end field

.field public n:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Lcom/whatsapp/uq;",
            "Lcom/whatsapp/uq;",
            ">;"
        }
    .end annotation
.end field

.field o:Lcom/whatsapp/ne;

.field p:Landroid/widget/ListView;

.field q:Landroid/view/inputmethod/InputMethodManager;

.field r:Landroid/widget/EditText;

.field s:Z

.field t:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private u:Landroid/widget/ImageButton;

.field private v:Landroid/widget/ImageButton;

.field private w:Ljava/lang/String;

.field private x:Z

.field private y:Lcom/whatsapp/ep;

.field z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v2, 0x73

    const/16 v4, 0x38

    const/16 v1, 0x25

    const/16 v3, 0x1c

    const/4 v8, 0x0

    const/16 v0, 0x28

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "A\u0016p]\t@,\u007fP\u001cQ,\u007fW\u0008K\u0007"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u001eJ\u001dh]\u0005QSoA\u000eQ\u0016q\u0018\u001eJ\u001dhY\u001eQSpQ\u000eQS\u007fW\u0008I\u0017<V\u0012QSzW\u0008K\u0017"

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

    const-string v0, "U\u001bsV\u0018"

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

    const-string v0, "S\u001dx\u0016\u001cK\u0017nW\u0014A]\u007fM\u000fV\u001cn\u0016\u0014Q\u0016q\u0017\u001eJ\u001dhY\u001eQ"

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

    const-string v0, "D\u001dxJ\u0012L\u00172Q\u0013Q\u0016rLSD\u0010hQ\u0012K]Uv.`!Hg2w,Y|4q"

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

    const-string v0, "D\u001dxJ\u0012L\u00172Q\u0013Q\u0016rLSD\u0010hQ\u0012K]Uv.`!H"

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

    const-string v0, "U\u001bsV\u0018z\u0007eH\u0018"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u0019@\u001fyL\u0018\n\u0014nW\u0008UI"

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

    const-string v0, "I\u0012eW\u0008Q,uV\u001bI\u0012h]\u000f"

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

    const-string v0, "L\u001dlM\tz\u001eyL\u0015J\u0017"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u001eW\u0016}L\u0018"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0018\u001fJ\u0006r[\u0018\u0005\u0007s\u0018\u0010D\u001ar"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u001eI\u001c\u007fSPR\u0001sV\u001a"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u000eR^y@\rL\u0001y\\"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u001eW\u0016}L\u0018\n\u001ds\u0015\u0010@^sJPH\u0000{K\tJ\u0001y\u0015\u0019G"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u001aW\u001ciHRW\u0016zJ\u0018V\u001bH]\u0010U4nW\u0008U%u]\n\u0005"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u0019L\u0012pW\u001a\u0008\u001fs_\u0014K^zY\u0014I\u0016x"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u0019L\u0012pW\u001a\u0008\u0000s^\tR\u0012n]P@\u000blQ\u000f@\u0017"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u0019L\u0012pW\u001a\u0005\u0007nA\u0014K\u0014<L\u0012\u0005\u0000tW\n\u00057Uy1j4Co<w=Ck8w%U{8z6Dh4w2Hq2k_<Z\u0008QSq]\u000eV\u0012{]]U\u0012nY\u0010@\u0007yJ]L\u0000<V\u0008I\u001f="

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u0019L\u0012pW\u001a\u0008\u0000s^\tR\u0012n]PD\u0011sM\t\u0008\u0007s\u0015\u0018]\u0003uJ\u0018"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u0019L\u0012pW\u001a\u0008\u0010pW\u001eN^kJ\u0012K\u0014"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\rD\u0006o]"

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

    const-string v0, "D\u001dxJ\u0012L\u00172Q\u0013Q\u0016rLSD\u0010hQ\u0012K]Jq8r"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u0012U\u0007uW\u0013V\\rW\u0014K\u0007yV\t\n\u0000eK\t@\u001e1[\u0012K\u0007}[\tV^}H\r\u0008\u001dsLPC\u001ciV\u0019"

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

    const-string v0, "F\u001cq\u0016\u001cK\u0017nW\u0014A]\u007fW\u0013Q\u0012\u007fL\u000e"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u0012U\u0007uW\u0013V\\oA\u000eQ\u0016q\u0015\u001eJ\u001dhY\u001eQ\u00001Y\rU^rW\t\u0008\u0015sM\u0013A"

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

    const-string v0, "A\u0016oL"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u001eJ\u001dh]\u0005Q\\rM\u0011I"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u000f@\u0000iT\t\u0005\u0010sV\tD\u0010h\u0018\u0013J\u0007<Y\u0019A\u0016x"

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

    aput-object v0, v9, v3

    const/16 v10, 0x1d

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u000f@\u0000iT\t\n\u0000wQ\r\n\u0010sV\tD\u0010h\u0018\u0013J\u0007<Y\u0019A\u0016x"

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

    const-string v0, "F\u001crL\u001cF\u0007"

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

    const-string v0, "A\u0016p]\t@,{J\u0012P\u0003CQ\u0019"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u000e@\u0007x]\u0011@\u0007y[\u0015D\u00073^\u001cL\u001fy\\"

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

    const-string v0, "K\u001c<Y\u001eQ\u001aj]]V\u0016oK\u0014J\u001d"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u001eJ\u001dzQ\u001aF\u001b}V\u001a@\\oOP@\u000blQ\u000f@\u0017"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u001eJ\u001dzQ\u001aF\u001b}V\u001a@\\\u007fT\u0012F\u00181O\u000fJ\u001d{"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u001fD\u0010w"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u0019@\u0000hJ\u0012\\"

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

    aput-object v0, v9, v1

    const/16 v10, 0x26

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u000f@\u0000iU\u0018\n\u001ds\u0015\u0010@^sJPH\u0000{K\tJ\u0001y\u0015\u0019G"

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

    const-string v0, "F\u001crN\u0018W\u0000}L\u0014J\u001do\u0017\u000f@\u0000iU\u0018"

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

    sput-object v9, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    .line 361
    sput-boolean v8, Lcom/whatsapp/Conversations;->h:Z

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x7d

    :goto_28
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_28

    :pswitch_1
    move v0, v2

    goto :goto_28

    :pswitch_2
    move v0, v3

    goto :goto_28

    :pswitch_3
    move v0, v4

    goto :goto_28

    :cond_1
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x7d

    :goto_29
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_29

    :pswitch_5
    move v0, v2

    goto :goto_29

    :pswitch_6
    move v0, v3

    goto :goto_29

    :pswitch_7
    move v0, v4

    goto :goto_29

    :cond_2
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    const/16 v0, 0x7d

    :goto_2a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_2a

    :pswitch_9
    move v0, v2

    goto :goto_2a

    :pswitch_a
    move v0, v3

    goto :goto_2a

    :pswitch_b
    move v0, v4

    goto :goto_2a

    :cond_3
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3

    const/16 v0, 0x7d

    :goto_2b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_2b

    :pswitch_d
    move v0, v2

    goto :goto_2b

    :pswitch_e
    move v0, v3

    goto :goto_2b

    :pswitch_f
    move v0, v4

    goto :goto_2b

    :cond_4
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4

    const/16 v0, 0x7d

    :goto_2c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_2c

    :pswitch_11
    move v0, v2

    goto :goto_2c

    :pswitch_12
    move v0, v3

    goto :goto_2c

    :pswitch_13
    move v0, v4

    goto :goto_2c

    :cond_5
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_5

    const/16 v0, 0x7d

    :goto_2d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_2d

    :pswitch_15
    move v0, v2

    goto :goto_2d

    :pswitch_16
    move v0, v3

    goto :goto_2d

    :pswitch_17
    move v0, v4

    goto :goto_2d

    :cond_6
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_6

    const/16 v0, 0x7d

    :goto_2e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_2e

    :pswitch_19
    move v0, v2

    goto :goto_2e

    :pswitch_1a
    move v0, v3

    goto :goto_2e

    :pswitch_1b
    move v0, v4

    goto :goto_2e

    :cond_7
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_7

    const/16 v0, 0x7d

    :goto_2f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_2f

    :pswitch_1d
    move v0, v2

    goto :goto_2f

    :pswitch_1e
    move v0, v3

    goto :goto_2f

    :pswitch_1f
    move v0, v4

    goto :goto_2f

    :cond_8
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_8

    const/16 v0, 0x7d

    :goto_30
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_30

    :pswitch_21
    move v0, v2

    goto :goto_30

    :pswitch_22
    move v0, v3

    goto :goto_30

    :pswitch_23
    move v0, v4

    goto :goto_30

    :cond_9
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_9

    const/16 v0, 0x7d

    :goto_31
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_31

    :pswitch_25
    move v0, v2

    goto :goto_31

    :pswitch_26
    move v0, v3

    goto :goto_31

    :pswitch_27
    move v0, v4

    goto :goto_31

    :cond_a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_a

    const/16 v0, 0x7d

    :goto_32
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_a

    :pswitch_28
    move v0, v1

    goto :goto_32

    :pswitch_29
    move v0, v2

    goto :goto_32

    :pswitch_2a
    move v0, v3

    goto :goto_32

    :pswitch_2b
    move v0, v4

    goto :goto_32

    :cond_b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_b

    const/16 v0, 0x7d

    :goto_33
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_33

    :pswitch_2d
    move v0, v2

    goto :goto_33

    :pswitch_2e
    move v0, v3

    goto :goto_33

    :pswitch_2f
    move v0, v4

    goto :goto_33

    :cond_c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_c

    const/16 v0, 0x7d

    :goto_34
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_c

    :pswitch_30
    move v0, v1

    goto :goto_34

    :pswitch_31
    move v0, v2

    goto :goto_34

    :pswitch_32
    move v0, v3

    goto :goto_34

    :pswitch_33
    move v0, v4

    goto :goto_34

    :cond_d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_d

    const/16 v0, 0x7d

    :goto_35
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_d

    :pswitch_34
    move v0, v1

    goto :goto_35

    :pswitch_35
    move v0, v2

    goto :goto_35

    :pswitch_36
    move v0, v3

    goto :goto_35

    :pswitch_37
    move v0, v4

    goto :goto_35

    :cond_e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_e

    const/16 v0, 0x7d

    :goto_36
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_e

    :pswitch_38
    move v0, v1

    goto :goto_36

    :pswitch_39
    move v0, v2

    goto :goto_36

    :pswitch_3a
    move v0, v3

    goto :goto_36

    :pswitch_3b
    move v0, v4

    goto :goto_36

    :cond_f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_f

    const/16 v0, 0x7d

    :goto_37
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_f

    :pswitch_3c
    move v0, v1

    goto :goto_37

    :pswitch_3d
    move v0, v2

    goto :goto_37

    :pswitch_3e
    move v0, v3

    goto :goto_37

    :pswitch_3f
    move v0, v4

    goto :goto_37

    :cond_10
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_10

    const/16 v0, 0x7d

    :goto_38
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_10

    :pswitch_40
    move v0, v1

    goto :goto_38

    :pswitch_41
    move v0, v2

    goto :goto_38

    :pswitch_42
    move v0, v3

    goto :goto_38

    :pswitch_43
    move v0, v4

    goto :goto_38

    :cond_11
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_11

    const/16 v0, 0x7d

    :goto_39
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_11

    :pswitch_44
    move v0, v1

    goto :goto_39

    :pswitch_45
    move v0, v2

    goto :goto_39

    :pswitch_46
    move v0, v3

    goto :goto_39

    :pswitch_47
    move v0, v4

    goto :goto_39

    :cond_12
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_12

    const/16 v0, 0x7d

    :goto_3a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_12

    :pswitch_48
    move v0, v1

    goto :goto_3a

    :pswitch_49
    move v0, v2

    goto :goto_3a

    :pswitch_4a
    move v0, v3

    goto :goto_3a

    :pswitch_4b
    move v0, v4

    goto :goto_3a

    :cond_13
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_13

    const/16 v0, 0x7d

    :goto_3b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_13

    :pswitch_4c
    move v0, v1

    goto :goto_3b

    :pswitch_4d
    move v0, v2

    goto :goto_3b

    :pswitch_4e
    move v0, v3

    goto :goto_3b

    :pswitch_4f
    move v0, v4

    goto :goto_3b

    :cond_14
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_14

    const/16 v0, 0x7d

    :goto_3c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_14

    :pswitch_50
    move v0, v1

    goto :goto_3c

    :pswitch_51
    move v0, v2

    goto :goto_3c

    :pswitch_52
    move v0, v3

    goto :goto_3c

    :pswitch_53
    move v0, v4

    goto :goto_3c

    :cond_15
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_15

    const/16 v0, 0x7d

    :goto_3d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_15

    :pswitch_54
    move v0, v1

    goto :goto_3d

    :pswitch_55
    move v0, v2

    goto :goto_3d

    :pswitch_56
    move v0, v3

    goto :goto_3d

    :pswitch_57
    move v0, v4

    goto :goto_3d

    :cond_16
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_16

    const/16 v0, 0x7d

    :goto_3e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_16

    :pswitch_58
    move v0, v1

    goto :goto_3e

    :pswitch_59
    move v0, v2

    goto :goto_3e

    :pswitch_5a
    move v0, v3

    goto :goto_3e

    :pswitch_5b
    move v0, v4

    goto :goto_3e

    :cond_17
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_17

    const/16 v0, 0x7d

    :goto_3f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_17

    :pswitch_5c
    move v0, v1

    goto :goto_3f

    :pswitch_5d
    move v0, v2

    goto :goto_3f

    :pswitch_5e
    move v0, v3

    goto :goto_3f

    :pswitch_5f
    move v0, v4

    goto :goto_3f

    :cond_18
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_18

    const/16 v0, 0x7d

    :goto_40
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_18

    :pswitch_60
    move v0, v1

    goto :goto_40

    :pswitch_61
    move v0, v2

    goto :goto_40

    :pswitch_62
    move v0, v3

    goto :goto_40

    :pswitch_63
    move v0, v4

    goto :goto_40

    :cond_19
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_19

    const/16 v0, 0x7d

    :goto_41
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_19

    :pswitch_64
    move v0, v1

    goto :goto_41

    :pswitch_65
    move v0, v2

    goto :goto_41

    :pswitch_66
    move v0, v3

    goto :goto_41

    :pswitch_67
    move v0, v4

    goto :goto_41

    :cond_1a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1a

    const/16 v0, 0x7d

    :goto_42
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1a

    :pswitch_68
    move v0, v1

    goto :goto_42

    :pswitch_69
    move v0, v2

    goto :goto_42

    :pswitch_6a
    move v0, v3

    goto :goto_42

    :pswitch_6b
    move v0, v4

    goto :goto_42

    :cond_1b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1b

    const/16 v0, 0x7d

    :goto_43
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1b

    :pswitch_6c
    move v0, v1

    goto :goto_43

    :pswitch_6d
    move v0, v2

    goto :goto_43

    :pswitch_6e
    move v0, v3

    goto :goto_43

    :pswitch_6f
    move v0, v4

    goto :goto_43

    :cond_1c
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1c

    const/16 v0, 0x7d

    :goto_44
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1c

    :pswitch_70
    move v0, v1

    goto :goto_44

    :pswitch_71
    move v0, v2

    goto :goto_44

    :pswitch_72
    move v0, v3

    goto :goto_44

    :pswitch_73
    move v0, v4

    goto :goto_44

    :cond_1d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1d

    const/16 v0, 0x7d

    :goto_45
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1d

    :pswitch_74
    move v0, v1

    goto :goto_45

    :pswitch_75
    move v0, v2

    goto :goto_45

    :pswitch_76
    move v0, v3

    goto :goto_45

    :pswitch_77
    move v0, v4

    goto :goto_45

    :cond_1e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1e

    const/16 v0, 0x7d

    :goto_46
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1e

    :pswitch_78
    move v0, v1

    goto :goto_46

    :pswitch_79
    move v0, v2

    goto :goto_46

    :pswitch_7a
    move v0, v3

    goto :goto_46

    :pswitch_7b
    move v0, v4

    goto :goto_46

    :cond_1f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1f

    const/16 v0, 0x7d

    :goto_47
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1f

    :pswitch_7c
    move v0, v1

    goto :goto_47

    :pswitch_7d
    move v0, v2

    goto :goto_47

    :pswitch_7e
    move v0, v3

    goto :goto_47

    :pswitch_7f
    move v0, v4

    goto :goto_47

    :cond_20
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_20

    const/16 v0, 0x7d

    :goto_48
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_20

    :pswitch_80
    move v0, v1

    goto :goto_48

    :pswitch_81
    move v0, v2

    goto :goto_48

    :pswitch_82
    move v0, v3

    goto :goto_48

    :pswitch_83
    move v0, v4

    goto :goto_48

    :cond_21
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_21

    const/16 v0, 0x7d

    :goto_49
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_21

    :pswitch_84
    move v0, v1

    goto :goto_49

    :pswitch_85
    move v0, v2

    goto :goto_49

    :pswitch_86
    move v0, v3

    goto :goto_49

    :pswitch_87
    move v0, v4

    goto :goto_49

    :cond_22
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_22

    const/16 v0, 0x7d

    :goto_4a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_22

    :pswitch_88
    move v0, v1

    goto :goto_4a

    :pswitch_89
    move v0, v2

    goto :goto_4a

    :pswitch_8a
    move v0, v3

    goto :goto_4a

    :pswitch_8b
    move v0, v4

    goto :goto_4a

    :cond_23
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_23

    const/16 v0, 0x7d

    :goto_4b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_23

    :pswitch_8c
    move v0, v1

    goto :goto_4b

    :pswitch_8d
    move v0, v2

    goto :goto_4b

    :pswitch_8e
    move v0, v3

    goto :goto_4b

    :pswitch_8f
    move v0, v4

    goto :goto_4b

    :cond_24
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_24

    const/16 v0, 0x7d

    :goto_4c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_24

    :pswitch_90
    move v0, v1

    goto :goto_4c

    :pswitch_91
    move v0, v2

    goto :goto_4c

    :pswitch_92
    move v0, v3

    goto :goto_4c

    :pswitch_93
    move v0, v4

    goto :goto_4c

    :cond_25
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_25

    const/16 v0, 0x7d

    :goto_4d
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_25

    :pswitch_94
    move v0, v1

    goto :goto_4d

    :pswitch_95
    move v0, v2

    goto :goto_4d

    :pswitch_96
    move v0, v3

    goto :goto_4d

    :pswitch_97
    move v0, v4

    goto :goto_4d

    :cond_26
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_26

    const/16 v0, 0x7d

    :goto_4e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_26

    :pswitch_98
    move v0, v1

    goto :goto_4e

    :pswitch_99
    move v0, v2

    goto :goto_4e

    :pswitch_9a
    move v0, v3

    goto :goto_4e

    :pswitch_9b
    move v0, v4

    goto :goto_4e

    :cond_27
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_27

    const/16 v0, 0x7d

    :goto_4f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_27

    :pswitch_9c
    move v0, v1

    goto :goto_4f

    :pswitch_9d
    move v0, v2

    goto :goto_4f

    :pswitch_9e
    move v0, v3

    goto :goto_4f

    :pswitch_9f
    move v0, v4

    goto :goto_4f

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
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 94
    invoke-direct {p0}, Lcom/whatsapp/DialogToastListActivity;-><init>()V

    .line 64
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/Conversations;->g:Landroid/os/Handler;

    .line 452
    new-instance v0, Lcom/whatsapp/pj;

    invoke-direct {v0}, Lcom/whatsapp/pj;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/Conversations;->l:Lcom/whatsapp/pj;

    .line 93
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/Conversations;->m:Ljava/util/HashMap;

    .line 44
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/Conversations;->n:Ljava/util/HashMap;

    .line 255
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/Conversations;->s:Z

    .line 56
    iput-object v1, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    .line 213
    iput-object v1, p0, Lcom/whatsapp/Conversations;->z:Ljava/lang/String;

    .line 49
    new-instance v0, Lcom/whatsapp/wo;

    invoke-direct {v0, p0}, Lcom/whatsapp/wo;-><init>(Lcom/whatsapp/Conversations;)V

    iput-object v0, p0, Lcom/whatsapp/Conversations;->B:Landroid/text/TextWatcher;

    return-void
.end method

.method public static a(Landroid/app/Activity;)Landroid/app/Dialog;
    .locals 2
    .parameter

    .prologue
    .line 470
    new-instance v0, Lcom/whatsapp/d;

    const v1, 0x7f030009

    invoke-direct {v0, p0, v1, p0}, Lcom/whatsapp/d;-><init>(Landroid/app/Activity;ILandroid/app/Activity;)V

    .line 186
    new-instance v1, Lcom/whatsapp/ro;

    invoke-direct {v1, p0}, Lcom/whatsapp/ro;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 177
    return-object v0
.end method

.method public static a(Landroid/app/Activity;I)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 370
    const/4 v0, 0x1

    sput-boolean v0, Lcom/whatsapp/App;->R:Z

    .line 356
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->L()V

    .line 326
    invoke-virtual {p0, p1}, Landroid/app/Activity;->showDialog(I)V

    .line 180
    return-void
.end method

.method private static a(Lcom/whatsapp/Conversations;)V
    .locals 1
    .parameter

    .prologue
    .line 114
    sput-object p0, Lcom/whatsapp/Conversations;->i:Lcom/whatsapp/Conversations;

    .line 283
    const/4 v0, 0x1

    sput-boolean v0, Lcom/whatsapp/Conversations;->h:Z

    .line 231
    return-void
.end method

.method static a(Lcom/whatsapp/Conversations;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 478
    invoke-direct {p0, p1}, Lcom/whatsapp/Conversations;->b(I)V

    return-void
.end method

.method static a(Lcom/whatsapp/Conversations;Z)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 211
    invoke-direct {p0, p1}, Lcom/whatsapp/Conversations;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 1
    .parameter

    .prologue
    .line 428
    if-nez p1, :cond_0

    .line 182
    invoke-virtual {p0}, Lcom/whatsapp/Conversations;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 225
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->showDialog(I)V

    .line 208
    :cond_0
    return-void
.end method

.method public static a()Z
    .locals 1

    .prologue
    .line 33
    sget-boolean v0, Lcom/whatsapp/Conversations;->h:Z

    return v0
.end method

.method public static b(Landroid/app/Activity;)Landroid/app/Dialog;
    .locals 2
    .parameter

    .prologue
    .line 345
    new-instance v0, Lcom/whatsapp/e;

    const v1, 0x7f030056

    invoke-direct {v0, p0, v1, p0}, Lcom/whatsapp/e;-><init>(Landroid/app/Activity;ILandroid/app/Activity;)V

    .line 409
    new-instance v1, Lcom/whatsapp/to;

    invoke-direct {v1, p0}, Lcom/whatsapp/to;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 411
    return-object v0
.end method

.method public static b()Lcom/whatsapp/Conversations;
    .locals 3

    .prologue
    .line 195
    sget-boolean v0, Lcom/whatsapp/Conversations;->h:Z

    if-eqz v0, :cond_0

    .line 156
    sget-object v0, Lcom/whatsapp/Conversations;->i:Lcom/whatsapp/Conversations;

    return-object v0

    .line 111
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    sget-object v1, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v2, 0x21

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private b(I)V
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 170
    const v0, 0x7f090002

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v2}, Lcom/whatsapp/Conversations;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 380
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 463
    sget-object v1, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 146
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-nez v0, :cond_0

    .line 232
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v1, 0x20

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 196
    :cond_0
    return-void
.end method

.method private static b(Lcom/whatsapp/Conversations;)V
    .locals 1
    .parameter

    .prologue
    .line 276
    sget-object v0, Lcom/whatsapp/Conversations;->i:Lcom/whatsapp/Conversations;

    if-ne v0, p0, :cond_0

    .line 163
    const/4 v0, 0x0

    sput-boolean v0, Lcom/whatsapp/Conversations;->h:Z

    .line 70
    :cond_0
    return-void
.end method

.method static c(Lcom/whatsapp/Conversations;)Landroid/widget/ImageButton;
    .locals 1
    .parameter

    .prologue
    .line 387
    iget-object v0, p0, Lcom/whatsapp/Conversations;->u:Landroid/widget/ImageButton;

    return-object v0
.end method

.method private c()V
    .locals 2

    .prologue
    .line 129
    invoke-static {}, Lcom/whatsapp/xp;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/whatsapp/xp;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 115
    new-instance v0, Lcom/whatsapp/eb;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whatsapp/eb;-><init>(Lcom/whatsapp/Conversations;Lcom/whatsapp/u8;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/whatsapp/eb;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 124
    :cond_0
    invoke-static {}, Lcom/whatsapp/xp;->d()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/whatsapp/Conversations;->a(Z)V

    .line 183
    :cond_1
    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 262
    invoke-static {}, Lcom/whatsapp/xp;->c()V

    .line 234
    new-instance v0, Lcom/whatsapp/eb;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whatsapp/eb;-><init>(Lcom/whatsapp/Conversations;Lcom/whatsapp/u8;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/whatsapp/eb;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 62
    return-void
.end method

.method static d(Lcom/whatsapp/Conversations;)V
    .locals 0
    .parameter

    .prologue
    .line 303
    invoke-direct {p0}, Lcom/whatsapp/Conversations;->d()V

    return-void
.end method

.method private e()I
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 362
    const v0, 0x7f090002

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v2}, Lcom/whatsapp/Conversations;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 148
    sget-object v1, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method static e(Lcom/whatsapp/Conversations;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 408
    iget-object v0, p0, Lcom/whatsapp/Conversations;->g:Landroid/os/Handler;

    return-object v0
.end method

.method private e(Ljava/lang/String;)V
    .locals 1
    .parameter

    .prologue
    .line 308
    iget-object v0, p0, Lcom/whatsapp/Conversations;->o:Lcom/whatsapp/ne;

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/whatsapp/Conversations;->o:Lcom/whatsapp/ne;

    invoke-virtual {v0}, Lcom/whatsapp/ne;->notifyDataSetChanged()V

    .line 218
    :cond_0
    return-void
.end method

.method static f(Lcom/whatsapp/Conversations;)I
    .locals 1
    .parameter

    .prologue
    .line 459
    invoke-direct {p0}, Lcom/whatsapp/Conversations;->e()I

    move-result v0

    return v0
.end method

.method static g(Lcom/whatsapp/Conversations;)Ljava/util/HashMap;
    .locals 1
    .parameter

    .prologue
    .line 41
    iget-object v0, p0, Lcom/whatsapp/Conversations;->m:Ljava/util/HashMap;

    return-object v0
.end method

.method private g()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 425
    invoke-static {p0, v1}, Lcom/whatsapp/eg;->a(Landroid/app/Activity;Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/Conversations;->z:Ljava/lang/String;

    .line 299
    iget-object v0, p0, Lcom/whatsapp/Conversations;->z:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 215
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->showDialog(I)V

    .line 446
    :cond_0
    sput-boolean v1, Lcom/whatsapp/eg;->d:Z

    .line 284
    sput-boolean v1, Lcom/whatsapp/eg;->e:Z

    .line 395
    return-void
.end method

.method static h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;
    .locals 1
    .parameter

    .prologue
    .line 386
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    return-object v0
.end method

.method static i(Lcom/whatsapp/Conversations;)Lcom/whatsapp/pj;
    .locals 1
    .parameter

    .prologue
    .line 333
    iget-object v0, p0, Lcom/whatsapp/Conversations;->l:Lcom/whatsapp/pj;

    return-object v0
.end method

.method private j()V
    .locals 1

    .prologue
    .line 404
    iget-object v0, p0, Lcom/whatsapp/Conversations;->o:Lcom/whatsapp/ne;

    if-eqz v0, :cond_0

    .line 354
    iget-object v0, p0, Lcom/whatsapp/Conversations;->o:Lcom/whatsapp/ne;

    invoke-virtual {v0}, Lcom/whatsapp/ne;->notifyDataSetChanged()V

    .line 106
    :cond_0
    return-void
.end method

.method static k()Lcom/whatsapp/zq;
    .locals 1

    .prologue
    .line 416
    sget-object v0, Lcom/whatsapp/Conversations;->k:Lcom/whatsapp/zq;

    return-object v0
.end method

.method static l()Lcom/whatsapp/zq;
    .locals 1

    .prologue
    .line 235
    sget-object v0, Lcom/whatsapp/Conversations;->j:Lcom/whatsapp/zq;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 120
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v0}, Lcom/whatsapp/qp;->f()I

    move-result v0

    .line 165
    const v1, 0x7f0d00de

    invoke-virtual {p0, v1}, Lcom/whatsapp/Conversations;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 197
    const v2, 0x7f0d00dc

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 465
    if-lez v0, :cond_0

    .line 252
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 329
    iget-object v0, p0, Lcom/whatsapp/Conversations;->p:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 37
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 450
    :cond_0
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 248
    iget-object v0, p0, Lcom/whatsapp/Conversations;->p:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 116
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 153
    :cond_1
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 357
    invoke-direct {p0, p1}, Lcom/whatsapp/Conversations;->e(Ljava/lang/String;)V

    .line 239
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whatsapp/iu;)V
    .locals 7
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 158
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v2, 0xf

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 469
    iget-object v6, p0, Lcom/whatsapp/Conversations;->p:Landroid/widget/ListView;

    new-instance v0, Lcom/whatsapp/vo;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move-object v4, p2

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/whatsapp/vo;-><init>(Lcom/whatsapp/Conversations;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whatsapp/iu;)V

    invoke-virtual {v6, v0}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    .line 290
    return-void
.end method

.method public a(Ljava/lang/String;Z)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 392
    iget-object v0, p0, Lcom/whatsapp/Conversations;->p:Landroid/widget/ListView;

    new-instance v1, Lcom/whatsapp/uo;

    invoke-direct {v1, p0, p1, p2}, Lcom/whatsapp/uo;-><init>(Lcom/whatsapp/Conversations;Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    .line 371
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 86
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 286
    invoke-direct {p0, p1}, Lcom/whatsapp/Conversations;->e(Ljava/lang/String;)V

    .line 390
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .parameter

    .prologue
    .line 209
    :try_start_0
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 314
    :goto_0
    return v0

    .line 393
    :catch_0
    move-exception v0

    .line 314
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()V
    .locals 1

    .prologue
    .line 57
    iget-boolean v0, p0, Lcom/whatsapp/Conversations;->x:Z

    if-nez v0, :cond_0

    .line 296
    const/16 v0, 0x6e

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->showDialog(I)V

    .line 141
    :cond_0
    return-void
.end method

.method public h()V
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/whatsapp/Conversations;->o:Lcom/whatsapp/ne;

    if-eqz v0, :cond_1

    .line 480
    iget-boolean v0, p0, Lcom/whatsapp/Conversations;->s:Z

    if-eqz v0, :cond_0

    .line 369
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/Conversations;->o:Lcom/whatsapp/ne;

    invoke-virtual {v0}, Lcom/whatsapp/ne;->notifyDataSetChanged()V

    .line 342
    :cond_1
    return-void
.end method

.method public i()V
    .locals 0

    .prologue
    .line 73
    invoke-direct {p0}, Lcom/whatsapp/Conversations;->j()V

    .line 305
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 6
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v5, 0x0

    const/4 v4, -0x1

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 482
    sparse-switch p1, :sswitch_data_0

    .line 285
    :cond_0
    :goto_0
    return-void

    .line 379
    :sswitch_0
    if-ne p2, v4, :cond_0

    .line 349
    sget-object v1, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v2, 0x1e

    aget-object v1, v1, v2

    invoke-virtual {p3, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 458
    sget-object v2, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v1

    .line 217
    invoke-static {v1}, Lcom/whatsapp/Conversation;->a(Lcom/whatsapp/zq;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/whatsapp/Conversations;->startActivity(Landroid/content/Intent;)V

    .line 264
    if-eqz v0, :cond_0

    .line 309
    :sswitch_1
    if-ne p2, v4, :cond_2

    .line 132
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 257
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/Conversations;->A:Lcom/whatsapp/zq;

    invoke-virtual {v1, v2, v3}, Lcom/whatsapp/qp;->a(Landroid/net/Uri;Lcom/whatsapp/zq;)V

    if-eqz v0, :cond_3

    .line 174
    :cond_1
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    sget-object v2, Lcom/whatsapp/Conversations;->A:Lcom/whatsapp/zq;

    invoke-virtual {v1, v2}, Lcom/whatsapp/qp;->b(Lcom/whatsapp/zq;)V

    if-eqz v0, :cond_3

    .line 38
    :cond_2
    sget-object v1, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v2, 0x1c

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 421
    :cond_3
    invoke-static {v5}, Lcom/whatsapp/g;->a(Z)V

    .line 175
    if-eqz v0, :cond_0

    .line 145
    :sswitch_2
    if-ne p2, v4, :cond_4

    .line 236
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    sget-object v2, Lcom/whatsapp/Conversations;->A:Lcom/whatsapp/zq;

    invoke-virtual {v1, v2}, Lcom/whatsapp/qp;->b(Lcom/whatsapp/zq;)V

    if-eqz v0, :cond_5

    .line 455
    :cond_4
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v1, 0x1d

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 147
    :cond_5
    invoke-static {v5}, Lcom/whatsapp/g;->a(Z)V

    goto :goto_0

    .line 482
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0xa -> :sswitch_1
        0xb -> :sswitch_2
    .end sparse-switch
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 365
    iget-boolean v0, p0, Lcom/whatsapp/Conversations;->s:Z

    if-eqz v0, :cond_0

    .line 104
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v1, 0x24

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 160
    const v0, 0x7f0d007e

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 133
    const v0, 0x7f0d003c

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 330
    iput-boolean v2, p0, Lcom/whatsapp/Conversations;->s:Z

    .line 343
    iget-object v0, p0, Lcom/whatsapp/Conversations;->o:Lcom/whatsapp/ne;

    invoke-virtual {v0}, Lcom/whatsapp/ne;->getFilter()Landroid/widget/Filter;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 310
    :cond_0
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onBackPressed()V

    .line 332
    :cond_1
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 5
    .parameter

    .prologue
    const/16 v4, 0x72

    const/16 v3, 0x71

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 341
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 302
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v1}, Lcom/whatsapp/App;->I()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 113
    sget-object v1, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v2, 0x23

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 123
    invoke-virtual {p0, v3}, Lcom/whatsapp/Conversations;->removeDialog(I)V

    .line 474
    invoke-static {p0, v3}, Lcom/whatsapp/Conversations;->a(Landroid/app/Activity;I)V

    if-eqz v0, :cond_2

    .line 273
    :cond_0
    invoke-static {}, Lcom/whatsapp/App;->J()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 295
    sget-object v1, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v2, 0x22

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p0, v4}, Lcom/whatsapp/Conversations;->removeDialog(I)V

    .line 268
    invoke-static {p0, v4}, Lcom/whatsapp/Conversations;->a(Landroid/app/Activity;I)V

    if-eqz v0, :cond_2

    .line 134
    :cond_1
    invoke-static {}, Lcom/whatsapp/App;->K()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 355
    const/16 v0, 0x73

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->showDialog(I)V

    .line 63
    :cond_2
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 8
    .parameter

    .prologue
    const/16 v7, 0xa

    const/4 v5, 0x7

    const/4 v6, 0x2

    const/4 v1, 0x1

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 269
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v3, p0, Lcom/whatsapp/Conversations;->w:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 348
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    .line 249
    :pswitch_0
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    .line 385
    :goto_0
    return v0

    .line 384
    :pswitch_1
    iget-object v2, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v2, :cond_0

    .line 383
    invoke-static {v0, p0}, Lcom/whatsapp/ContactInfo;->a(Lcom/whatsapp/zq;Landroid/app/Activity;)V

    :cond_0
    move v0, v1

    .line 385
    goto :goto_0

    .line 71
    :pswitch_2
    invoke-virtual {v0}, Lcom/whatsapp/zq;->o()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 321
    sget-boolean v3, Lcom/whatsapp/eu;->j:Z

    if-eqz v3, :cond_1

    .line 279
    const v3, 0x7f0900d7

    const/4 v4, 0x0

    invoke-static {p0, v3, v4}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    if-eqz v2, :cond_3

    .line 82
    :cond_1
    sput-object v0, Lcom/whatsapp/Conversations;->j:Lcom/whatsapp/zq;

    .line 338
    invoke-virtual {p0, v5}, Lcom/whatsapp/Conversations;->showDialog(I)V

    if-eqz v2, :cond_3

    .line 431
    :cond_2
    sput-object v0, Lcom/whatsapp/Conversations;->k:Lcom/whatsapp/zq;

    .line 136
    invoke-virtual {p0, v7}, Lcom/whatsapp/Conversations;->showDialog(I)V

    :cond_3
    move v0, v1

    .line 191
    goto :goto_0

    .line 352
    :pswitch_3
    sput-object v0, Lcom/whatsapp/Conversations;->A:Lcom/whatsapp/zq;

    .line 477
    invoke-virtual {v0}, Lcom/whatsapp/zq;->a()Ljava/lang/String;

    move-result-object v0

    .line 179
    new-instance v3, Landroid/content/Intent;

    sget-object v4, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/4 v5, 0x5

    aget-object v4, v4, v5

    sget-object v5, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-direct {v3, v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 128
    sget-object v4, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    aget-object v4, v4, v6

    invoke-virtual {v3, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 35
    invoke-virtual {p0}, Lcom/whatsapp/Conversations;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 351
    invoke-virtual {v3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 221
    invoke-static {v1}, Lcom/whatsapp/g;->a(Z)V

    .line 449
    invoke-virtual {p0, v3, v7}, Lcom/whatsapp/Conversations;->startActivityForResult(Landroid/content/Intent;I)V

    if-eqz v2, :cond_5

    .line 137
    :cond_4
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 445
    invoke-static {}, Lcom/whatsapp/App;->h()V

    :cond_5
    move v0, v1

    .line 9
    goto :goto_0

    .line 261
    :pswitch_4
    sput-object v0, Lcom/whatsapp/Conversations;->A:Lcom/whatsapp/zq;

    .line 258
    invoke-static {v1}, Lcom/whatsapp/g;->a(Z)V

    .line 244
    new-instance v0, Landroid/content/Intent;

    sget-object v2, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 336
    sget-object v2, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 142
    sget-object v2, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    aget-object v2, v2, v6

    sget-object v3, Lcom/whatsapp/Conversations;->A:Lcom/whatsapp/zq;

    invoke-virtual {v3}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 432
    sget-object v2, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-virtual {v0, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 126
    const/high16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 419
    const/16 v2, 0xb

    invoke-virtual {p0, v0, v2}, Lcom/whatsapp/Conversations;->startActivityForResult(Landroid/content/Intent;I)V

    move v0, v1

    .line 100
    goto/16 :goto_0

    .line 350
    :pswitch_5
    sget-boolean v0, Lcom/whatsapp/App;->mb:Z

    if-nez v0, :cond_6

    sget-boolean v0, Lcom/whatsapp/App;->lb:Z

    if-eqz v0, :cond_7

    .line 327
    :cond_6
    invoke-static {}, Lcom/whatsapp/App;->tb()Z

    move-result v0

    if-eqz v0, :cond_9

    const v0, 0x7f0900b6

    :goto_1
    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->a(I)V

    if-eqz v2, :cond_8

    .line 263
    :cond_7
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->showDialog(I)V

    :cond_8
    move v0, v1

    .line 246
    goto/16 :goto_0

    .line 327
    :cond_9
    const v0, 0x7f0900b7

    goto :goto_1

    .line 433
    :pswitch_6
    sget-object v2, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v2, v0}, Lcom/whatsapp/qp;->h(Lcom/whatsapp/zq;)V

    move v0, v1

    .line 301
    goto/16 :goto_0

    .line 346
    :pswitch_7
    invoke-static {v0, p0}, Lcom/whatsapp/GroupChatInfo;->a(Lcom/whatsapp/zq;Landroid/app/Activity;)V

    move v0, v1

    .line 247
    goto/16 :goto_0

    .line 348
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_7
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6
    .parameter

    .prologue
    const/4 v5, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 282
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onCreate(Landroid/os/Bundle;)V

    .line 189
    sget-object v0, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v0}, Lcom/whatsapp/fq;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/whatsapp/App;->c(Landroid/content/Context;)I

    move-result v0

    if-eq v0, v5, :cond_1

    .line 118
    :cond_0
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 358
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/App;->d(Ljava/lang/String;)V

    .line 353
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/Main;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 185
    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->startActivity(Landroid/content/Intent;)V

    .line 7
    invoke-virtual {p0}, Lcom/whatsapp/Conversations;->finish()V

    .line 293
    :goto_0
    return-void

    .line 109
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    if-nez v0, :cond_2

    .line 107
    new-instance v0, Lcom/whatsapp/ep;

    invoke-direct {v0}, Lcom/whatsapp/ep;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    .line 272
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f09027d

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->a:Ljava/lang/String;

    .line 422
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f090267

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->c:Ljava/lang/String;

    .line 140
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f090268

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->b:Ljava/lang/String;

    .line 190
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f090269

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->e:Ljava/lang/String;

    .line 32
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f09026a

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->d:Ljava/lang/String;

    .line 376
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f090266

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->f:Ljava/lang/String;

    .line 227
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f09026b

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->g:Ljava/lang/String;

    .line 243
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f09026c

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->h:Ljava/lang/String;

    .line 367
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f090184

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->i:Ljava/lang/String;

    .line 224
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f090185

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->j:Ljava/lang/String;

    .line 315
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f090186

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->k:Ljava/lang/String;

    .line 267
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f090187

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->l:Ljava/lang/String;

    .line 222
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f09026f

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->m:Ljava/lang/String;

    .line 460
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f09026e

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->n:Ljava/lang/String;

    .line 402
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f0901fc

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->o:Ljava/lang/String;

    .line 59
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f0901fd

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->p:Ljava/lang/String;

    .line 479
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f0901fe

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->q:Ljava/lang/String;

    .line 260
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f090200

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->r:Ljava/lang/String;

    .line 388
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f0901ff

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->s:Ljava/lang/String;

    .line 238
    iget-object v0, p0, Lcom/whatsapp/Conversations;->y:Lcom/whatsapp/ep;

    const v2, 0x7f090256

    invoke-virtual {p0, v2}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/ep;->t:Ljava/lang/String;

    .line 439
    :cond_2
    sget-object v0, Lcom/whatsapp/App;->oc:Landroid/media/AsyncPlayer;

    invoke-virtual {v0}, Landroid/media/AsyncPlayer;->stop()V

    .line 31
    invoke-static {p0}, Lcom/whatsapp/Conversations;->a(Lcom/whatsapp/Conversations;)V

    .line 199
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v2, 0xa

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 72
    invoke-static {}, Lcom/whatsapp/App;->z()V

    .line 150
    const v0, 0x7f030025

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->setContentView(I)V

    .line 108
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v2, 0x9

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/whatsapp/Conversations;->q:Landroid/view/inputmethod/InputMethodManager;

    .line 11
    const v0, 0x7f0d0080

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/whatsapp/Conversations;->r:Landroid/widget/EditText;

    .line 84
    iget-object v0, p0, Lcom/whatsapp/Conversations;->r:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/whatsapp/Conversations;->B:Landroid/text/TextWatcher;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 471
    iget-object v0, p0, Lcom/whatsapp/Conversations;->r:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/whatsapp/Conversations;->r:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/TextEmojiLabel;->a(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setGravity(I)V

    .line 266
    const v0, 0x7f0d0081

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/Conversations;->u:Landroid/widget/ImageButton;

    .line 397
    iget-object v0, p0, Lcom/whatsapp/Conversations;->u:Landroid/widget/ImageButton;

    new-instance v2, Lcom/whatsapp/oo;

    invoke-direct {v2, p0}, Lcom/whatsapp/oo;-><init>(Lcom/whatsapp/Conversations;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    const v0, 0x7f0d0085

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/Conversations;->v:Landroid/widget/ImageButton;

    .line 176
    iget-object v0, p0, Lcom/whatsapp/Conversations;->v:Landroid/widget/ImageButton;

    new-instance v2, Lcom/whatsapp/xo;

    invoke-direct {v2, p0}, Lcom/whatsapp/xo;-><init>(Lcom/whatsapp/Conversations;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    invoke-static {p0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/uk;)V

    .line 210
    sget-object v0, Lcom/whatsapp/gp;->a:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/whatsapp/Conversations;->t:Ljava/util/ArrayList;

    .line 240
    invoke-virtual {p0}, Lcom/whatsapp/Conversations;->getListView()Landroid/widget/ListView;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/Conversations;->p:Landroid/widget/ListView;

    .line 15
    iget-object v0, p0, Lcom/whatsapp/Conversations;->p:Landroid/widget/ListView;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setFastScrollEnabled(Z)V

    .line 399
    iget-object v0, p0, Lcom/whatsapp/Conversations;->p:Landroid/widget/ListView;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setScrollbarFadingEnabled(Z)V

    .line 462
    invoke-virtual {p0}, Lcom/whatsapp/Conversations;->a()V

    .line 389
    invoke-direct {p0}, Lcom/whatsapp/Conversations;->e()I

    move-result v0

    if-ge v0, v5, :cond_3

    .line 39
    invoke-virtual {p0}, Lcom/whatsapp/Conversations;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    sget-object v2, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 92
    const v2, 0x7f030028

    iget-object v3, p0, Lcom/whatsapp/Conversations;->p:Landroid/widget/ListView;

    invoke-virtual {v0, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 313
    iget-object v2, p0, Lcom/whatsapp/Conversations;->p:Landroid/widget/ListView;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3, v4}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 122
    :cond_3
    new-instance v0, Lcom/whatsapp/ne;

    invoke-direct {v0, p0}, Lcom/whatsapp/ne;-><init>(Lcom/whatsapp/Conversations;)V

    iput-object v0, p0, Lcom/whatsapp/Conversations;->o:Lcom/whatsapp/ne;

    .line 472
    iget-object v0, p0, Lcom/whatsapp/Conversations;->p:Landroid/widget/ListView;

    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 420
    iget-object v0, p0, Lcom/whatsapp/Conversations;->p:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/whatsapp/Conversations;->o:Lcom/whatsapp/ne;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 401
    iget-object v0, p0, Lcom/whatsapp/Conversations;->p:Landroid/widget/ListView;

    new-instance v2, Lcom/whatsapp/yo;

    invoke-direct {v2, p0}, Lcom/whatsapp/yo;-><init>(Lcom/whatsapp/Conversations;)V

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 253
    iget-object v0, p0, Lcom/whatsapp/Conversations;->p:Landroid/widget/ListView;

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->registerForContextMenu(Landroid/view/View;)V

    .line 27
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->I()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 20
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v2, 0xc

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 97
    const/16 v0, 0x71

    invoke-static {p0, v0}, Lcom/whatsapp/Conversations;->a(Landroid/app/Activity;I)V

    if-eqz v1, :cond_7

    .line 202
    :cond_4
    invoke-static {}, Lcom/whatsapp/App;->J()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 36
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v2, 0xd

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 34
    const/16 v0, 0x72

    invoke-static {p0, v0}, Lcom/whatsapp/Conversations;->a(Landroid/app/Activity;I)V

    if-eqz v1, :cond_7

    .line 250
    :cond_5
    invoke-static {}, Lcom/whatsapp/App;->K()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 83
    const/16 v0, 0x73

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->showDialog(I)V

    if-eqz v1, :cond_7

    .line 242
    :cond_6
    new-instance v0, Lcom/whatsapp/zo;

    invoke-direct {v0, p0}, Lcom/whatsapp/zo;-><init>(Lcom/whatsapp/Conversations;)V

    .line 456
    const v1, 0x7f0d00da

    invoke-virtual {p0, v1}, Lcom/whatsapp/Conversations;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 281
    new-instance v0, Lcom/whatsapp/ap;

    invoke-direct {v0, p0}, Lcom/whatsapp/ap;-><init>(Lcom/whatsapp/Conversations;)V

    .line 375
    const v1, 0x7f0d0105

    invoke-virtual {p0, v1}, Lcom/whatsapp/Conversations;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 377
    :cond_7
    sget-object v0, Lcom/whatsapp/App;->oc:Landroid/media/AsyncPlayer;

    invoke-virtual {v0}, Landroid/media/AsyncPlayer;->stop()V

    .line 382
    invoke-direct {p0}, Lcom/whatsapp/Conversations;->g()V

    .line 193
    invoke-direct {p0}, Lcom/whatsapp/Conversations;->c()V

    goto/16 :goto_0
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 8
    .parameter
    .parameter
    .parameter

    .prologue
    const v7, 0x7f0900d4

    const/4 v6, 0x1

    const/4 v5, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 201
    invoke-super {p0, p1, p2, p3}, Lcom/whatsapp/DialogToastListActivity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 317
    check-cast p3, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    iget-object v0, p3, Landroid/widget/AdapterView$AdapterContextMenuInfo;->targetView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/fp;

    .line 10
    if-nez v0, :cond_1

    .line 340
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v1, 0x1b

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 400
    :cond_0
    :goto_0
    return-void

    .line 457
    :cond_1
    iget-object v2, v0, Lcom/whatsapp/fp;->l:Ljava/lang/String;

    iput-object v2, p0, Lcom/whatsapp/Conversations;->w:Ljava/lang/String;

    .line 466
    sget-object v2, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v3, p0, Lcom/whatsapp/Conversations;->w:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v2

    .line 483
    invoke-virtual {v2}, Lcom/whatsapp/zq;->p()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 154
    iget-object v0, v2, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    sget-object v1, Lcom/whatsapp/App;->E:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 287
    invoke-virtual {p0, v7}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v5, v6, v5, v0}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    goto :goto_0

    .line 475
    :cond_2
    iget-object v3, v2, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {}, Lcom/whatsapp/eu;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 292
    iget-object v3, v2, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-nez v3, :cond_4

    .line 219
    invoke-virtual {v2}, Lcom/whatsapp/zq;->o()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 413
    iget-object v0, v0, Lcom/whatsapp/fp;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    const/16 v0, 0xc

    const v3, 0x7f0900e7

    invoke-virtual {p0, v3}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v5, v0, v5, v3}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    if-eqz v1, :cond_5

    .line 442
    :cond_3
    const/4 v0, 0x2

    const v3, 0x7f09022a

    invoke-virtual {p0, v3}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v5, v0, v5, v3}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 149
    const/4 v0, 0x3

    const v3, 0x7f09022b

    invoke-virtual {p0, v3}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v5, v0, v5, v3}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    if-eqz v1, :cond_5

    .line 187
    :cond_4
    const v0, 0x7f0900ee

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v5, v5, v5, v0}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 192
    :cond_5
    const/4 v0, 0x4

    const v3, 0x7f0900da

    invoke-virtual {p0, v3}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v5, v0, v5, v3}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 55
    invoke-virtual {v2}, Lcom/whatsapp/zq;->o()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 275
    invoke-virtual {p0, v7}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v5, v6, v5, v0}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    if-eqz v1, :cond_7

    .line 233
    :cond_6
    const v0, 0x7f0900d3

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v5, v6, v5, v0}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 89
    :cond_7
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v1, p0, Lcom/whatsapp/Conversations;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/fq;->j(Ljava/lang/String;)Lcom/whatsapp/sz;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 251
    const/4 v0, 0x5

    const v1, 0x7f0900f6

    invoke-virtual {p0, v1}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v5, v0, v5, v1}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    goto/16 :goto_0
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 7
    .parameter

    .prologue
    const v6, 0x7f09000c

    const v4, 0x7f09000e

    const/4 v0, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 270
    sparse-switch p1, :sswitch_data_0

    .line 99
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    .line 476
    :cond_0
    :goto_0
    return-object v0

    .line 406
    :sswitch_0
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 194
    const v1, 0x7f090089

    invoke-virtual {p0, v1}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 173
    const v1, 0x7f09008a

    invoke-virtual {p0, v1}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 76
    invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 212
    invoke-virtual {v0, v5}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    goto :goto_0

    .line 81
    :sswitch_1
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 112
    const v1, 0x7f090089

    invoke-virtual {p0, v1}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 323
    const v1, 0x7f09008a

    invoke-virtual {p0, v1}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 24
    invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 18
    invoke-virtual {v0, v5}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    goto :goto_0

    .line 80
    :sswitch_2
    new-instance v0, Lcom/whatsapp/bp;

    invoke-direct {v0, p0}, Lcom/whatsapp/bp;-><init>(Lcom/whatsapp/Conversations;)V

    .line 65
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f090046

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f090049

    new-array v3, v3, [Ljava/lang/Object;

    const v4, 0x7f090048

    invoke-virtual {p0, v4}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/Conversations;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f09004b

    invoke-virtual {v1, v2, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 167
    :sswitch_3
    iget-object v1, p0, Lcom/whatsapp/Conversations;->z:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 138
    new-instance v1, Lcom/whatsapp/cp;

    invoke-direct {v1, p0}, Lcom/whatsapp/cp;-><init>(Lcom/whatsapp/Conversations;)V

    .line 430
    new-instance v2, Lcom/whatsapp/dp;

    invoke-direct {v2, p0}, Lcom/whatsapp/dp;-><init>(Lcom/whatsapp/Conversations;)V

    .line 68
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-direct {v3, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iget-object v4, p0, Lcom/whatsapp/Conversations;->z:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v3

    const v4, 0x7f090010

    invoke-virtual {v3, v4, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v3, 0x7f090011

    invoke-virtual {v1, v3, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 381
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    goto/16 :goto_0

    .line 19
    :cond_1
    sget-object v1, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v2, 0x12

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 396
    :sswitch_4
    new-instance v1, Lcom/whatsapp/bo;

    invoke-direct {v1, p0}, Lcom/whatsapp/bo;-><init>(Lcom/whatsapp/Conversations;)V

    .line 427
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v3, 0x7f0900dd

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2, v4, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, v6, v0}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 259
    :sswitch_5
    new-instance v1, Lcom/whatsapp/eo;

    invoke-direct {v1, p0}, Lcom/whatsapp/eo;-><init>(Lcom/whatsapp/Conversations;)V

    .line 461
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v3, 0x7f0900df

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2, v4, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, v6, v0}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 347
    :sswitch_6
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 203
    const v1, 0x7f0900e0

    invoke-virtual {p0, v1}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 435
    const v1, 0x7f09008a

    invoke-virtual {p0, v1}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 226
    invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 22
    invoke-virtual {v0, v5}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    goto/16 :goto_0

    .line 54
    :sswitch_7
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 320
    const v1, 0x7f0902a7

    invoke-virtual {p0, v1}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 374
    const v1, 0x7f0902a8

    invoke-virtual {p0, v1}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 398
    invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 359
    invoke-virtual {v0, v5}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    goto/16 :goto_0

    .line 378
    :sswitch_8
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f090124

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/go;

    invoke-direct {v1, p0}, Lcom/whatsapp/go;-><init>(Lcom/whatsapp/Conversations;)V

    invoke-virtual {v0, v4, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 125
    :sswitch_9
    sget-object v1, Lcom/whatsapp/Conversations;->k:Lcom/whatsapp/zq;

    if-eqz v1, :cond_0

    .line 178
    const v0, 0x7f0900d9

    new-array v1, v3, [Ljava/lang/Object;

    sget-object v2, Lcom/whatsapp/Conversations;->k:Lcom/whatsapp/zq;

    invoke-virtual {v2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v5

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/Conversations;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 200
    invoke-virtual {p0}, Lcom/whatsapp/Conversations;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 60
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    if-nez v1, :cond_2

    :goto_1
    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/io;

    invoke-direct {v1, p0}, Lcom/whatsapp/io;-><init>(Lcom/whatsapp/Conversations;)V

    invoke-virtual {v0, v6, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f090010

    new-instance v2, Lcom/whatsapp/ho;

    invoke-direct {v2, p0}, Lcom/whatsapp/ho;-><init>(Lcom/whatsapp/Conversations;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_1

    .line 307
    :sswitch_a
    sget-object v1, Lcom/whatsapp/Conversations;->j:Lcom/whatsapp/zq;

    if-eqz v1, :cond_0

    .line 42
    const v0, 0x7f0900d8

    new-array v1, v3, [Ljava/lang/Object;

    sget-object v2, Lcom/whatsapp/Conversations;->j:Lcom/whatsapp/zq;

    invoke-virtual {v2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v5

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/Conversations;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 434
    invoke-virtual {p0}, Lcom/whatsapp/Conversations;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 373
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    if-nez v1, :cond_3

    :goto_2
    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/ko;

    invoke-direct {v1, p0}, Lcom/whatsapp/ko;-><init>(Lcom/whatsapp/Conversations;)V

    invoke-virtual {v0, v6, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/jo;

    invoke-direct {v1, p0}, Lcom/whatsapp/jo;-><init>(Lcom/whatsapp/Conversations;)V

    invoke-virtual {v0, v4, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    :cond_3
    move-object v0, v1

    goto :goto_2

    .line 394
    :sswitch_b
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f09001f

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/lo;

    invoke-direct {v1, p0}, Lcom/whatsapp/lo;-><init>(Lcom/whatsapp/Conversations;)V

    invoke-virtual {v0, v4, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 139
    :sswitch_c
    iget-object v1, p0, Lcom/whatsapp/Conversations;->w:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 214
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v2, p0, Lcom/whatsapp/Conversations;->w:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 135
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f090131

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f090132

    new-instance v3, Lcom/whatsapp/no;

    invoke-direct {v3, p0, v0}, Lcom/whatsapp/no;-><init>(Lcom/whatsapp/Conversations;Lcom/whatsapp/zq;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f090133

    new-instance v3, Lcom/whatsapp/mo;

    invoke-direct {v3, p0, v0}, Lcom/whatsapp/mo;-><init>(Lcom/whatsapp/Conversations;Lcom/whatsapp/zq;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 152
    :sswitch_d
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v1, 0x11

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 319
    invoke-static {p0}, Lcom/whatsapp/Conversations;->b(Landroid/app/Activity;)Landroid/app/Dialog;

    move-result-object v0

    goto/16 :goto_0

    .line 181
    :sswitch_e
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 74
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f09009d

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0902ca

    new-instance v2, Lcom/whatsapp/po;

    invoke-direct {v2, p0}, Lcom/whatsapp/po;-><init>(Lcom/whatsapp/Conversations;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 85
    :sswitch_f
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v1, 0x13

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 204
    invoke-static {p0}, Lcom/whatsapp/eg;->a(Landroid/app/Activity;)Landroid/app/Dialog;

    move-result-object v0

    goto/16 :goto_0

    .line 429
    :sswitch_10
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v1, 0x14

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 223
    invoke-static {p0}, Lcom/whatsapp/Conversations;->a(Landroid/app/Activity;)Landroid/app/Dialog;

    move-result-object v0

    goto/16 :goto_0

    .line 270
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x1 -> :sswitch_1
        0x2 -> :sswitch_3
        0x3 -> :sswitch_4
        0x4 -> :sswitch_5
        0x5 -> :sswitch_0
        0x6 -> :sswitch_6
        0x7 -> :sswitch_a
        0x9 -> :sswitch_8
        0xa -> :sswitch_9
        0xb -> :sswitch_b
        0xc -> :sswitch_c
        0x64 -> :sswitch_7
        0x6e -> :sswitch_e
        0x71 -> :sswitch_10
        0x72 -> :sswitch_d
        0x73 -> :sswitch_f
    .end sparse-switch
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 6
    .parameter

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 75
    invoke-virtual {p0}, Lcom/whatsapp/Conversations;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 8
    const v1, 0x7f09003c

    invoke-interface {p1, v3, v3, v3, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    const v2, 0x7f0203cd

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object v1

    const/16 v2, 0x6e

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setAlphabeticShortcut(C)Landroid/view/MenuItem;

    .line 228
    const/16 v1, 0xa

    const v2, 0x7f09003d

    invoke-interface {p1, v3, v1, v3, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    const v2, 0x7f0203c5

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object v1

    const/16 v2, 0x67

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setAlphabeticShortcut(C)Landroid/view/MenuItem;

    .line 426
    const v1, 0x7f09003f

    invoke-interface {p1, v3, v4, v3, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    const v2, 0x7f0203d3

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object v1

    const/16 v2, 0x73

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setAlphabeticShortcut(C)Landroid/view/MenuItem;

    .line 368
    const/4 v1, 0x4

    const v2, 0x7f09003e

    invoke-interface {p1, v3, v1, v3, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    const v2, 0x7f0203c2

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object v1

    const/16 v2, 0x63

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setAlphabeticShortcut(C)Landroid/view/MenuItem;

    .line 468
    const/4 v1, 0x2

    const v2, 0x7f090040

    invoke-interface {p1, v3, v1, v3, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    const v2, 0x7f0203d0

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object v1

    const/16 v2, 0x6f

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setAlphabeticShortcut(C)Landroid/view/MenuItem;

    .line 237
    sget v1, Lcom/whatsapp/App;->f:I

    if-ne v1, v5, :cond_0

    .line 294
    const v1, 0x7f090041

    invoke-interface {p1, v3, v5, v3, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    const v2, 0x7f0203e8

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 143
    :cond_0
    const/4 v0, 0x5

    const v1, 0x7f0900e2

    invoke-interface {p1, v3, v0, v3, v1}, Landroid/view/Menu;->addSubMenu(IIII)Landroid/view/SubMenu;

    move-result-object v0

    .line 95
    invoke-interface {v0}, Landroid/view/SubMenu;->clearHeader()V

    .line 43
    invoke-interface {v0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object v1

    const v2, 0x7f0203c9

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 144
    const/4 v1, 0x7

    const v2, 0x7f090019

    invoke-interface {v0, v3, v1, v3, v2}, Landroid/view/SubMenu;->add(IIII)Landroid/view/MenuItem;

    .line 3
    const/4 v1, 0x6

    const v2, 0x7f0900dc

    invoke-interface {v0, v3, v1, v3, v2}, Landroid/view/SubMenu;->add(IIII)Landroid/view/MenuItem;

    .line 481
    const/16 v1, 0x8

    const v2, 0x7f0900de

    invoke-interface {v0, v3, v1, v3, v2}, Landroid/view/SubMenu;->add(IIII)Landroid/view/MenuItem;

    .line 312
    const/16 v1, 0x9

    const v2, 0x7f090045

    invoke-interface {v0, v3, v1, v3, v2}, Landroid/view/SubMenu;->add(IIII)Landroid/view/MenuItem;

    .line 443
    return v4
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 405
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v1, 0x25

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 289
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onDestroy()V

    .line 110
    invoke-static {p0}, Lcom/whatsapp/App;->b(Lcom/whatsapp/uk;)V

    .line 5
    invoke-static {p0}, Lcom/whatsapp/Conversations;->b(Lcom/whatsapp/Conversations;)V

    .line 331
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/Conversations;->A:Lcom/whatsapp/zq;

    .line 45
    iget-object v0, p0, Lcom/whatsapp/Conversations;->m:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 161
    iget-object v0, p0, Lcom/whatsapp/Conversations;->l:Lcom/whatsapp/pj;

    invoke-virtual {v0}, Lcom/whatsapp/pj;->a()V

    .line 300
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x1

    .line 360
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 198
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v1, 0x1f

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 51
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 151
    invoke-virtual {p0, v0, v2}, Lcom/whatsapp/Conversations;->a(Ljava/lang/String;Z)V

    .line 454
    new-instance v1, Lcom/whatsapp/u8;

    invoke-direct {v1, p0, v0}, Lcom/whatsapp/u8;-><init>(Lcom/whatsapp/Conversations;Ljava/lang/String;)V

    .line 291
    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setPriority(I)V

    .line 423
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 230
    :cond_0
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 7
    .parameter

    .prologue
    const/16 v5, 0xb

    const/4 v2, 0x0

    const/4 v3, 0x1

    sget-boolean v4, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 316
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 403
    :goto_0
    :pswitch_0
    return v2

    .line 453
    :pswitch_1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/ContactPicker;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 58
    invoke-virtual {p0, v0, v3}, Lcom/whatsapp/Conversations;->startActivityForResult(Landroid/content/Intent;I)V

    move v2, v3

    .line 46
    goto :goto_0

    .line 77
    :pswitch_2
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/SetStatus;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 188
    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->startActivity(Landroid/content/Intent;)V

    move v2, v3

    .line 265
    goto :goto_0

    .line 335
    :pswitch_3
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/Settings;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 363
    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->startActivity(Landroid/content/Intent;)V

    move v2, v3

    .line 131
    goto :goto_0

    .line 298
    :pswitch_4
    invoke-virtual {p0}, Lcom/whatsapp/Conversations;->finish()V

    .line 464
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/Advanced;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 297
    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->startActivity(Landroid/content/Intent;)V

    move v2, v3

    .line 119
    goto :goto_0

    .line 52
    :pswitch_5
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v2, 0x16

    aget-object v1, v1, v2

    sget-object v2, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 325
    invoke-virtual {p0}, Lcom/whatsapp/Conversations;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 61
    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 23
    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->startActivity(Landroid/content/Intent;)V

    if-eqz v4, :cond_2

    .line 410
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/whatsapp/Conversations;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v2, 0x18

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 417
    if-nez v0, :cond_1

    .line 101
    sget-object v1, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v2, 0x17

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 344
    const/16 v1, 0xb

    invoke-virtual {p0, v1}, Lcom/whatsapp/Conversations;->showDialog(I)V

    if-eqz v4, :cond_2

    .line 121
    :cond_1
    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_1
    move v2, v3

    .line 48
    goto :goto_0

    .line 306
    :catch_0
    move-exception v0

    .line 436
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v1, 0x19

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 17
    invoke-virtual {p0, v5}, Lcom/whatsapp/Conversations;->showDialog(I)V

    goto :goto_1

    .line 328
    :pswitch_6
    invoke-virtual {p0}, Lcom/whatsapp/Conversations;->onSearchRequested()Z

    move v2, v3

    .line 53
    goto/16 :goto_0

    .line 364
    :pswitch_7
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->showDialog(I)V

    move v2, v3

    .line 334
    goto/16 :goto_0

    .line 278
    :pswitch_8
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->showDialog(I)V

    move v2, v3

    .line 78
    goto/16 :goto_0

    .line 229
    :pswitch_9
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/MultipleContactPicker;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 256
    sget-object v1, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v2, 0x1a

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 274
    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->startActivity(Landroid/content/Intent;)V

    move v2, v3

    .line 168
    goto/16 :goto_0

    .line 241
    :pswitch_a
    sget-object v0, Lcom/whatsapp/gp;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v1, v2

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 127
    invoke-static {v0}, Lcom/whatsapp/eu;->f(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-static {v0}, Lcom/whatsapp/zq;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1
    add-int/lit8 v1, v1, 0x1

    move v0, v1

    :goto_3
    if-eqz v4, :cond_4

    .line 304
    :goto_4
    sget v1, Lcom/whatsapp/eu;->a:I

    if-lt v0, v1, :cond_3

    .line 88
    const v0, 0x7f09026d

    new-array v1, v3, [Ljava/lang/Object;

    sget v4, Lcom/whatsapp/eu;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/Conversations;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->c(Ljava/lang/String;)V

    move v2, v3

    .line 403
    goto/16 :goto_0

    .line 220
    :cond_3
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/EditGroupSubject;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 207
    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->startActivity(Landroid/content/Intent;)V

    move v2, v3

    .line 12
    goto/16 :goto_0

    :cond_4
    move v1, v0

    goto :goto_2

    :cond_5
    move v0, v1

    goto :goto_3

    :cond_6
    move v0, v1

    goto :goto_4

    .line 316
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method

.method public onPause()V
    .locals 5

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 245
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v2, 0x15

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 280
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/Conversations;->x:Z

    .line 444
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onPause()V

    .line 437
    iget-object v0, p0, Lcom/whatsapp/Conversations;->p:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v0

    :cond_0
    iget-object v2, p0, Lcom/whatsapp/Conversations;->p:Landroid/widget/ListView;

    invoke-virtual {v2}, Landroid/widget/ListView;->getLastVisiblePosition()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 96
    iget-object v2, p0, Lcom/whatsapp/Conversations;->o:Lcom/whatsapp/ne;

    invoke-virtual {v2, v0}, Lcom/whatsapp/ne;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/gp;->a(Ljava/lang/String;)Lcom/whatsapp/zq;

    move-result-object v2

    .line 184
    iget-object v3, p0, Lcom/whatsapp/Conversations;->n:Ljava/util/HashMap;

    iget-object v4, v2, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v2, v2, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    .line 271
    :cond_1
    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 6
    .parameter

    .prologue
    const/16 v5, 0x8

    const/4 v2, 0x6

    const/4 v4, 0x1

    const/4 v3, 0x0

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 105
    iget-object v1, p0, Lcom/whatsapp/Conversations;->o:Lcom/whatsapp/ne;

    invoke-virtual {v1}, Lcom/whatsapp/ne;->getCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 162
    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1, v4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 2
    invoke-interface {p1, v5}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1, v4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    if-eqz v0, :cond_1

    .line 130
    :cond_0
    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 288
    invoke-interface {p1, v5}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 438
    :cond_1
    const/4 v1, 0x5

    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    .line 414
    invoke-interface {v1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v2

    .line 440
    invoke-interface {v2}, Landroid/view/SubMenu;->hasVisibleItems()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 448
    invoke-interface {v1, v4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    if-eqz v0, :cond_3

    .line 171
    :cond_2
    invoke-interface {v1, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 6
    :cond_3
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onResume()V
    .locals 3

    .prologue
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 391
    sget-object v1, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v2, 0x27

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 254
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/whatsapp/Conversations;->x:Z

    .line 451
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onResume()V

    .line 318
    sget-object v1, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v1}, Lcom/whatsapp/fq;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Lcom/whatsapp/App;->c(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    .line 166
    :cond_0
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v1, 0x26

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 324
    sget-object v0, Lcom/whatsapp/Conversations;->C:[Ljava/lang/String;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/App;->d(Ljava/lang/String;)V

    .line 311
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/Main;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 47
    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->startActivity(Landroid/content/Intent;)V

    .line 40
    invoke-virtual {p0}, Lcom/whatsapp/Conversations;->finish()V

    .line 467
    :cond_1
    :goto_0
    return-void

    .line 441
    :cond_2
    invoke-static {}, Lcom/whatsapp/n5;->a()V

    .line 473
    sget-object v1, Lcom/whatsapp/App;->oc:Landroid/media/AsyncPlayer;

    invoke-virtual {v1}, Landroid/media/AsyncPlayer;->stop()V

    .line 69
    invoke-static {}, Lcom/whatsapp/App;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 79
    const/16 v1, 0x6e

    invoke-virtual {p0, v1}, Lcom/whatsapp/Conversations;->showDialog(I)V

    if-eqz v0, :cond_1

    .line 337
    :cond_3
    sget-object v1, Lcom/whatsapp/App;->H:Ljava/util/Date;

    if-eqz v1, :cond_4

    .line 322
    const/16 v1, 0x71

    invoke-static {p0, v1}, Lcom/whatsapp/Conversations;->a(Landroid/app/Activity;I)V

    if-eqz v0, :cond_1

    .line 372
    :cond_4
    sget-boolean v1, Lcom/whatsapp/App;->p:Z

    if-eqz v1, :cond_5

    .line 415
    const/16 v1, 0x72

    invoke-static {p0, v1}, Lcom/whatsapp/Conversations;->a(Landroid/app/Activity;I)V

    if-eqz v0, :cond_1

    .line 418
    :cond_5
    invoke-static {}, Lcom/whatsapp/App;->K()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 26
    const/16 v0, 0x73

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->showDialog(I)V

    goto :goto_0
.end method

.method public onSearchRequested()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 216
    iget-boolean v0, p0, Lcom/whatsapp/Conversations;->s:Z

    if-nez v0, :cond_0

    .line 424
    const v0, 0x7f0d007e

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 29
    const v0, 0x7f0d003c

    invoke-virtual {p0, v0}, Lcom/whatsapp/Conversations;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 407
    iget-object v0, p0, Lcom/whatsapp/Conversations;->q:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v0, v2, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 91
    iget-object v0, p0, Lcom/whatsapp/Conversations;->r:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 14
    iget-object v0, p0, Lcom/whatsapp/Conversations;->r:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 412
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/Conversations;->s:Z

    .line 67
    iget-object v0, p0, Lcom/whatsapp/Conversations;->p:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->clearTextFilter()V

    .line 206
    :cond_0
    return v2
.end method
