// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	public static com.whatsapp.client. /*module:WhatsApp-17.class#7*/  message_store ; // ofs = 55966 addr = 4)
	public static String /*java.lang.String[]*/  dictionary ; // ofs = 55972 addr = 5)


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
	ldc literal_48:"1"
	aastore 
	dup 
	bipush 6
	ldc literal_49:"1.0"
	aastore 
	dup 
	bipush 7
	ldc literal_50:"ack"
	aastore 
	dup 
	bipush 8
	ldc literal_51:"action"
	aastore 
	dup 
	bipush 9
	ldc literal_52:"active"
	aastore 
	dup 
	bipush 10
	ldc literal_53:"add"
	aastore 
	dup 
	bipush 11
	ldc literal_54:"all"
	aastore 
	dup 
	bipush 12
	ldc literal_55:"allow"
	aastore 
	dup 
	bipush 13
	ldc literal_56:"apple"
	aastore 
	dup 
	bipush 14
	ldc literal_57:"audio"
	aastore 
	dup 
	bipush 15
	ldc literal_58:"auth"
	aastore 
	dup 
	bipush 16
	ldc literal_59:"author"
	aastore 
	dup 
	bipush 17
	ldc literal_60:"available"
	aastore 
	dup 
	bipush 18
	ldc literal_61:"bad-request"
	aastore 
	dup 
	bipush 19
	ldc literal_62:"base64"
	aastore 
	dup 
	bipush 20
	ldc literal_63:"Bell.caf"
	aastore 
	dup 
	bipush 21
	ldc literal_64:"bind"
	aastore 
	dup 
	bipush 22
	ldc literal_65:"body"
	aastore 
	dup 
	bipush 23
	ldc literal_66:"Boing.caf"
	aastore 
	dup 
	bipush 24
	ldc literal_67:"cancel"
	aastore 
	dup 
	bipush 25
	ldc literal_68:"category"
	aastore 
	dup 
	bipush 26
	ldc literal_69:"challenge"
	aastore 
	dup 
	bipush 27
	ldc literal_70:"chat"
	aastore 
	dup 
	bipush 28
	ldc literal_71:"clean"
	aastore 
	dup 
	bipush 29
	ldc literal_72:"code"
	aastore 
	dup 
	bipush 30
	ldc literal_73:"composing"
	aastore 
	dup 
	bipush 31
	ldc literal_74:"config"
	aastore 
	dup 
	bipush 32
	ldc literal_75:"conflict"
	aastore 
	dup 
	bipush 33
	ldc literal_76:"contacts"
	aastore 
	dup 
	bipush 34
	ldc literal_77:"create"
	aastore 
	dup 
	bipush 35
	ldc literal_78:"creation"
	aastore 
	dup 
	bipush 36
	ldc literal_79:"default"
	aastore 
	dup 
	bipush 37
	ldc literal_80:"delay"
	aastore 
	dup 
	bipush 38
	ldc literal_81:"delete"
	aastore 
	dup 
	bipush 39
	ldc literal_82:"delivered"
	aastore 
	dup 
	bipush 40
	ldc literal_83:"deny"
	aastore 
	dup 
	bipush 41
	ldc literal_84:"DIGEST-MD5"
	aastore 
	dup 
	bipush 42
	ldc literal_85:"DIGEST-MD5-1"
	aastore 
	dup 
	bipush 43
	ldc literal_86:"dirty"
	aastore 
	dup 
	bipush 44
	ldc literal_87:"en"
	aastore 
	dup 
	bipush 45
	ldc literal_88:"enable"
	aastore 
	dup 
	bipush 46
	ldc literal_89:"encoding"
	aastore 
	dup 
	bipush 47
	ldc literal_90:"error"
	aastore 
	dup 
	bipush 48
	ldc literal_91:"expiration"
	aastore 
	dup 
	bipush 49
	ldc literal_92:"expired"
	aastore 
	dup 
	bipush 50
	ldc literal_93:"failure"
	aastore 
	dup 
	bipush 51
	ldc literal_94:"false"
	aastore 
	dup 
	bipush 52
	ldc literal_95:"favorites"
	aastore 
	dup 
	bipush 53
	ldc literal_96:"feature"
	aastore 
	dup 
	bipush 54
	ldc literal_97:"field"
	aastore 
	dup 
	bipush 55
	ldc literal_98:"free"
	aastore 
	dup 
	bipush 56
	ldc literal_99:"from"
	aastore 
	dup 
	bipush 57
	ldc literal_100:"g.us"
	aastore 
	dup 
	bipush 58
	ldc literal_101:"get"
	aastore 
	dup 
	bipush 59
	ldc literal_102:"Glass.caf"
	aastore 
	dup 
	bipush 60
	ldc literal_103:"google"
	aastore 
	dup 
	bipush 61
	ldc literal_104:"group"
	aastore 
	dup 
	bipush 62
	ldc literal_105:"groups"
	aastore 
	dup 
	bipush 63
	ldc literal_106:"g_sound"
	aastore 
	dup 
	bipush 64
	ldc literal_107:"Harp.caf"
	aastore 
	dup 
	bipush 65
	ldc literal_108:"http://etherx.jabber.org/streams"
	aastore 
	dup 
	bipush 66
	ldc literal_109:"http://jabber.org/protocol/chatstates"
	aastore 
	dup 
	bipush 67
	ldc literal_110:"id"
	aastore 
	dup 
	bipush 68
	ldc literal_111:"image"
	aastore 
	dup 
	bipush 69
	ldc literal_112:"img"
	aastore 
	dup 
	bipush 70
	ldc literal_113:"inactive"
	aastore 
	dup 
	bipush 71
	ldc literal_114:"internal-server-error"
	aastore 
	dup 
	bipush 72
	ldc literal_115:"iq"
	aastore 
	dup 
	bipush 73
	ldc literal_116:"item"
	aastore 
	dup 
	bipush 74
	ldc literal_117:"item-not-found"
	aastore 
	dup 
	bipush 75
	ldc literal_118:"jabber:client"
	aastore 
	dup 
	bipush 76
	ldc literal_119:"jabber:iq:last"
	aastore 
	dup 
	bipush 77
	ldc literal_120:"jabber:iq:privacy"
	aastore 
	dup 
	bipush 78
	ldc literal_121:"jabber:x:delay"
	aastore 
	dup 
	bipush 79
	ldc literal_122:"jabber:x:event"
	aastore 
	dup 
	bipush 80
	ldc literal_123:"jid"
	aastore 
	dup 
	bipush 81
	ldc literal_124:"jid-malformed"
	aastore 
	dup 
	bipush 82
	ldc literal_125:"kind"
	aastore 
	dup 
	bipush 83
	ldc literal_126:"leave"
	aastore 
	dup 
	bipush 84
	ldc literal_127:"leave-all"
	aastore 
	dup 
	bipush 85
	ldc literal_128:"list"
	aastore 
	dup 
	bipush 86
	ldc literal_129:"location"
	aastore 
	dup 
	bipush 87
	ldc literal_130:"max_groups"
	aastore 
	dup 
	bipush 88
	ldc literal_131:"max_participants"
	aastore 
	dup 
	bipush 89
	ldc literal_132:"max_subject"
	aastore 
	dup 
	bipush 90
	ldc literal_133:"mechanism"
	aastore 
	dup 
	bipush 91
	ldc literal_134:"mechanisms"
	aastore 
	dup 
	bipush 92
	ldc literal_135:"media"
	aastore 
	dup 
	bipush 93
	ldc literal_136:"message"
	aastore 
	dup 
	bipush 94
	ldc literal_137:"message_acks"
	aastore 
	dup 
	bipush 95
	ldc literal_138:"missing"
	aastore 
	dup 
	bipush 96
	ldc literal_139:"modify"
	aastore 
	dup 
	bipush 97
	ldc literal_140:"name"
	aastore 
	dup 
	bipush 98
	ldc literal_141:"not-acceptable"
	aastore 
	dup 
	bipush 99
	ldc literal_142:"not-allowed"
	aastore 
	dup 
	bipush 100
	ldc literal_143:"not-authorized"
	aastore 
	dup 
	bipush 101
	ldc literal_144:"notify"
	aastore 
	dup 
	bipush 102
	ldc literal_145:"Offline Storage"
	aastore 
	dup 
	bipush 103
	ldc literal_146:"order"
	aastore 
	dup 
	bipush 104
	ldc literal_147:"owner"
	aastore 
	dup 
	bipush 105
	ldc literal_148:"owning"
	aastore 
	dup 
	bipush 106
	ldc literal_149:"paid"
	aastore 
	dup 
	bipush 107
	ldc literal_150:"participant"
	aastore 
	dup 
	bipush 108
	ldc literal_151:"participants"
	aastore 
	dup 
	bipush 109
	ldc literal_152:"participating"
	aastore 
	dup 
	bipush 110
	ldc literal_153:"fail"
	aastore 
	dup 
	bipush 111
	ldc literal_154:"paused"
	aastore 
	dup 
	bipush 112
	ldc literal_155:"picture"
	aastore 
	dup 
	bipush 113
	ldc literal_156:"ping"
	aastore 
	dup 
	bipush 114
	ldc literal_157:"PLAIN"
	aastore 
	dup 
	bipush 115
	ldc literal_158:"platform"
	aastore 
	dup 
	bipush 116
	ldc literal_159:"presence"
	aastore 
	dup 
	bipush 117
	ldc literal_160:"preview"
	aastore 
	dup 
	bipush 118
	ldc literal_161:"probe"
	aastore 
	dup 
	bipush 119
	ldc literal_162:"prop"
	aastore 
	dup 
	bipush 120
	ldc literal_163:"props"
	aastore 
	dup 
	bipush 121
	ldc literal_164:"p_o"
	aastore 
	dup 
	bipush 122
	ldc literal_165:"p_t"
	aastore 
	dup 
	bipush 123
	ldc literal_166:"query"
	aastore 
	dup 
	bipush 124
	ldc literal_167:"raw"
	aastore 
	dup 
	bipush 125
	ldc literal_168:"receipt"
	aastore 
	dup 
	bipush 126
	ldc literal_169:"receipt_acks"
	aastore 
	dup 
	bipush 127
	ldc literal_170:"received"
	aastore 
	dup 
	sipush 128
	ldc literal_171:"relay"
	aastore 
	dup 
	sipush 129
	ldc literal_172:"remove"
	aastore 
	dup 
	sipush 130
	ldc literal_173:"Replaced by new connection"
	aastore 
	dup 
	sipush 131
	ldc literal_174:"request"
	aastore 
	dup 
	sipush 132
	ldc literal_175:"resource"
	aastore 
	dup 
	sipush 133
	ldc literal_176:"resource-constraint"
	aastore 
	dup 
	sipush 134
	ldc literal_177:"response"
	aastore 
	dup 
	sipush 135
	ldc literal_178:"result"
	aastore 
	dup 
	sipush 136
	ldc literal_179:"retry"
	aastore 
	dup 
	sipush 137
	ldc literal_180:"rim"
	aastore 
	dup 
	sipush 138
	ldc literal_181:"s.whatsapp.net"
	aastore 
	dup 
	sipush 139
	ldc literal_182:"seconds"
	aastore 
	dup 
	sipush 140
	ldc literal_183:"server"
	aastore 
	dup 
	sipush 141
	ldc literal_184:"session"
	aastore 
	dup 
	sipush 142
	ldc literal_185:"set"
	aastore 
	dup 
	sipush 143
	ldc literal_186:"show"
	aastore 
	dup 
	sipush 144
	ldc literal_187:"sid"
	aastore 
	dup 
	sipush 145
	ldc literal_188:"sound"
	aastore 
	dup 
	sipush 146
	ldc literal_189:"stamp"
	aastore 
	dup 
	sipush 147
	ldc literal_190:"starttls"
	aastore 
	dup 
	sipush 148
	ldc literal_191:"status"
	aastore 
	dup 
	sipush 149
	ldc literal_192:"stream:error"
	aastore 
	dup 
	sipush 150
	ldc literal_193:"stream:features"
	aastore 
	dup 
	sipush 151
	ldc literal_194:"subject"
	aastore 
	dup 
	sipush 152
	ldc literal_195:"subscribe"
	aastore 
	dup 
	sipush 153
	ldc literal_196:"success"
	aastore 
	dup 
	sipush 154
	ldc literal_197:"system-shutdown"
	aastore 
	dup 
	sipush 155
	ldc literal_198:"s_o"
	aastore 
	dup 
	sipush 156
	ldc literal_199:"s_t"
	aastore 
	dup 
	sipush 157
	ldc literal_200:"t"
	aastore 
	dup 
	sipush 158
	ldc literal_201:"TimePassing.caf"
	aastore 
	dup 
	sipush 159
	ldc literal_202:"timestamp"
	aastore 
	dup 
	sipush 160
	ldc literal_203:"to"
	aastore 
	dup 
	sipush 161
	ldc literal_204:"Tri-tone.caf"
	aastore 
	dup 
	sipush 162
	ldc literal_205:"type"
	aastore 
	dup 
	sipush 163
	ldc literal_206:"unavailable"
	aastore 
	dup 
	sipush 164
	ldc literal_207:"uri"
	aastore 
	dup 
	sipush 165
	ldc literal_208:"url"
	aastore 
	dup 
	sipush 166
	ldc literal_209:"urn:ietf:params:xml:ns:xmpp-bind"
	aastore 
	dup 
	sipush 167
	ldc literal_210:"urn:ietf:params:xml:ns:xmpp-sasl"
	aastore 
	dup 
	sipush 168
	ldc literal_211:"urn:ietf:params:xml:ns:xmpp-session"
	aastore 
	dup 
	sipush 169
	ldc literal_212:"urn:ietf:params:xml:ns:xmpp-stanzas"
	aastore 
	dup 
	sipush 170
	ldc literal_213:"urn:ietf:params:xml:ns:xmpp-streams"
	aastore 
	dup 
	sipush 171
	ldc literal_214:"urn:xmpp:delay"
	aastore 
	dup 
	sipush 172
	ldc literal_215:"urn:xmpp:ping"
	aastore 
	dup 
	sipush 173
	ldc literal_216:"urn:xmpp:receipts"
	aastore 
	dup 
	sipush 174
	ldc literal_217:"urn:xmpp:whatsapp"
	aastore 
	dup 
	sipush 175
	ldc literal_218:"urn:xmpp:whatsapp:dirty"
	aastore 
	dup 
	sipush 176
	ldc literal_219:"urn:xmpp:whatsapp:mms"
	aastore 
	dup 
	sipush 177
	ldc literal_220:"urn:xmpp:whatsapp:push"
	aastore 
	dup 
	sipush 178
	ldc literal_221:"value"
	aastore 
	dup 
	sipush 179
	ldc literal_222:"vcard"
	aastore 
	dup 
	sipush 180
	ldc literal_223:"version"
	aastore 
	dup 
	sipush 181
	ldc literal_224:"video"
	aastore 
	dup 
	sipush 182
	ldc literal_225:"w"
	aastore 
	dup 
	sipush 183
	ldc literal_226:"w:g"
	aastore 
	dup 
	sipush 184
	ldc literal_227:"w:p:r"
	aastore 
	dup 
	sipush 185
	ldc literal_228:"wait"
	aastore 
	dup 
	sipush 186
	ldc literal_229:"x"
	aastore 
	dup 
	sipush 187
	ldc literal_230:"xml-not-well-formed"
	aastore 
	dup 
	sipush 188
	ldc literal_231:"xml:lang"
	aastore 
	dup 
	sipush 189
	ldc literal_232:"xmlns"
	aastore 
	dup 
	sipush 190
	ldc literal_233:"xmlns:stream"
	aastore 
	dup 
	sipush 191
	ldc literal_234:"Xylophone.caf"
	aastore 
	dup 
	sipush 192
	ldc literal_235:"account"
	aastore 
	dup 
	sipush 193
	ldc literal_236:"digest"
	aastore 
	dup 
	sipush 194
	ldc literal_237:"g_notify"
	aastore 
	dup 
	sipush 195
	ldc literal_238:"method"
	aastore 
	dup 
	sipush 196
	ldc literal_239:"password"
	aastore 
	dup 
	sipush 197
	ldc literal_240:"registration"
	aastore 
	dup 
	sipush 198
	ldc literal_241:"stat"
	aastore 
	dup 
	sipush 199
	ldc literal_242:"text"
	aastore 
	dup 
	sipush 200
	ldc literal_243:"user"
	aastore 
	dup 
	sipush 201
	ldc literal_244:"username"
	aastore 
	dup 
	sipush 202
	ldc literal_245:"event"
	aastore 
	dup 
	sipush 203
	ldc literal_246:"latitude"
	aastore 
	dup 
	sipush 204
	ldc literal_247:"longitude"
	aastore 
	dup 
	sipush 205
	ldc literal_248:"true"
	aastore 
	dup 
	sipush 206
	ldc literal_249:"after"
	aastore 
	dup 
	sipush 207
	ldc literal_250:"before"
	aastore 
	dup 
	sipush 208
	ldc literal_251:"broadcast"
	aastore 
	dup 
	sipush 209
	ldc literal_252:"count"
	aastore 
	dup 
	sipush 210
	ldc literal_253:"features"
	aastore 
	dup 
	sipush 211
	ldc literal_254:"first"
	aastore 
	dup 
	sipush 212
	ldc literal_255:"index"
	aastore 
	dup 
	sipush 213
	ldc literal_256:"invalid-mechanism"
	aastore 
	dup 
	sipush 214
	ldc literal_257:"last"
	aastore 
	dup 
	sipush 215
	ldc literal_258:"max"
	aastore 
	dup 
	sipush 216
	ldc literal_259:"offline"
	aastore 
	dup 
	sipush 217
	ldc literal_260:"proceed"
	aastore 
	dup 
	sipush 218
	ldc literal_261:"required"
	aastore 
	dup 
	sipush 219
	ldc literal_262:"sync"
	aastore 
	dup 
	sipush 220
	ldc literal_263:"elapsed"
	aastore 
	dup 
	sipush 221
	ldc literal_264:"ip"
	aastore 
	dup 
	sipush 222
	ldc literal_265:"microsoft"
	aastore 
	dup 
	sipush 223
	ldc literal_266:"mute"
	aastore 
	dup 
	sipush 224
	ldc literal_267:"nokia"
	aastore 
	dup 
	sipush 225
	ldc literal_268:"off"
	aastore 
	dup 
	sipush 226
	ldc literal_269:"pin"
	aastore 
	dup 
	sipush 227
	ldc literal_270:"pop_mean_time"
	aastore 
	dup 
	sipush 228
	ldc literal_271:"pop_plus_minus"
	aastore 
	dup 
	sipush 229
	ldc literal_272:"port"
	aastore 
	dup 
	sipush 230
	ldc literal_273:"reason"
	aastore 
	dup 
	sipush 231
	ldc literal_274:"server-error"
	aastore 
	dup 
	sipush 232
	ldc literal_275:"silent"
	aastore 
	dup 
	sipush 233
	ldc literal_276:"timeout"
	aastore 
	dup 
	sipush 234
	ldc literal_277:"lc"
	aastore 
	dup 
	sipush 235
	ldc literal_278:"lg"
	aastore 
	dup 
	sipush 236
	ldc literal_279:"bad-protocol"
	aastore 
	dup 
	sipush 237
	ldc literal_280:"none"
	aastore 
	dup 
	sipush 238
	ldc literal_281:"remote-server-timeout"
	aastore 
	dup 
	sipush 239
	ldc literal_282:"service-unavailable"
	aastore 
	dup 
	sipush 240
	ldc literal_283:"w:p"
	aastore 
	dup 
	sipush 241
	ldc literal_284:"w:profile:picture"
	aastore 
	dup 
	sipush 242
	ldc literal_285:"notification"
	aastore 
	putstatic dictionary // FunXMPP
	clinit_return 
	}

}
