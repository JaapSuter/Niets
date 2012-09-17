// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	public static String /*java.lang.String[]*/  dictionary ; // ofs = 57152 addr = 2)


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
	sipush 237
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
	ldc literal_84:"account"
	aastore 
	dup 
	bipush 6
	ldc literal_85:"ack"
	aastore 
	dup 
	bipush 7
	ldc literal_86:"action"
	aastore 
	dup 
	bipush 8
	ldc literal_87:"active"
	aastore 
	dup 
	bipush 9
	ldc literal_88:"add"
	aastore 
	dup 
	bipush 10
	ldc literal_89:"after"
	aastore 
	dup 
	bipush 11
	ldc literal_90:"ib"
	aastore 
	dup 
	bipush 12
	ldc literal_91:"all"
	aastore 
	dup 
	bipush 13
	ldc literal_92:"allow"
	aastore 
	dup 
	bipush 14
	ldc literal_93:"apple"
	aastore 
	dup 
	bipush 15
	ldc literal_94:"audio"
	aastore 
	dup 
	bipush 16
	ldc literal_95:"auth"
	aastore 
	dup 
	bipush 17
	ldc literal_96:"author"
	aastore 
	dup 
	bipush 18
	ldc literal_97:"available"
	aastore 
	dup 
	bipush 19
	ldc literal_98:"bad-protocol"
	aastore 
	dup 
	bipush 20
	ldc literal_99:"bad-request"
	aastore 
	dup 
	bipush 21
	ldc literal_100:"before"
	aastore 
	dup 
	bipush 22
	ldc literal_101:"Bell.caf"
	aastore 
	dup 
	bipush 23
	ldc literal_102:"body"
	aastore 
	dup 
	bipush 24
	ldc literal_103:"Boing.caf"
	aastore 
	dup 
	bipush 25
	ldc literal_104:"cancel"
	aastore 
	dup 
	bipush 26
	ldc literal_105:"category"
	aastore 
	dup 
	bipush 27
	ldc literal_106:"challenge"
	aastore 
	dup 
	bipush 28
	ldc literal_107:"chat"
	aastore 
	dup 
	bipush 29
	ldc literal_108:"clean"
	aastore 
	dup 
	bipush 30
	ldc literal_109:"code"
	aastore 
	dup 
	bipush 31
	ldc literal_110:"composing"
	aastore 
	dup 
	bipush 32
	ldc literal_111:"config"
	aastore 
	dup 
	bipush 33
	ldc literal_112:"conflict"
	aastore 
	dup 
	bipush 34
	ldc literal_113:"contacts"
	aastore 
	dup 
	bipush 35
	ldc literal_114:"count"
	aastore 
	dup 
	bipush 36
	ldc literal_115:"create"
	aastore 
	dup 
	bipush 37
	ldc literal_116:"creation"
	aastore 
	dup 
	bipush 38
	ldc literal_117:"default"
	aastore 
	dup 
	bipush 39
	ldc literal_118:"delay"
	aastore 
	dup 
	bipush 40
	ldc literal_119:"delete"
	aastore 
	dup 
	bipush 41
	ldc literal_120:"delivered"
	aastore 
	dup 
	bipush 42
	ldc literal_121:"deny"
	aastore 
	dup 
	bipush 43
	ldc literal_122:"digest"
	aastore 
	dup 
	bipush 44
	ldc literal_123:"DIGEST-MD5-1"
	aastore 
	dup 
	bipush 45
	ldc literal_124:"DIGEST-MD5-2"
	aastore 
	dup 
	bipush 46
	ldc literal_125:"dirty"
	aastore 
	dup 
	bipush 47
	ldc literal_126:"elapsed"
	aastore 
	dup 
	bipush 48
	ldc literal_127:"broadcast"
	aastore 
	dup 
	bipush 49
	ldc literal_128:"enable"
	aastore 
	dup 
	bipush 50
	ldc literal_129:"encoding"
	aastore 
	dup 
	bipush 51
	ldc literal_130:"duplicate"
	aastore 
	dup 
	bipush 52
	ldc literal_131:"error"
	aastore 
	dup 
	bipush 53
	ldc literal_132:"event"
	aastore 
	dup 
	bipush 54
	ldc literal_133:"expiration"
	aastore 
	dup 
	bipush 55
	ldc literal_134:"expired"
	aastore 
	dup 
	bipush 56
	ldc literal_135:"fail"
	aastore 
	dup 
	bipush 57
	ldc literal_136:"failure"
	aastore 
	dup 
	bipush 58
	ldc literal_137:"false"
	aastore 
	dup 
	bipush 59
	ldc literal_138:"favorites"
	aastore 
	dup 
	bipush 60
	ldc literal_139:"feature"
	aastore 
	dup 
	bipush 61
	ldc literal_140:"features"
	aastore 
	dup 
	bipush 62
	ldc literal_141:"field"
	aastore 
	dup 
	bipush 63
	ldc literal_142:"first"
	aastore 
	dup 
	bipush 64
	ldc literal_143:"free"
	aastore 
	dup 
	bipush 65
	ldc literal_144:"from"
	aastore 
	dup 
	bipush 66
	ldc literal_145:"g.us"
	aastore 
	dup 
	bipush 67
	ldc literal_146:"get"
	aastore 
	dup 
	bipush 68
	ldc literal_147:"Glass.caf"
	aastore 
	dup 
	bipush 69
	ldc literal_148:"google"
	aastore 
	dup 
	bipush 70
	ldc literal_149:"group"
	aastore 
	dup 
	bipush 71
	ldc literal_150:"groups"
	aastore 
	dup 
	bipush 72
	ldc literal_151:"g_notify"
	aastore 
	dup 
	bipush 73
	ldc literal_152:"g_sound"
	aastore 
	dup 
	bipush 74
	ldc literal_153:"Harp.caf"
	aastore 
	dup 
	bipush 75
	ldc literal_154:"http://etherx.jabber.org/streams"
	aastore 
	dup 
	bipush 76
	ldc literal_155:"http://jabber.org/protocol/chatstates"
	aastore 
	dup 
	bipush 77
	ldc literal_156:"id"
	aastore 
	dup 
	bipush 78
	ldc literal_157:"image"
	aastore 
	dup 
	bipush 79
	ldc literal_158:"img"
	aastore 
	dup 
	bipush 80
	ldc literal_159:"inactive"
	aastore 
	dup 
	bipush 81
	ldc literal_160:"index"
	aastore 
	dup 
	bipush 82
	ldc literal_161:"internal-server-error"
	aastore 
	dup 
	bipush 83
	ldc literal_162:"invalid-mechanism"
	aastore 
	dup 
	bipush 84
	ldc literal_163:"ip"
	aastore 
	dup 
	bipush 85
	ldc literal_164:"iq"
	aastore 
	dup 
	bipush 86
	ldc literal_165:"item"
	aastore 
	dup 
	bipush 87
	ldc literal_166:"item-not-found"
	aastore 
	dup 
	bipush 88
	ldc literal_167:"user-not-found"
	aastore 
	dup 
	bipush 89
	ldc literal_168:"jabber:iq:last"
	aastore 
	dup 
	bipush 90
	ldc literal_169:"jabber:iq:privacy"
	aastore 
	dup 
	bipush 91
	ldc literal_170:"jabber:x:delay"
	aastore 
	dup 
	bipush 92
	ldc literal_171:"jabber:x:event"
	aastore 
	dup 
	bipush 93
	ldc literal_172:"jid"
	aastore 
	dup 
	bipush 94
	ldc literal_173:"jid-malformed"
	aastore 
	dup 
	bipush 95
	ldc literal_174:"kind"
	aastore 
	dup 
	bipush 96
	ldc literal_175:"last"
	aastore 
	dup 
	bipush 97
	ldc literal_176:"latitude"
	aastore 
	dup 
	bipush 98
	ldc literal_177:"lc"
	aastore 
	dup 
	bipush 99
	ldc literal_178:"leave"
	aastore 
	dup 
	bipush 100
	ldc literal_179:"leave-all"
	aastore 
	dup 
	bipush 101
	ldc literal_180:"lg"
	aastore 
	dup 
	bipush 102
	ldc literal_181:"list"
	aastore 
	dup 
	bipush 103
	ldc literal_182:"location"
	aastore 
	dup 
	bipush 104
	ldc literal_183:"longitude"
	aastore 
	dup 
	bipush 105
	ldc literal_184:"max"
	aastore 
	dup 
	bipush 106
	ldc literal_185:"max_groups"
	aastore 
	dup 
	bipush 107
	ldc literal_186:"max_participants"
	aastore 
	dup 
	bipush 108
	ldc literal_187:"max_subject"
	aastore 
	dup 
	bipush 109
	ldc literal_188:"mechanism"
	aastore 
	dup 
	bipush 110
	ldc literal_189:"media"
	aastore 
	dup 
	bipush 111
	ldc literal_190:"message"
	aastore 
	dup 
	bipush 112
	ldc literal_191:"message_acks"
	aastore 
	dup 
	bipush 113
	ldc literal_192:"method"
	aastore 
	dup 
	bipush 114
	ldc literal_193:"microsoft"
	aastore 
	dup 
	bipush 115
	ldc literal_194:"missing"
	aastore 
	dup 
	bipush 116
	ldc literal_195:"modify"
	aastore 
	dup 
	bipush 117
	ldc literal_196:"mute"
	aastore 
	dup 
	bipush 118
	ldc literal_197:"name"
	aastore 
	dup 
	bipush 119
	ldc literal_198:"nokia"
	aastore 
	dup 
	bipush 120
	ldc literal_199:"none"
	aastore 
	dup 
	bipush 121
	ldc literal_200:"not-acceptable"
	aastore 
	dup 
	bipush 122
	ldc literal_201:"not-allowed"
	aastore 
	dup 
	bipush 123
	ldc literal_202:"not-authorized"
	aastore 
	dup 
	bipush 124
	ldc literal_203:"notification"
	aastore 
	dup 
	bipush 125
	ldc literal_204:"notify"
	aastore 
	dup 
	bipush 126
	ldc literal_205:"off"
	aastore 
	dup 
	bipush 127
	ldc literal_206:"offline"
	aastore 
	dup 
	sipush 128
	ldc literal_207:"order"
	aastore 
	dup 
	sipush 129
	ldc literal_208:"owner"
	aastore 
	dup 
	sipush 130
	ldc literal_209:"owning"
	aastore 
	dup 
	sipush 131
	ldc literal_210:"paid"
	aastore 
	dup 
	sipush 132
	ldc literal_211:"participant"
	aastore 
	dup 
	sipush 133
	ldc literal_212:"participants"
	aastore 
	dup 
	sipush 134
	ldc literal_213:"participating"
	aastore 
	dup 
	sipush 135
	ldc literal_214:"password"
	aastore 
	dup 
	sipush 136
	ldc literal_215:"paused"
	aastore 
	dup 
	sipush 137
	ldc literal_216:"picture"
	aastore 
	dup 
	sipush 138
	ldc literal_217:"pin"
	aastore 
	dup 
	sipush 139
	ldc literal_218:"ping"
	aastore 
	dup 
	sipush 140
	ldc literal_219:"platform"
	aastore 
	dup 
	sipush 141
	ldc literal_220:"pop_mean_time"
	aastore 
	dup 
	sipush 142
	ldc literal_221:"pop_plus_minus"
	aastore 
	dup 
	sipush 143
	ldc literal_222:"port"
	aastore 
	dup 
	sipush 144
	ldc literal_223:"presence"
	aastore 
	dup 
	sipush 145
	ldc literal_224:"preview"
	aastore 
	dup 
	sipush 146
	ldc literal_225:"probe"
	aastore 
	dup 
	sipush 147
	ldc literal_226:"proceed"
	aastore 
	dup 
	sipush 148
	ldc literal_227:"prop"
	aastore 
	dup 
	sipush 149
	ldc literal_228:"props"
	aastore 
	dup 
	sipush 150
	ldc literal_229:"p_o"
	aastore 
	dup 
	sipush 151
	ldc literal_230:"p_t"
	aastore 
	dup 
	sipush 152
	ldc literal_231:"query"
	aastore 
	dup 
	sipush 153
	ldc literal_232:"raw"
	aastore 
	dup 
	sipush 154
	ldc literal_233:"reason"
	aastore 
	dup 
	sipush 155
	ldc literal_234:"receipt"
	aastore 
	dup 
	sipush 156
	ldc literal_235:"receipt_acks"
	aastore 
	dup 
	sipush 157
	ldc literal_236:"received"
	aastore 
	dup 
	sipush 158
	ldc literal_237:"registration"
	aastore 
	dup 
	sipush 159
	ldc literal_238:"relay"
	aastore 
	dup 
	sipush 160
	ldc literal_239:"remote-server-timeout"
	aastore 
	dup 
	sipush 161
	ldc literal_240:"remove"
	aastore 
	dup 
	sipush 162
	ldc literal_241:"Replaced by new connection"
	aastore 
	dup 
	sipush 163
	ldc literal_242:"request"
	aastore 
	dup 
	sipush 164
	ldc literal_243:"required"
	aastore 
	dup 
	sipush 165
	ldc literal_244:"resource"
	aastore 
	dup 
	sipush 166
	ldc literal_245:"resource-constraint"
	aastore 
	dup 
	sipush 167
	ldc literal_246:"response"
	aastore 
	dup 
	sipush 168
	ldc literal_247:"result"
	aastore 
	dup 
	sipush 169
	ldc literal_248:"retry"
	aastore 
	dup 
	sipush 170
	ldc literal_249:"rim"
	aastore 
	dup 
	sipush 171
	ldc literal_250:"s.whatsapp.net"
	aastore 
	dup 
	sipush 172
	ldc literal_251:"s.us"
	aastore 
	dup 
	sipush 173
	ldc literal_252:"seconds"
	aastore 
	dup 
	sipush 174
	ldc literal_253:"server"
	aastore 
	dup 
	sipush 175
	ldc literal_254:"server-error"
	aastore 
	dup 
	sipush 176
	ldc literal_255:"service-unavailable"
	aastore 
	dup 
	sipush 177
	ldc literal_256:"set"
	aastore 
	dup 
	sipush 178
	ldc literal_257:"show"
	aastore 
	dup 
	sipush 179
	ldc literal_258:"sid"
	aastore 
	dup 
	sipush 180
	ldc literal_259:"silent"
	aastore 
	dup 
	sipush 181
	ldc literal_260:"sound"
	aastore 
	dup 
	sipush 182
	ldc literal_261:"stamp"
	aastore 
	dup 
	sipush 183
	ldc literal_262:"unsubscribe"
	aastore 
	dup 
	sipush 184
	ldc literal_263:"stat"
	aastore 
	dup 
	sipush 185
	ldc literal_264:"status"
	aastore 
	dup 
	sipush 186
	ldc literal_265:"stream:error"
	aastore 
	dup 
	sipush 187
	ldc literal_266:"stream:features"
	aastore 
	dup 
	sipush 188
	ldc literal_267:"subject"
	aastore 
	dup 
	sipush 189
	ldc literal_268:"subscribe"
	aastore 
	dup 
	sipush 190
	ldc literal_269:"success"
	aastore 
	dup 
	sipush 191
	ldc literal_270:"sync"
	aastore 
	dup 
	sipush 192
	ldc literal_271:"system-shutdown"
	aastore 
	dup 
	sipush 193
	ldc literal_272:"s_o"
	aastore 
	dup 
	sipush 194
	ldc literal_273:"s_t"
	aastore 
	dup 
	sipush 195
	ldc literal_274:"t"
	aastore 
	dup 
	sipush 196
	ldc literal_275:"text"
	aastore 
	dup 
	sipush 197
	ldc literal_276:"timeout"
	aastore 
	dup 
	sipush 198
	ldc literal_277:"TimePassing.caf"
	aastore 
	dup 
	sipush 199
	ldc literal_278:"timestamp"
	aastore 
	dup 
	sipush 200
	ldc literal_279:"to"
	aastore 
	dup 
	sipush 201
	ldc literal_280:"Tri-tone.caf"
	aastore 
	dup 
	sipush 202
	ldc literal_281:"true"
	aastore 
	dup 
	sipush 203
	ldc literal_282:"type"
	aastore 
	dup 
	sipush 204
	ldc literal_283:"unavailable"
	aastore 
	dup 
	sipush 205
	ldc literal_284:"uri"
	aastore 
	dup 
	sipush 206
	ldc literal_285:"url"
	aastore 
	dup 
	sipush 207
	ldc literal_286:"urn:ietf:params:xml:ns:xmpp-sasl"
	aastore 
	dup 
	sipush 208
	ldc literal_287:"urn:ietf:params:xml:ns:xmpp-stanzas"
	aastore 
	dup 
	sipush 209
	ldc literal_288:"urn:ietf:params:xml:ns:xmpp-streams"
	aastore 
	dup 
	sipush 210
	ldc literal_289:"urn:xmpp:delay"
	aastore 
	dup 
	sipush 211
	ldc literal_290:"urn:xmpp:ping"
	aastore 
	dup 
	sipush 212
	ldc literal_291:"urn:xmpp:receipts"
	aastore 
	dup 
	sipush 213
	ldc literal_292:"urn:xmpp:whatsapp"
	aastore 
	dup 
	sipush 214
	ldc literal_293:"urn:xmpp:whatsapp:account"
	aastore 
	dup 
	sipush 215
	ldc literal_294:"urn:xmpp:whatsapp:dirty"
	aastore 
	dup 
	sipush 216
	ldc literal_295:"urn:xmpp:whatsapp:mms"
	aastore 
	dup 
	sipush 217
	ldc literal_296:"urn:xmpp:whatsapp:push"
	aastore 
	dup 
	sipush 218
	ldc literal_297:"user"
	aastore 
	dup 
	sipush 219
	ldc literal_298:"username"
	aastore 
	dup 
	sipush 220
	ldc literal_299:"value"
	aastore 
	dup 
	sipush 221
	ldc literal_300:"vcard"
	aastore 
	dup 
	sipush 222
	ldc literal_301:"version"
	aastore 
	dup 
	sipush 223
	ldc literal_302:"video"
	aastore 
	dup 
	sipush 224
	ldc literal_303:"w"
	aastore 
	dup 
	sipush 225
	ldc literal_304:"w:g"
	aastore 
	dup 
	sipush 226
	ldc literal_305:"w:p"
	aastore 
	dup 
	sipush 227
	ldc literal_306:"w:p:r"
	aastore 
	dup 
	sipush 228
	ldc literal_307:"w:profile:picture"
	aastore 
	dup 
	sipush 229
	ldc literal_308:"wait"
	aastore 
	dup 
	sipush 230
	ldc literal_309:"x"
	aastore 
	dup 
	sipush 231
	ldc literal_310:"xml-not-well-formed"
	aastore 
	dup 
	sipush 232
	ldc literal_311:"xmlns"
	aastore 
	dup 
	sipush 233
	ldc literal_312:"xmlns:stream"
	aastore 
	dup 
	sipush 234
	ldc literal_313:"Xylophone.caf"
	aastore 
	dup 
	sipush 235
	ldc literal_314:"1"
	aastore 
	dup 
	sipush 236
	ldc literal_315:"WAUTH-1"
	aastore 
	putstatic dictionary // FunXMPP
	clinit_return 
	}

}
