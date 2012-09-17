.class Lcom/whatsapp/jn;
.super Ljava/lang/Object;
.source "jn.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:[I

.field final b:Ljava/lang/String;

.field final c:I

.field final d:Lcom/whatsapp/Conversation;


# direct methods
.method constructor <init>(Lcom/whatsapp/Conversation;[ILjava/lang/String;I)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/jn;->d:Lcom/whatsapp/Conversation;

    iput-object p2, p0, Lcom/whatsapp/jn;->a:[I

    iput-object p3, p0, Lcom/whatsapp/jn;->b:Ljava/lang/String;

    iput p4, p0, Lcom/whatsapp/jn;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4
    .parameter
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/jn;->d:Lcom/whatsapp/Conversation;

    iget-object v1, p0, Lcom/whatsapp/jn;->a:[I

    aget v1, v1, p2

    iget-object v2, p0, Lcom/whatsapp/jn;->b:Ljava/lang/String;

    iget v3, p0, Lcom/whatsapp/jn;->c:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/whatsapp/Conversation;->a(ILjava/lang/String;I)Z

    .line 2
    return-void
.end method
