// Copyright 2012, Jaap Suter - This file is subject to the
// terms and conditions defined in file LICENSE.md, which
// is part of the package - or contact license@jaapsuter.com
package com.jaapsuter.niets.xmpp;

import com.jaapsuter.niets.Assert;

import java.util.Hashtable;

public final class Symbols {

    public static String get(int tag) {
        return _tagToString[tag];
    }

    public static int get(String tag) {
        return ((Integer)_stringToTag.get(tag)).intValue();
    }


    private static final String[] _tagToString = new String[] {
            null, "stream:stream", null, null, null, "1", "1.0", "ack",
            "action", "active", "add", "all", "allow", "apple", "audio", "auth", "author",
            "available", "bad-request", "base64", "Bell.caf", "bind", "body", "Boing.caf",
            "cancel", "category", "challenge", "chat", "clean", "code", "composing",
            "config", "conflict", "contacts", "create", "creation", "default", "delay",
            "delete", "delivered", "deny", "DIGEST-MD5", "DIGEST-MD5-1", "dirty", "en",
            "enable", "encoding", "error", "expiration", "expired", "failure", "false",
            "favorites", "feature", "field", "free", "from", "g.us", "get", "Glass.caf",
            "google", "group", "groups", "g_sound", "Harp.caf",
            "http://etherx.jabber.org/streams", "http://jabber.org/protocol/chatstates",
            "id", "image", "img", "inactive", "internal-server-error", "iq", "item",
            "item-not-found", "jabber:client", "jabber:iq:last", "jabber:iq:privacy",
            "jabber:x:delay", "jabber:x:event", "jid", "jid-malformed", "kind", "leave",
            "leave-all", "list", "location", "max_groups", "max_participants",
            "max_subject", "mechanism", "mechanisms", "media", "message", "message_acks",
            "missing", "modify", "name", "not-acceptable", "not-allowed", "not-authorized",
            "notify", "Offline Storage", "order", "owner", "owning", "paid", "participant",
            "participants", "participating", "fail", "paused", "picture", "ping", "PLAIN",
            "platform", "presence", "preview", "probe", "prop", "props", "p_o", "p_t",
            "query", "raw", "receipt", "receipt_acks", "received", "relay", "remove",
            "Replaced by new connection", "request", "resource", "resource-constraint",
            "response", "result", "retry", "rim", "s.whatsapp.net", "seconds", "server",
            "session", "set", "show", "sid", "sound", "stamp", "starttls", "status",
            "stream:error", "stream:features", "subject", "subscribe", "success",
            "system-shutdown", "s_o", "s_t", "t", "TimePassing.caf", "timestamp", "to",
            "Tri-tone.caf", "type", "unavailable", "uri", "url",
            "urn:ietf:params:xml:ns:xmpp-bind", "urn:ietf:params:xml:ns:xmpp-sasl",
            "urn:ietf:params:xml:ns:xmpp-session", "urn:ietf:params:xml:ns:xmpp-stanzas",
            "urn:ietf:params:xml:ns:xmpp-streams", "urn:xmpp:delay", "urn:xmpp:ping",
            "urn:xmpp:receipts", "urn:xmpp:whatsapp", "urn:xmpp:whatsapp:dirty",
            "urn:xmpp:whatsapp:mms", "urn:xmpp:whatsapp:push", "value", "vcard", "version",
            "video", "w", "w:g", "w:p:r", "wait", "x", "xml-not-well-formed", "xml:lang",
            "xmlns", "xmlns:stream", "Xylophone.caf", "account", "digest", "g_notify",
            "method", "password", "registration", "stat", "text", "user", "username",
            "event", "latitude", "longitude", "true", "after", "before", "broadcast",
            "count", "features", "first", "index", "invalid-mechanism", "last", "max",
            "offline", "proceed", "required", "sync", "elapsed", "ip", "microsoft", "mute",
            "nokia", "off", "pin", "pop_mean_time", "pop_plus_minus", "port", "reason",
            "server-error", "silent", "timeout", "lc", "lg", "bad-protocol", "none",
            "remote-server-timeout", "service-unavailable", "w:p", "w:profile:picture",
            "notification"
    };

    private static final Hashtable _stringToTag;

    static {
        _stringToTag = new Hashtable();
        for (int i = 0; i < _tagToString.length; ++i)
            if (_tagToString[i] != null)
                _stringToTag.put(_tagToString[i], new Integer(i));
    }


    private Symbols() {
    }
}
