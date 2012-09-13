.class public Lcom/whatsapp/ViewSharedContactActivity;
.super Lcom/whatsapp/DialogToastActivity;
.source "ViewSharedContactActivity.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field f:Lg;

.field g:Z

.field h:Landroid/graphics/Bitmap;

.field i:Z

.field j:Ljava/lang/String;

.field k:Ljava/lang/String;

.field l:Ljava/lang/String;

.field m:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v3, 0x5e

    const/16 v4, 0x2f

    const/16 v2, 0x1f

    const/16 v1, 0xf

    const/4 v6, 0x0

    const/16 v0, 0x32

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "zq=G\u000clt;KS"

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

    const-string v0, "\u007fp-[\u0008c"

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

    const-string v0, "jr?F\u0005"

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

    const-string v0, "\u007fw1A\u000c5"

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

    const-string v0, "yv;X\u001ag~,J\rlp0[\u0008lk?L\u001dfi7[\u0010 z&[\u000cal7@\u0007/"

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

    const-string v0, "yq:\u0001\u0008a{,@\u0000k1=Z\u001b|p,\u0001\u0000{z3\u0000\u0019`l*N\u0005\"~:K\u001bjl-p\u001f="

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

    const-string v0, "yq:\u0001\u0008a{,@\u0000k1=Z\u001b|p,\u0001\u0000{z3\u0000\u0006}x?A\u0000u~*F\u0006a"

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

    const-string v0, "k~*N["

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

    const-string v0, "k~*NX?"

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

    const-string v0, "k~*N\\"

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

    const-string v0, "yq:\u0001\u0008a{,@\u0000k1=Z\u001b|p,\u0001\u0000{z3\u0000\u0000b"

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

    const-string v0, "yq:\u0001\u0008a{,@\u0000k1=Z\u001b|p,\u0001\u0000{z3\u0000\u0019gp0J6y-"

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

    const-string v0, "n|=@\u001cak\u0001[\u0010\u007fz"

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

    const-string v0, "k~*N_"

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

    const-string v0, "yq:\u0001\u0008a{,@\u0000k1=Z\u001b|p,\u0001\u0000{z3\u0000\u000cb~7C6y-"

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

    const-string v0, "k~*NX:"

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

    aput-object v0, v9, v1

    const/16 v10, 0x10

    const-string v0, "yv;X6|w?]\u000ck@=@\u0007{~=[Faz)p\u0007zr<J\u001b q;J\rP{;C\u001dn@-V\u0007l"

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

    const/16 v10, 0x11

    const-string v0, "yq:\u0001\u0008a{,@\u0000k1=Z\u001b|p,\u0001\u0000{z3\u0000\u0007f|5A\u0008bz"

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

    aput-object v0, v9, v10

    const/16 v10, 0x12

    const-string v0, "yq:\u0001\u0008a{,@\u0000k1=Z\u001b|p,\u0001\u0000{z3\u0000\u0019gp*@"

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

    const/16 v10, 0x13

    const-string v0, "yv;X\u001ag~,J\rlp0[\u0008lk?L\u001dfi7[\u0010/"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_13
    if-gt v7, v8, :cond_13

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x14

    const-string v0, "bv3J\u001dvo;"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_14
    if-gt v7, v8, :cond_14

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x15

    const-string v0, "AV\u001dd\'NR\u001b"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_15
    if-gt v7, v8, :cond_15

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x16

    const-string v0, "yq:\u0001\u0008a{,@\u0000k1=Z\u001b|p,\u0001\u0000{z3\u0000\u0007nr;"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_16
    if-gt v7, v8, :cond_16

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x17

    const-string v0, "n|=@\u001cak\u0001A\u0008bz"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_17
    if-gt v7, v8, :cond_17

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x18

    const-string v0, "k~*N]"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_18
    if-gt v7, v8, :cond_18

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x19

    const-string v0, "yq:\u0001\u0008a{,@\u0000k1=Z\u001b|p,\u0001\u0000{z3\u0000\n`q*N\n{@;Y\u000cak"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_19
    if-gt v7, v8, :cond_19

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1a

    const-string v0, "}~)p\n`q*N\n{@7K"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1a
    if-gt v7, v8, :cond_1a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1b

    const-string v0, "lp3\u0001\u0008a{,@\u0000k1=@\u0007{~=[\u001a"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1b
    if-gt v7, v8, :cond_1b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1c

    const-string v0, "M[\u001fv"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1c
    if-gt v7, v8, :cond_1c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1d

    const-string v0, "k~*NZ"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1d
    if-gt v7, v8, :cond_1d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1e

    const-string v0, "k~*NX"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1e
    if-gt v7, v8, :cond_1e

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const-string v0, "n{:p\u001ag~,J\rP|1A\u001dn|*\u0000"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1f
    if-gt v7, v8, :cond_1f

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v2

    const/16 v10, 0x20

    const-string v0, "yv;X6|w?]\u000ck@=@\u0007{~=[Fzq5@\u001ea@=@\u0007{~=[6zo:N\u001dj%"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_20
    if-gt v7, v8, :cond_20

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x21

    const-string v0, "k~*NQ"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_21
    if-gt v7, v8, :cond_21

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x22

    const-string v0, "yv;X\u001ag~,J\rlp0[\u0008lk?L\u001dfi7[\u0010 k\'_\u000c j0D\u0007`h0\u000f"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_22
    if-gt v7, v8, :cond_22

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x23

    const-string v0, "/c~"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_23
    if-gt v7, v8, :cond_23

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x24

    const-string v0, "k~*NP"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_24
    if-gt v7, v8, :cond_24

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x25

    const-string v0, "yv;X6|w?]\u000ck@=@\u0007{~=[Flm;N\u001dj@=@\u0007{~=[S/"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_25
    if-gt v7, v8, :cond_25

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x26

    const-string v0, "k~*N^"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_26
    if-gt v7, v8, :cond_26

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x27

    const-string v0, "ZM\u0012"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_27
    if-gt v7, v8, :cond_27

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x28

    const-string v0, "lp0[\u0008lk\u0001F\r"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_28
    if-gt v7, v8, :cond_28

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x29

    const-string v0, "\'w*[\u0019sw*[\u0019|6d\u0000F\'D\u0002XDR4\u0002\u0001@$D\u0002XDR4v\u00002Shs\u000fG  {\t\u0008boe\u00124%6a"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_29
    if-gt v7, v8, :cond_29

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2a

    const-string v0, "yv;X\u001ag~,J\rlp0[\u0008lkqL\u001bj~*JFy|?]\r/v-\u000f\u0007zs2\u000e"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2a
    if-gt v7, v8, :cond_2a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2b

    const-string v0, "ev:"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2b
    if-gt v7, v8, :cond_2b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2c

    const-string v0, "y|?]\r"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2c
    if-gt v7, v8, :cond_2c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2d

    const-string v0, "yv;X\u0001nm;K\n`q*N\n{02@\u0008k@=@\u0007{~=[6\u007fw1[\u0006Py?F\u0005j{~"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2d
    if-gt v7, v8, :cond_2d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2e

    const-string v0, "j{7[6lp0[\u0008lk\u0001F\u0007ip"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2e
    if-gt v7, v8, :cond_2e

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const-string v0, "aj2C"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2f
    if-gt v7, v8, :cond_2f

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v4

    const/16 v10, 0x30

    const-string v0, "c~\'@\u001c{@7A\u000fc~*J\u001b"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_30
    if-gt v7, v8, :cond_30

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v8, 0x31

    const-string v0, "hz*{\u0010\u007fz\u0012N\u000bjs\u000cJ\u001a`j,L\u000c"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_31
    if-gt v6, v7, :cond_31

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x69

    :goto_32
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_32

    :pswitch_1
    move v0, v2

    goto :goto_32

    :pswitch_2
    move v0, v3

    goto :goto_32

    :pswitch_3
    move v0, v4

    goto :goto_32

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x69

    :goto_33
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_33

    :pswitch_5
    move v0, v2

    goto :goto_33

    :pswitch_6
    move v0, v3

    goto :goto_33

    :pswitch_7
    move v0, v4

    goto :goto_33

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    const/16 v0, 0x69

    :goto_34
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_34

    :pswitch_9
    move v0, v2

    goto :goto_34

    :pswitch_a
    move v0, v3

    goto :goto_34

    :pswitch_b
    move v0, v4

    goto :goto_34

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    const/16 v0, 0x69

    :goto_35
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_35

    :pswitch_d
    move v0, v2

    goto :goto_35

    :pswitch_e
    move v0, v3

    goto :goto_35

    :pswitch_f
    move v0, v4

    goto :goto_35

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    const/16 v0, 0x69

    :goto_36
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_36

    :pswitch_11
    move v0, v2

    goto :goto_36

    :pswitch_12
    move v0, v3

    goto :goto_36

    :pswitch_13
    move v0, v4

    goto :goto_36

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    const/16 v0, 0x69

    :goto_37
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_37

    :pswitch_15
    move v0, v2

    goto :goto_37

    :pswitch_16
    move v0, v3

    goto :goto_37

    :pswitch_17
    move v0, v4

    goto :goto_37

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    const/16 v0, 0x69

    :goto_38
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_38

    :pswitch_19
    move v0, v2

    goto :goto_38

    :pswitch_1a
    move v0, v3

    goto :goto_38

    :pswitch_1b
    move v0, v4

    goto :goto_38

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    const/16 v0, 0x69

    :goto_39
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_39

    :pswitch_1d
    move v0, v2

    goto :goto_39

    :pswitch_1e
    move v0, v3

    goto :goto_39

    :pswitch_1f
    move v0, v4

    goto :goto_39

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    const/16 v0, 0x69

    :goto_3a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_3a

    :pswitch_21
    move v0, v2

    goto :goto_3a

    :pswitch_22
    move v0, v3

    goto :goto_3a

    :pswitch_23
    move v0, v4

    goto :goto_3a

    :cond_9
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_9

    const/16 v0, 0x69

    :goto_3b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_3b

    :pswitch_25
    move v0, v2

    goto :goto_3b

    :pswitch_26
    move v0, v3

    goto :goto_3b

    :pswitch_27
    move v0, v4

    goto :goto_3b

    :cond_a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_a

    const/16 v0, 0x69

    :goto_3c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_a

    :pswitch_28
    move v0, v1

    goto :goto_3c

    :pswitch_29
    move v0, v2

    goto :goto_3c

    :pswitch_2a
    move v0, v3

    goto :goto_3c

    :pswitch_2b
    move v0, v4

    goto :goto_3c

    :cond_b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_b

    const/16 v0, 0x69

    :goto_3d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_3d

    :pswitch_2d
    move v0, v2

    goto :goto_3d

    :pswitch_2e
    move v0, v3

    goto :goto_3d

    :pswitch_2f
    move v0, v4

    goto :goto_3d

    :cond_c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_c

    const/16 v0, 0x69

    :goto_3e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_c

    :pswitch_30
    move v0, v1

    goto :goto_3e

    :pswitch_31
    move v0, v2

    goto :goto_3e

    :pswitch_32
    move v0, v3

    goto :goto_3e

    :pswitch_33
    move v0, v4

    goto :goto_3e

    :cond_d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_d

    const/16 v0, 0x69

    :goto_3f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_d

    :pswitch_34
    move v0, v1

    goto :goto_3f

    :pswitch_35
    move v0, v2

    goto :goto_3f

    :pswitch_36
    move v0, v3

    goto :goto_3f

    :pswitch_37
    move v0, v4

    goto :goto_3f

    :cond_e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_e

    const/16 v0, 0x69

    :goto_40
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_e

    :pswitch_38
    move v0, v1

    goto :goto_40

    :pswitch_39
    move v0, v2

    goto :goto_40

    :pswitch_3a
    move v0, v3

    goto :goto_40

    :pswitch_3b
    move v0, v4

    goto :goto_40

    :cond_f
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_f

    const/16 v0, 0x69

    :goto_41
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_f

    :pswitch_3c
    move v0, v1

    goto :goto_41

    :pswitch_3d
    move v0, v2

    goto :goto_41

    :pswitch_3e
    move v0, v3

    goto :goto_41

    :pswitch_3f
    move v0, v4

    goto :goto_41

    :cond_10
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_10

    const/16 v0, 0x69

    :goto_42
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_10

    :pswitch_40
    move v0, v1

    goto :goto_42

    :pswitch_41
    move v0, v2

    goto :goto_42

    :pswitch_42
    move v0, v3

    goto :goto_42

    :pswitch_43
    move v0, v4

    goto :goto_42

    :cond_11
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_11

    const/16 v0, 0x69

    :goto_43
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_11

    :pswitch_44
    move v0, v1

    goto :goto_43

    :pswitch_45
    move v0, v2

    goto :goto_43

    :pswitch_46
    move v0, v3

    goto :goto_43

    :pswitch_47
    move v0, v4

    goto :goto_43

    :cond_12
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_12

    const/16 v0, 0x69

    :goto_44
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_12

    :pswitch_48
    move v0, v1

    goto :goto_44

    :pswitch_49
    move v0, v2

    goto :goto_44

    :pswitch_4a
    move v0, v3

    goto :goto_44

    :pswitch_4b
    move v0, v4

    goto :goto_44

    :cond_13
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_13

    const/16 v0, 0x69

    :goto_45
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_13

    :pswitch_4c
    move v0, v1

    goto :goto_45

    :pswitch_4d
    move v0, v2

    goto :goto_45

    :pswitch_4e
    move v0, v3

    goto :goto_45

    :pswitch_4f
    move v0, v4

    goto :goto_45

    :cond_14
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_14

    const/16 v0, 0x69

    :goto_46
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_14

    :pswitch_50
    move v0, v1

    goto :goto_46

    :pswitch_51
    move v0, v2

    goto :goto_46

    :pswitch_52
    move v0, v3

    goto :goto_46

    :pswitch_53
    move v0, v4

    goto :goto_46

    :cond_15
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_15

    const/16 v0, 0x69

    :goto_47
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_15

    :pswitch_54
    move v0, v1

    goto :goto_47

    :pswitch_55
    move v0, v2

    goto :goto_47

    :pswitch_56
    move v0, v3

    goto :goto_47

    :pswitch_57
    move v0, v4

    goto :goto_47

    :cond_16
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_16

    const/16 v0, 0x69

    :goto_48
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_16

    :pswitch_58
    move v0, v1

    goto :goto_48

    :pswitch_59
    move v0, v2

    goto :goto_48

    :pswitch_5a
    move v0, v3

    goto :goto_48

    :pswitch_5b
    move v0, v4

    goto :goto_48

    :cond_17
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_17

    const/16 v0, 0x69

    :goto_49
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_17

    :pswitch_5c
    move v0, v1

    goto :goto_49

    :pswitch_5d
    move v0, v2

    goto :goto_49

    :pswitch_5e
    move v0, v3

    goto :goto_49

    :pswitch_5f
    move v0, v4

    goto :goto_49

    :cond_18
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_18

    const/16 v0, 0x69

    :goto_4a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_18

    :pswitch_60
    move v0, v1

    goto :goto_4a

    :pswitch_61
    move v0, v2

    goto :goto_4a

    :pswitch_62
    move v0, v3

    goto :goto_4a

    :pswitch_63
    move v0, v4

    goto :goto_4a

    :cond_19
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_19

    const/16 v0, 0x69

    :goto_4b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_19

    :pswitch_64
    move v0, v1

    goto :goto_4b

    :pswitch_65
    move v0, v2

    goto :goto_4b

    :pswitch_66
    move v0, v3

    goto :goto_4b

    :pswitch_67
    move v0, v4

    goto :goto_4b

    :cond_1a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1a

    const/16 v0, 0x69

    :goto_4c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1a

    :pswitch_68
    move v0, v1

    goto :goto_4c

    :pswitch_69
    move v0, v2

    goto :goto_4c

    :pswitch_6a
    move v0, v3

    goto :goto_4c

    :pswitch_6b
    move v0, v4

    goto :goto_4c

    :cond_1b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1b

    const/16 v0, 0x69

    :goto_4d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1b

    :pswitch_6c
    move v0, v1

    goto :goto_4d

    :pswitch_6d
    move v0, v2

    goto :goto_4d

    :pswitch_6e
    move v0, v3

    goto :goto_4d

    :pswitch_6f
    move v0, v4

    goto :goto_4d

    :cond_1c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1c

    const/16 v0, 0x69

    :goto_4e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1c

    :pswitch_70
    move v0, v1

    goto :goto_4e

    :pswitch_71
    move v0, v2

    goto :goto_4e

    :pswitch_72
    move v0, v3

    goto :goto_4e

    :pswitch_73
    move v0, v4

    goto :goto_4e

    :cond_1d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1d

    const/16 v0, 0x69

    :goto_4f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1d

    :pswitch_74
    move v0, v1

    goto :goto_4f

    :pswitch_75
    move v0, v2

    goto :goto_4f

    :pswitch_76
    move v0, v3

    goto :goto_4f

    :pswitch_77
    move v0, v4

    goto :goto_4f

    :cond_1e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1e

    const/16 v0, 0x69

    :goto_50
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1e

    :pswitch_78
    move v0, v1

    goto :goto_50

    :pswitch_79
    move v0, v2

    goto :goto_50

    :pswitch_7a
    move v0, v3

    goto :goto_50

    :pswitch_7b
    move v0, v4

    goto :goto_50

    :cond_1f
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1f

    const/16 v0, 0x69

    :goto_51
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1f

    :pswitch_7c
    move v0, v1

    goto :goto_51

    :pswitch_7d
    move v0, v2

    goto :goto_51

    :pswitch_7e
    move v0, v3

    goto :goto_51

    :pswitch_7f
    move v0, v4

    goto :goto_51

    :cond_20
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_20

    const/16 v0, 0x69

    :goto_52
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_20

    :pswitch_80
    move v0, v1

    goto :goto_52

    :pswitch_81
    move v0, v2

    goto :goto_52

    :pswitch_82
    move v0, v3

    goto :goto_52

    :pswitch_83
    move v0, v4

    goto :goto_52

    :cond_21
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_21

    const/16 v0, 0x69

    :goto_53
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_21

    :pswitch_84
    move v0, v1

    goto :goto_53

    :pswitch_85
    move v0, v2

    goto :goto_53

    :pswitch_86
    move v0, v3

    goto :goto_53

    :pswitch_87
    move v0, v4

    goto :goto_53

    :cond_22
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_22

    const/16 v0, 0x69

    :goto_54
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_22

    :pswitch_88
    move v0, v1

    goto :goto_54

    :pswitch_89
    move v0, v2

    goto :goto_54

    :pswitch_8a
    move v0, v3

    goto :goto_54

    :pswitch_8b
    move v0, v4

    goto :goto_54

    :cond_23
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_23

    const/16 v0, 0x69

    :goto_55
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_23

    :pswitch_8c
    move v0, v1

    goto :goto_55

    :pswitch_8d
    move v0, v2

    goto :goto_55

    :pswitch_8e
    move v0, v3

    goto :goto_55

    :pswitch_8f
    move v0, v4

    goto :goto_55

    :cond_24
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_24

    const/16 v0, 0x69

    :goto_56
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_24

    :pswitch_90
    move v0, v1

    goto :goto_56

    :pswitch_91
    move v0, v2

    goto :goto_56

    :pswitch_92
    move v0, v3

    goto :goto_56

    :pswitch_93
    move v0, v4

    goto :goto_56

    :cond_25
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_25

    const/16 v0, 0x69

    :goto_57
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_25

    :pswitch_94
    move v0, v1

    goto :goto_57

    :pswitch_95
    move v0, v2

    goto :goto_57

    :pswitch_96
    move v0, v3

    goto :goto_57

    :pswitch_97
    move v0, v4

    goto :goto_57

    :cond_26
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_26

    const/16 v0, 0x69

    :goto_58
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_26

    :pswitch_98
    move v0, v1

    goto :goto_58

    :pswitch_99
    move v0, v2

    goto :goto_58

    :pswitch_9a
    move v0, v3

    goto :goto_58

    :pswitch_9b
    move v0, v4

    goto :goto_58

    :cond_27
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_27

    const/16 v0, 0x69

    :goto_59
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_27

    :pswitch_9c
    move v0, v1

    goto :goto_59

    :pswitch_9d
    move v0, v2

    goto :goto_59

    :pswitch_9e
    move v0, v3

    goto :goto_59

    :pswitch_9f
    move v0, v4

    goto :goto_59

    :cond_28
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_28

    const/16 v0, 0x69

    :goto_5a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_28

    :pswitch_a0
    move v0, v1

    goto :goto_5a

    :pswitch_a1
    move v0, v2

    goto :goto_5a

    :pswitch_a2
    move v0, v3

    goto :goto_5a

    :pswitch_a3
    move v0, v4

    goto :goto_5a

    :cond_29
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_29

    const/16 v0, 0x69

    :goto_5b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_29

    :pswitch_a4
    move v0, v1

    goto :goto_5b

    :pswitch_a5
    move v0, v2

    goto :goto_5b

    :pswitch_a6
    move v0, v3

    goto :goto_5b

    :pswitch_a7
    move v0, v4

    goto :goto_5b

    :cond_2a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2a

    const/16 v0, 0x69

    :goto_5c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2a

    :pswitch_a8
    move v0, v1

    goto :goto_5c

    :pswitch_a9
    move v0, v2

    goto :goto_5c

    :pswitch_aa
    move v0, v3

    goto :goto_5c

    :pswitch_ab
    move v0, v4

    goto :goto_5c

    :cond_2b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2b

    const/16 v0, 0x69

    :goto_5d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2b

    :pswitch_ac
    move v0, v1

    goto :goto_5d

    :pswitch_ad
    move v0, v2

    goto :goto_5d

    :pswitch_ae
    move v0, v3

    goto :goto_5d

    :pswitch_af
    move v0, v4

    goto :goto_5d

    :cond_2c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2c

    const/16 v0, 0x69

    :goto_5e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2c

    :pswitch_b0
    move v0, v1

    goto :goto_5e

    :pswitch_b1
    move v0, v2

    goto :goto_5e

    :pswitch_b2
    move v0, v3

    goto :goto_5e

    :pswitch_b3
    move v0, v4

    goto :goto_5e

    :cond_2d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2d

    const/16 v0, 0x69

    :goto_5f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2d

    :pswitch_b4
    move v0, v1

    goto :goto_5f

    :pswitch_b5
    move v0, v2

    goto :goto_5f

    :pswitch_b6
    move v0, v3

    goto :goto_5f

    :pswitch_b7
    move v0, v4

    goto :goto_5f

    :cond_2e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2e

    const/16 v0, 0x69

    :goto_60
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2e

    :pswitch_b8
    move v0, v1

    goto :goto_60

    :pswitch_b9
    move v0, v2

    goto :goto_60

    :pswitch_ba
    move v0, v3

    goto :goto_60

    :pswitch_bb
    move v0, v4

    goto :goto_60

    :cond_2f
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2f

    const/16 v0, 0x69

    :goto_61
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2f

    :pswitch_bc
    move v0, v1

    goto :goto_61

    :pswitch_bd
    move v0, v2

    goto :goto_61

    :pswitch_be
    move v0, v3

    goto :goto_61

    :pswitch_bf
    move v0, v4

    goto :goto_61

    :cond_30
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_30

    const/16 v0, 0x69

    :goto_62
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_30

    :pswitch_c0
    move v0, v1

    goto :goto_62

    :pswitch_c1
    move v0, v2

    goto :goto_62

    :pswitch_c2
    move v0, v3

    goto :goto_62

    :pswitch_c3
    move v0, v4

    goto :goto_62

    :cond_31
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_31

    const/16 v0, 0x69

    :goto_63
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_31

    :pswitch_c4
    move v0, v1

    goto :goto_63

    :pswitch_c5
    move v0, v2

    goto :goto_63

    :pswitch_c6
    move v0, v3

    goto :goto_63

    :pswitch_c7
    move v0, v4

    goto :goto_63

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
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 258
    invoke-direct {p0}, Lcom/whatsapp/DialogToastActivity;-><init>()V

    .line 42
    iput-object v1, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    .line 156
    iput-boolean v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->g:Z

    .line 40
    iput-object v1, p0, Lcom/whatsapp/ViewSharedContactActivity;->h:Landroid/graphics/Bitmap;

    .line 197
    iput-boolean v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->i:Z

    return-void
.end method

.method private a(Le;)Landroid/widget/RelativeLayout;
    .locals 8
    .parameter

    .prologue
    const/4 v7, 0x0

    const/4 v5, 0x1

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 87
    sget-object v0, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v1, 0x30

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewSharedContactActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 291
    const v1, 0x7f03005b

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 330
    new-instance v1, Lcom/whatsapp/v7;

    invoke-direct {v1, p0, p1}, Lcom/whatsapp/v7;-><init>(Lcom/whatsapp/ViewSharedContactActivity;Le;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    iget-object v1, p1, Le;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 21
    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 183
    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setFocusable(Z)V

    .line 45
    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020412

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 147
    iget-boolean v1, p0, Lcom/whatsapp/ViewSharedContactActivity;->i:Z

    if-eqz v1, :cond_0

    .line 278
    const v1, 0x7f0d0191

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 249
    :cond_0
    const v1, 0x7f0d0193

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 154
    sget-object v2, Lg;->a:Ljava/util/HashMap;

    iget-object v4, p1, Le;->a:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 30
    const v2, 0x7f09022e

    new-array v4, v5, [Ljava/lang/Object;

    sget-object v5, Lg;->b:Ljava/util/HashMap;

    iget-object v6, p1, Le;->a:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v4, v7

    invoke-virtual {p0, v2, v4}, Lcom/whatsapp/ViewSharedContactActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v3, :cond_5

    .line 207
    :cond_1
    iget-object v2, p1, Le;->a:Ljava/lang/String;

    sget-object v4, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v5, 0x27

    aget-object v4, v4, v5

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 12
    iget-object v2, p1, Le;->e:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v2

    .line 228
    if-eqz v2, :cond_2

    array-length v2, v2

    if-lez v2, :cond_2

    .line 308
    iget-object v2, p1, Le;->e:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v2

    aget-object v2, v2, v7

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v3, :cond_3

    .line 193
    :cond_2
    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f090231

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    :cond_3
    if-eqz v3, :cond_5

    .line 17
    :cond_4
    sget-object v2, Lg;->b:Ljava/util/HashMap;

    iget-object v3, p1, Le;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 188
    :cond_5
    const v1, 0x7f0d0194

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 333
    const/16 v2, 0x12c

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setWidth(I)V

    .line 277
    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 245
    iget-object v2, p1, Le;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    const v1, 0x7f0d0192

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 89
    return-object v0
.end method

.method private a(Li;I)Landroid/widget/RelativeLayout;
    .locals 5
    .parameter
    .parameter

    .prologue
    const/4 v3, 0x1

    .line 190
    sget-object v0, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v1, 0x30

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewSharedContactActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 9
    const v1, 0x7f03005b

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 108
    iget-object v1, p1, Li;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 119
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 282
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setFocusable(Z)V

    .line 148
    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020412

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 38
    iget-boolean v1, p0, Lcom/whatsapp/ViewSharedContactActivity;->i:Z

    if-eqz v1, :cond_0

    .line 110
    const v1, 0x7f0d0191

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 97
    :cond_0
    const v1, 0x7f0d0193

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f090100

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v2, p1, Li;->b:I

    if-nez v2, :cond_2

    iget-object v2, p1, Li;->e:Ljava/lang/String;

    :goto_0
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0900e8

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    const v1, 0x7f0d0194

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 234
    const/16 v2, 0x12c

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setWidth(I)V

    .line 317
    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 206
    iget-object v2, p1, Li;->d:Lh;

    if-eqz v2, :cond_1

    .line 186
    iget-object v2, p1, Li;->d:Lh;

    invoke-virtual {v2}, Lh;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    :cond_1
    const v1, 0x7f0d0192

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 60
    invoke-virtual {v1, p2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 283
    return-object v0

    .line 16
    :cond_2
    const-class v2, Landroid/provider/ContactsContract$CommonDataKinds$StructuredPostal;

    iget v4, p1, Li;->b:I

    invoke-direct {p0, v2, v4}, Lcom/whatsapp/ViewSharedContactActivity;->a(Ljava/lang/Class;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/widget/RelativeLayout;
    .locals 4
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v3, 0x1

    .line 109
    sget-object v0, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v1, 0x30

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewSharedContactActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 332
    const v1, 0x7f03005b

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 218
    invoke-virtual {v0, p4}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 150
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 175
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setFocusable(Z)V

    .line 199
    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020412

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 85
    iget-boolean v1, p0, Lcom/whatsapp/ViewSharedContactActivity;->i:Z

    if-eqz v1, :cond_0

    .line 81
    const v1, 0x7f0d0191

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 160
    :cond_0
    const v1, 0x7f0d0193

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 37
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 311
    const v1, 0x7f0d0194

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 65
    const/16 v2, 0x12c

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setWidth(I)V

    .line 155
    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 18
    sget-object v2, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v3, 0x2f

    aget-object v2, v2, v3

    invoke-virtual {p2, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 296
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 323
    :cond_1
    const v1, 0x7f0d0192

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 69
    invoke-virtual {v1, p3}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 43
    return-object v0
.end method

.method private a(Ljava/lang/String;)Lg;
    .locals 1
    .parameter

    .prologue
    .line 35
    :try_start_0
    invoke-static {p1}, Lg;->b(Ljava/lang/String;)Lg;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lb; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    .line 269
    :goto_0
    return-object v0

    .line 90
    :catch_0
    move-exception v0

    .line 211
    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/Throwable;)V

    .line 269
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    .line 54
    :catch_1
    move-exception v0

    .line 158
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_1

    .line 261
    :catch_2
    move-exception v0

    .line 83
    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method private a(Ljava/lang/Class;I)Ljava/lang/String;
    .locals 7
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 251
    :try_start_0
    sget-object v0, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v2, 0x31

    aget-object v0, v0, v2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v3

    invoke-virtual {p1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 32
    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const/4 v3, 0x0

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-virtual {v0, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 309
    :goto_0
    return-object v0

    .line 137
    :catch_0
    move-exception v0

    .line 34
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 309
    goto :goto_0
.end method

.method private a()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 82
    iget-boolean v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->g:Z

    if-eqz v0, :cond_0

    .line 285
    const v0, 0x7f09022d

    new-array v1, v4, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    invoke-virtual {v3}, Lg;->a()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/ViewSharedContactActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewSharedContactActivity;->c(Ljava/lang/String;)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 334
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->c()V

    .line 39
    iput-boolean v4, p0, Lcom/whatsapp/ViewSharedContactActivity;->g:Z

    .line 312
    :cond_1
    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 2
    .parameter

    .prologue
    .line 102
    const v0, 0x7f0d0191

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 192
    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 237
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_1

    .line 71
    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 151
    :cond_1
    return-void
.end method

.method static a(Lcom/whatsapp/ViewSharedContactActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    invoke-direct {p0}, Lcom/whatsapp/ViewSharedContactActivity;->a()V

    return-void
.end method

.method static a(Lcom/whatsapp/ViewSharedContactActivity;Landroid/view/View;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 219
    invoke-direct {p0, p1}, Lcom/whatsapp/ViewSharedContactActivity;->a(Landroid/view/View;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .parameter
    .parameter
    .parameter

    .prologue
    const v1, 0x7f0d018d

    .line 135
    const v0, 0x7f0d018c

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewSharedContactActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 318
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 243
    invoke-virtual {p0, v1}, Lcom/whatsapp/ViewSharedContactActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 262
    :cond_0
    invoke-virtual {p0, v1}, Lcom/whatsapp/ViewSharedContactActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 98
    :cond_1
    return-void
.end method

.method private b()V
    .locals 8

    .prologue
    const/4 v7, 0x2

    const/4 v2, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    move v1, v2

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_5

    .line 47
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 215
    const v0, 0x7f0d0191

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 290
    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-nez v0, :cond_4

    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v5, v5, v2

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 191
    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 327
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/4 v6, 0x4

    aget-object v5, v5, v6

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->k:Ljava/util/Map;

    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v3, :cond_4

    .line 194
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Li;

    if-eqz v0, :cond_3

    .line 292
    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li;

    .line 287
    iget-object v5, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v5, v5, Lg;->i:Ljava/util/List;

    invoke-interface {v5, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 241
    iget-object v5, v0, Li;->a:Ljava/lang/Class;

    const-class v6, Landroid/provider/ContactsContract$CommonDataKinds$Email;

    if-ne v5, v6, :cond_1

    .line 93
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v6, v6, v7

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    if-eqz v3, :cond_2

    .line 115
    :cond_1
    iget-object v0, v0, Li;->a:Ljava/lang/Class;

    const-class v5, Landroid/provider/ContactsContract$CommonDataKinds$StructuredPostal;

    if-ne v0, v5, :cond_2

    .line 163
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/4 v6, 0x1

    aget-object v5, v5, v6

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 25
    :cond_2
    if-eqz v3, :cond_4

    :cond_3
    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ll;

    if-eqz v0, :cond_4

    .line 299
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->h:Ljava/util/List;

    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/4 v6, 0x3

    aget-object v5, v5, v6

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 88
    :cond_4
    add-int/lit8 v0, v1, 0x1

    if-eqz v3, :cond_6

    .line 239
    :cond_5
    new-instance v0, Lm;

    invoke-direct {v0}, Lm;-><init>()V

    .line 248
    :try_start_0
    iget-object v1, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lm;->a(Lg;I)Ljava/lang/String;

    move-result-object v0

    .line 121
    iget-object v1, p0, Lcom/whatsapp/ViewSharedContactActivity;->k:Ljava/lang/String;

    iget-object v2, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v2, v2, Lg;->c:Lj;

    iget-object v2, v2, Lj;->a:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lcom/whatsapp/App;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewSharedContactActivity;->setResult(I)V

    .line 252
    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->finish()V
    :try_end_0
    .catch Lb; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :goto_1
    return-void

    .line 15
    :catch_0
    move-exception v0

    .line 51
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 220
    const v0, 0x7f09022f

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewSharedContactActivity;->a(I)V

    goto :goto_1

    :cond_6
    move v1, v0

    goto/16 :goto_0
.end method

.method static b(Lcom/whatsapp/ViewSharedContactActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 227
    invoke-direct {p0}, Lcom/whatsapp/ViewSharedContactActivity;->b()V

    return-void
.end method


# virtual methods
.method protected c()V
    .locals 14

    .prologue
    const/16 v13, 0x1e

    const/4 v3, 0x1

    const/16 v12, 0x1a

    const/16 v11, 0x14

    const/4 v5, 0x0

    sget-boolean v6, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 293
    const/4 v0, 0x0

    .line 316
    const/4 v1, 0x0

    .line 231
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 196
    sget-object v4, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v4}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v4

    .line 130
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v8, 0x17

    aget-object v7, v7, v8

    invoke-virtual {v4, v7, v0}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 306
    sget-object v0, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v7, 0xc

    aget-object v0, v0, v7

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 257
    invoke-virtual {v4}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 305
    sget-object v0, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 253
    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v1, v1, v12

    invoke-virtual {v0, v1, v5}, Landroid/content/ContentProviderOperation$Builder;->withValueBackReference(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;

    .line 244
    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v1, v1, v11

    sget-object v4, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v7, 0x16

    aget-object v4, v4, v7

    invoke-virtual {v0, v1, v4}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 159
    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v1, v1, v13

    iget-object v4, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v4, v4, Lg;->c:Lj;

    iget-object v4, v4, Lj;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 324
    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v4, 0x1d

    aget-object v1, v1, v4

    iget-object v4, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v4, v4, Lg;->c:Lj;

    iget-object v4, v4, Lj;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 105
    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/4 v4, 0x7

    aget-object v1, v1, v4

    iget-object v4, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v4, v4, Lg;->c:Lj;

    iget-object v4, v4, Lj;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 56
    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v4, 0x9

    aget-object v1, v1, v4

    iget-object v4, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v4, v4, Lg;->c:Lj;

    iget-object v4, v4, Lj;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 41
    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v4, 0x18

    aget-object v1, v1, v4

    iget-object v4, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v4, v4, Lg;->c:Lj;

    iget-object v4, v4, Lj;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 235
    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v4, 0xd

    aget-object v1, v1, v4

    iget-object v4, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v4, v4, Lg;->c:Lj;

    iget-object v4, v4, Lj;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 76
    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v4, 0x26

    aget-object v1, v1, v4

    iget-object v4, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v4, v4, Lg;->c:Lj;

    iget-object v4, v4, Lj;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 301
    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v4, 0x24

    aget-object v1, v1, v4

    iget-object v4, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v4, v4, Lg;->c:Lj;

    iget-object v4, v4, Lj;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 189
    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->h:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 238
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll;

    .line 217
    sget-object v4, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v4}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v4

    .line 79
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v7, v7, v12

    invoke-virtual {v4, v7, v5}, Landroid/content/ContentProviderOperation$Builder;->withValueBackReference(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;

    .line 96
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v7, v7, v11

    sget-object v8, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v9, 0xb

    aget-object v8, v8, v9

    invoke-virtual {v4, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 335
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v7, v7, v13

    iget-object v8, v0, Ll;->b:Ljava/lang/String;

    invoke-virtual {v4, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 101
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/4 v8, 0x7

    aget-object v7, v7, v8

    iget v8, v0, Ll;->a:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v4, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 236
    iget v7, v0, Ll;->a:I

    if-nez v7, :cond_1

    .line 134
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v8, 0x1d

    aget-object v7, v7, v8

    iget-object v0, v0, Ll;->c:Ljava/lang/String;

    invoke-virtual {v4, v7, v0}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 289
    :cond_1
    invoke-virtual {v4}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v6, :cond_0

    .line 321
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->i:Ljava/util/List;

    if-eqz v0, :cond_a

    .line 22
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li;

    .line 201
    iget-object v4, v0, Li;->a:Ljava/lang/Class;

    const-class v7, Landroid/provider/ContactsContract$CommonDataKinds$Email;

    if-ne v4, v7, :cond_5

    .line 259
    sget-object v4, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v4}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v4

    .line 276
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v7, v7, v12

    invoke-virtual {v4, v7, v5}, Landroid/content/ContentProviderOperation$Builder;->withValueBackReference(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;

    .line 326
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v7, v7, v11

    sget-object v8, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v9, 0xe

    aget-object v8, v8, v9

    invoke-virtual {v4, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 263
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v7, v7, v13

    iget-object v8, v0, Li;->c:Ljava/lang/String;

    invoke-virtual {v4, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 23
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/4 v8, 0x7

    aget-object v7, v7, v8

    iget v8, v0, Li;->b:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v4, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 182
    iget v7, v0, Li;->b:I

    if-nez v7, :cond_4

    .line 204
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v8, 0x1d

    aget-object v7, v7, v8

    iget-object v8, v0, Li;->e:Ljava/lang/String;

    invoke-virtual {v4, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 14
    :cond_4
    invoke-virtual {v4}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v6, :cond_9

    .line 2
    :cond_5
    iget-object v4, v0, Li;->a:Ljava/lang/Class;

    const-class v7, Landroid/provider/ContactsContract$CommonDataKinds$StructuredPostal;

    if-ne v4, v7, :cond_7

    .line 178
    sget-object v4, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v4}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v4

    .line 270
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v7, v7, v12

    invoke-virtual {v4, v7, v5}, Landroid/content/ContentProviderOperation$Builder;->withValueBackReference(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;

    .line 179
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v7, v7, v11

    sget-object v8, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/4 v9, 0x5

    aget-object v8, v8, v9

    invoke-virtual {v4, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 265
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v8, 0x18

    aget-object v7, v7, v8

    iget-object v8, v0, Li;->d:Lh;

    invoke-virtual {v8}, Lh;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 143
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v8, 0x26

    aget-object v7, v7, v8

    iget-object v8, v0, Li;->d:Lh;

    iget-object v8, v8, Lh;->b:Ljava/lang/String;

    invoke-virtual {v4, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 152
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v8, 0x21

    aget-object v7, v7, v8

    iget-object v8, v0, Li;->d:Lh;

    iget-object v8, v8, Lh;->c:Ljava/lang/String;

    invoke-virtual {v4, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 284
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v8, 0x24

    aget-object v7, v7, v8

    iget-object v8, v0, Li;->d:Lh;

    iget-object v8, v8, Lh;->d:Ljava/lang/String;

    invoke-virtual {v4, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 214
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v8, 0x8

    aget-object v7, v7, v8

    iget-object v8, v0, Li;->d:Lh;

    iget-object v8, v8, Lh;->e:Ljava/lang/String;

    invoke-virtual {v4, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 216
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/4 v8, 0x7

    aget-object v7, v7, v8

    iget v8, v0, Li;->b:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v4, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 100
    iget v7, v0, Li;->b:I

    if-nez v7, :cond_6

    .line 136
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v8, 0x1d

    aget-object v7, v7, v8

    iget-object v8, v0, Li;->e:Ljava/lang/String;

    invoke-virtual {v4, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 170
    :cond_6
    invoke-virtual {v4}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v6, :cond_9

    .line 24
    :cond_7
    iget-object v4, v0, Li;->a:Ljava/lang/Class;

    const-class v7, Landroid/provider/ContactsContract$CommonDataKinds$Im;

    if-ne v4, v7, :cond_8

    .line 202
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v8, 0x13

    aget-object v7, v7, v8

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    if-eqz v6, :cond_9

    .line 27
    :cond_8
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v8, 0x22

    aget-object v7, v7, v8

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    :cond_9
    if-eqz v6, :cond_3

    .line 162
    :cond_a
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->j:Ljava/util/List;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_c

    .line 232
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->j:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk;

    .line 331
    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v1}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v4

    .line 103
    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v1, v1, v12

    invoke-virtual {v4, v1, v5}, Landroid/content/ContentProviderOperation$Builder;->withValueBackReference(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;

    .line 336
    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v1, v1, v11

    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/4 v8, 0x6

    aget-object v7, v7, v8

    invoke-virtual {v4, v1, v7}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 247
    iget-object v1, v0, Lk;->b:Ljava/lang/String;

    const-string v7, " "

    invoke-virtual {v1, v7}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v7

    .line 221
    if-lez v7, :cond_17

    iget-object v1, v0, Lk;->b:Ljava/lang/String;

    invoke-virtual {v1, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 273
    :goto_0
    sget-object v8, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v8, v8, v13

    invoke-virtual {v4, v8, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 117
    if-lez v7, :cond_b

    .line 55
    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v8, 0x9

    aget-object v1, v1, v8

    iget-object v8, v0, Lk;->b:Ljava/lang/String;

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v8, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v1, v7}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 174
    :cond_b
    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v7, 0x18

    aget-object v1, v1, v7

    iget-object v0, v0, Lk;->c:Ljava/lang/String;

    invoke-virtual {v4, v1, v0}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 280
    invoke-virtual {v4}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    :cond_c
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->k:Ljava/util/Map;

    if-eqz v0, :cond_12

    .line 297
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 36
    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v7, 0x15

    aget-object v1, v1, v7

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 242
    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v1}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v1

    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v7, v7, v12

    invoke-virtual {v1, v7, v5}, Landroid/content/ContentProviderOperation$Builder;->withValueBackReference(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v1

    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v7, v7, v11

    sget-object v8, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v9, 0x11

    aget-object v8, v8, v9

    invoke-virtual {v1, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v7

    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v8, v1, v13

    iget-object v1, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v1, v1, Lg;->k:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le;

    iget-object v1, v1, Le;->b:Ljava/lang/String;

    invoke-virtual {v7, v8, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v1

    .line 271
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    :cond_e
    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v7, 0x1c

    aget-object v1, v1, v7

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 74
    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v1}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v1

    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v7, v7, v12

    invoke-virtual {v1, v7, v5}, Landroid/content/ContentProviderOperation$Builder;->withValueBackReference(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v1

    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v7, v7, v11

    sget-object v8, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v9, 0x19

    aget-object v8, v8, v9

    invoke-virtual {v1, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v1

    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/4 v8, 0x7

    aget-object v7, v7, v8

    const/4 v8, 0x3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v1, v7, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v7

    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v8, v1, v13

    iget-object v1, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v1, v1, Lg;->k:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le;

    iget-object v1, v1, Le;->b:Ljava/lang/String;

    invoke-virtual {v7, v8, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v1

    .line 113
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    :cond_f
    sget-object v1, Lg;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 329
    iget-object v1, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v1, v1, Lg;->k:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le;

    .line 153
    sget-object v7, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v7}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v7

    sget-object v8, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v8, v8, v12

    invoke-virtual {v7, v8, v5}, Landroid/content/ContentProviderOperation$Builder;->withValueBackReference(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v7

    sget-object v8, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v8, v8, v11

    sget-object v9, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v10, 0xa

    aget-object v9, v9, v10

    invoke-virtual {v7, v8, v9}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v7

    sget-object v8, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v9, 0x9

    aget-object v8, v8, v9

    sget-object v9, Lg;->a:Ljava/util/HashMap;

    invoke-virtual {v9, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v7

    sget-object v8, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v8, v8, v13

    iget-object v9, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v9, v9, Lg;->k:Ljava/util/Map;

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le;

    iget-object v0, v0, Le;->b:Ljava/lang/String;

    invoke-virtual {v7, v8, v0}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 212
    iget-object v7, v1, Le;->e:Ljava/util/Set;

    if-eqz v7, :cond_10

    iget-object v7, v1, Le;->e:Ljava/util/Set;

    invoke-interface {v7}, Ljava/util/Set;->size()I

    move-result v7

    if-lez v7, :cond_10

    .line 223
    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/4 v8, 0x7

    aget-object v7, v7, v8

    iget-object v1, v1, Le;->e:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v1

    aget-object v1, v1, v5

    invoke-virtual {v0, v7, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 77
    :cond_10
    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    :cond_11
    if-eqz v6, :cond_d

    .line 104
    :cond_12
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->h:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_13

    .line 319
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 10
    iget-object v1, p0, Lcom/whatsapp/ViewSharedContactActivity;->h:Landroid/graphics/Bitmap;

    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v7, 0x64

    invoke-virtual {v1, v4, v7, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 195
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 80
    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v1}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v1

    sget-object v4, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v4, v4, v12

    invoke-virtual {v1, v4, v5}, Landroid/content/ContentProviderOperation$Builder;->withValueBackReference(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v1

    sget-object v4, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    aget-object v4, v4, v11

    sget-object v7, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v8, 0x12

    aget-object v7, v7, v8

    invoke-virtual {v1, v4, v7}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v1

    sget-object v4, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v7, 0xf

    aget-object v4, v4, v7

    invoke-virtual {v1, v4, v0}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v0

    .line 72
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    :cond_13
    const/4 v0, 0x1

    :try_start_0
    invoke-static {v0}, Lcom/whatsapp/g;->a(Z)V

    .line 300
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v4, 0x1b

    aget-object v1, v1, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentResolver;->applyBatch(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;

    move-result-object v0

    .line 205
    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v0, v0, Landroid/content/ContentProviderResult;->uri:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v7

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v2, 0x25

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v1, v1, Lg;->c:Lj;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v2, 0x23

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move v2, v5

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll;

    .line 67
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v4, v0, Ll;->b:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/whatsapp/qp;->f(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v9

    .line 48
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_15

    .line 145
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move v4, v5

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/zq;

    .line 168
    iget-object v11, v1, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-nez v11, :cond_1b

    .line 111
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v11, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v12, 0x20

    aget-object v11, v11, v12

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 129
    new-instance v4, Lcom/whatsapp/uq;

    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v11

    iget-object v13, v0, Ll;->b:Ljava/lang/String;

    invoke-direct {v4, v11, v12, v13}, Lcom/whatsapp/uq;-><init>(JLjava/lang/String;)V

    iput-object v4, v1, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    .line 58
    iget-object v4, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    invoke-virtual {v4}, Lg;->a()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    .line 294
    const/4 v4, 0x1

    iput-boolean v4, v1, Lcom/whatsapp/zq;->k:Z

    move v1, v3

    .line 95
    :goto_3
    if-eqz v6, :cond_1a

    move v0, v1

    .line 185
    :goto_4
    if-eqz v0, :cond_14

    .line 255
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v1, 0x0

    invoke-virtual {v0, v9, v1}, Lcom/whatsapp/qp;->c(Ljava/util/ArrayList;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 112
    sget-object v0, Lcom/whatsapp/App;->Ib:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 246
    :cond_14
    if-eqz v6, :cond_19

    :cond_15
    move v0, v3

    .line 64
    :goto_5
    if-eqz v6, :cond_18

    .line 200
    :goto_6
    if-eqz v0, :cond_16

    .line 31
    sget-object v0, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 57
    new-instance v0, Lcom/whatsapp/y9;

    invoke-direct {v0, p0}, Lcom/whatsapp/y9;-><init>(Lcom/whatsapp/ViewSharedContactActivity;)V

    .line 142
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setPriority(I)V

    .line 116
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 94
    :cond_16
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/whatsapp/g;->a(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    :goto_7
    const v0, 0x7f09022c

    new-array v1, v3, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    invoke-virtual {v2}, Lg;->a()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v5

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/ViewSharedContactActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewSharedContactActivity;->c(Ljava/lang/String;)V

    .line 225
    return-void

    .line 221
    :cond_17
    iget-object v1, v0, Lk;->b:Ljava/lang/String;

    goto/16 :goto_0

    .line 26
    :catch_0
    move-exception v0

    .line 304
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v4, 0x1f

    aget-object v2, v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto :goto_7

    :cond_18
    move v2, v0

    goto/16 :goto_1

    :cond_19
    move v0, v2

    goto :goto_5

    :cond_1a
    move v4, v1

    goto/16 :goto_2

    :cond_1b
    move v1, v4

    goto :goto_3

    :cond_1c
    move v0, v4

    goto :goto_4

    :cond_1d
    move v0, v2

    goto :goto_6
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8
    .parameter

    .prologue
    const/4 v1, 0x0

    const v7, 0x7f0d018e

    const/4 v6, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 19
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onCreate(Landroid/os/Bundle;)V

    .line 146
    const v0, 0x7f03005a

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewSharedContactActivity;->setContentView(I)V

    .line 315
    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v3, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v4, 0x2e

    aget-object v3, v3, v4

    invoke-virtual {v0, v3, v6}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->i:Z

    .line 213
    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v3, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v4, 0x2c

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->j:Ljava/lang/String;

    .line 49
    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v3, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v4, 0x2b

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->k:Ljava/lang/String;

    .line 73
    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v3, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v4, 0x28

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->l:Ljava/lang/String;

    .line 124
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->j:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 176
    sget-object v0, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v1, 0x2a

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 303
    const v0, 0x7f090230

    invoke-static {p0, v0, v6}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 209
    :goto_0
    return-void

    .line 313
    :cond_0
    const v0, 0x7f0d018f

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewSharedContactActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->m:Landroid/widget/LinearLayout;

    .line 298
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->j:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/whatsapp/ViewSharedContactActivity;->a(Ljava/lang/String;)Lg;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    .line 92
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    if-nez v0, :cond_1

    .line 198
    const v0, 0x7f0902d9

    new-instance v3, Lcom/whatsapp/p7;

    invoke-direct {v3, p0}, Lcom/whatsapp/p7;-><init>(Lcom/whatsapp/ViewSharedContactActivity;)V

    invoke-virtual {p0, v0, v3}, Lcom/whatsapp/ViewSharedContactActivity;->a(ILcom/whatsapp/nr;)V

    .line 177
    :cond_1
    iget-boolean v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->i:Z

    if-eqz v0, :cond_2

    .line 180
    const v0, 0x7f0d0087

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewSharedContactActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 120
    invoke-virtual {p0, v7}, Lcom/whatsapp/ViewSharedContactActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 141
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    if-eqz v0, :cond_2

    .line 325
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/whatsapp/ViewSharedContactActivity;->l:Ljava/lang/String;

    invoke-static {v3, v4}, Lg;->a(Landroid/content/Context;Ljava/lang/String;)[B

    move-result-object v3

    iput-object v3, v0, Lg;->f:[B
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    if-eqz v0, :cond_10

    .line 302
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->f:[B

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->f:[B

    array-length v0, v0

    if-lez v0, :cond_5

    .line 337
    iget-boolean v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->i:Z

    if-nez v0, :cond_3

    .line 20
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->f:[B

    invoke-static {v0}, Lwb;->b([B)[B

    move-result-object v0

    if-eqz v2, :cond_4

    .line 229
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->f:[B

    .line 167
    :cond_4
    array-length v3, v0

    invoke-static {v0, v6, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, p0, Lcom/whatsapp/ViewSharedContactActivity;->h:Landroid/graphics/Bitmap;

    .line 128
    new-instance v3, Lcom/whatsapp/br;

    const-string v4, ""

    invoke-direct {v3, p0, v4, v0}, Lcom/whatsapp/br;-><init>(Lcom/whatsapp/ViewSharedContactActivity;Ljava/lang/String;[B)V

    .line 267
    const v0, 0x7f0d018a

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewSharedContactActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 164
    sget-object v4, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v4}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0a0005

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    float-to-int v4, v4

    sget-object v5, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v5}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v5

    iget v5, v5, Lcom/whatsapp/j4;->L:F

    invoke-virtual {v3, v4, v5, v6}, Lcom/whatsapp/zq;->a(IFZ)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 320
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->j:Ljava/util/List;

    if-eqz v0, :cond_13

    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_13

    .line 53
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->j:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk;

    iget-object v1, v0, Lk;->b:Ljava/lang/String;

    .line 256
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->j:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk;

    iget-object v0, v0, Lk;->c:Ljava/lang/String;

    .line 281
    :goto_2
    iget-object v3, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v3, v3, Lg;->c:Lj;

    iget-object v3, v3, Lj;->a:Ljava/lang/String;

    invoke-direct {p0, v3, v1, v0}, Lcom/whatsapp/ViewSharedContactActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->h:Ljava/util/List;

    if-eqz v0, :cond_7

    .line 107
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll;

    .line 171
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0900e1

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, " "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v1, v0, Ll;->a:I

    if-nez v1, :cond_11

    iget-object v1, v0, Ll;->c:Ljava/lang/String;

    :goto_3
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v4, v0, Ll;->b:Ljava/lang/String;

    const v5, 0x7f020036

    iget-object v6, v0, Ll;->b:Ljava/lang/String;

    invoke-direct {p0, v1, v4, v5, v6}, Lcom/whatsapp/ViewSharedContactActivity;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/widget/RelativeLayout;

    move-result-object v1

    .line 254
    new-instance v4, Lcom/whatsapp/q7;

    invoke-direct {v4, p0}, Lcom/whatsapp/q7;-><init>(Lcom/whatsapp/ViewSharedContactActivity;)V

    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 139
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 161
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 338
    if-eqz v2, :cond_6

    .line 307
    :cond_7
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->i:Ljava/util/List;

    if-eqz v0, :cond_b

    .line 157
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li;

    .line 264
    iget-object v1, v0, Li;->a:Ljava/lang/Class;

    const-class v4, Landroid/provider/ContactsContract$CommonDataKinds$Email;

    if-ne v1, v4, :cond_9

    .line 86
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0900e6

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, " "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v1, v0, Li;->b:I

    if-nez v1, :cond_12

    iget-object v1, v0, Li;->e:Ljava/lang/String;

    :goto_4
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v4, v0, Li;->c:Ljava/lang/String;

    const v5, 0x7f02003f

    iget-object v6, v0, Li;->c:Ljava/lang/String;

    invoke-direct {p0, v1, v4, v5, v6}, Lcom/whatsapp/ViewSharedContactActivity;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/widget/RelativeLayout;

    move-result-object v1

    .line 295
    new-instance v4, Lcom/whatsapp/r7;

    invoke-direct {v4, p0}, Lcom/whatsapp/r7;-><init>(Lcom/whatsapp/ViewSharedContactActivity;)V

    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 339
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 125
    iget-object v4, p0, Lcom/whatsapp/ViewSharedContactActivity;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 279
    if-eqz v2, :cond_a

    :cond_9
    iget-object v1, v0, Li;->a:Ljava/lang/Class;

    const-class v4, Landroid/provider/ContactsContract$CommonDataKinds$StructuredPostal;

    if-ne v1, v4, :cond_a

    .line 268
    const v1, 0x7f020040

    invoke-direct {p0, v0, v1}, Lcom/whatsapp/ViewSharedContactActivity;->a(Li;I)Landroid/widget/RelativeLayout;

    move-result-object v1

    .line 314
    new-instance v4, Lcom/whatsapp/s7;

    invoke-direct {v4, p0}, Lcom/whatsapp/s7;-><init>(Lcom/whatsapp/ViewSharedContactActivity;)V

    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 140
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 187
    :cond_a
    if-eqz v2, :cond_8

    .line 46
    :cond_b
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->k:Ljava/util/Map;

    if-eqz v0, :cond_10

    .line 131
    iget-object v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v0, v0, Lg;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 208
    iget-object v3, p0, Lcom/whatsapp/ViewSharedContactActivity;->f:Lg;

    iget-object v3, v3, Lg;->k:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 172
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le;

    .line 169
    invoke-virtual {v0}, Le;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 286
    iget-object v4, v0, Le;->a:Ljava/lang/String;

    sget-object v5, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v6, 0x27

    aget-object v5, v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    .line 224
    sget-object v4, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v5, 0x29

    aget-object v4, v4, v5

    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    .line 272
    iget-object v5, v0, Le;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 75
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    move-result v4

    .line 165
    if-nez v4, :cond_e

    .line 266
    if-eqz v2, :cond_d

    .line 328
    :cond_e
    invoke-direct {p0, v0}, Lcom/whatsapp/ViewSharedContactActivity;->a(Le;)Landroid/widget/RelativeLayout;

    move-result-object v0

    .line 310
    iget-object v4, p0, Lcom/whatsapp/ViewSharedContactActivity;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 322
    if-eqz v2, :cond_d

    .line 166
    :cond_f
    if-eqz v2, :cond_c

    .line 50
    :cond_10
    const v0, 0x7f0d0112

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewSharedContactActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/t7;

    invoke-direct {v1, p0}, Lcom/whatsapp/t7;-><init>(Lcom/whatsapp/ViewSharedContactActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    invoke-virtual {p0, v7}, Lcom/whatsapp/ViewSharedContactActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/u7;

    invoke-direct {v1, p0}, Lcom/whatsapp/u7;-><init>(Lcom/whatsapp/ViewSharedContactActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 99
    :catch_0
    move-exception v0

    .line 44
    sget-object v0, Lcom/whatsapp/ViewSharedContactActivity;->z:[Ljava/lang/String;

    const/16 v3, 0x2d

    aget-object v0, v0, v3

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 171
    :cond_11
    const-class v1, Landroid/provider/ContactsContract$CommonDataKinds$Phone;

    iget v5, v0, Ll;->a:I

    invoke-direct {p0, v1, v5}, Lcom/whatsapp/ViewSharedContactActivity;->a(Ljava/lang/Class;I)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_3

    .line 86
    :cond_12
    const-class v1, Landroid/provider/ContactsContract$CommonDataKinds$Email;

    iget v5, v0, Li;->b:I

    invoke-direct {p0, v1, v5}, Lcom/whatsapp/ViewSharedContactActivity;->a(Ljava/lang/Class;I)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_4

    :cond_13
    move-object v0, v1

    goto/16 :goto_2
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 5
    .parameter

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 275
    iget-boolean v0, p0, Lcom/whatsapp/ViewSharedContactActivity;->i:Z

    if-eqz v0, :cond_0

    .line 149
    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090248

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v4, v3, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    .line 126
    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0203d1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 138
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f09022a

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v3, v3, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    .line 8
    invoke-virtual {p0}, Lcom/whatsapp/ViewSharedContactActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0203bc

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 123
    :cond_1
    return v4
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2
    .parameter

    .prologue
    const/4 v0, 0x1

    .line 222
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 226
    const/4 v0, 0x0

    .line 260
    :goto_0
    return v0

    .line 203
    :pswitch_0
    invoke-direct {p0}, Lcom/whatsapp/ViewSharedContactActivity;->a()V

    goto :goto_0

    .line 288
    :pswitch_1
    invoke-direct {p0}, Lcom/whatsapp/ViewSharedContactActivity;->b()V

    goto :goto_0

    .line 222
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onResume()V
    .locals 0

    .prologue
    .line 114
    invoke-super {p0}, Lcom/whatsapp/DialogToastActivity;->onResume()V

    .line 250
    return-void
.end method
