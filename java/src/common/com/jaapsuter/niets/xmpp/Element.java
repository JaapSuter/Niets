// Copyright 2012, Jaap Suter - This file is subject to the
// terms and conditions defined in file LICENSE.md, which
// is part of the package - or contact license@jaapsuter.com

package com.jaapsuter.niets.xmpp;

import java.util.Enumeration;
import java.util.Hashtable;

public final class Element {
    public Element(String name, Hashtable attribs, Object children) {
        _name = name;
        _children = children;
        _attribs = attribs;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append('<');
        sb.append(_name);

        Enumeration keys = _attribs.keys();
        while (keys.hasMoreElements()) {
            String key = (String)keys.nextElement();
            String value = (String)_attribs.get(key);

            sb.append(key);
            sb.append("='");
            sb.append(value);
            sb.append('\'');
            if (keys.hasMoreElements())
                sb.append(' ');
            else
                break;
        }

        sb.append('>');

        if (_children instanceof Object[]) {
            Object[] children = (Object[])_children;
            for (int i = 0; i < children.length; ++i)
                sb.append(children[i].toString());
        }
        else if (_children != null) {
            sb.append(_children.toString());
        }

        sb.append("</");
        sb.append(_name);
        sb.append(">");

        return sb.toString();
    }

    private String _name;
    private Hashtable _attribs;
    private Object _children;
}
