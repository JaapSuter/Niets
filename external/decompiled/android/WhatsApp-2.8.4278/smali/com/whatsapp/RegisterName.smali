.class public Lcom/whatsapp/RegisterName;
.super Lcom/whatsapp/VerifyMessageStoreActivity;
.source "RegisterName.java"

# interfaces
.implements Lcom/whatsapp/uk;


# static fields
.field private static l:Lcom/whatsapp/s9;

.field private static m:Lcom/whatsapp/f;

.field private static final z:[Ljava/lang/String;


# instance fields
.field private n:Lcom/whatsapp/zq;

.field private o:Landroid/widget/ImageButton;

.field private p:Landroid/view/View;

.field private q:Landroid/widget/EditText;

.field private r:Landroid/os/Handler;

.field private s:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v2, 0x43

    const/16 v4, 0x42

    const/16 v3, 0x37

    const/16 v1, 0x2b

    const/4 v6, 0x0

    const/16 v0, 0x24

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "Y/$^1_/1Y#F/lT.B)(R&\u00049\'T#Y.0C#_/c"

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

    const-string v0, "Y/$^1_/1Y#F/lT.D)(\u001a5Y%-P"

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

    const-string v0, "Y/$^1_/1Y#F/lT0N+7R"

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

    const-string v0, "x%-N"

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

    const-string v0, "Y/$^1_/1Y#F/lT0N+7RmI+\'\u001a1_+7RbI%6Y!Nj7XbF+*Y"

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

    const-string v0, "Y/$^1_/1Y#F/lT0N+7RmF#0D+E-nG#Y+.DbI%6Y!Nj7XbY/$G*D$&"

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

    const-string v0, "Y/$^1_/1Y#F/lZ1L97X0Ne+R#G>+N"

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

    const-string v0, "O/!B%"

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

    const-string v0, "F%6Y6N."

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

    const-string v0, "F%6Y6N.\u001cE-"

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

    const-string v0, "J$\'E-B.m^,_/-ClN27E#\u00059+X0_)6Clb\u0004\u0017r\u000c\u007f"

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

    const-string v0, "H%.\u00195C+7D#[:mz#B$"

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

    const-string v0, "H+-Y-_j3V0X/cD*D87T7_j6E+\u000b"

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

    const-string v0, "H%.\u0019#E.1X+Od/V7E)+R0\u0005+ C+D$mb\u000cb\u0004\u0010c\u0003g\u0006\u001cd\nd\u0018\u0017t\u0017\u007f"

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

    const-string v0, "J$\'E-B.m^,_/-ClN27E#\u00059+X0_)6Cle\u000b\u000er"

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

    const-string v0, "H%.\u00195C+7D#[:"

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

    const-string v0, "Y/$^1_/1Y#F/lE\'X?.R"

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

    const-string v0, "Y/$^1_/1Y#F/lY-\u0006:6D*E+.R"

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

    const-string v0, "Y/$^1_/1Y#F/lS+J&,PmH+-CoH%-Y\'H>"

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

    const-string v0, "Y/$^1_/1Y#F/lS+J&,PmM+*[\'Og-R6"

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

    const-string v0, "Y/$^1_/1Y#F/lS+J&,PmH&,T)\u0006=1X,L"

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

    const-string v0, "Y/$^1_/1\u001a,J\'&"

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

    const-string v0, "B9\u001cE\'X/7"

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

    const-string v0, "F/"

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

    const-string v0, "Y/$^1_/1Y#F/lD\'_\u0015\'^0_3"

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

    const-string v0, "Y/$^1_/1Y#F/lT0N+7RmX+5RbF/"

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

    const-string v0, "Y/$^1_/1Y#F/lZ\'X9\"P\'X>,E\']/1^$B/\'\u0018/B90^,Lg3V0J\'0\u0017 D?-T\'\u000b>,\u00170N-3_-E/"

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

    const-string v0, "J$\'E-B.m^,_/-ClH+7R%D8:\u0019\u000ej\u001f\rt\nn\u0018"

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

    const-string v0, "J$\'E-B.m^,_/-ClJ)7^-Ed\u000ev\u000be"

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

    const-string v0, "H%.\u0019%D%$[\'"

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

    const-string v0, "Y/$^1_/1Y#F/lP\'_\'&Y#F/c"

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

    const/16 v10, 0x1f

    const-string v0, "O#0G.J3\u001cY#F/"

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

    aput-object v0, v9, v10

    const/16 v10, 0x20

    const-string v0, "J$\'E-B.m^,_/-ClN27E#\u00059+X0_)6Clb\t\u000cy\u001dy\u000f\u0010x\u0017y\t\u0006"

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

    const-string v0, "O?3[+H+7R"

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

    const-string v0, "H%.\u0019#E.1X+Od/V7E)+R0\u0005+ C+D$m~\u000cx\u001e\u0002{\u000et\u0019\u000bx\u0010\u007f\t\u0016c"

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

    const/16 v8, 0x23

    const-string v0, "Y/$^1_/1Y#F/lS\'X>1X;"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_23
    if-gt v6, v7, :cond_23

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    .line 33
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/RegisterName;->l:Lcom/whatsapp/s9;

    .line 197
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/RegisterName;->m:Lcom/whatsapp/f;

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_24
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_24

    :pswitch_1
    const/16 v0, 0x4a

    goto :goto_24

    :pswitch_2
    move v0, v2

    goto :goto_24

    :pswitch_3
    move v0, v3

    goto :goto_24

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_25
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_25

    :pswitch_5
    const/16 v0, 0x4a

    goto :goto_25

    :pswitch_6
    move v0, v2

    goto :goto_25

    :pswitch_7
    move v0, v3

    goto :goto_25

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_26
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_26

    :pswitch_9
    const/16 v0, 0x4a

    goto :goto_26

    :pswitch_a
    move v0, v2

    goto :goto_26

    :pswitch_b
    move v0, v3

    goto :goto_26

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_27
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_27

    :pswitch_d
    const/16 v0, 0x4a

    goto :goto_27

    :pswitch_e
    move v0, v2

    goto :goto_27

    :pswitch_f
    move v0, v3

    goto :goto_27

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_28
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_28

    :pswitch_11
    const/16 v0, 0x4a

    goto :goto_28

    :pswitch_12
    move v0, v2

    goto :goto_28

    :pswitch_13
    move v0, v3

    goto :goto_28

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_29
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_29

    :pswitch_15
    const/16 v0, 0x4a

    goto :goto_29

    :pswitch_16
    move v0, v2

    goto :goto_29

    :pswitch_17
    move v0, v3

    goto :goto_29

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_2a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_2a

    :pswitch_19
    const/16 v0, 0x4a

    goto :goto_2a

    :pswitch_1a
    move v0, v2

    goto :goto_2a

    :pswitch_1b
    move v0, v3

    goto :goto_2a

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_2b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_2b

    :pswitch_1d
    const/16 v0, 0x4a

    goto :goto_2b

    :pswitch_1e
    move v0, v2

    goto :goto_2b

    :pswitch_1f
    move v0, v3

    goto :goto_2b

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_2c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_2c

    :pswitch_21
    const/16 v0, 0x4a

    goto :goto_2c

    :pswitch_22
    move v0, v2

    goto :goto_2c

    :pswitch_23
    move v0, v3

    goto :goto_2c

    :cond_9
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_2d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_2d

    :pswitch_25
    const/16 v0, 0x4a

    goto :goto_2d

    :pswitch_26
    move v0, v2

    goto :goto_2d

    :pswitch_27
    move v0, v3

    goto :goto_2d

    :cond_a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_2e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_a

    :pswitch_28
    move v0, v1

    goto :goto_2e

    :pswitch_29
    const/16 v0, 0x4a

    goto :goto_2e

    :pswitch_2a
    move v0, v2

    goto :goto_2e

    :pswitch_2b
    move v0, v3

    goto :goto_2e

    :cond_b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_2f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_2f

    :pswitch_2d
    const/16 v0, 0x4a

    goto :goto_2f

    :pswitch_2e
    move v0, v2

    goto :goto_2f

    :pswitch_2f
    move v0, v3

    goto :goto_2f

    :cond_c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_30
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_c

    :pswitch_30
    move v0, v1

    goto :goto_30

    :pswitch_31
    const/16 v0, 0x4a

    goto :goto_30

    :pswitch_32
    move v0, v2

    goto :goto_30

    :pswitch_33
    move v0, v3

    goto :goto_30

    :cond_d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_d

    move v0, v4

    :goto_31
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_d

    :pswitch_34
    move v0, v1

    goto :goto_31

    :pswitch_35
    const/16 v0, 0x4a

    goto :goto_31

    :pswitch_36
    move v0, v2

    goto :goto_31

    :pswitch_37
    move v0, v3

    goto :goto_31

    :cond_e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_e

    move v0, v4

    :goto_32
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_e

    :pswitch_38
    move v0, v1

    goto :goto_32

    :pswitch_39
    const/16 v0, 0x4a

    goto :goto_32

    :pswitch_3a
    move v0, v2

    goto :goto_32

    :pswitch_3b
    move v0, v3

    goto :goto_32

    :cond_f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_f

    move v0, v4

    :goto_33
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_f

    :pswitch_3c
    move v0, v1

    goto :goto_33

    :pswitch_3d
    const/16 v0, 0x4a

    goto :goto_33

    :pswitch_3e
    move v0, v2

    goto :goto_33

    :pswitch_3f
    move v0, v3

    goto :goto_33

    :cond_10
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_10

    move v0, v4

    :goto_34
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_10

    :pswitch_40
    move v0, v1

    goto :goto_34

    :pswitch_41
    const/16 v0, 0x4a

    goto :goto_34

    :pswitch_42
    move v0, v2

    goto :goto_34

    :pswitch_43
    move v0, v3

    goto :goto_34

    :cond_11
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_11

    move v0, v4

    :goto_35
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_11

    :pswitch_44
    move v0, v1

    goto :goto_35

    :pswitch_45
    const/16 v0, 0x4a

    goto :goto_35

    :pswitch_46
    move v0, v2

    goto :goto_35

    :pswitch_47
    move v0, v3

    goto :goto_35

    :cond_12
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_12

    move v0, v4

    :goto_36
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_12

    :pswitch_48
    move v0, v1

    goto :goto_36

    :pswitch_49
    const/16 v0, 0x4a

    goto :goto_36

    :pswitch_4a
    move v0, v2

    goto :goto_36

    :pswitch_4b
    move v0, v3

    goto :goto_36

    :cond_13
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_13

    move v0, v4

    :goto_37
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_13

    :pswitch_4c
    move v0, v1

    goto :goto_37

    :pswitch_4d
    const/16 v0, 0x4a

    goto :goto_37

    :pswitch_4e
    move v0, v2

    goto :goto_37

    :pswitch_4f
    move v0, v3

    goto :goto_37

    :cond_14
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_14

    move v0, v4

    :goto_38
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_14

    :pswitch_50
    move v0, v1

    goto :goto_38

    :pswitch_51
    const/16 v0, 0x4a

    goto :goto_38

    :pswitch_52
    move v0, v2

    goto :goto_38

    :pswitch_53
    move v0, v3

    goto :goto_38

    :cond_15
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_15

    move v0, v4

    :goto_39
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_15

    :pswitch_54
    move v0, v1

    goto :goto_39

    :pswitch_55
    const/16 v0, 0x4a

    goto :goto_39

    :pswitch_56
    move v0, v2

    goto :goto_39

    :pswitch_57
    move v0, v3

    goto :goto_39

    :cond_16
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_16

    move v0, v4

    :goto_3a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_16

    :pswitch_58
    move v0, v1

    goto :goto_3a

    :pswitch_59
    const/16 v0, 0x4a

    goto :goto_3a

    :pswitch_5a
    move v0, v2

    goto :goto_3a

    :pswitch_5b
    move v0, v3

    goto :goto_3a

    :cond_17
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_17

    move v0, v4

    :goto_3b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_17

    :pswitch_5c
    move v0, v1

    goto :goto_3b

    :pswitch_5d
    const/16 v0, 0x4a

    goto :goto_3b

    :pswitch_5e
    move v0, v2

    goto :goto_3b

    :pswitch_5f
    move v0, v3

    goto :goto_3b

    :cond_18
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_18

    move v0, v4

    :goto_3c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_18

    :pswitch_60
    move v0, v1

    goto :goto_3c

    :pswitch_61
    const/16 v0, 0x4a

    goto :goto_3c

    :pswitch_62
    move v0, v2

    goto :goto_3c

    :pswitch_63
    move v0, v3

    goto :goto_3c

    :cond_19
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_19

    move v0, v4

    :goto_3d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_19

    :pswitch_64
    move v0, v1

    goto :goto_3d

    :pswitch_65
    const/16 v0, 0x4a

    goto :goto_3d

    :pswitch_66
    move v0, v2

    goto :goto_3d

    :pswitch_67
    move v0, v3

    goto :goto_3d

    :cond_1a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1a

    move v0, v4

    :goto_3e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1a

    :pswitch_68
    move v0, v1

    goto :goto_3e

    :pswitch_69
    const/16 v0, 0x4a

    goto :goto_3e

    :pswitch_6a
    move v0, v2

    goto :goto_3e

    :pswitch_6b
    move v0, v3

    goto :goto_3e

    :cond_1b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1b

    move v0, v4

    :goto_3f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1b

    :pswitch_6c
    move v0, v1

    goto :goto_3f

    :pswitch_6d
    const/16 v0, 0x4a

    goto :goto_3f

    :pswitch_6e
    move v0, v2

    goto :goto_3f

    :pswitch_6f
    move v0, v3

    goto :goto_3f

    :cond_1c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1c

    move v0, v4

    :goto_40
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1c

    :pswitch_70
    move v0, v1

    goto :goto_40

    :pswitch_71
    const/16 v0, 0x4a

    goto :goto_40

    :pswitch_72
    move v0, v2

    goto :goto_40

    :pswitch_73
    move v0, v3

    goto :goto_40

    :cond_1d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1d

    move v0, v4

    :goto_41
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1d

    :pswitch_74
    move v0, v1

    goto :goto_41

    :pswitch_75
    const/16 v0, 0x4a

    goto :goto_41

    :pswitch_76
    move v0, v2

    goto :goto_41

    :pswitch_77
    move v0, v3

    goto :goto_41

    :cond_1e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1e

    move v0, v4

    :goto_42
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1e

    :pswitch_78
    move v0, v1

    goto :goto_42

    :pswitch_79
    const/16 v0, 0x4a

    goto :goto_42

    :pswitch_7a
    move v0, v2

    goto :goto_42

    :pswitch_7b
    move v0, v3

    goto :goto_42

    :cond_1f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1f

    move v0, v4

    :goto_43
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1f

    :pswitch_7c
    move v0, v1

    goto :goto_43

    :pswitch_7d
    const/16 v0, 0x4a

    goto :goto_43

    :pswitch_7e
    move v0, v2

    goto :goto_43

    :pswitch_7f
    move v0, v3

    goto :goto_43

    :cond_20
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_20

    move v0, v4

    :goto_44
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_20

    :pswitch_80
    move v0, v1

    goto :goto_44

    :pswitch_81
    const/16 v0, 0x4a

    goto :goto_44

    :pswitch_82
    move v0, v2

    goto :goto_44

    :pswitch_83
    move v0, v3

    goto :goto_44

    :cond_21
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_21

    move v0, v4

    :goto_45
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_21

    :pswitch_84
    move v0, v1

    goto :goto_45

    :pswitch_85
    const/16 v0, 0x4a

    goto :goto_45

    :pswitch_86
    move v0, v2

    goto :goto_45

    :pswitch_87
    move v0, v3

    goto :goto_45

    :cond_22
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_22

    move v0, v4

    :goto_46
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_22

    :pswitch_88
    move v0, v1

    goto :goto_46

    :pswitch_89
    const/16 v0, 0x4a

    goto :goto_46

    :pswitch_8a
    move v0, v2

    goto :goto_46

    :pswitch_8b
    move v0, v3

    goto :goto_46

    :cond_23
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_23

    move v0, v4

    :goto_47
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_23

    :pswitch_8c
    move v0, v1

    goto :goto_47

    :pswitch_8d
    const/16 v0, 0x4a

    goto :goto_47

    :pswitch_8e
    move v0, v2

    goto :goto_47

    :pswitch_8f
    move v0, v3

    goto :goto_47

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
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/whatsapp/VerifyMessageStoreActivity;-><init>()V

    .line 251
    new-instance v0, Lcom/whatsapp/qd;

    invoke-direct {v0, p0}, Lcom/whatsapp/qd;-><init>(Lcom/whatsapp/RegisterName;)V

    iput-object v0, p0, Lcom/whatsapp/RegisterName;->r:Landroid/os/Handler;

    .line 83
    return-void
.end method

.method public static a(Landroid/content/Context;)Landroid/content/Intent;
    .locals 4
    .parameter

    .prologue
    .line 63
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 144
    sget-object v1, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v2, 0xf

    aget-object v1, v1, v2

    sget-object v2, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 113
    sget-object v1, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v2, 0x1c

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 201
    sget-object v1, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v2, 0x1b

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 31
    const/high16 v1, 0x1000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 11
    const/high16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 174
    return-object v0
.end method

.method static a(Lcom/whatsapp/f;)Lcom/whatsapp/f;
    .locals 0
    .parameter

    .prologue
    .line 57
    sput-object p0, Lcom/whatsapp/RegisterName;->m:Lcom/whatsapp/f;

    return-object p0
.end method

.method static a(Lcom/whatsapp/s9;)Lcom/whatsapp/s9;
    .locals 0
    .parameter

    .prologue
    .line 62
    sput-object p0, Lcom/whatsapp/RegisterName;->l:Lcom/whatsapp/s9;

    return-object p0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4
    .parameter
    .parameter

    .prologue
    .line 13
    invoke-static {p0}, Lcom/whatsapp/RegisterName;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    .line 50
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 127
    sget-object v2, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v3, 0xa

    aget-object v2, v2, v3

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 95
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v2, 0x21

    aget-object v0, v0, v2

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 25
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v2, 0xe

    aget-object v0, v0, v2

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 52
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v2, 0x20

    aget-object v0, v0, v2

    const v2, 0x7f0203d7

    invoke-static {p0, v2}, Landroid/content/Intent$ShortcutIconResource;->fromContext(Landroid/content/Context;I)Landroid/content/Intent$ShortcutIconResource;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 146
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v2, 0x22

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 105
    invoke-virtual {p0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 122
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 5
    .parameter
    .parameter
    .parameter

    .prologue
    .line 16
    if-nez p2, :cond_0

    .line 58
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1
    sget-object v1, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v2, 0xf

    aget-object v1, v1, v2

    sget-object v2, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 130
    const/high16 v1, 0x1000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 198
    const/high16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_1

    .line 179
    :cond_0
    invoke-static {p0}, Lcom/whatsapp/RegisterName;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    .line 215
    :cond_1
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 38
    :try_start_0
    sget-object v2, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v3, 0xa

    aget-object v2, v2, v3

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v0, v3}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    :goto_0
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v2, 0xe

    aget-object v0, v0, v2

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v2, 0xd

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 61
    invoke-virtual {p0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 231
    return-void

    .line 92
    :catch_0
    move-exception v0

    .line 196
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v4, 0xc

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 5
    .parameter
    .parameter

    .prologue
    const/4 v4, 0x1

    .line 165
    const/high16 v0, 0x3fc0

    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v1

    iget v1, v1, Lcom/whatsapp/j4;->L:F

    mul-float/2addr v0, v1

    .line 42
    iget-object v1, p0, Lcom/whatsapp/RegisterName;->o:Landroid/widget/ImageButton;

    new-instance v2, Lcom/whatsapp/p;

    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v2, v3, p1, v0, p2}, Lcom/whatsapp/p;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;FLjava/lang/CharSequence;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 73
    iget-object v0, p0, Lcom/whatsapp/RegisterName;->o:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    .line 186
    iget-object v0, p0, Lcom/whatsapp/RegisterName;->o:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V

    .line 6
    return-void
.end method

.method static a(Lcom/whatsapp/RegisterName;)V
    .locals 0
    .parameter

    .prologue
    .line 200
    invoke-direct {p0}, Lcom/whatsapp/RegisterName;->g()V

    return-void
.end method

.method static b(Lcom/whatsapp/RegisterName;)Lcom/whatsapp/zq;
    .locals 1
    .parameter

    .prologue
    .line 64
    iget-object v0, p0, Lcom/whatsapp/RegisterName;->n:Lcom/whatsapp/zq;

    return-object v0
.end method

.method static c(Lcom/whatsapp/RegisterName;)Landroid/widget/EditText;
    .locals 1
    .parameter

    .prologue
    .line 166
    iget-object v0, p0, Lcom/whatsapp/RegisterName;->q:Landroid/widget/EditText;

    return-object v0
.end method

.method private g()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 28
    const v0, 0x7f0d015a

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    .line 164
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 132
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 26
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v2, 0x11

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 148
    const v0, 0x7f090087

    invoke-static {p0, v0, v3}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/App;

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->a(Ljava/lang/String;)V

    .line 191
    invoke-static {v1}, Lcom/whatsapp/App;->h(Ljava/lang/String;)V

    .line 205
    invoke-static {p0, v3}, Lcom/whatsapp/App;->b(Landroid/content/Context;Z)V

    .line 7
    new-instance v0, Lcom/whatsapp/s9;

    iget-object v1, p0, Lcom/whatsapp/RegisterName;->r:Landroid/os/Handler;

    invoke-direct {v0, p0, v1}, Lcom/whatsapp/s9;-><init>(Lcom/whatsapp/RegisterName;Landroid/os/Handler;)V

    sput-object v0, Lcom/whatsapp/RegisterName;->l:Lcom/whatsapp/s9;

    .line 232
    invoke-static {}, Lcom/whatsapp/App;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 236
    invoke-virtual {p0, v3}, Lcom/whatsapp/RegisterName;->showDialog(I)V

    .line 10
    :cond_1
    const v0, 0x7f0d0168

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 163
    const/high16 v0, 0x7f09

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/whatsapp/RegisterName;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 111
    :cond_2
    return-void
.end method

.method private h()Ljava/lang/String;
    .locals 12

    .prologue
    const/16 v11, 0x2e

    const/16 v10, 0x20

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget-boolean v8, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 155
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_5

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/ContactsContract$Profile;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    sget-object v4, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v5, 0x1f

    aget-object v4, v4, v5

    aput-object v4, v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 228
    if-eqz v1, :cond_5

    .line 97
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 135
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 159
    :goto_0
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 56
    :goto_1
    if-nez v0, :cond_3

    .line 181
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v1}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v1

    .line 169
    if-eqz v1, :cond_3

    .line 24
    invoke-virtual {v1}, Landroid/accounts/AccountManager;->getAccounts()[Landroid/accounts/Account;

    move-result-object v2

    .line 204
    if-eqz v2, :cond_3

    .line 35
    array-length v3, v2

    move v1, v7

    :cond_0
    if-ge v1, v3, :cond_3

    aget-object v4, v2, v1

    .line 149
    iget-object v5, v4, Landroid/accounts/Account;->type:Ljava/lang/String;

    sget-object v6, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v9, 0x1d

    aget-object v6, v6, v9

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 55
    iget-object v0, v4, Landroid/accounts/Account;->name:Ljava/lang/String;

    const-string v5, "@"

    invoke-virtual {v0, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 125
    iget-object v0, v4, Landroid/accounts/Account;->name:Ljava/lang/String;

    iget-object v5, v4, Landroid/accounts/Account;->name:Ljava/lang/String;

    const-string v6, "@"

    invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v0, v7, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v11, v10}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    if-eqz v8, :cond_3

    .line 216
    :cond_1
    iget-object v0, v4, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {v0, v11, v10}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    .line 143
    if-eqz v8, :cond_3

    .line 100
    :cond_2
    add-int/lit8 v1, v1, 0x1

    if-eqz v8, :cond_0

    .line 51
    :cond_3
    return-object v0

    .line 239
    :catch_0
    move-exception v0

    .line 67
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v3, 0x1e

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    move-object v0, v6

    goto :goto_1

    .line 239
    :catch_1
    move-exception v1

    move-object v6, v0

    move-object v0, v1

    goto :goto_2

    :cond_4
    move-object v0, v6

    goto :goto_0

    :cond_5
    move-object v0, v6

    goto :goto_1
.end method

.method private i()V
    .locals 8

    .prologue
    const/4 v0, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 207
    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0a000e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 129
    const/high16 v2, 0x3fc0

    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v3

    iget v3, v3, Lcom/whatsapp/j4;->L:F

    mul-float/2addr v2, v3

    .line 93
    iget-object v3, p0, Lcom/whatsapp/RegisterName;->n:Lcom/whatsapp/zq;

    iget-object v3, v3, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v3}, Lcom/whatsapp/hz;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 242
    iget-object v2, p0, Lcom/whatsapp/RegisterName;->o:Landroid/widget/ImageButton;

    invoke-virtual {v2, v5}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 221
    iget-object v2, p0, Lcom/whatsapp/RegisterName;->p:Landroid/view/View;

    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 12
    iget-object v2, p0, Lcom/whatsapp/RegisterName;->s:Landroid/graphics/Bitmap;

    if-nez v2, :cond_0

    .line 106
    sget-object v2, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/RegisterName;->s:Landroid/graphics/Bitmap;

    .line 140
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/RegisterName;->s:Landroid/graphics/Bitmap;

    .line 203
    :goto_0
    invoke-direct {p0, v1, v0}, Lcom/whatsapp/RegisterName;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    .line 219
    return-void

    .line 43
    :cond_1
    iget-object v3, p0, Lcom/whatsapp/RegisterName;->o:Landroid/widget/ImageButton;

    invoke-virtual {v3, v6}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 70
    iget-object v3, p0, Lcom/whatsapp/RegisterName;->p:Landroid/view/View;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 75
    iget-object v3, p0, Lcom/whatsapp/RegisterName;->n:Lcom/whatsapp/zq;

    invoke-virtual {v3}, Lcom/whatsapp/zq;->h()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 89
    iget-object v0, p0, Lcom/whatsapp/RegisterName;->n:Lcom/whatsapp/zq;

    invoke-virtual {v0, v1, v2, v5}, Lcom/whatsapp/zq;->a(IFZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 99
    :cond_2
    if-nez v0, :cond_3

    .line 223
    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0203ba

    invoke-static {v0, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 121
    invoke-static {v0, v1, v1, v6}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 53
    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f090175

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v2, :cond_4

    .line 229
    :cond_3
    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f090176

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    goto :goto_0

    :cond_4
    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    goto :goto_0
.end method

.method static j()Lcom/whatsapp/s9;
    .locals 1

    .prologue
    .line 213
    sget-object v0, Lcom/whatsapp/RegisterName;->l:Lcom/whatsapp/s9;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 214
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1
    .parameter

    .prologue
    .line 194
    iget-object v0, p0, Lcom/whatsapp/RegisterName;->n:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 250
    invoke-direct {p0}, Lcom/whatsapp/RegisterName;->i()V

    .line 72
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 188
    return-void
.end method

.method protected e()V
    .locals 8

    .prologue
    const/16 v7, 0x19

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 218
    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 78
    sget-object v0, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_1

    .line 114
    :cond_0
    invoke-static {p0}, Lcom/whatsapp/App;->d(Landroid/content/Context;)Lcom/whatsapp/App$Me;

    move-result-object v0

    .line 240
    :cond_1
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v1}, Lcom/whatsapp/App;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/whatsapp/App$Me;->jabber_id:Ljava/lang/String;

    .line 139
    iget-object v1, v0, Lcom/whatsapp/App$Me;->jabber_id:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 170
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v1, 0x1a

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 141
    invoke-static {p0, v6}, Lcom/whatsapp/App;->a(Landroid/content/Context;I)V

    .line 248
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/RegisterPhone;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->startActivity(Landroid/content/Intent;)V

    .line 233
    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->finish()V

    .line 184
    :goto_0
    return-void

    .line 44
    :cond_2
    :try_start_0
    new-instance v1, Ljava/io/ObjectOutputStream;

    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v3, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v4, 0x17

    aget-object v3, v3, v4

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/whatsapp/App;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 22
    invoke-virtual {v1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 138
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 60
    sput-object v0, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    .line 108
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v1, 0x18

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 172
    sput-boolean v6, Lcom/whatsapp/eu;->h:Z

    .line 209
    sput-boolean v6, Lcom/whatsapp/eu;->j:Z

    .line 153
    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/App;->m(Landroid/content/Context;)V

    .line 76
    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/App;->n(Landroid/content/Context;)V

    .line 145
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v0}, Lcom/whatsapp/messaging/MessageService;->a(Landroid/content/Context;)V

    .line 160
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v0}, Lcom/whatsapp/qp;->b()Lcom/whatsapp/ar;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/RegisterName;->n:Lcom/whatsapp/zq;

    .line 176
    iget-object v0, p0, Lcom/whatsapp/RegisterName;->n:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-static {v0, v5, v1}, Lcom/whatsapp/App;->a(Ljava/lang/String;II)V

    .line 158
    invoke-direct {p0}, Lcom/whatsapp/RegisterName;->i()V

    .line 156
    iget-object v0, p0, Lcom/whatsapp/RegisterName;->p:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 119
    :catch_0
    move-exception v0

    .line 112
    sget-object v1, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    aget-object v1, v1, v7

    invoke-static {v1, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 157
    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->finish()V

    goto :goto_0

    .line 237
    :catch_1
    move-exception v0

    .line 195
    sget-object v1, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    aget-object v1, v1, v7

    invoke-static {v1, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 226
    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->finish()V

    goto :goto_0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 4
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v3, -0x1

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 246
    packed-switch p1, :pswitch_data_0

    .line 222
    :cond_0
    :goto_0
    return-void

    .line 79
    :pswitch_0
    if-ne p2, v3, :cond_0

    .line 247
    if-eqz p3, :cond_1

    sget-object v1, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v2, 0x16

    aget-object v1, v1, v2

    const/4 v2, 0x0

    invoke-virtual {p3, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 126
    iget-object v1, p0, Lcom/whatsapp/RegisterName;->n:Lcom/whatsapp/zq;

    invoke-static {v1, p0}, Lcom/whatsapp/iz;->b(Lcom/whatsapp/zq;Landroid/app/Activity;)V

    .line 167
    invoke-direct {p0}, Lcom/whatsapp/RegisterName;->i()V

    if-eqz v0, :cond_0

    .line 193
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/RegisterName;->n:Lcom/whatsapp/zq;

    const/16 v2, 0xd

    invoke-static {p3, v1, p0, v2, p0}, Lcom/whatsapp/iz;->a(Landroid/content/Intent;Lcom/whatsapp/zq;Landroid/app/Activity;ILcom/whatsapp/lr;)V

    if-eqz v0, :cond_0

    .line 88
    :pswitch_1
    invoke-static {}, Lcom/whatsapp/iz;->a()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 18
    if-ne p2, v3, :cond_2

    .line 34
    iget-object v1, p0, Lcom/whatsapp/RegisterName;->n:Lcom/whatsapp/zq;

    invoke-static {v1, p0}, Lcom/whatsapp/iz;->a(Lcom/whatsapp/zq;Landroid/app/Activity;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 249
    invoke-direct {p0}, Lcom/whatsapp/RegisterName;->i()V

    if-eqz v0, :cond_0

    .line 120
    :cond_2
    if-nez p2, :cond_0

    if-eqz p3, :cond_0

    .line 68
    invoke-static {p3, p0}, Lcom/whatsapp/iz;->a(Landroid/content/Intent;Lcom/whatsapp/lr;)V

    goto :goto_0

    .line 246
    nop

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 10
    .parameter

    .prologue
    const/4 v9, 0x3

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/16 v6, 0x8

    const/4 v5, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 46
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    aget-object v0, v0, v8

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 225
    invoke-super {p0, p1}, Lcom/whatsapp/VerifyMessageStoreActivity;->onCreate(Landroid/os/Bundle;)V

    .line 211
    const v0, 0x7f030052

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->setContentView(I)V

    .line 54
    invoke-static {p0}, Lcom/whatsapp/App;->c(Landroid/content/Context;)I

    move-result v0

    .line 116
    if-ne v0, v9, :cond_0

    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->getIntent()Landroid/content/Intent;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/4 v4, 0x7

    aget-object v3, v3, v4

    invoke-virtual {v2, v3, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    if-eq v0, v8, :cond_1

    .line 168
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 41
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/Main;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->startActivity(Landroid/content/Intent;)V

    .line 206
    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->finish()V

    .line 241
    :goto_0
    return-void

    .line 162
    :cond_1
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v0}, Lcom/whatsapp/App;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 104
    if-nez v0, :cond_2

    .line 230
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 40
    invoke-static {p0, v7}, Lcom/whatsapp/App;->a(Landroid/content/Context;I)V

    .line 3
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/RegisterPhone;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->startActivity(Landroid/content/Intent;)V

    .line 96
    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->finish()V

    goto :goto_0

    .line 27
    :cond_2
    const v0, 0x7f0d0164

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 82
    new-instance v2, Lcom/whatsapp/u1;

    invoke-direct {v2, p0}, Lcom/whatsapp/u1;-><init>(Lcom/whatsapp/RegisterName;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 107
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v2, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    aget-object v2, v2, v9

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 23
    const v0, 0x7f0d0166

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 183
    const v0, 0x7f0d0168

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 17
    const v0, 0x7f0d0090

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 94
    const v0, 0x7f0d0093

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    if-eqz v1, :cond_4

    .line 136
    :cond_3
    const v0, 0x7f0d0168

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    invoke-virtual {v0, v7}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 115
    const v0, 0x7f0d0166

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lcom/whatsapp/v1;

    invoke-direct {v2, p0}, Lcom/whatsapp/v1;-><init>(Lcom/whatsapp/RegisterName;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    :cond_4
    const v0, 0x7f0d0116

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/RegisterName;->o:Landroid/widget/ImageButton;

    .line 71
    iget-object v0, p0, Lcom/whatsapp/RegisterName;->o:Landroid/widget/ImageButton;

    new-instance v2, Lcom/whatsapp/w1;

    invoke-direct {v2, p0}, Lcom/whatsapp/w1;-><init>(Lcom/whatsapp/RegisterName;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    const v0, 0x7f0d00a6

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/RegisterName;->p:Landroid/view/View;

    .line 98
    invoke-direct {p0}, Lcom/whatsapp/RegisterName;->h()Ljava/lang/String;

    move-result-object v2

    .line 29
    if-eqz v2, :cond_5

    .line 187
    const v0, 0x7f0d015a

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 45
    :cond_5
    sget-object v0, Lcom/whatsapp/RegisterName;->l:Lcom/whatsapp/s9;

    if-eqz v0, :cond_6

    .line 5
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v0}, Lcom/whatsapp/qp;->b()Lcom/whatsapp/ar;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/RegisterName;->n:Lcom/whatsapp/zq;

    .line 189
    invoke-direct {p0}, Lcom/whatsapp/RegisterName;->i()V

    .line 202
    invoke-virtual {p0, v5}, Lcom/whatsapp/RegisterName;->showDialog(I)V

    if-eqz v1, :cond_a

    .line 117
    :cond_6
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v0}, Lcom/whatsapp/fq;->d()Z

    move-result v0

    if-nez v0, :cond_9

    .line 36
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    .line 212
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    aget-object v3, v3, v5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 178
    sget-object v2, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    aget-object v2, v2, v6

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    sget-object v2, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 49
    const/16 v0, 0x66

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->showDialog(I)V

    if-eqz v1, :cond_8

    .line 175
    :cond_7
    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->c()V

    .line 48
    :cond_8
    if-eqz v1, :cond_a

    .line 123
    :cond_9
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 102
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v0}, Lcom/whatsapp/fq;->a()V

    .line 235
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/tq;)V

    .line 59
    invoke-static {}, Lcom/whatsapp/App;->B()V

    .line 220
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->O()V

    .line 39
    invoke-virtual {p0}, Lcom/whatsapp/RegisterName;->e()V

    .line 9
    :cond_a
    const v0, 0x7f0d015a

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/whatsapp/RegisterName;->q:Landroid/widget/EditText;

    .line 154
    iget-object v0, p0, Lcom/whatsapp/RegisterName;->q:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/whatsapp/RegisterName;->q:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/TextEmojiLabel;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setGravity(I)V

    .line 173
    iget-object v0, p0, Lcom/whatsapp/RegisterName;->q:Landroid/widget/EditText;

    new-instance v1, Lcom/whatsapp/x1;

    invoke-direct {v1, p0}, Lcom/whatsapp/x1;-><init>(Lcom/whatsapp/RegisterName;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 210
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->I()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 74
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    aget-object v0, v0, v7

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 245
    const/16 v0, 0x71

    invoke-static {p0, v0}, Lcom/whatsapp/Conversations;->a(Landroid/app/Activity;I)V

    .line 171
    :cond_b
    invoke-static {p0, v8}, Lcom/whatsapp/App;->a(Landroid/content/Context;I)V

    .line 30
    invoke-static {p0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/uk;)V

    goto/16 :goto_0
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 5
    .parameter

    .prologue
    const/4 v2, 0x1

    const/4 v4, 0x0

    .line 86
    sparse-switch p1, :sswitch_data_0

    .line 133
    invoke-super {p0, p1}, Lcom/whatsapp/VerifyMessageStoreActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    .line 190
    :goto_0
    return-object v0

    .line 180
    :sswitch_0
    new-instance v0, Lcom/whatsapp/f;

    invoke-direct {v0, p0}, Lcom/whatsapp/f;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/whatsapp/RegisterName;->m:Lcom/whatsapp/f;

    .line 118
    sget-object v0, Lcom/whatsapp/RegisterName;->m:Lcom/whatsapp/f;

    const v1, 0x7f090089

    invoke-virtual {p0, v1}, Lcom/whatsapp/RegisterName;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/f;->setTitle(Ljava/lang/CharSequence;)V

    .line 20
    sget-object v0, Lcom/whatsapp/RegisterName;->m:Lcom/whatsapp/f;

    const v1, 0x7f09008a

    invoke-virtual {p0, v1}, Lcom/whatsapp/RegisterName;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/f;->setMessage(Ljava/lang/CharSequence;)V

    .line 244
    sget-object v0, Lcom/whatsapp/RegisterName;->m:Lcom/whatsapp/f;

    invoke-virtual {v0, v2}, Lcom/whatsapp/f;->setIndeterminate(Z)V

    .line 91
    sget-object v0, Lcom/whatsapp/RegisterName;->m:Lcom/whatsapp/f;

    invoke-virtual {v0, v4}, Lcom/whatsapp/f;->setCancelable(Z)V

    .line 190
    sget-object v0, Lcom/whatsapp/RegisterName;->m:Lcom/whatsapp/f;

    goto :goto_0

    .line 81
    :sswitch_1
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v1, 0x13

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 19
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f090046

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f090049

    new-array v2, v2, [Ljava/lang/Object;

    const v3, 0x7f090048

    invoke-virtual {p0, v3}, Lcom/whatsapp/RegisterName;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/whatsapp/RegisterName;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09004b

    new-instance v2, Lcom/whatsapp/y1;

    invoke-direct {v2, p0}, Lcom/whatsapp/y1;-><init>(Lcom/whatsapp/RegisterName;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 243
    :sswitch_2
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v1, 0x12

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 8
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f09004e

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09004c

    new-instance v2, Lcom/whatsapp/a2;

    invoke-direct {v2, p0}, Lcom/whatsapp/a2;-><init>(Lcom/whatsapp/RegisterName;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09000c

    new-instance v2, Lcom/whatsapp/z1;

    invoke-direct {v2, p0}, Lcom/whatsapp/z1;-><init>(Lcom/whatsapp/RegisterName;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 150
    :sswitch_3
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v1, 0x14

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 21
    invoke-static {p0}, Lcom/whatsapp/Conversations;->a(Landroid/app/Activity;)Landroid/app/Dialog;

    move-result-object v0

    goto/16 :goto_0

    .line 86
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x6d -> :sswitch_2
        0x71 -> :sswitch_3
    .end sparse-switch
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 185
    const v0, 0x7f090050

    invoke-interface {p1, v1, v1, v1, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    .line 192
    const v1, 0x7f0203c6

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 85
    const/4 v0, 0x1

    return v0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 177
    invoke-super {p0}, Lcom/whatsapp/VerifyMessageStoreActivity;->onDestroy()V

    .line 137
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v1, 0x23

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 37
    invoke-static {p0}, Lcom/whatsapp/App;->b(Lcom/whatsapp/uk;)V

    .line 217
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2
    .parameter

    .prologue
    .line 234
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 66
    const/4 v0, 0x0

    .line 161
    :goto_0
    return v0

    .line 128
    :pswitch_0
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v1, 0x15

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->d(Ljava/lang/String;)V

    .line 161
    const/4 v0, 0x1

    goto :goto_0

    .line 234
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 32
    invoke-super {p0}, Lcom/whatsapp/VerifyMessageStoreActivity;->onPause()V

    .line 199
    sget-object v0, Lcom/whatsapp/RegisterName;->l:Lcom/whatsapp/s9;

    if-eqz v0, :cond_0

    .line 142
    sget-object v0, Lcom/whatsapp/RegisterName;->l:Lcom/whatsapp/s9;

    invoke-virtual {v0}, Lcom/whatsapp/s9;->a()V

    .line 238
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 208
    sget-object v0, Lcom/whatsapp/RegisterName;->z:[Ljava/lang/String;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 224
    invoke-super {p0}, Lcom/whatsapp/VerifyMessageStoreActivity;->onResume()V

    .line 90
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/RegisterName;->k:Z

    .line 87
    sget-object v0, Lcom/whatsapp/RegisterName;->l:Lcom/whatsapp/s9;

    if-eqz v0, :cond_1

    .line 84
    sget-object v0, Lcom/whatsapp/RegisterName;->m:Lcom/whatsapp/f;

    if-nez v0, :cond_0

    .line 147
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterName;->showDialog(I)V

    .line 77
    :cond_0
    sget-object v0, Lcom/whatsapp/RegisterName;->l:Lcom/whatsapp/s9;

    iget-object v1, p0, Lcom/whatsapp/RegisterName;->r:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lcom/whatsapp/s9;->a(Landroid/os/Handler;)V

    .line 227
    :cond_1
    return-void
.end method
