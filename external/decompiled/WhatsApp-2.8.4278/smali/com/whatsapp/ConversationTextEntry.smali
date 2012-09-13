.class public Lcom/whatsapp/ConversationTextEntry;
.super Landroid/widget/EditText;
.source "ConversationTextEntry.java"


# static fields
.field private static final editableFactory:Landroid/text/Editable$Factory;


# instance fields
.field private inputEnterSend:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 6
    new-instance v0, Lcom/whatsapp/yd;

    invoke-direct {v0}, Lcom/whatsapp/yd;-><init>()V

    sput-object v0, Lcom/whatsapp/ConversationTextEntry;->editableFactory:Landroid/text/Editable$Factory;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter

    .prologue
    .line 26
    invoke-direct {p0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 17
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 13
    sget-object v0, Lcom/whatsapp/ConversationTextEntry;->editableFactory:Landroid/text/Editable$Factory;

    invoke-virtual {p0, v0}, Lcom/whatsapp/ConversationTextEntry;->setEditableFactory(Landroid/text/Editable$Factory;)V

    .line 5
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 19
    invoke-direct {p0, p1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 16
    sget-object v0, Lcom/whatsapp/ConversationTextEntry;->editableFactory:Landroid/text/Editable$Factory;

    invoke-virtual {p0, v0}, Lcom/whatsapp/ConversationTextEntry;->setEditableFactory(Landroid/text/Editable$Factory;)V

    .line 28
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .parameter
    .parameter
    .parameter

    .prologue
    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 12
    sget-object v0, Lcom/whatsapp/ConversationTextEntry;->editableFactory:Landroid/text/Editable$Factory;

    invoke-virtual {p0, v0}, Lcom/whatsapp/ConversationTextEntry;->setEditableFactory(Landroid/text/Editable$Factory;)V

    .line 8
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1
    .parameter

    .prologue
    .line 23
    iput-boolean p1, p0, Lcom/whatsapp/ConversationTextEntry;->inputEnterSend:Z

    .line 4
    const v0, 0x2c001

    invoke-virtual {p0, v0}, Lcom/whatsapp/ConversationTextEntry;->setRawInputType(I)V

    .line 1
    if-eqz p1, :cond_0

    .line 27
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/whatsapp/ConversationTextEntry;->setImeOptions(I)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 22
    :cond_0
    const v0, 0x40000004

    invoke-virtual {p0, v0}, Lcom/whatsapp/ConversationTextEntry;->setImeOptions(I)V

    .line 14
    :cond_1
    return-void
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3
    .parameter

    .prologue
    .line 7
    invoke-super {p0, p1}, Landroid/widget/EditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    .line 25
    iget-boolean v1, p0, Lcom/whatsapp/ConversationTextEntry;->inputEnterSend:Z

    if-eqz v1, :cond_1

    .line 20
    iget v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    and-int/lit16 v1, v1, 0xff

    .line 21
    and-int/lit8 v2, v1, 0x4

    if-eqz v2, :cond_0

    .line 10
    iget v2, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    xor-int/2addr v1, v2

    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 3
    iget v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 2
    :cond_0
    iget v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const/high16 v2, 0x4000

    and-int/2addr v1, v2

    if-eqz v1, :cond_1

    .line 18
    iget v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const v2, -0x40000001

    and-int/2addr v1, v2

    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 9
    :cond_1
    return-object v0
.end method
