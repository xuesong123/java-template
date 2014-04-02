/*
 * $RCSfile: NodeUtil.java,v $$
 * $Revision: 1.1 $
 * $Date: 2013-11-4 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 */
package com.skin.ayada.util;

import java.util.List;
import java.util.Map;

import com.skin.ayada.statement.Node;
import com.skin.ayada.statement.NodeType;

/**
 * <p>Title: NodeUtil</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @version 1.0
 */
public class NodeUtil
{
    /**
     * @param nodes
     * @return String
     */
    public static String getDescription(List<Node> nodes)
    {
        StringBuilder buffer = new StringBuilder();

        for(Node node : nodes)
        {
            buffer.append(getDescription(node));
            buffer.append("\r\n");
        }

        return buffer.toString();
    }

    /**
     * @param node
     * @return String
     */
    public static String getDescription(Node node)
    {
        int nodeType = node.getNodeType();
        StringBuilder buffer = new StringBuilder();

        if(nodeType == NodeType.TEXT)
        {
            buffer.append("<text>");
            buffer.append(node.getTextContent());
            buffer.append("</text>");
            return buffer.toString();
        }

        if(nodeType == NodeType.COMMENT)
        {
            buffer.append(node.getTextContent());
            return buffer.toString();
        }

        if(nodeType == NodeType.VARIABLE || nodeType == NodeType.EXPRESSION)
        {
            buffer.append("${");
            buffer.append(node.getTextContent());
            buffer.append("}");
            return buffer.toString();
        }

        buffer.append("<");
        buffer.append(node.getNodeName());
        Map<String, String> attributes = node.getAttributes();

        if(attributes != null && attributes.size() > 0)
        {
            for(Map.Entry<String, String> entrySet : attributes.entrySet())
            {
                buffer.append(" ");
                buffer.append(entrySet.getKey());
                buffer.append("=\"");
                buffer.append(HtmlUtil.encode(entrySet.getValue()));
                buffer.append("\"");
            }
        }

        if(node.getClosed() == NodeType.PAIR_CLOSED)
        {
            buffer.append(">...");
            buffer.append("</");
            buffer.append(node.getNodeName());
            buffer.append(">");
        }
        else
        {
            buffer.append("/>");
        }

        return buffer.toString();
    }

    /**
     * @param attributes
     * @return String
     */
    public static String toString(Map<String, String> attributes)
    {
        StringBuilder buffer = new StringBuilder();

        if(attributes != null && attributes.size() > 0)
        {
            for(Map.Entry<String, String> entrySet : attributes.entrySet())
            {
                buffer.append(entrySet.getKey());
                buffer.append("=\"");
                buffer.append(entrySet.getValue());
                buffer.append("\"");
                buffer.append(" ");
            }

            if(buffer.length() > 0)
            {
                buffer.deleteCharAt(buffer.length() - 1);
            }
        }

        return buffer.toString();
    }
}
