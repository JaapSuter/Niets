.class Lcom/whatsapp/l;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "l.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field private a:Landroid/database/sqlite/SQLiteDatabase;

.field public b:Lcom/whatsapp/rq;

.field private c:I

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v1, 0x78

    const/16 v3, 0x5a

    const/16 v2, 0x2e

    const/16 v4, 0x12

    const/4 v6, 0x0

    const/16 v0, 0x1a

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "^\u000cAz"

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

    const-string v0, "\u0013\u000bI)f\u0011\nKug\u000e\u001f\\;v\u001bXX?`\r\u0011A42"

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

    const-string v0, "\u0013\u000bI)f\u0011\nKuq\u000c\u001dO.w^"

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

    const-string v0, ":*a\n2*9l\u0016W^1hzW&1}\u000eA^\u0015K)a\u001f\u001fK)"

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

    const-string v0, "76}\u001f@*Xg\u0014F1XC?a\r\u0019I?aV\'G>>^\u0013K#M\u000c\u001dC5f\u001b\'D3vRXE?k!\u001e\\5\u007f!\u0015Kv2\u0015\u001dW\u0005{\u001aT\u000e)f\u001f\u000c[)>^\u0016K?v\r\'^/a\u0016T\u000e>s\n\u0019\u0002zf\u0017\u0015K)f\u001f\u0015^v2\u0013\u001dJ3s!\r\\6>^\u0015K>{\u001f\'C3\u007f\u001b\'Z#b\u001bT\u000e7w\u001a\u0011O\u0005e\u001f\'Z#b\u001bT\u000e7w\u001a\u0011O\u0005a\u0017\u0002Kv2\u0013\u001dJ3s!\u0016O7wRXC?v\u0017\u0019q2s\r\u0010\u0002z~\u001f\u000cG.g\u001a\u001d\u0002z~\u0011\u0016I3f\u000b\u001cKv2\n\u0010[7p!\u0011C;u\u001bT\u000e(w\u001d\u001dG,w\u001a\'Z3\u007f\u001b\u000bZ;\u007f\u000eT\u000e)w\u0010\u001cq.{\u0013\u001d].s\u0013\u0008\u0002z`\u001b\u001bK3b\n\']?`\u0008\u001d\\\u0005f\u0017\u0015K)f\u001f\u0015^v2\u000c\u001dM?{\u000e\u000cq>w\u0008\u0011M?M\n\u0011C?a\n\u0019C*;^.o\u0016G;+\u000er#RX\tw#YT\u000ej>^_\u0003k5RX\u0003k>^H\u0002z\\+4bv2NT\u000e\u0014G24\u0002z\\+4bv2SI\u0002z?OT\u000e\u0014G24\u0002z\\+4bv2NT\u000ej>^6{\u0016^RX\u0003k>^U\u001fv2SI\u0002z?OQ"

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

    const-string v0, ":*a\n2*9l\u0016W^1hzW&1}\u000eA^\u001bF;f!\u0014G)f"

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

    const-string v0, "=*k\u001bF;X{\u0014[/-kz[0<k\u00022\u0013\u001d])s\u0019\u001d]\u0005y\u001b\u0001q3|\u001a\u001dVz}\u0010XC?a\r\u0019I?a^PE?k!\nK7}\n\u001dq0{\u001aT\u000e1w\u0007\'H(}\u0013\'C?>^\u0013K#M\u0017\u001c\u0007"

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

    const-string v0, "=*k\u001bF;Xz\u001bP2=\u000e9z\u001f\u000cq6{\r\u000c\u000erM\u0017\u001c\u000e\u0013\\*=i\u001f@^(|\u0013_?*wzY;!\u000e\u001bG*7g\u0014Q,=c\u001f\\*T\u000e1w\u0007\'\\?\u007f\u0011\u000cK\u0005x\u0017\u001c\u000e\u000eW&,\u000e\u000f\\7){\u001f>^\u0015K)a\u001f\u001fK\u0005f\u001f\u001aB?M\u0017\u001c\u000e\u0013\\*=i\u001f@W"

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

    const-string v0, "=*k\u001bF;Xz\u001bP2=\u000e7w\r\u000bO=w\rX\u0006\u0005{\u001aXg\u0014F;?k\u00082.*g\u0017S,!\u000e\u0011W\'Xo\u000fF11`\u0019@;5k\u0014FRXE?k!\nK7}\n\u001dq0{\u001aXz\u001fJ*X`\u0015F^6{\u0016^RXE?k!\u001e\\5\u007f!\u0015Kz[0,k\u001dW,T\u000e1w\u0007\'G>2*=v\u000e207zz\\+4bv2\r\u000cO.g\rXg\u0014F;?k\u0008>^\u0016K?v\r\'^/a\u0016Xg\u0014F;?k\u0008>^\u001cO.s^,k\u0002FRXZ3\u007f\u001b\u000bZ;\u007f\u000eXg\u0014F;?k\u0008>^\u0015K>{\u001f\'[(~^,k\u0002FRXC?v\u0017\u0019q7{\u0013\u001dq.k\u000e\u001d\u000e\u000eW&,\u0002z\u007f\u001b\u001cG;M\t\u0019q.k\u000e\u001d\u000e\u000eW&,\u0002z\u007f\u001b\u001cG;M\r\u0011T?276z\u001fU;*\u0002z\u007f\u001b\u001cG;M\u0010\u0019C?2*=v\u000e>^\u0015K>{\u001f\'F;a\u0016Xz\u001fJ*T\u000e6s\n\u0011Z/v\u001bX|\u001fS2T\u000e6}\u0010\u001fG.g\u001a\u001d\u000e\u0008W?4\u0002zf\u0016\rC8M\u0017\u0015O=w^,k\u0002FRX\\?\u007f\u0011\u000cK\u0005`\u001b\u000bA/`\u001d\u001d\u000e\u000eW&,\u0002z`\u001b\u001bK3d\u001b\u001cq.{\u0013\u001d].s\u0013\u0008\u000e\u0013\\*=i\u001f@RX]?|\u001a\'Z3\u007f\u001b\u000bZ;\u007f\u000eXg\u0014F;?k\u0008>^\nK9w\u0017\u0008Z\u0005a\u001b\nX?`!\u000cG7w\r\u000cO7b^1`\u000eW9=|v2\u000c\u001dM?{\u000e\u000cq>w\u0008\u0011M?M\n\u0011C?a\n\u0019C*276z\u001fU;*\u0002z`\u001f\u000fq>s\n\u0019\u000e\u0018^1:\u0007"

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

    const-string v0, "\u0013\u000bI)f\u0011\nKuu\u001b\u000cY({\n\u0019L6w\u001a\u001a\u00015|\u0011\u0008K4"

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

    const-string v0, "\u0013\u000bI)f\u0011\nKuu\u001b\u000cY({\n\u0019L6w\u001a\u001a\u000e3a^\nK;v^\u0017@6k"

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

    const-string v0, "\u0013\u001dJ3s!\u0010O)z^,k\u0002F"

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

    const-string v0, "\u0013\u000bI)f\u0011\nKus\u0012\u000cK(M\n\u0019L6w!\u0019J>M\u000c\u0019Y\u0005v\u001f\u000cO"

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

    const-string v0, "\u000c\u0019Y\u0005v\u001f\u000cOzP27l"

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

    const-string v0, "\u0013\u000bI)f\u0011\nKuu\u001b\u000cY({\n\u0019L6w\u001a\u001a\u0001?j\u0017\u000bZ)"

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

    const-string v0, "\u0013\u000bI)f\u0011\nKuu\u001b\u000cY({\n\u0019L6w\u001a\u001a\u00016{\r\u000c\u000e"

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

    const-string v0, "\r\u001dB?q\nX]+~^\u001e\\5\u007f^\u000b_6{\n\u001dq7s\r\u000cK(2\t\u0010K(w^\u000cW*wC_Z;p\u0012\u001d\tzs\u0010\u001c\u000e4s\u0013\u001d\u0013}\u007f\u001b\u000b];u\u001b\u000b\ta"

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

    const-string v0, "?4z\u001f@^,o\u0018^;XC?a\r\u0019I?a^9j\u001e2\u0013\u001dJ3s!\u0010O)z^,k\u0002F^"

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

    const-string v0, "\u0013\u000bI)f\u0011\nKus\u0012\u000cK(M\n\u0019L6w!\u0019J>M\u0013\u001dJ3s!\u0010O)z"

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

    aput-object v0, v9, v4

    const/16 v10, 0x13

    const-string v0, "\u0013\u000bI)f\u0011\nKuu\u001b\u000cY({\n\u0019L6w\u001a\u001a\u00017w\r\u000bO=w\rX]9z\u001b\u0015O"

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

    const-string v0, "\u0013\u000bI)f\u0011\nKuu\u001b\u000cY({\n\u0019L6w\u001a\u001a\u0001>}\u0010\u001d\u00016{\r\u000c\u000e"

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

    const-string v0, "?4z\u001f@^,o\u0018^;XC?a\r\u0019I?a^9j\u001e2\u000c\u0019Y\u0005v\u001f\u000cOzP27lz"

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

    const-string v0, "\u0013\u000bI)f\u0011\nKuu\u001b\u000cY({\n\u0019L6w\u001a\u001a\u000e>}\u001b\u000b@}f^\u001dV3a\n"

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

    const-string v0, "\u0013\u000bI)f\u0011\nKtv\u001c"

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

    const-string v0, ".*o\u001d_?XM5g\u0010\u000cq9z\u001f\u0016I?aC7h\u001c)"

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

    const/16 v8, 0x19

    const-string v0, ".*o\u001d_?X]#|\u001d\u0010\\5|\u0011\r]g\\1*c\u001b^E"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_19
    if-gt v6, v7, :cond_19

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_1a
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    const/16 v0, 0x7e

    goto :goto_1a

    :pswitch_1
    move v0, v1

    goto :goto_1a

    :pswitch_2
    move v0, v2

    goto :goto_1a

    :pswitch_3
    move v0, v3

    goto :goto_1a

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_1b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    const/16 v0, 0x7e

    goto :goto_1b

    :pswitch_5
    move v0, v1

    goto :goto_1b

    :pswitch_6
    move v0, v2

    goto :goto_1b

    :pswitch_7
    move v0, v3

    goto :goto_1b

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_1c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    const/16 v0, 0x7e

    goto :goto_1c

    :pswitch_9
    move v0, v1

    goto :goto_1c

    :pswitch_a
    move v0, v2

    goto :goto_1c

    :pswitch_b
    move v0, v3

    goto :goto_1c

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_1d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    const/16 v0, 0x7e

    goto :goto_1d

    :pswitch_d
    move v0, v1

    goto :goto_1d

    :pswitch_e
    move v0, v2

    goto :goto_1d

    :pswitch_f
    move v0, v3

    goto :goto_1d

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_1e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    const/16 v0, 0x7e

    goto :goto_1e

    :pswitch_11
    move v0, v1

    goto :goto_1e

    :pswitch_12
    move v0, v2

    goto :goto_1e

    :pswitch_13
    move v0, v3

    goto :goto_1e

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_1f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    const/16 v0, 0x7e

    goto :goto_1f

    :pswitch_15
    move v0, v1

    goto :goto_1f

    :pswitch_16
    move v0, v2

    goto :goto_1f

    :pswitch_17
    move v0, v3

    goto :goto_1f

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_20
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    const/16 v0, 0x7e

    goto :goto_20

    :pswitch_19
    move v0, v1

    goto :goto_20

    :pswitch_1a
    move v0, v2

    goto :goto_20

    :pswitch_1b
    move v0, v3

    goto :goto_20

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_21
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    const/16 v0, 0x7e

    goto :goto_21

    :pswitch_1d
    move v0, v1

    goto :goto_21

    :pswitch_1e
    move v0, v2

    goto :goto_21

    :pswitch_1f
    move v0, v3

    goto :goto_21

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_22
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    const/16 v0, 0x7e

    goto :goto_22

    :pswitch_21
    move v0, v1

    goto :goto_22

    :pswitch_22
    move v0, v2

    goto :goto_22

    :pswitch_23
    move v0, v3

    goto :goto_22

    :cond_9
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_23
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_9

    :pswitch_24
    const/16 v0, 0x7e

    goto :goto_23

    :pswitch_25
    move v0, v1

    goto :goto_23

    :pswitch_26
    move v0, v2

    goto :goto_23

    :pswitch_27
    move v0, v3

    goto :goto_23

    :cond_a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_24
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_a

    :pswitch_28
    const/16 v0, 0x7e

    goto :goto_24

    :pswitch_29
    move v0, v1

    goto :goto_24

    :pswitch_2a
    move v0, v2

    goto :goto_24

    :pswitch_2b
    move v0, v3

    goto :goto_24

    :cond_b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_25
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_b

    :pswitch_2c
    const/16 v0, 0x7e

    goto :goto_25

    :pswitch_2d
    move v0, v1

    goto :goto_25

    :pswitch_2e
    move v0, v2

    goto :goto_25

    :pswitch_2f
    move v0, v3

    goto :goto_25

    :cond_c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_26
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_c

    :pswitch_30
    const/16 v0, 0x7e

    goto :goto_26

    :pswitch_31
    move v0, v1

    goto :goto_26

    :pswitch_32
    move v0, v2

    goto :goto_26

    :pswitch_33
    move v0, v3

    goto :goto_26

    :cond_d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_d

    move v0, v4

    :goto_27
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_d

    :pswitch_34
    const/16 v0, 0x7e

    goto :goto_27

    :pswitch_35
    move v0, v1

    goto :goto_27

    :pswitch_36
    move v0, v2

    goto :goto_27

    :pswitch_37
    move v0, v3

    goto :goto_27

    :cond_e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_e

    move v0, v4

    :goto_28
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_e

    :pswitch_38
    const/16 v0, 0x7e

    goto :goto_28

    :pswitch_39
    move v0, v1

    goto :goto_28

    :pswitch_3a
    move v0, v2

    goto :goto_28

    :pswitch_3b
    move v0, v3

    goto :goto_28

    :cond_f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_f

    move v0, v4

    :goto_29
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_f

    :pswitch_3c
    const/16 v0, 0x7e

    goto :goto_29

    :pswitch_3d
    move v0, v1

    goto :goto_29

    :pswitch_3e
    move v0, v2

    goto :goto_29

    :pswitch_3f
    move v0, v3

    goto :goto_29

    :cond_10
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_10

    move v0, v4

    :goto_2a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_10

    :pswitch_40
    const/16 v0, 0x7e

    goto :goto_2a

    :pswitch_41
    move v0, v1

    goto :goto_2a

    :pswitch_42
    move v0, v2

    goto :goto_2a

    :pswitch_43
    move v0, v3

    goto :goto_2a

    :cond_11
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_11

    move v0, v4

    :goto_2b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_11

    :pswitch_44
    const/16 v0, 0x7e

    goto :goto_2b

    :pswitch_45
    move v0, v1

    goto :goto_2b

    :pswitch_46
    move v0, v2

    goto :goto_2b

    :pswitch_47
    move v0, v3

    goto :goto_2b

    :cond_12
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_12

    move v0, v4

    :goto_2c
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_12

    :pswitch_48
    const/16 v0, 0x7e

    goto :goto_2c

    :pswitch_49
    move v0, v1

    goto :goto_2c

    :pswitch_4a
    move v0, v2

    goto :goto_2c

    :pswitch_4b
    move v0, v3

    goto :goto_2c

    :cond_13
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_13

    move v0, v4

    :goto_2d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_13

    :pswitch_4c
    const/16 v0, 0x7e

    goto :goto_2d

    :pswitch_4d
    move v0, v1

    goto :goto_2d

    :pswitch_4e
    move v0, v2

    goto :goto_2d

    :pswitch_4f
    move v0, v3

    goto :goto_2d

    :cond_14
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_14

    move v0, v4

    :goto_2e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_14

    :pswitch_50
    const/16 v0, 0x7e

    goto :goto_2e

    :pswitch_51
    move v0, v1

    goto :goto_2e

    :pswitch_52
    move v0, v2

    goto :goto_2e

    :pswitch_53
    move v0, v3

    goto :goto_2e

    :cond_15
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_15

    move v0, v4

    :goto_2f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_15

    :pswitch_54
    const/16 v0, 0x7e

    goto :goto_2f

    :pswitch_55
    move v0, v1

    goto :goto_2f

    :pswitch_56
    move v0, v2

    goto :goto_2f

    :pswitch_57
    move v0, v3

    goto :goto_2f

    :cond_16
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_16

    move v0, v4

    :goto_30
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_16

    :pswitch_58
    const/16 v0, 0x7e

    goto :goto_30

    :pswitch_59
    move v0, v1

    goto :goto_30

    :pswitch_5a
    move v0, v2

    goto :goto_30

    :pswitch_5b
    move v0, v3

    goto :goto_30

    :cond_17
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_17

    move v0, v4

    :goto_31
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_17

    :pswitch_5c
    const/16 v0, 0x7e

    goto :goto_31

    :pswitch_5d
    move v0, v1

    goto :goto_31

    :pswitch_5e
    move v0, v2

    goto :goto_31

    :pswitch_5f
    move v0, v3

    goto :goto_31

    :cond_18
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_18

    move v0, v4

    :goto_32
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_18

    :pswitch_60
    const/16 v0, 0x7e

    goto :goto_32

    :pswitch_61
    move v0, v1

    goto :goto_32

    :pswitch_62
    move v0, v2

    goto :goto_32

    :pswitch_63
    move v0, v3

    goto :goto_32

    :cond_19
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_19

    move v0, v4

    :goto_33
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_19

    :pswitch_64
    const/16 v0, 0x7e

    goto :goto_33

    :pswitch_65
    move v0, v1

    goto :goto_33

    :pswitch_66
    move v0, v2

    goto :goto_33

    :pswitch_67
    move v0, v3

    goto :goto_33

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
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 69
    sget-object v0, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v1, 0x17

    aget-object v0, v0, v1

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v3, v1}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 53
    iput-object v3, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 49
    iput v2, p0, Lcom/whatsapp/l;->c:I

    .line 63
    iput v2, p0, Lcom/whatsapp/l;->d:I

    .line 39
    return-void
.end method

.method static a(Lcom/whatsapp/l;I)I
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 66
    iput p1, p0, Lcom/whatsapp/l;->c:I

    return p1
.end method

.method public static a(ILjava/lang/Object;Landroid/database/sqlite/SQLiteStatement;)V
    .locals 2
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 58
    if-nez p1, :cond_0

    .line 4
    invoke-virtual {p2, p0}, Landroid/database/sqlite/SQLiteStatement;->bindNull(I)V

    sget v0, Lcom/whatsapp/yq;->e:I

    if-eqz v0, :cond_1

    .line 16
    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 50
    new-instance v1, Ljava/io/ObjectOutputStream;

    invoke-direct {v1, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 11
    invoke-virtual {v1, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 38
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 25
    invoke-virtual {p2, p0, v0}, Landroid/database/sqlite/SQLiteStatement;->bindBlob(I[B)V

    .line 65
    :cond_1
    return-void
.end method

.method public static a(ILjava/lang/String;Landroid/database/sqlite/SQLiteStatement;)V
    .locals 1
    .parameter
    .parameter
    .parameter

    .prologue
    .line 17
    if-nez p1, :cond_0

    .line 18
    invoke-virtual {p2, p0}, Landroid/database/sqlite/SQLiteStatement;->bindNull(I)V

    sget v0, Lcom/whatsapp/yq;->e:I

    if-eqz v0, :cond_1

    .line 79
    :cond_0
    invoke-virtual {p2, p0, p1}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 64
    :cond_1
    return-void
.end method

.method public static a(I[BLandroid/database/sqlite/SQLiteStatement;)V
    .locals 1
    .parameter
    .parameter
    .parameter

    .prologue
    .line 31
    if-nez p1, :cond_0

    .line 94
    invoke-virtual {p2, p0}, Landroid/database/sqlite/SQLiteStatement;->bindNull(I)V

    sget v0, Lcom/whatsapp/yq;->e:I

    if-eqz v0, :cond_1

    .line 74
    :cond_0
    invoke-virtual {p2, p0, p1}, Landroid/database/sqlite/SQLiteStatement;->bindBlob(I[B)V

    .line 22
    :cond_1
    return-void
.end method

.method static b(Lcom/whatsapp/l;I)I
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 71
    iput p1, p0, Lcom/whatsapp/l;->d:I

    return p1
.end method


# virtual methods
.method public a(Lcom/whatsapp/rq;)V
    .locals 0
    .parameter

    .prologue
    .line 47
    iput-object p1, p0, Lcom/whatsapp/l;->b:Lcom/whatsapp/rq;

    .line 75
    return-void
.end method

.method public declared-synchronized close()V
    .locals 1

    .prologue
    .line 70
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 86
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    monitor-exit p0

    return-void

    .line 70
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    .prologue
    .line 45
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/whatsapp/l;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    .locals 6

    .prologue
    .line 89
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 92
    :goto_0
    monitor-exit p0

    return-object v0

    .line 35
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/whatsapp/fq;->I()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/fq;->c(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1
    sget-object v0, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v1, 0x16

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 9
    :try_start_2
    invoke-static {}, Lcom/whatsapp/fq;->I()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 37
    invoke-static {}, Lcom/whatsapp/fq;->I()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 10
    :cond_1
    invoke-static {}, Lcom/whatsapp/fq;->I()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 27
    invoke-static {}, Lcom/whatsapp/fq;->I()Ljava/io/File;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v2, 0xf

    aget-object v1, v1, v2

    invoke-static {v0, v1}, Lcom/whatsapp/fq;->b(Ljava/io/File;Ljava/lang/String;)V

    .line 51
    invoke-static {}, Lcom/whatsapp/fq;->I()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x10000010

    invoke-static {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->openDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 21
    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 62
    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p0, v0}, Lcom/whatsapp/l;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 5
    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 90
    :try_start_3
    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 55
    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 77
    :cond_2
    invoke-static {}, Lcom/whatsapp/fq;->I()Ljava/io/File;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v2, 0x14

    aget-object v1, v1, v2

    invoke-static {v0, v1}, Lcom/whatsapp/fq;->b(Ljava/io/File;Ljava/lang/String;)V

    .line 87
    sget v0, Lcom/whatsapp/yq;->e:I

    if-eqz v0, :cond_7

    .line 73
    :cond_3
    sget-object v0, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 20
    invoke-static {}, Lcom/whatsapp/fq;->I()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x10

    invoke-static {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->openDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 26
    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isReadOnly()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 56
    sget-object v0, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 13
    :cond_4
    const-string v1, ""

    .line 91
    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    sget-object v2, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v3, 0x10

    aget-object v2, v2, v3

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-object v2

    .line 28
    if-eqz v2, :cond_5

    .line 60
    :try_start_4
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 57
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move-result-object v0

    .line 83
    :goto_1
    :try_start_5
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    move-object v1, v0

    .line 96
    :cond_5
    :goto_2
    sget-object v0, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v2, 0xd

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result v0

    if-nez v0, :cond_6

    .line 33
    :try_start_6
    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    sget-object v2, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v3, 0x15

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_1

    .line 24
    :cond_6
    :goto_3
    :try_start_7
    sget-object v0, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v2, 0xb

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    move-result v0

    if-nez v0, :cond_7

    .line 88
    :try_start_8
    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    sget-object v1, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v2, 0x11

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_2

    .line 6
    :cond_7
    :goto_4
    :try_start_9
    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    if-eqz v0, :cond_8

    .line 54
    :try_start_a
    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p0, v0}, Lcom/whatsapp/l;->onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_3

    .line 92
    :cond_8
    :goto_5
    :try_start_b
    iget-object v0, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    goto/16 :goto_0

    .line 59
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 67
    iget-object v1, p0, Lcom/whatsapp/l;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 87
    :cond_9
    invoke-static {}, Lcom/whatsapp/fq;->I()Ljava/io/File;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v3, 0x14

    aget-object v2, v2, v3

    invoke-static {v1, v2}, Lcom/whatsapp/fq;->b(Ljava/io/File;Ljava/lang/String;)V

    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 89
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    .line 76
    :catch_0
    move-exception v0

    .line 43
    :try_start_c
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v5, 0x13

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 61
    :try_start_d
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_2

    .line 68
    :catchall_2
    move-exception v0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v0

    .line 36
    :catch_1
    move-exception v0

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v4, 0xc

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto/16 :goto_3

    .line 44
    :catch_2
    move-exception v0

    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v3, 0x12

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto/16 :goto_4

    .line 81
    :catch_3
    move-exception v0

    .line 48
    sget-object v1, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-static {v1, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    goto/16 :goto_5

    :cond_a
    move-object v0, v1

    goto/16 :goto_1
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2
    .parameter

    .prologue
    .line 14
    sget-object v0, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 98
    sget-object v0, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 19
    sget-object v0, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    .line 84
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 46
    sget-object v0, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 95
    sget-object v0, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 97
    sget-object v0, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 85
    sget-object v0, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    .line 93
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 41
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->setVersion(I)V

    .line 15
    return-void
.end method

.method public onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2
    .parameter

    .prologue
    .line 42
    sget-object v0, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v1, 0x19

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 78
    sget-object v0, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/16 v1, 0x18

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 29
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 3
    .parameter
    .parameter
    .parameter

    .prologue
    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/l;->z:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p0, p1}, Lcom/whatsapp/l;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 2
    return-void
.end method
