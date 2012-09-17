.class Lcom/whatsapp/r;
.super Landroid/os/AsyncTask;
.source "r.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field private a:I

.field private b:Lcom/whatsapp/zq;

.field final c:Z

.field final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "\u0018bj?E\u001dnv6\u0004\u001b+h<\u0011\u0006mo0\u0004\u001bbi=IOli\'E\u001bcs>\u0007"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v2, v1

    move-object v1, v0

    :goto_0
    if-gt v2, v3, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/r;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x65

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x6f

    goto :goto_1

    :pswitch_1
    const/16 v0, 0xb

    goto :goto_1

    :pswitch_2
    const/4 v0, 0x6

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x53

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public constructor <init>(Lcom/whatsapp/zq;IZZ)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whatsapp/zq;",
            "I)V"
        }
    .end annotation

    .prologue
    .line 8
    iput-boolean p3, p0, Lcom/whatsapp/r;->c:Z

    iput-boolean p4, p0, Lcom/whatsapp/r;->d:Z

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whatsapp/r;->b:Lcom/whatsapp/zq;

    .line 3
    iput p2, p0, Lcom/whatsapp/r;->a:I

    .line 6
    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Landroid/graphics/Bitmap;
    .locals 4
    .parameter

    .prologue
    .line 12
    iget-object v0, p0, Lcom/whatsapp/r;->b:Lcom/whatsapp/zq;

    iget v1, p0, Lcom/whatsapp/r;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/whatsapp/zq;->a(IFZ)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected a(Landroid/graphics/Bitmap;)V
    .locals 3
    .parameter

    .prologue
    .line 5
    if-eqz p1, :cond_0

    .line 7
    sget-object v0, Lcom/whatsapp/App;->xb:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/whatsapp/r;->b:Lcom/whatsapp/zq;

    invoke-virtual {v1}, Lcom/whatsapp/zq;->f()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/ref/SoftReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    sget-object v0, Lcom/whatsapp/r;->z:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 11
    :cond_0
    const/4 v0, 0x1

    iget-boolean v1, p0, Lcom/whatsapp/r;->c:Z

    iget-boolean v2, p0, Lcom/whatsapp/r;->d:Z

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(ZZZ)V

    .line 1
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 10
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/r;->a([Ljava/lang/Void;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 9
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/whatsapp/r;->a(Landroid/graphics/Bitmap;)V

    return-void
.end method
