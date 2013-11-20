/*
 * $RCSfile: AllTagTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2013-11-19 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * JSP generated by JspCompiler-0.1.1 (built Tue Nov 19 12:23:38 CST 2013)
 *
 */
package _jsp.webapp;

import com.skin.ayada.runtime.ExpressionContext;
import com.skin.ayada.runtime.JspWriter;
import com.skin.ayada.runtime.PageContext;
import com.skin.ayada.tagext.BodyContent;
import com.skin.ayada.tagext.IterationTag;
import com.skin.ayada.tagext.Tag;
import com.skin.ayada.template.JspTemplate;
import com.skin.ayada.util.ExpressionUtil;
import java.io.File; /* JSP_DIRECTIVE_PAGE.import: lineNumber: 4 */

/**
 * <p>Title: AllTagTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
public class AllTagTestTemplate extends JspTemplate
{
    /* JSP_DECLARATION: lineNumber: 13 */
    public int myInt = 0;
    /* jsp:declaration END */
    /* JSP_DECLARATION: lineNumber: 21 */
    public void hello1(){
        System.out.println("Hello, World !");
    }
    /* jsp:declaration END */
    /* JSP_DECLARATION: lineNumber: 23 */
    public void hello2(){
        System.out.println("Hello, World !");
    }
    /* jsp:declaration END */
    /* JSP_DECLARATION: lineNumber: 29 */
    public void hello3(){
        System.out.println("Hello, World !");
    }
    /* jsp:declaration END */
    /* JSP_DECLARATION: lineNumber: 35 */
    public void hello4(){
        System.out.println(new File("."));
    }
    /* jsp:declaration END */
    /**
     * @param pageContext
     * @throws Exception
     */
    @Override
    public void execute(final PageContext pageContext) throws Exception
    {
        JspWriter out = pageContext.getOut();
        JspWriter jspWriter = pageContext.getOut();
        ExpressionContext expressionContext = pageContext.getExpressionContext();

        /* JSP_DIRECTIVE: lineNumber: 1 */
        /* <jsp:directive.page page="" contentType="text/html;charset=UTF-8"/> */
        /* jsp:directive.page END */

        /* JSP_DIRECTIVE: lineNumber: 2 */
        /* <jsp:directive.taglib taglib="" prefix="c" uri="http://java.sun.com/jsp/jstl/core"/> */
        /* jsp:directive.taglib END */

        /* JSP_DIRECTIVE: lineNumber: 3 */
        /* <jsp:directive.taglib taglib="" prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"/> */
        /* jsp:directive.taglib END */

        /* JSP_DIRECTIVE: lineNumber: 4 */
        /* <jsp:directive.page page="" import="java.io.File"/> */
        /* jsp:directive.page END */

        /* NODE START: lineNumber: 5, offset: 8, length: 2, tagClassName: com.skin.ayada.jstl.core.ImportTag, tagInstanceName: _jsp_ImportTag_9 */
        /* <t:import name="app:scrollpage" className="test.com.skin.ayada.taglib.ScrollPage"/> */
        pageContext.getTagLibrary().setup("app:scrollpage", "test.com.skin.ayada.taglib.ScrollPage");
        /* jsp.jstl.core.ImportTag END */
        /* NODE END: lineNumber: 5, tagClassName: com.skin.ayada.jstl.core.ImportTag, tagInstanceName: _jsp_ImportTag_9 */


        /* NODE START: lineNumber: 6, offset: 10, length: 2, tagClassName: com.skin.ayada.jstl.core.ImportTag, tagInstanceName: _jsp_ImportTag_11 */
        /* <t:import name="app:test" className="test.com.skin.ayada.taglib.TestTag"/> */
        pageContext.getTagLibrary().setup("app:test", "test.com.skin.ayada.taglib.TestTag");
        /* jsp.jstl.core.ImportTag END */
        /* NODE END: lineNumber: 6, tagClassName: com.skin.ayada.jstl.core.ImportTag, tagInstanceName: _jsp_ImportTag_11 */

        /* TEXT: lineNumber: 7 */
        out.write("<html>\r\n<head>\r\n<title>test</title>\r\n</head>\r\n<body jsp=\"");

        /* JSP_EXPRESSION: lineNumber: 11 */
        out.print(1 + 2);
        /* jsp:expression END */
        /* TEXT: lineNumber: 11 */
        out.write("\" version=\"1.0\">\r\n");

        /* JSP_DECLARATION: lineNumber: 13 */
        /* <jsp:declaration>...</jsp:declaration> */
        /* jsp:declaration END */
        /* TEXT: lineNumber: 16 */
        out.write("\r\n");

        /* JSP_DECLARATION: lineNumber: 21 */
        /* <jsp:declaration>...</jsp:declaration> */
        /* jsp:declaration END */
        /* TEXT: lineNumber: 22 */
        out.write("\r\n");

        /* JSP_DECLARATION: lineNumber: 23 */
        /* <jsp:declaration>...</jsp:declaration> */
        /* jsp:declaration END */
        /* TEXT: lineNumber: 28 */
        out.write("\r\n");

        /* JSP_DECLARATION: lineNumber: 29 */
        /* <jsp:declaration>...</jsp:declaration> */
        /* jsp:declaration END */
        /* TEXT: lineNumber: 34 */
        out.write("\r\n");

        /* JSP_DECLARATION: lineNumber: 35 */
        /* <jsp:declaration>...</jsp:declaration> */
        /* jsp:declaration END */
        /* TEXT: lineNumber: 40 */
        out.write("\r\n");

        /* JSP_SCRIPTLET: lineNumber: 41 */
    System.out.println("Hello, World1 !");

        /* jsp:scriptlet END */
        /* TEXT: lineNumber: 44 */
        out.write("\r\n");

        /* JSP_SCRIPTLET: lineNumber: 45 */
    System.out.println("Hello, World2 ! </test");
    System.out.println("Hello, World2 ! </jsp:scriptlet2>");

        /* jsp:scriptlet END */
        /* TEXT: lineNumber: 49 */
        out.write("\r\n");

        /* JSP_SCRIPTLET: lineNumber: 53 */
    int mytest = 0;
    System.out.println("Hello, World3 !");

        /* jsp:scriptlet END */
        /* TEXT: lineNumber: 54 */
        out.write("\r\n");

        /* JSP_EXPRESSION: lineNumber: 55 */
        out.print(mytest);
        /* jsp:expression END */
        /* TEXT: lineNumber: 56 */
        out.write("\r\n");

        /* JSP_SCRIPTLET: lineNumber: 57 */
    System.out.println("Hello, World4 !");

        /* jsp:scriptlet END */
        /* TEXT: lineNumber: 60 */
        out.write("\r\n");

        /* JSP_EXPRESSION: lineNumber: 61 */
        out.print(("Hello" + " " + "World !"));
        /* jsp:expression END */
        /* TEXT: lineNumber: 62 */
        out.write("\r\n");

        /* NODE START: lineNumber: 63, offset: 49, length: 2, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_50 */
        /* <c:set var="myVar" value="Hello, World!"/> */
        pageContext.setAttribute("myVar", "Hello, World!");
        /* jsp.jstl.core.SetTag END */
        /* NODE END: lineNumber: 63, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_50 */

        /* TEXT: lineNumber: 63 */
        out.write("\r\n<h1>");
        /* EXPRESSION: lineNumber: 64 */
        out.print(pageContext.getAttribute("myVar"), false);
        /* TEXT: lineNumber: 64 */
        out.write("</h1>\r\n");

        /* NODE START: lineNumber: 66, offset: 54, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_55 */
        /* <c:out value="c:out: Hello, World!"/> */
        out.write("c:out: Hello, World!");
        /* jsp.jstl.core.OutTag END */
        /* NODE END: lineNumber: 66, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_55 */

        /* TEXT: lineNumber: 66 */
        out.write("\r\n<div style=\"background-color: #c0c0c0;\"></div>\r\n");

        /* NODE START: lineNumber: 68, offset: 57, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_58 */
        /* <c:out value="<div>Hello World!</div>" escapeXml="true"/> */
        out.write("&lt;div&gt;Hello World!&lt;/div&gt;");
        /* jsp.jstl.core.OutTag END */
        /* NODE END: lineNumber: 68, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_58 */

        /* TEXT: lineNumber: 68 */
        out.write("\r\n");

        /* NODE START: lineNumber: 69, offset: 60, length: 3, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_61 */
        /* <c:out escapeXml="true">...</c:out> */
        out = pageContext.pushBody();
        /* TEXT: lineNumber: 69 */
        out.write("<h1>Hello World!</h1>");
        pageContext.printBodyContent((BodyContent)out, true);
        out = pageContext.popBody();
        /* jsp.jstl.core.OutTag END */
        /* NODE END: lineNumber: 69, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_61 */

        /* TEXT: lineNumber: 69 */
        out.write("\r\n");

        /* NODE START: lineNumber: 70, offset: 64, length: 3, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_65 */
        /* <c:out value="<div>Hello World!</div>" escapeXml="true">...</c:out> */
        out = pageContext.pushBody();
        out.write("&lt;div&gt;Hello World!&lt;/div&gt;");
        /* TEXT: lineNumber: 70 */
        out.write("<h1>Hello World!</h1>");
        pageContext.printBodyContent((BodyContent)out, true);
        out = pageContext.popBody();
        /* jsp.jstl.core.OutTag END */
        /* NODE END: lineNumber: 70, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_65 */

        /* TEXT: lineNumber: 70 */
        out.write("\r\n");

        /* NODE START: lineNumber: 72, offset: 68, length: 3, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _jsp_IfTag_69 */
        /* <c:if test="${1 == 1}">...</c:if> */
        if(ExpressionUtil.getBoolean(expressionContext, "${1 == 1}")){
        /* TEXT: lineNumber: 72 */
        out.write("c:if test");
        } /* jsp.jstl.core.IfTag END */
        /* NODE END: lineNumber: 72, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _jsp_IfTag_69 */

        /* TEXT: lineNumber: 72 */
        out.write("\r\n<h1>c:forEach test1</h1>\r\n");

        /* NODE START: lineNumber: 75, offset: 72, length: 3, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_73 */
        /* <c:forEach items="1,2,3,4,5" var="mynum">...</c:forEach> */
        Object _jsp_old_var_73 = pageContext.getAttribute("mynum");
        com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_73 = new com.skin.ayada.jstl.core.ForEachTag();

        _jsp_ForEachTag_73.setParent((Tag)null);
        _jsp_ForEachTag_73.setPageContext(pageContext);
        _jsp_ForEachTag_73.setVar("mynum");
        _jsp_ForEachTag_73.setItems("1,2,3,4,5");
        int _jsp_flag_73 = _jsp_ForEachTag_73.doStartTag();
        if(_jsp_flag_73 != Tag.SKIP_BODY){
            while(true){
        /* EXPRESSION: lineNumber: 77 */
        out.print(pageContext.getAttribute("mynum"), false);
                if(_jsp_ForEachTag_73.hasNext()){
                    pageContext.setAttribute("mynum", _jsp_ForEachTag_73.next());
                }
                else{
                    break;
                }
            }
        }
        _jsp_ForEachTag_73.release();
        pageContext.setAttribute("mynum", _jsp_old_var_73);
        /* jsp.jstl.core.ForEachTag END */
        /* NODE END: lineNumber: 75, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_73 */

        /* TEXT: lineNumber: 77 */
        out.write("\r\n<h1>c:forEach test2</h1>\r\n");

        /* NODE START: lineNumber: 80, offset: 76, length: 20, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_77 */
        /* <c:forEach items="${userList}" var="user" varStatus="status">...</c:forEach> */
        Object _jsp_old_var_77 = pageContext.getAttribute("user");
        Object _jsp_old_var_status_77 = pageContext.getAttribute("status");
        com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_77 = new com.skin.ayada.jstl.core.ForEachTag();

        _jsp_ForEachTag_77.setParent((Tag)null);
        _jsp_ForEachTag_77.setPageContext(pageContext);
        _jsp_ForEachTag_77.setVar("user");
        _jsp_ForEachTag_77.setItems(ExpressionUtil.evaluate(expressionContext, "${userList}"));
        pageContext.setAttribute("status", _jsp_ForEachTag_77.getLoopStatus());
        int _jsp_flag_77 = _jsp_ForEachTag_77.doStartTag();
        if(_jsp_flag_77 != Tag.SKIP_BODY){
            while(true){
        /* TEXT: lineNumber: 80 */
        out.write("\r\n    <p>user: ");
        /* EXPRESSION: lineNumber: 81 */
        out.write(expressionContext.getString("user.userName"));
        /* TEXT: lineNumber: 81 */
        out.write("</p>\r\n    ");

        /* NODE START: lineNumber: 82, offset: 80, length: 14, tagClassName: com.skin.ayada.jstl.core.ChooseTag, tagInstanceName: _jsp_ChooseTag_81 */
        /* <c:choose>...</c:choose> */
        boolean _jsp_ChooseTag_81 = true;


        /* NODE START: lineNumber: 83, offset: 81, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_82 */
        /* <c:when test="${user.userName == 'test1'}">...</c:when> */
        if(_jsp_ChooseTag_81 && ExpressionUtil.getBoolean(expressionContext, "${user.userName == \'test1\'}")){
            _jsp_ChooseTag_81 = false;
        /* TEXT: lineNumber: 83 */
        out.write("<p>test1, good man !</p>");
        } /* jsp.jstl.core.WhenTag END */
        /* NODE END: lineNumber: 83, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_82 */


        /* NODE START: lineNumber: 84, offset: 84, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_85 */
        /* <c:when test="${user.userName == 'test2'}">...</c:when> */
        if(_jsp_ChooseTag_81 && ExpressionUtil.getBoolean(expressionContext, "${user.userName == \'test2\'}")){
            _jsp_ChooseTag_81 = false;
        /* TEXT: lineNumber: 84 */
        out.write("<p>test2, good man !</p>");
        } /* jsp.jstl.core.WhenTag END */
        /* NODE END: lineNumber: 84, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_85 */


        /* NODE START: lineNumber: 85, offset: 87, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_88 */
        /* <c:when test="${user.userName == 'test3'}">...</c:when> */
        if(_jsp_ChooseTag_81 && ExpressionUtil.getBoolean(expressionContext, "${user.userName == \'test3\'}")){
            _jsp_ChooseTag_81 = false;
        /* TEXT: lineNumber: 85 */
        out.write("<p>test3, good man !</p>");
        } /* jsp.jstl.core.WhenTag END */
        /* NODE END: lineNumber: 85, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_88 */


        /* NODE START: lineNumber: 86, offset: 90, length: 3, tagClassName: com.skin.ayada.jstl.core.OtherwiseTag, tagInstanceName: _jsp_OtherwiseTag_91 */
        /* <c:otherwise>...</c:otherwise> */
        if(_jsp_ChooseTag_81){
            _jsp_ChooseTag_81 = false;
        /* TEXT: lineNumber: 86 */
        out.write("<p>unknown user! Do you known \'bad egg\'? You! Are!</p>");
        } /* jsp.jstl.core.OtherwiseTag END */
        /* NODE END: lineNumber: 86, tagClassName: com.skin.ayada.jstl.core.OtherwiseTag, tagInstanceName: _jsp_OtherwiseTag_91 */

        /* jsp.jstl.core.ChooseTag END */
        /* NODE END: lineNumber: 82, tagClassName: com.skin.ayada.jstl.core.ChooseTag, tagInstanceName: _jsp_ChooseTag_81 */

        /* TEXT: lineNumber: 87 */
        out.write("\r\n");
                if(_jsp_ForEachTag_77.hasNext()){
                    pageContext.setAttribute("user", _jsp_ForEachTag_77.next());
                }
                else{
                    break;
                }
            }
        }
        _jsp_ForEachTag_77.release();
        pageContext.setAttribute("user", _jsp_old_var_77);
        pageContext.setAttribute("status", _jsp_old_var_status_77);
        /* jsp.jstl.core.ForEachTag END */
        /* NODE END: lineNumber: 80, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_77 */

        /* TEXT: lineNumber: 88 */
        out.write("\r\n<h1>c:choose test1</h1>\r\n");

        /* NODE START: lineNumber: 91, offset: 97, length: 14, tagClassName: com.skin.ayada.jstl.core.ChooseTag, tagInstanceName: _jsp_ChooseTag_98 */
        /* <c:choose>...</c:choose> */
        boolean _jsp_ChooseTag_98 = true;


        /* NODE START: lineNumber: 92, offset: 98, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_99 */
        /* <c:when test="${1 == 1}">...</c:when> */
        if(_jsp_ChooseTag_98 && ExpressionUtil.getBoolean(expressionContext, "${1 == 1}")){
            _jsp_ChooseTag_98 = false;
        /* TEXT: lineNumber: 92 */
        out.write("c:when test=\"{1 == 1}\"");
        } /* jsp.jstl.core.WhenTag END */
        /* NODE END: lineNumber: 92, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_99 */


        /* NODE START: lineNumber: 93, offset: 101, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_102 */
        /* <c:when test="${2 == 2}">...</c:when> */
        if(_jsp_ChooseTag_98 && ExpressionUtil.getBoolean(expressionContext, "${2 == 2}")){
            _jsp_ChooseTag_98 = false;
        /* TEXT: lineNumber: 93 */
        out.write("c:when test=\"{2 == 2}\"");
        } /* jsp.jstl.core.WhenTag END */
        /* NODE END: lineNumber: 93, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_102 */


        /* NODE START: lineNumber: 94, offset: 104, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_105 */
        /* <c:when test="${3 == 3}">...</c:when> */
        if(_jsp_ChooseTag_98 && ExpressionUtil.getBoolean(expressionContext, "${3 == 3}")){
            _jsp_ChooseTag_98 = false;
        /* TEXT: lineNumber: 94 */
        out.write("c:when test=\"{3 == 3}\"");
        } /* jsp.jstl.core.WhenTag END */
        /* NODE END: lineNumber: 94, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_105 */


        /* NODE START: lineNumber: 95, offset: 107, length: 3, tagClassName: com.skin.ayada.jstl.core.OtherwiseTag, tagInstanceName: _jsp_OtherwiseTag_108 */
        /* <c:otherwise>...</c:otherwise> */
        if(_jsp_ChooseTag_98){
            _jsp_ChooseTag_98 = false;
        /* TEXT: lineNumber: 95 */
        out.write("c:otherwise");
        } /* jsp.jstl.core.OtherwiseTag END */
        /* NODE END: lineNumber: 95, tagClassName: com.skin.ayada.jstl.core.OtherwiseTag, tagInstanceName: _jsp_OtherwiseTag_108 */

        /* jsp.jstl.core.ChooseTag END */
        /* NODE END: lineNumber: 91, tagClassName: com.skin.ayada.jstl.core.ChooseTag, tagInstanceName: _jsp_ChooseTag_98 */

        /* TEXT: lineNumber: 96 */
        out.write("\r\n<h1>app:test test1</h1>\r\n");

        /* NODE START: lineNumber: 99, offset: 112, length: 2, tagClassName: test.com.skin.ayada.taglib.TestTag, tagInstanceName: _jsp_TestTag_113 */
        /* <app:test myBoolean="true" myChar="c" myByte="1" myInt="-1.0" myFloat="1.0f" myDouble="1.0d" myLong="1L" myString="Hello"/> */
        test.com.skin.ayada.taglib.TestTag _jsp_TestTag_113 = new test.com.skin.ayada.taglib.TestTag();
        _jsp_TestTag_113.setParent((Tag)null);
        _jsp_TestTag_113.setPageContext(pageContext);
        _jsp_TestTag_113.setMyBoolean(true);
        _jsp_TestTag_113.setMyChar('c');
        _jsp_TestTag_113.setMyByte((byte)1);
        _jsp_TestTag_113.setMyInt(-1);
        _jsp_TestTag_113.setMyFloat(1.0f);
        _jsp_TestTag_113.setMyDouble(1.0d);
        _jsp_TestTag_113.setMyLong(1L);
        _jsp_TestTag_113.setMyString("Hello");
        int _jsp_flag_113 = _jsp_TestTag_113.doStartTag();

        if(_jsp_flag_113 == Tag.SKIP_PAGE){
            return;
        }

        do{
            _jsp_flag_113 = _jsp_TestTag_113.doAfterBody();
        }
        while(_jsp_flag_113 == IterationTag.EVAL_BODY_AGAIN);
        _jsp_TestTag_113.doEndTag();
        _jsp_TestTag_113.release();
        /* NODE END: lineNumber: 99, tagClassName: test.com.skin.ayada.taglib.TestTag, tagInstanceName: _jsp_TestTag_113 */

        /* TEXT: lineNumber: 99 */
        out.write("\r\n");

        /* NODE START: lineNumber: 100, offset: 115, length: 2, tagClassName: test.com.skin.ayada.taglib.TestTag, tagInstanceName: _jsp_TestTag_116 */
        /* <app:test myBoolean="false" myChar="c" myByte="243" myInt="-1.0" myFloat="1.0F" myDouble="1.0D" myLong="1L" myString="Hello"/> */
        test.com.skin.ayada.taglib.TestTag _jsp_TestTag_116 = new test.com.skin.ayada.taglib.TestTag();
        _jsp_TestTag_116.setParent((Tag)null);
        _jsp_TestTag_116.setPageContext(pageContext);
        _jsp_TestTag_116.setMyBoolean(false);
        _jsp_TestTag_116.setMyChar('c');
        _jsp_TestTag_116.setMyByte((byte)243);
        _jsp_TestTag_116.setMyInt(-1);
        _jsp_TestTag_116.setMyFloat(1.0f);
        _jsp_TestTag_116.setMyDouble(1.0d);
        _jsp_TestTag_116.setMyLong(1L);
        _jsp_TestTag_116.setMyString("Hello");
        int _jsp_flag_116 = _jsp_TestTag_116.doStartTag();

        if(_jsp_flag_116 == Tag.SKIP_PAGE){
            return;
        }

        do{
            _jsp_flag_116 = _jsp_TestTag_116.doAfterBody();
        }
        while(_jsp_flag_116 == IterationTag.EVAL_BODY_AGAIN);
        _jsp_TestTag_116.doEndTag();
        _jsp_TestTag_116.release();
        /* NODE END: lineNumber: 100, tagClassName: test.com.skin.ayada.taglib.TestTag, tagInstanceName: _jsp_TestTag_116 */

        /* TEXT: lineNumber: 100 */
        out.write("\r\n");

        /* NODE START: lineNumber: 101, offset: 118, length: 2, tagClassName: test.com.skin.ayada.taglib.TestTag, tagInstanceName: _jsp_TestTag_119 */
        /* <app:test myInt="-1.0" myFloat="1.0" myDouble="1e3" myLong="1e3" myString="Hello"/> */
        test.com.skin.ayada.taglib.TestTag _jsp_TestTag_119 = new test.com.skin.ayada.taglib.TestTag();
        _jsp_TestTag_119.setParent((Tag)null);
        _jsp_TestTag_119.setPageContext(pageContext);
        _jsp_TestTag_119.setMyInt(-1);
        _jsp_TestTag_119.setMyFloat(1.0f);
        _jsp_TestTag_119.setMyDouble(1000.0d);
        _jsp_TestTag_119.setMyLong(1000L);
        _jsp_TestTag_119.setMyString("Hello");
        int _jsp_flag_119 = _jsp_TestTag_119.doStartTag();

        if(_jsp_flag_119 == Tag.SKIP_PAGE){
            return;
        }

        do{
            _jsp_flag_119 = _jsp_TestTag_119.doAfterBody();
        }
        while(_jsp_flag_119 == IterationTag.EVAL_BODY_AGAIN);
        _jsp_TestTag_119.doEndTag();
        _jsp_TestTag_119.release();
        /* NODE END: lineNumber: 101, tagClassName: test.com.skin.ayada.taglib.TestTag, tagInstanceName: _jsp_TestTag_119 */

        /* TEXT: lineNumber: 101 */
        out.write("\r\n");

        /* NODE START: lineNumber: 102, offset: 121, length: 2, tagClassName: test.com.skin.ayada.taglib.TestTag, tagInstanceName: _jsp_TestTag_122 */
        /* <app:test myInt="-1.0" myFloat="1.0" myDouble="1.2e3" myLong="1.2e3" myString="Hello"/> */
        test.com.skin.ayada.taglib.TestTag _jsp_TestTag_122 = new test.com.skin.ayada.taglib.TestTag();
        _jsp_TestTag_122.setParent((Tag)null);
        _jsp_TestTag_122.setPageContext(pageContext);
        _jsp_TestTag_122.setMyInt(-1);
        _jsp_TestTag_122.setMyFloat(1.0f);
        _jsp_TestTag_122.setMyDouble(1200.0d);
        _jsp_TestTag_122.setMyLong(1200L);
        _jsp_TestTag_122.setMyString("Hello");
        int _jsp_flag_122 = _jsp_TestTag_122.doStartTag();

        if(_jsp_flag_122 == Tag.SKIP_PAGE){
            return;
        }

        do{
            _jsp_flag_122 = _jsp_TestTag_122.doAfterBody();
        }
        while(_jsp_flag_122 == IterationTag.EVAL_BODY_AGAIN);
        _jsp_TestTag_122.doEndTag();
        _jsp_TestTag_122.release();
        /* NODE END: lineNumber: 102, tagClassName: test.com.skin.ayada.taglib.TestTag, tagInstanceName: _jsp_TestTag_122 */

        /* TEXT: lineNumber: 102 */
        out.write("\r\n<h1>app:scrollpage test1</h1>\r\n");

        /* NODE START: lineNumber: 105, offset: 124, length: 2, tagClassName: test.com.skin.ayada.taglib.ScrollPage, tagInstanceName: _jsp_ScrollPage_125 */
        /* <app:scrollpage count="254" pageNum="2" pageSize="10"/> */
        test.com.skin.ayada.taglib.ScrollPage _jsp_ScrollPage_125 = new test.com.skin.ayada.taglib.ScrollPage();
        _jsp_ScrollPage_125.setParent((Tag)null);
        _jsp_ScrollPage_125.setPageContext(pageContext);
        _jsp_ScrollPage_125.setCount(254);
        _jsp_ScrollPage_125.setPageNum(2);
        _jsp_ScrollPage_125.setPageSize(10);
        int _jsp_flag_125 = _jsp_ScrollPage_125.doStartTag();

        if(_jsp_flag_125 == Tag.SKIP_PAGE){
            return;
        }

        do{
            _jsp_flag_125 = _jsp_ScrollPage_125.doAfterBody();
        }
        while(_jsp_flag_125 == IterationTag.EVAL_BODY_AGAIN);
        _jsp_ScrollPage_125.doEndTag();
        _jsp_ScrollPage_125.release();
        /* NODE END: lineNumber: 105, tagClassName: test.com.skin.ayada.taglib.ScrollPage, tagInstanceName: _jsp_ScrollPage_125 */

        /* TEXT: lineNumber: 105 */
        out.write("\r\n</body>\r\n</html>");
        out.flush();
        jspWriter.flush();
    }
}
