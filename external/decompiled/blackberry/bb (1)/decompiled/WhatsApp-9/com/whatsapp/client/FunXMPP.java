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
	ldc literal_622:"1"
	aastore 
	dup 
	bipush 6
	ldc literal_623:"1.0"
	aastore 
	dup 
	bipush 7
	ldc literal_624:"ack"
	aastore 
	dup 
	bipush 8
	ldc literal_625:"action"
	aastore 
	dup 
	bipush 9
	ldc literal_626:"active"
	aastore 
	dup 
	bipush 10
	ldc literal_627:"add"
	aastore 
	dup 
	bipush 11
	ldc literal_628:"all"
	aastore 
	dup 
	bipush 12
	ldc literal_629:"allow"
	aastore 
	dup 
	bipush 13
	ldc literal_630:"apple"
	aastore 
	dup 
	bipush 14
	ldc literal_631:"audio"
	aastore 
	dup 
	bipush 15
	ldc literal_632:"auth"
	aastore 
	dup 
	bipush 16
	ldc literal_633:"author"
	aastore 
	dup 
	bipush 17
	ldc literal_634:"available"
	aastore 
	dup 
	bipush 18
	ldc literal_635:"bad-request"
	aastore 
	dup 
	bipush 19
	ldc literal_636:"base64"
	aastore 
	dup 
	bipush 20
	ldc literal_637:"Bell.caf"
	aastore 
	dup 
	bipush 21
	ldc literal_638:"bind"
	aastore 
	dup 
	bipush 22
	ldc literal_639:"body"
	aastore 
	dup 
	bipush 23
	ldc literal_640:"Boing.caf"
	aastore 
	dup 
	bipush 24
	ldc literal_641:"cancel"
	aastore 
	dup 
	bipush 25
	ldc literal_642:"category"
	aastore 
	dup 
	bipush 26
	ldc literal_643:"challenge"
	aastore 
	dup 
	bipush 27
	ldc literal_644:"chat"
	aastore 
	dup 
	bipush 28
	ldc literal_645:"clean"
	aastore 
	dup 
	bipush 29
	ldc literal_646:"code"
	aastore 
	dup 
	bipush 30
	ldc literal_647:"composing"
	aastore 
	dup 
	bipush 31
	ldc literal_648:"config"
	aastore 
	dup 
	bipush 32
	ldc literal_649:"conflict"
	aastore 
	dup 
	bipush 33
	ldc literal_650:"contacts"
	aastore 
	dup 
	bipush 34
	ldc literal_651:"create"
	aastore 
	dup 
	bipush 35
	ldc literal_652:"creation"
	aastore 
	dup 
	bipush 36
	ldc literal_653:"default"
	aastore 
	dup 
	bipush 37
	ldc literal_654:"delay"
	aastore 
	dup 
	bipush 38
	ldc literal_655:"delete"
	aastore 
	dup 
	bipush 39
	ldc literal_656:"delivered"
	aastore 
	dup 
	bipush 40
	ldc literal_657:"deny"
	aastore 
	dup 
	bipush 41
	ldc literal_658:"DIGEST-MD5"
	aastore 
	dup 
	bipush 42
	ldc literal_659:"DIGEST-MD5-1"
	aastore 
	dup 
	bipush 43
	ldc literal_660:"dirty"
	aastore 
	dup 
	bipush 44
	ldc literal_661:"en"
	aastore 
	dup 
	bipush 45
	ldc literal_662:"enable"
	aastore 
	dup 
	bipush 46
	ldc literal_663:"encoding"
	aastore 
	dup 
	bipush 47
	ldc literal_664:"error"
	aastore 
	dup 
	bipush 48
	ldc literal_665:"expiration"
	aastore 
	dup 
	bipush 49
	ldc literal_666:"expired"
	aastore 
	dup 
	bipush 50
	ldc literal_667:"failure"
	aastore 
	dup 
	bipush 51
	ldc literal_668:"false"
	aastore 
	dup 
	bipush 52
	ldc literal_669:"favorites"
	aastore 
	dup 
	bipush 53
	ldc literal_670:"feature"
	aastore 
	dup 
	bipush 54
	ldc literal_671:"field"
	aastore 
	dup 
	bipush 55
	ldc literal_672:"free"
	aastore 
	dup 
	bipush 56
	ldc literal_673:"from"
	aastore 
	dup 
	bipush 57
	ldc literal_674:"g.us"
	aastore 
	dup 
	bipush 58
	ldc literal_675:"get"
	aastore 
	dup 
	bipush 59
	ldc literal_676:"Glass.caf"
	aastore 
	dup 
	bipush 60
	ldc literal_677:"google"
	aastore 
	dup 
	bipush 61
	ldc literal_678:"group"
	aastore 
	dup 
	bipush 62
	ldc literal_679:"groups"
	aastore 
	dup 
	bipush 63
	ldc literal_680:"g_sound"
	aastore 
	dup 
	bipush 64
	ldc literal_681:"Harp.caf"
	aastore 
	dup 
	bipush 65
	ldc literal_682:"http://etherx.jabber.org/streams"
	aastore 
	dup 
	bipush 66
	ldc literal_683:"http://jabber.org/protocol/chatstates"
	aastore 
	dup 
	bipush 67
	ldc literal_684:"id"
	aastore 
	dup 
	bipush 68
	ldc literal_685:"image"
	aastore 
	dup 
	bipush 69
	ldc literal_686:"img"
	aastore 
	dup 
	bipush 70
	ldc literal_687:"inactive"
	aastore 
	dup 
	bipush 71
	ldc literal_688:"internal-server-error"
	aastore 
	dup 
	bipush 72
	ldc literal_689:"iq"
	aastore 
	dup 
	bipush 73
	ldc literal_690:"item"
	aastore 
	dup 
	bipush 74
	ldc literal_691:"item-not-found"
	aastore 
	dup 
	bipush 75
	ldc literal_692:"jabber:client"
	aastore 
	dup 
	bipush 76
	ldc literal_693:"jabber:iq:last"
	aastore 
	dup 
	bipush 77
	ldc literal_694:"jabber:iq:privacy"
	aastore 
	dup 
	bipush 78
	ldc literal_695:"jabber:x:delay"
	aastore 
	dup 
	bipush 79
	ldc literal_696:"jabber:x:event"
	aastore 
	dup 
	bipush 80
	ldc literal_697:"jid"
	aastore 
	dup 
	bipush 81
	ldc literal_698:"jid-malformed"
	aastore 
	dup 
	bipush 82
	ldc literal_699:"kind"
	aastore 
	dup 
	bipush 83
	ldc literal_700:"leave"
	aastore 
	dup 
	bipush 84
	ldc literal_701:"leave-all"
	aastore 
	dup 
	bipush 85
	ldc literal_702:"list"
	aastore 
	dup 
	bipush 86
	ldc literal_703:"location"
	aastore 
	dup 
	bipush 87
	ldc literal_704:"max_groups"
	aastore 
	dup 
	bipush 88
	ldc literal_705:"max_participants"
	aastore 
	dup 
	bipush 89
	ldc literal_706:"max_subject"
	aastore 
	dup 
	bipush 90
	ldc literal_707:"mechanism"
	aastore 
	dup 
	bipush 91
	ldc literal_708:"mechanisms"
	aastore 
	dup 
	bipush 92
	ldc literal_709:"media"
	aastore 
	dup 
	bipush 93
	ldc literal_710:"message"
	aastore 
	dup 
	bipush 94
	ldc literal_711:"message_acks"
	aastore 
	dup 
	bipush 95
	ldc literal_712:"missing"
	aastore 
	dup 
	bipush 96
	ldc literal_713:"modify"
	aastore 
	dup 
	bipush 97
	ldc literal_714:"name"
	aastore 
	dup 
	bipush 98
	ldc literal_715:"not-acceptable"
	aastore 
	dup 
	bipush 99
	ldc literal_716:"not-allowed"
	aastore 
	dup 
	bipush 100
	ldc literal_717:"not-authorized"
	aastore 
	dup 
	bipush 101
	ldc literal_718:"notify"
	aastore 
	dup 
	bipush 102
	ldc literal_719:"Offline Storage"
	aastore 
	dup 
	bipush 103
	ldc literal_720:"order"
	aastore 
	dup 
	bipush 104
	ldc literal_721:"owner"
	aastore 
	dup 
	bipush 105
	ldc literal_722:"owning"
	aastore 
	dup 
	bipush 106
	ldc literal_723:"paid"
	aastore 
	dup 
	bipush 107
	ldc literal_724:"participant"
	aastore 
	dup 
	bipush 108
	ldc literal_725:"participants"
	aastore 
	dup 
	bipush 109
	ldc literal_726:"participating"
	aastore 
	dup 
	bipush 110
	ldc literal_727:"fail"
	aastore 
	dup 
	bipush 111
	ldc literal_728:"paused"
	aastore 
	dup 
	bipush 112
	ldc literal_729:"picture"
	aastore 
	dup 
	bipush 113
	ldc literal_730:"ping"
	aastore 
	dup 
	bipush 114
	ldc literal_731:"PLAIN"
	aastore 
	dup 
	bipush 115
	ldc literal_732:"platform"
	aastore 
	dup 
	bipush 116
	ldc literal_733:"presence"
	aastore 
	dup 
	bipush 117
	ldc literal_734:"preview"
	aastore 
	dup 
	bipush 118
	ldc literal_735:"probe"
	aastore 
	dup 
	bipush 119
	ldc literal_736:"prop"
	aastore 
	dup 
	bipush 120
	ldc literal_737:"props"
	aastore 
	dup 
	bipush 121
	ldc literal_738:"p_o"
	aastore 
	dup 
	bipush 122
	ldc literal_739:"p_t"
	aastore 
	dup 
	bipush 123
	ldc literal_740:"query"
	aastore 
	dup 
	bipush 124
	ldc literal_741:"raw"
	aastore 
	dup 
	bipush 125
	ldc literal_742:"receipt"
	aastore 
	dup 
	bipush 126
	ldc literal_743:"receipt_acks"
	aastore 
	dup 
	bipush 127
	ldc literal_744:"received"
	aastore 
	dup 
	sipush 128
	ldc literal_745:"relay"
	aastore 
	dup 
	sipush 129
	ldc literal_746:"remove"
	aastore 
	dup 
	sipush 130
	ldc literal_747:"Replaced by new connection"
	aastore 
	dup 
	sipush 131
	ldc literal_748:"request"
	aastore 
	dup 
	sipush 132
	ldc literal_749:"resource"
	aastore 
	dup 
	sipush 133
	ldc literal_750:"resource-constraint"
	aastore 
	dup 
	sipush 134
	ldc literal_751:"response"
	aastore 
	dup 
	sipush 135
	ldc literal_752:"result"
	aastore 
	dup 
	sipush 136
	ldc literal_753:"retry"
	aastore 
	dup 
	sipush 137
	ldc literal_754:"rim"
	aastore 
	dup 
	sipush 138
	ldc literal_755:"s.whatsapp.net"
	aastore 
	dup 
	sipush 139
	ldc literal_756:"seconds"
	aastore 
	dup 
	sipush 140
	ldc literal_757:"server"
	aastore 
	dup 
	sipush 141
	ldc literal_758:"session"
	aastore 
	dup 
	sipush 142
	ldc literal_759:"set"
	aastore 
	dup 
	sipush 143
	ldc literal_760:"show"
	aastore 
	dup 
	sipush 144
	ldc literal_761:"sid"
	aastore 
	dup 
	sipush 145
	ldc literal_762:"sound"
	aastore 
	dup 
	sipush 146
	ldc literal_763:"stamp"
	aastore 
	dup 
	sipush 147
	ldc literal_764:"starttls"
	aastore 
	dup 
	sipush 148
	ldc literal_765:"status"
	aastore 
	dup 
	sipush 149
	ldc literal_766:"stream:error"
	aastore 
	dup 
	sipush 150
	ldc literal_767:"stream:features"
	aastore 
	dup 
	sipush 151
	ldc literal_768:"subject"
	aastore 
	dup 
	sipush 152
	ldc literal_769:"subscribe"
	aastore 
	dup 
	sipush 153
	ldc literal_770:"success"
	aastore 
	dup 
	sipush 154
	ldc literal_771:"system-shutdown"
	aastore 
	dup 
	sipush 155
	ldc literal_772:"s_o"
	aastore 
	dup 
	sipush 156
	ldc literal_773:"s_t"
	aastore 
	dup 
	sipush 157
	ldc literal_774:"t"
	aastore 
	dup 
	sipush 158
	ldc literal_775:"TimePassing.caf"
	aastore 
	dup 
	sipush 159
	ldc literal_776:"timestamp"
	aastore 
	dup 
	sipush 160
	ldc literal_777:"to"
	aastore 
	dup 
	sipush 161
	ldc literal_778:"Tri-tone.caf"
	aastore 
	dup 
	sipush 162
	ldc literal_779:"type"
	aastore 
	dup 
	sipush 163
	ldc literal_780:"unavailable"
	aastore 
	dup 
	sipush 164
	ldc literal_781:"uri"
	aastore 
	dup 
	sipush 165
	ldc literal_782:"url"
	aastore 
	dup 
	sipush 166
	ldc literal_783:"urn:ietf:params:xml:ns:xmpp-bind"
	aastore 
	dup 
	sipush 167
	ldc literal_784:"urn:ietf:params:xml:ns:xmpp-sasl"
	aastore 
	dup 
	sipush 168
	ldc literal_785:"urn:ietf:params:xml:ns:xmpp-session"
	aastore 
	dup 
	sipush 169
	ldc literal_786:"urn:ietf:params:xml:ns:xmpp-stanzas"
	aastore 
	dup 
	sipush 170
	ldc literal_787:"urn:ietf:params:xml:ns:xmpp-streams"
	aastore 
	dup 
	sipush 171
	ldc literal_788:"urn:xmpp:delay"
	aastore 
	dup 
	sipush 172
	ldc literal_789:"urn:xmpp:ping"
	aastore 
	dup 
	sipush 173
	ldc literal_790:"urn:xmpp:receipts"
	aastore 
	dup 
	sipush 174
	ldc literal_791:"urn:xmpp:whatsapp"
	aastore 
	dup 
	sipush 175
	ldc literal_792:"urn:xmpp:whatsapp:dirty"
	aastore 
	dup 
	sipush 176
	ldc literal_793:"urn:xmpp:whatsapp:mms"
	aastore 
	dup 
	sipush 177
	ldc literal_794:"urn:xmpp:whatsapp:push"
	aastore 
	dup 
	sipush 178
	ldc literal_795:"value"
	aastore 
	dup 
	sipush 179
	ldc literal_796:"vcard"
	aastore 
	dup 
	sipush 180
	ldc literal_797:"version"
	aastore 
	dup 
	sipush 181
	ldc literal_798:"video"
	aastore 
	dup 
	sipush 182
	ldc literal_799:"w"
	aastore 
	dup 
	sipush 183
	ldc literal_800:"w:g"
	aastore 
	dup 
	sipush 184
	ldc literal_801:"w:p:r"
	aastore 
	dup 
	sipush 185
	ldc literal_802:"wait"
	aastore 
	dup 
	sipush 186
	ldc literal_803:"x"
	aastore 
	dup 
	sipush 187
	ldc literal_804:"xml-not-well-formed"
	aastore 
	dup 
	sipush 188
	ldc literal_805:"xml:lang"
	aastore 
	dup 
	sipush 189
	ldc literal_806:"xmlns"
	aastore 
	dup 
	sipush 190
	ldc literal_807:"xmlns:stream"
	aastore 
	dup 
	sipush 191
	ldc literal_808:"Xylophone.caf"
	aastore 
	dup 
	sipush 192
	ldc literal_809:"account"
	aastore 
	dup 
	sipush 193
	ldc literal_810:"digest"
	aastore 
	dup 
	sipush 194
	ldc literal_811:"g_notify"
	aastore 
	dup 
	sipush 195
	ldc literal_812:"method"
	aastore 
	dup 
	sipush 196
	ldc literal_813:"password"
	aastore 
	dup 
	sipush 197
	ldc literal_814:"registration"
	aastore 
	dup 
	sipush 198
	ldc literal_815:"stat"
	aastore 
	dup 
	sipush 199
	ldc literal_816:"text"
	aastore 
	dup 
	sipush 200
	ldc literal_817:"user"
	aastore 
	dup 
	sipush 201
	ldc literal_818:"username"
	aastore 
	dup 
	sipush 202
	ldc literal_819:"event"
	aastore 
	dup 
	sipush 203
	ldc literal_820:"latitude"
	aastore 
	dup 
	sipush 204
	ldc literal_821:"longitude"
	aastore 
	dup 
	sipush 205
	ldc literal_822:"true"
	aastore 
	dup 
	sipush 206
	ldc literal_823:"after"
	aastore 
	dup 
	sipush 207
	ldc literal_824:"before"
	aastore 
	dup 
	sipush 208
	ldc literal_825:"broadcast"
	aastore 
	dup 
	sipush 209
	ldc literal_826:"count"
	aastore 
	dup 
	sipush 210
	ldc literal_827:"features"
	aastore 
	dup 
	sipush 211
	ldc literal_828:"first"
	aastore 
	dup 
	sipush 212
	ldc literal_829:"index"
	aastore 
	dup 
	sipush 213
	ldc literal_830:"invalid-mechanism"
	aastore 
	dup 
	sipush 214
	ldc literal_831:"last"
	aastore 
	dup 
	sipush 215
	ldc literal_832:"max"
	aastore 
	dup 
	sipush 216
	ldc literal_833:"offline"
	aastore 
	dup 
	sipush 217
	ldc literal_834:"proceed"
	aastore 
	dup 
	sipush 218
	ldc literal_835:"required"
	aastore 
	dup 
	sipush 219
	ldc literal_836:"sync"
	aastore 
	dup 
	sipush 220
	ldc literal_837:"elapsed"
	aastore 
	dup 
	sipush 221
	ldc literal_838:"ip"
	aastore 
	dup 
	sipush 222
	ldc literal_839:"microsoft"
	aastore 
	dup 
	sipush 223
	ldc literal_840:"mute"
	aastore 
	dup 
	sipush 224
	ldc literal_841:"nokia"
	aastore 
	dup 
	sipush 225
	ldc literal_842:"off"
	aastore 
	dup 
	sipush 226
	ldc literal_843:"pin"
	aastore 
	dup 
	sipush 227
	ldc literal_844:"pop_mean_time"
	aastore 
	dup 
	sipush 228
	ldc literal_845:"pop_plus_minus"
	aastore 
	dup 
	sipush 229
	ldc literal_846:"port"
	aastore 
	dup 
	sipush 230
	ldc literal_847:"reason"
	aastore 
	dup 
	sipush 231
	ldc literal_848:"server-error"
	aastore 
	dup 
	sipush 232
	ldc literal_849:"silent"
	aastore 
	dup 
	sipush 233
	ldc literal_850:"timeout"
	aastore 
	dup 
	sipush 234
	ldc literal_851:"lc"
	aastore 
	dup 
	sipush 235
	ldc literal_852:"lg"
	aastore 
	dup 
	sipush 236
	ldc literal_853:"bad-protocol"
	aastore 
	dup 
	sipush 237
	ldc literal_854:"none"
	aastore 
	dup 
	sipush 238
	ldc literal_855:"remote-server-timeout"
	aastore 
	dup 
	sipush 239
	ldc literal_856:"service-unavailable"
	aastore 
	dup 
	sipush 240
	ldc literal_857:"w:p"
	aastore 
	dup 
	sipush 241
	ldc literal_858:"w:profile:picture"
	aastore 
	dup 
	sipush 242
	ldc literal_859:"notification"
	aastore 
	putstatic dictionary // FunXMPP
	clinit_return 
	}

}
