package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertTour_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_head_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_theme_method_enctype_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_file_title_name_accept_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sx_head_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_fielderror_cssStyle_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_submit_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_head_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_theme_method_enctype_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_file_title_name_accept_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sx_head_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_textfield_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_fielderror_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_submit_value_nobody.release();
    _jspx_tagPool_s_head_nobody.release();
    _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody.release();
    _jspx_tagPool_s_form_theme_method_enctype_action.release();
    _jspx_tagPool_s_form_method_action.release();
    _jspx_tagPool_s_file_title_name_accept_nobody.release();
    _jspx_tagPool_sx_head_nobody.release();
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_textfield_name_label_nobody.release();
    _jspx_tagPool_s_if_test.release();
    _jspx_tagPool_s_fielderror_cssStyle_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Insert Tour</title>\n");
      out.write("        ");
      if (_jspx_meth_sx_head_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_s_head_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <font color=\"green\">\n");
      out.write("        Welcome, ");
      if (_jspx_meth_s_property_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </font>\n");
      out.write("        <h1>Insert Tour</h1>\n");
      out.write("        ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <a href=\"admin.jsp\">\n");
      out.write("            <input type=\"button\" value=\"Back\" />\n");
      out.write("        </a>\n");
      out.write("       </br>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sx_head_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sx:head
    org.apache.struts2.dojo.views.jsp.ui.HeadTag _jspx_th_sx_head_0 = (org.apache.struts2.dojo.views.jsp.ui.HeadTag) _jspx_tagPool_sx_head_nobody.get(org.apache.struts2.dojo.views.jsp.ui.HeadTag.class);
    _jspx_th_sx_head_0.setPageContext(_jspx_page_context);
    _jspx_th_sx_head_0.setParent(null);
    int _jspx_eval_sx_head_0 = _jspx_th_sx_head_0.doStartTag();
    if (_jspx_th_sx_head_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sx_head_nobody.reuse(_jspx_th_sx_head_0);
      return true;
    }
    _jspx_tagPool_sx_head_nobody.reuse(_jspx_th_sx_head_0);
    return false;
  }

  private boolean _jspx_meth_s_head_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:head
    org.apache.struts2.views.jsp.ui.HeadTag _jspx_th_s_head_0 = (org.apache.struts2.views.jsp.ui.HeadTag) _jspx_tagPool_s_head_nobody.get(org.apache.struts2.views.jsp.ui.HeadTag.class);
    _jspx_th_s_head_0.setPageContext(_jspx_page_context);
    _jspx_th_s_head_0.setParent(null);
    int _jspx_eval_s_head_0 = _jspx_th_s_head_0.doStartTag();
    if (_jspx_th_s_head_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_head_nobody.reuse(_jspx_th_s_head_0);
      return true;
    }
    _jspx_tagPool_s_head_nobody.reuse(_jspx_th_s_head_0);
    return false;
  }

  private boolean _jspx_meth_s_property_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent(null);
    _jspx_th_s_property_0.setValue("%{#session.USERNAME}");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_method_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("insertTourAction");
    _jspx_th_s_form_0.setMethod("POST");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("            \n");
        out.write("            \n");
        out.write("            ");
        if (_jspx_meth_s_textfield_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_textfield_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_textfield_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_textfield_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_textfield_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("             \n");
        out.write("            ");
        if (_jspx_meth_s_textfield_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("            \n");
        out.write("            \n");
        out.write("            ");
        if (_jspx_meth_s_textfield_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("            \n");
        out.write("            ");
        if (_jspx_meth_sx_datetimepicker_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_sx_datetimepicker_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            \n");
        out.write("            ");
        if (_jspx_meth_s_textfield_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("            <h3>Choose File & Upload</h3>  \n");
        out.write("            ");
        if (_jspx_meth_s_form_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("  \n");
        out.write("            \n");
        out.write("            \n");
        out.write("            ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    \n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_method_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_method_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_textfield_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_0.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_0.setName("tourName");
    _jspx_th_s_textfield_0.setLabel("Tour Name");
    int _jspx_eval_s_textfield_0 = _jspx_th_s_textfield_0.doStartTag();
    if (_jspx_th_s_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_0);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_0);
    return false;
  }

  private boolean _jspx_meth_s_textfield_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_1.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_1.setName("description");
    _jspx_th_s_textfield_1.setLabel("Description");
    int _jspx_eval_s_textfield_1 = _jspx_th_s_textfield_1.doStartTag();
    if (_jspx_th_s_textfield_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_1);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_1);
    return false;
  }

  private boolean _jspx_meth_s_textfield_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_2 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_2.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_2.setName("price");
    _jspx_th_s_textfield_2.setLabel("Price");
    int _jspx_eval_s_textfield_2 = _jspx_th_s_textfield_2.doStartTag();
    if (_jspx_th_s_textfield_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_2);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_2);
    return false;
  }

  private boolean _jspx_meth_s_textfield_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_3 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_3.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_3.setName("numberTicket");
    _jspx_th_s_textfield_3.setLabel("Number Ticket");
    int _jspx_eval_s_textfield_3 = _jspx_th_s_textfield_3.doStartTag();
    if (_jspx_th_s_textfield_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_3);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_3);
    return false;
  }

  private boolean _jspx_meth_s_textfield_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_4 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_4.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_4.setName("vehicle");
    _jspx_th_s_textfield_4.setLabel("Vehicle");
    int _jspx_eval_s_textfield_4 = _jspx_th_s_textfield_4.doStartTag();
    if (_jspx_th_s_textfield_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_4);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_4);
    return false;
  }

  private boolean _jspx_meth_s_textfield_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_5 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_5.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_5.setName("depLocation");
    _jspx_th_s_textfield_5.setLabel("Departure Location");
    int _jspx_eval_s_textfield_5 = _jspx_th_s_textfield_5.doStartTag();
    if (_jspx_th_s_textfield_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_5);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_5);
    return false;
  }

  private boolean _jspx_meth_s_textfield_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_6 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_6.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_6.setName("desLocation");
    _jspx_th_s_textfield_6.setLabel("Destination Location");
    int _jspx_eval_s_textfield_6 = _jspx_th_s_textfield_6.doStartTag();
    if (_jspx_th_s_textfield_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_6);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_6);
    return false;
  }

  private boolean _jspx_meth_sx_datetimepicker_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sx:datetimepicker
    org.apache.struts2.dojo.views.jsp.ui.DateTimePickerTag _jspx_th_sx_datetimepicker_0 = (org.apache.struts2.dojo.views.jsp.ui.DateTimePickerTag) _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody.get(org.apache.struts2.dojo.views.jsp.ui.DateTimePickerTag.class);
    _jspx_th_sx_datetimepicker_0.setPageContext(_jspx_page_context);
    _jspx_th_sx_datetimepicker_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_sx_datetimepicker_0.setName("checkInDate");
    _jspx_th_sx_datetimepicker_0.setLabel("Check In Date (yyyy-MMM-dd)");
    _jspx_th_sx_datetimepicker_0.setDisplayFormat("yyyy-MMM-dd");
    _jspx_th_sx_datetimepicker_0.setValue("Check In Date");
    int _jspx_eval_sx_datetimepicker_0 = _jspx_th_sx_datetimepicker_0.doStartTag();
    if (_jspx_th_sx_datetimepicker_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody.reuse(_jspx_th_sx_datetimepicker_0);
      return true;
    }
    _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody.reuse(_jspx_th_sx_datetimepicker_0);
    return false;
  }

  private boolean _jspx_meth_sx_datetimepicker_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sx:datetimepicker
    org.apache.struts2.dojo.views.jsp.ui.DateTimePickerTag _jspx_th_sx_datetimepicker_1 = (org.apache.struts2.dojo.views.jsp.ui.DateTimePickerTag) _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody.get(org.apache.struts2.dojo.views.jsp.ui.DateTimePickerTag.class);
    _jspx_th_sx_datetimepicker_1.setPageContext(_jspx_page_context);
    _jspx_th_sx_datetimepicker_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_sx_datetimepicker_1.setName("checkOutDate");
    _jspx_th_sx_datetimepicker_1.setLabel("Check Out Date (yyyy-MMM-dd)");
    _jspx_th_sx_datetimepicker_1.setDisplayFormat("yyyy-MMM-dd");
    _jspx_th_sx_datetimepicker_1.setValue("Check Out Date");
    int _jspx_eval_sx_datetimepicker_1 = _jspx_th_sx_datetimepicker_1.doStartTag();
    if (_jspx_th_sx_datetimepicker_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody.reuse(_jspx_th_sx_datetimepicker_1);
      return true;
    }
    _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody.reuse(_jspx_th_sx_datetimepicker_1);
    return false;
  }

  private boolean _jspx_meth_s_textfield_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_7 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_7.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_7.setName("img");
    _jspx_th_s_textfield_7.setLabel("Image");
    int _jspx_eval_s_textfield_7 = _jspx_th_s_textfield_7.doStartTag();
    if (_jspx_th_s_textfield_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_7);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_7);
    return false;
  }

  private boolean _jspx_meth_s_form_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_1 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_theme_method_enctype_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_1.setPageContext(_jspx_page_context);
    _jspx_th_s_form_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_form_1.setAction("/upload/perform-upload");
    _jspx_th_s_form_1.setMethod("post");
    _jspx_th_s_form_1.setEnctype("multipart/form-data");
    _jspx_th_s_form_1.setTheme("simple");
    int _jspx_eval_s_form_1 = _jspx_th_s_form_1.doStartTag();
    if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_1.doInitBody();
      }
      do {
        out.write("  \n");
        out.write("                ");
        if (_jspx_meth_s_file_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("  \n");
        out.write("                <button>Upload</button>  \n");
        out.write("                <br/><br/>  \n");
        out.write("                ");
        if (_jspx_meth_s_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("  \n");
        out.write("                ");
        if (_jspx_meth_s_fielderror_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("  \n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_form_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_theme_method_enctype_action.reuse(_jspx_th_s_form_1);
      return true;
    }
    _jspx_tagPool_s_form_theme_method_enctype_action.reuse(_jspx_th_s_form_1);
    return false;
  }

  private boolean _jspx_meth_s_file_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:file
    org.apache.struts2.views.jsp.ui.FileTag _jspx_th_s_file_0 = (org.apache.struts2.views.jsp.ui.FileTag) _jspx_tagPool_s_file_title_name_accept_nobody.get(org.apache.struts2.views.jsp.ui.FileTag.class);
    _jspx_th_s_file_0.setPageContext(_jspx_page_context);
    _jspx_th_s_file_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_file_0.setName("inputFile");
    _jspx_th_s_file_0.setTitle("Choose File to Upload");
    _jspx_th_s_file_0.setAccept(".doc,.jar,image/png,video/*");
    int _jspx_eval_s_file_0 = _jspx_th_s_file_0.doStartTag();
    if (_jspx_th_s_file_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_file_title_name_accept_nobody.reuse(_jspx_th_s_file_0);
      return true;
    }
    _jspx_tagPool_s_file_title_name_accept_nobody.reuse(_jspx_th_s_file_0);
    return false;
  }

  private boolean _jspx_meth_s_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_0 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_0.setPageContext(_jspx_page_context);
    _jspx_th_s_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_if_0.setTest("successMsg != null");
    int _jspx_eval_s_if_0 = _jspx_th_s_if_0.doStartTag();
    if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_0.doInitBody();
      }
      do {
        out.write("  \n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_s_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
    return false;
  }

  private boolean _jspx_meth_s_fielderror_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_fielderror_0 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _jspx_tagPool_s_fielderror_cssStyle_nobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_fielderror_0.setPageContext(_jspx_page_context);
    _jspx_th_s_fielderror_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_fielderror_0.setCssStyle("color:red;");
    int _jspx_eval_s_fielderror_0 = _jspx_th_s_fielderror_0.doStartTag();
    if (_jspx_th_s_fielderror_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_fielderror_cssStyle_nobody.reuse(_jspx_th_s_fielderror_0);
      return true;
    }
    _jspx_tagPool_s_fielderror_cssStyle_nobody.reuse(_jspx_th_s_fielderror_0);
    return false;
  }

  private boolean _jspx_meth_s_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_submit_0.setValue("Insert");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_value_nobody.reuse(_jspx_th_s_submit_0);
    return false;
  }
}
