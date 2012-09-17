// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-15.cod
// Module version  : 2.7.3204
// Class ID        : 16
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	public static com.whatsapp.client.FunXMPP$MessageStore /*module:WhatsApp-17.class#29*/  message_store ; // ofs = 56892 addr = 35)
	public static String /*java.lang.String[]*/  dictionary ; // ofs = 56898 addr = 36)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final java.lang.String removeResourceFromJID( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 47
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	istore_1 
	iload_1 
	bipush -1
	if_icmpne Label10
	aload_0 
	areturn 
Label10:
	aload_0 
	iconst_0 
	iload_1 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static FunXMPP
	clinit_wait 
	new FunXMPP$1
	dup 
	invokespecial com.whatsapp.client.FunXMPP$1.<init> // pc=1
	putstatic message_store // FunXMPP
	sipush 243
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	aconst_null 
	aastore 
	dup 
	iconst_1 
	aconst_null 
	aastore 
	dup 
	bipush 2
	aconst_null 
	aastore 
	dup 
	bipush 3
	aconst_null 
	aastore 
	dup 
	bipush 4
	aconst_null 
	aastore 
	dup 
	bipush 5
	ldc literal_715:"1"
	aastore 
	dup 
	bipush 6
	ldc literal_716:"1.0"
	aastore 
	dup 
	bipush 7
	ldc literal_717:"ack"
	aastore 
	dup 
	bipush 8
	ldc literal_718:"action"
	aastore 
	dup 
	bipush 9
	ldc literal_719:"active"
	aastore 
	dup 
	bipush 10
	ldc literal_720:"add"
	aastore 
	dup 
	bipush 11
	ldc literal_721:"all"
	aastore 
	dup 
	bipush 12
	ldc literal_722:"allow"
	aastore 
	dup 
	bipush 13
	ldc literal_723:"apple"
	aastore 
	dup 
	bipush 14
	ldc literal_724:"audio"
	aastore 
	dup 
	bipush 15
	ldc literal_725:"auth"
	aastore 
	dup 
	bipush 16
	ldc literal_726:"author"
	aastore 
	dup 
	bipush 17
	ldc literal_727:"available"
	aastore 
	dup 
	bipush 18
	ldc literal_728:"bad-request"
	aastore 
	dup 
	bipush 19
	ldc literal_729:"base64"
	aastore 
	dup 
	bipush 20
	ldc literal_730:"Bell.caf"
	aastore 
	dup 
	bipush 21
	ldc literal_731:"bind"
	aastore 
	dup 
	bipush 22
	ldc literal_732:"body"
	aastore 
	dup 
	bipush 23
	ldc literal_733:"Boing.caf"
	aastore 
	dup 
	bipush 24
	ldc literal_734:"cancel"
	aastore 
	dup 
	bipush 25
	ldc literal_735:"category"
	aastore 
	dup 
	bipush 26
	ldc literal_736:"challenge"
	aastore 
	dup 
	bipush 27
	ldc literal_737:"chat"
	aastore 
	dup 
	bipush 28
	ldc literal_738:"clean"
	aastore 
	dup 
	bipush 29
	ldc literal_739:"code"
	aastore 
	dup 
	bipush 30
	ldc literal_740:"composing"
	aastore 
	dup 
	bipush 31
	ldc literal_741:"config"
	aastore 
	dup 
	bipush 32
	ldc literal_742:"conflict"
	aastore 
	dup 
	bipush 33
	ldc literal_743:"contacts"
	aastore 
	dup 
	bipush 34
	ldc literal_744:"create"
	aastore 
	dup 
	bipush 35
	ldc literal_745:"creation"
	aastore 
	dup 
	bipush 36
	ldc literal_746:"default"
	aastore 
	dup 
	bipush 37
	ldc literal_747:"delay"
	aastore 
	dup 
	bipush 38
	ldc literal_748:"delete"
	aastore 
	dup 
	bipush 39
	ldc literal_749:"delivered"
	aastore 
	dup 
	bipush 40
	ldc literal_750:"deny"
	aastore 
	dup 
	bipush 41
	ldc literal_751:"DIGEST-MD5"
	aastore 
	dup 
	bipush 42
	ldc literal_752:"DIGEST-MD5-1"
	aastore 
	dup 
	bipush 43
	ldc literal_753:"dirty"
	aastore 
	dup 
	bipush 44
	ldc literal_754:"en"
	aastore 
	dup 
	bipush 45
	ldc literal_755:"enable"
	aastore 
	dup 
	bipush 46
	ldc literal_756:"encoding"
	aastore 
	dup 
	bipush 47
	ldc literal_757:"error"
	aastore 
	dup 
	bipush 48
	ldc literal_758:"expiration"
	aastore 
	dup 
	bipush 49
	ldc literal_759:"expired"
	aastore 
	dup 
	bipush 50
	ldc literal_760:"failure"
	aastore 
	dup 
	bipush 51
	ldc literal_761:"false"
	aastore 
	dup 
	bipush 52
	ldc literal_762:"favorites"
	aastore 
	dup 
	bipush 53
	ldc literal_763:"feature"
	aastore 
	dup 
	bipush 54
	ldc literal_764:"field"
	aastore 
	dup 
	bipush 55
	ldc literal_765:"free"
	aastore 
	dup 
	bipush 56
	ldc literal_766:"from"
	aastore 
	dup 
	bipush 57
	ldc literal_767:"g.us"
	aastore 
	dup 
	bipush 58
	ldc literal_768:"get"
	aastore 
	dup 
	bipush 59
	ldc literal_769:"Glass.caf"
	aastore 
	dup 
	bipush 60
	ldc literal_770:"google"
	aastore 
	dup 
	bipush 61
	ldc literal_771:"group"
	aastore 
	dup 
	bipush 62
	ldc literal_772:"groups"
	aastore 
	dup 
	bipush 63
	ldc literal_773:"g_sound"
	aastore 
	dup 
	bipush 64
	ldc literal_774:"Harp.caf"
	aastore 
	dup 
	bipush 65
	ldc literal_775:"http://etherx.jabber.org/streams"
	aastore 
	dup 
	bipush 66
	ldc literal_776:"http://jabber.org/protocol/chatstates"
	aastore 
	dup 
	bipush 67
	ldc literal_777:"id"
	aastore 
	dup 
	bipush 68
	ldc literal_778:"image"
	aastore 
	dup 
	bipush 69
	ldc literal_779:"img"
	aastore 
	dup 
	bipush 70
	ldc literal_780:"inactive"
	aastore 
	dup 
	bipush 71
	ldc literal_781:"internal-server-error"
	aastore 
	dup 
	bipush 72
	ldc literal_782:"iq"
	aastore 
	dup 
	bipush 73
	ldc literal_783:"item"
	aastore 
	dup 
	bipush 74
	ldc literal_784:"item-not-found"
	aastore 
	dup 
	bipush 75
	ldc literal_785:"jabber:client"
	aastore 
	dup 
	bipush 76
	ldc literal_786:"jabber:iq:last"
	aastore 
	dup 
	bipush 77
	ldc literal_787:"jabber:iq:privacy"
	aastore 
	dup 
	bipush 78
	ldc literal_788:"jabber:x:delay"
	aastore 
	dup 
	bipush 79
	ldc literal_789:"jabber:x:event"
	aastore 
	dup 
	bipush 80
	ldc literal_790:"jid"
	aastore 
	dup 
	bipush 81
	ldc literal_791:"jid-malformed"
	aastore 
	dup 
	bipush 82
	ldc literal_792:"kind"
	aastore 
	dup 
	bipush 83
	ldc literal_793:"leave"
	aastore 
	dup 
	bipush 84
	ldc literal_794:"leave-all"
	aastore 
	dup 
	bipush 85
	ldc literal_795:"list"
	aastore 
	dup 
	bipush 86
	ldc literal_796:"location"
	aastore 
	dup 
	bipush 87
	ldc literal_797:"max_groups"
	aastore 
	dup 
	bipush 88
	ldc literal_798:"max_participants"
	aastore 
	dup 
	bipush 89
	ldc literal_799:"max_subject"
	aastore 
	dup 
	bipush 90
	ldc literal_800:"mechanism"
	aastore 
	dup 
	bipush 91
	ldc literal_801:"mechanisms"
	aastore 
	dup 
	bipush 92
	ldc literal_802:"media"
	aastore 
	dup 
	bipush 93
	ldc literal_803:"message"
	aastore 
	dup 
	bipush 94
	ldc literal_804:"message_acks"
	aastore 
	dup 
	bipush 95
	ldc literal_805:"missing"
	aastore 
	dup 
	bipush 96
	ldc literal_806:"modify"
	aastore 
	dup 
	bipush 97
	ldc literal_807:"name"
	aastore 
	dup 
	bipush 98
	ldc literal_808:"not-acceptable"
	aastore 
	dup 
	bipush 99
	ldc literal_809:"not-allowed"
	aastore 
	dup 
	bipush 100
	ldc literal_810:"not-authorized"
	aastore 
	dup 
	bipush 101
	ldc literal_811:"notify"
	aastore 
	dup 
	bipush 102
	ldc literal_812:"Offline Storage"
	aastore 
	dup 
	bipush 103
	ldc literal_813:"order"
	aastore 
	dup 
	bipush 104
	ldc literal_814:"owner"
	aastore 
	dup 
	bipush 105
	ldc literal_815:"owning"
	aastore 
	dup 
	bipush 106
	ldc literal_816:"paid"
	aastore 
	dup 
	bipush 107
	ldc literal_817:"participant"
	aastore 
	dup 
	bipush 108
	ldc literal_818:"participants"
	aastore 
	dup 
	bipush 109
	ldc literal_819:"participating"
	aastore 
	dup 
	bipush 110
	ldc literal_820:"fail"
	aastore 
	dup 
	bipush 111
	ldc literal_821:"paused"
	aastore 
	dup 
	bipush 112
	ldc literal_822:"picture"
	aastore 
	dup 
	bipush 113
	ldc literal_823:"ping"
	aastore 
	dup 
	bipush 114
	ldc literal_824:"PLAIN"
	aastore 
	dup 
	bipush 115
	ldc literal_825:"platform"
	aastore 
	dup 
	bipush 116
	ldc literal_826:"presence"
	aastore 
	dup 
	bipush 117
	ldc literal_827:"preview"
	aastore 
	dup 
	bipush 118
	ldc literal_828:"probe"
	aastore 
	dup 
	bipush 119
	ldc literal_829:"prop"
	aastore 
	dup 
	bipush 120
	ldc literal_830:"props"
	aastore 
	dup 
	bipush 121
	ldc literal_831:"p_o"
	aastore 
	dup 
	bipush 122
	ldc literal_832:"p_t"
	aastore 
	dup 
	bipush 123
	ldc literal_833:"query"
	aastore 
	dup 
	bipush 124
	ldc literal_834:"raw"
	aastore 
	dup 
	bipush 125
	ldc literal_835:"receipt"
	aastore 
	dup 
	bipush 126
	ldc literal_836:"receipt_acks"
	aastore 
	dup 
	bipush 127
	ldc literal_837:"received"
	aastore 
	dup 
	sipush 128
	ldc literal_838:"relay"
	aastore 
	dup 
	sipush 129
	ldc literal_839:"remove"
	aastore 
	dup 
	sipush 130
	ldc literal_840:"Replaced by new connection"
	aastore 
	dup 
	sipush 131
	ldc literal_841:"request"
	aastore 
	dup 
	sipush 132
	ldc literal_842:"resource"
	aastore 
	dup 
	sipush 133
	ldc literal_843:"resource-constraint"
	aastore 
	dup 
	sipush 134
	ldc literal_844:"response"
	aastore 
	dup 
	sipush 135
	ldc literal_845:"result"
	aastore 
	dup 
	sipush 136
	ldc literal_846:"retry"
	aastore 
	dup 
	sipush 137
	ldc literal_847:"rim"
	aastore 
	dup 
	sipush 138
	ldc literal_848:"s.whatsapp.net"
	aastore 
	dup 
	sipush 139
	ldc literal_849:"seconds"
	aastore 
	dup 
	sipush 140
	ldc literal_850:"server"
	aastore 
	dup 
	sipush 141
	ldc literal_851:"session"
	aastore 
	dup 
	sipush 142
	ldc literal_852:"set"
	aastore 
	dup 
	sipush 143
	ldc literal_853:"show"
	aastore 
	dup 
	sipush 144
	ldc literal_854:"sid"
	aastore 
	dup 
	sipush 145
	ldc literal_855:"sound"
	aastore 
	dup 
	sipush 146
	ldc literal_856:"stamp"
	aastore 
	dup 
	sipush 147
	ldc literal_857:"starttls"
	aastore 
	dup 
	sipush 148
	ldc literal_858:"status"
	aastore 
	dup 
	sipush 149
	ldc literal_859:"stream:error"
	aastore 
	dup 
	sipush 150
	ldc literal_860:"stream:features"
	aastore 
	dup 
	sipush 151
	ldc literal_861:"subject"
	aastore 
	dup 
	sipush 152
	ldc literal_862:"subscribe"
	aastore 
	dup 
	sipush 153
	ldc literal_863:"success"
	aastore 
	dup 
	sipush 154
	ldc literal_864:"system-shutdown"
	aastore 
	dup 
	sipush 155
	ldc literal_865:"s_o"
	aastore 
	dup 
	sipush 156
	ldc literal_866:"s_t"
	aastore 
	dup 
	sipush 157
	ldc literal_867:"t"
	aastore 
	dup 
	sipush 158
	ldc literal_868:"TimePassing.caf"
	aastore 
	dup 
	sipush 159
	ldc literal_869:"timestamp"
	aastore 
	dup 
	sipush 160
	ldc literal_870:"to"
	aastore 
	dup 
	sipush 161
	ldc literal_871:"Tri-tone.caf"
	aastore 
	dup 
	sipush 162
	ldc literal_872:"type"
	aastore 
	dup 
	sipush 163
	ldc literal_873:"unavailable"
	aastore 
	dup 
	sipush 164
	ldc literal_874:"uri"
	aastore 
	dup 
	sipush 165
	ldc literal_875:"url"
	aastore 
	dup 
	sipush 166
	ldc literal_876:"urn:ietf:params:xml:ns:xmpp-bind"
	aastore 
	dup 
	sipush 167
	ldc literal_877:"urn:ietf:params:xml:ns:xmpp-sasl"
	aastore 
	dup 
	sipush 168
	ldc literal_878:"urn:ietf:params:xml:ns:xmpp-session"
	aastore 
	dup 
	sipush 169
	ldc literal_879:"urn:ietf:params:xml:ns:xmpp-stanzas"
	aastore 
	dup 
	sipush 170
	ldc literal_880:"urn:ietf:params:xml:ns:xmpp-streams"
	aastore 
	dup 
	sipush 171
	ldc literal_881:"urn:xmpp:delay"
	aastore 
	dup 
	sipush 172
	ldc literal_882:"urn:xmpp:ping"
	aastore 
	dup 
	sipush 173
	ldc literal_883:"urn:xmpp:receipts"
	aastore 
	dup 
	sipush 174
	ldc literal_884:"urn:xmpp:whatsapp"
	aastore 
	dup 
	sipush 175
	ldc literal_885:"urn:xmpp:whatsapp:dirty"
	aastore 
	dup 
	sipush 176
	ldc literal_886:"urn:xmpp:whatsapp:mms"
	aastore 
	dup 
	sipush 177
	ldc literal_887:"urn:xmpp:whatsapp:push"
	aastore 
	dup 
	sipush 178
	ldc literal_888:"value"
	aastore 
	dup 
	sipush 179
	ldc literal_889:"vcard"
	aastore 
	dup 
	sipush 180
	ldc literal_890:"version"
	aastore 
	dup 
	sipush 181
	ldc literal_891:"video"
	aastore 
	dup 
	sipush 182
	ldc literal_892:"w"
	aastore 
	dup 
	sipush 183
	ldc literal_893:"w:g"
	aastore 
	dup 
	sipush 184
	ldc literal_894:"w:p:r"
	aastore 
	dup 
	sipush 185
	ldc literal_895:"wait"
	aastore 
	dup 
	sipush 186
	ldc literal_896:"x"
	aastore 
	dup 
	sipush 187
	ldc literal_897:"xml-not-well-formed"
	aastore 
	dup 
	sipush 188
	ldc literal_898:"xml:lang"
	aastore 
	dup 
	sipush 189
	ldc literal_899:"xmlns"
	aastore 
	dup 
	sipush 190
	ldc literal_900:"xmlns:stream"
	aastore 
	dup 
	sipush 191
	ldc literal_901:"Xylophone.caf"
	aastore 
	dup 
	sipush 192
	ldc literal_902:"account"
	aastore 
	dup 
	sipush 193
	ldc literal_903:"digest"
	aastore 
	dup 
	sipush 194
	ldc literal_904:"g_notify"
	aastore 
	dup 
	sipush 195
	ldc literal_905:"method"
	aastore 
	dup 
	sipush 196
	ldc literal_906:"password"
	aastore 
	dup 
	sipush 197
	ldc literal_907:"registration"
	aastore 
	dup 
	sipush 198
	ldc literal_908:"stat"
	aastore 
	dup 
	sipush 199
	ldc literal_909:"text"
	aastore 
	dup 
	sipush 200
	ldc literal_910:"user"
	aastore 
	dup 
	sipush 201
	ldc literal_911:"username"
	aastore 
	dup 
	sipush 202
	ldc literal_912:"event"
	aastore 
	dup 
	sipush 203
	ldc literal_913:"latitude"
	aastore 
	dup 
	sipush 204
	ldc literal_914:"longitude"
	aastore 
	dup 
	sipush 205
	ldc literal_915:"true"
	aastore 
	dup 
	sipush 206
	ldc literal_916:"after"
	aastore 
	dup 
	sipush 207
	ldc literal_917:"before"
	aastore 
	dup 
	sipush 208
	ldc literal_918:"broadcast"
	aastore 
	dup 
	sipush 209
	ldc literal_919:"count"
	aastore 
	dup 
	sipush 210
	ldc literal_920:"features"
	aastore 
	dup 
	sipush 211
	ldc literal_921:"first"
	aastore 
	dup 
	sipush 212
	ldc literal_922:"index"
	aastore 
	dup 
	sipush 213
	ldc literal_923:"invalid-mechanism"
	aastore 
	dup 
	sipush 214
	ldc literal_924:"last"
	aastore 
	dup 
	sipush 215
	ldc literal_925:"max"
	aastore 
	dup 
	sipush 216
	ldc literal_926:"offline"
	aastore 
	dup 
	sipush 217
	ldc literal_927:"proceed"
	aastore 
	dup 
	sipush 218
	ldc literal_928:"required"
	aastore 
	dup 
	sipush 219
	ldc literal_929:"sync"
	aastore 
	dup 
	sipush 220
	ldc literal_930:"elapsed"
	aastore 
	dup 
	sipush 221
	ldc literal_931:"ip"
	aastore 
	dup 
	sipush 222
	ldc literal_932:"microsoft"
	aastore 
	dup 
	sipush 223
	ldc literal_933:"mute"
	aastore 
	dup 
	sipush 224
	ldc literal_934:"nokia"
	aastore 
	dup 
	sipush 225
	ldc literal_935:"off"
	aastore 
	dup 
	sipush 226
	ldc literal_936:"pin"
	aastore 
	dup 
	sipush 227
	ldc literal_937:"pop_mean_time"
	aastore 
	dup 
	sipush 228
	ldc literal_938:"pop_plus_minus"
	aastore 
	dup 
	sipush 229
	ldc literal_939:"port"
	aastore 
	dup 
	sipush 230
	ldc literal_940:"reason"
	aastore 
	dup 
	sipush 231
	ldc literal_941:"server-error"
	aastore 
	dup 
	sipush 232
	ldc literal_942:"silent"
	aastore 
	dup 
	sipush 233
	ldc literal_943:"timeout"
	aastore 
	dup 
	sipush 234
	ldc literal_944:"lc"
	aastore 
	dup 
	sipush 235
	ldc literal_945:"lg"
	aastore 
	dup 
	sipush 236
	ldc literal_946:"bad-protocol"
	aastore 
	dup 
	sipush 237
	ldc literal_947:"none"
	aastore 
	dup 
	sipush 238
	ldc literal_948:"remote-server-timeout"
	aastore 
	dup 
	sipush 239
	ldc literal_949:"service-unavailable"
	aastore 
	dup 
	sipush 240
	ldc literal_950:"w:p"
	aastore 
	dup 
	sipush 241
	ldc literal_951:"w:profile:picture"
	aastore 
	dup 
	sipush 242
	ldc literal_952:"notification"
	aastore 
	putstatic dictionary // FunXMPP
	clinit_return 
	}

}
