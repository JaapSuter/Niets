.class public Lcom/whatsapp/MediaData;
.super Ljava/lang/Object;
.source "MediaData.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field static final serialVersionUID:J = -0xb69121e5dcffaL


# instance fields
.field transient downloader:Lcom/whatsapp/ob;

.field public file:Ljava/io/File;

.field progress:J

.field public transferred:Z

.field transient transferring:Z

.field transient uploader:Lcom/whatsapp/pb;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-boolean v0, p0, Lcom/whatsapp/MediaData;->transferring:Z

    .line 7
    iput-boolean v0, p0, Lcom/whatsapp/MediaData;->transferred:Z

    .line 5
    return-void
.end method

.method public constructor <init>(Lcom/whatsapp/MediaData;)V
    .locals 1
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-boolean v0, p0, Lcom/whatsapp/MediaData;->transferring:Z

    .line 3
    iput-boolean v0, p0, Lcom/whatsapp/MediaData;->transferred:Z

    .line 9
    iget-boolean v0, p1, Lcom/whatsapp/MediaData;->transferred:Z

    iput-boolean v0, p0, Lcom/whatsapp/MediaData;->transferred:Z

    .line 8
    iget-object v0, p1, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    iput-object v0, p0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    .line 10
    return-void
.end method
