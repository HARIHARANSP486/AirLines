/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2019-05-24 08:53:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listflights_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family: Times New Roman, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".display .display {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 10%;\r\n");
      out.write("\tleft: 18%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\t/* background-image: url(\"profile.bmp\"); */\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\theight: 600px;\r\n");
      out.write("\tbackground-position: center;\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero-content {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 2%;\r\n");
      out.write("\tleft: 96%;\r\n");
      out.write("\ttransform: translate(-50%, -50%);\r\n");
      out.write("\tcolor: green;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero-back {\r\n");
      out.write("\ttxt-align: center;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 2%;\r\n");
      out.write("\tleft: 90%;\r\n");
      out.write("\ttransform: translate(-50%, -50%);\r\n");
      out.write("\tcolor: green;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-default {\r\n");
      out.write("\tbackground: #000;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-default:hover {\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav {\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tbackground-color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tcolor: #f2f2f2;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding: 15px 56.5px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tbackground-color: grey;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a:hover {\r\n");
      out.write("\tbackground-color: #ddd;\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a.active {\r\n");
      out.write("\tbackground-color: #4CAF50;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav-right {\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"hero-page\">\r\n");
      out.write("\t\t<h4>\r\n");
      out.write("\t\t\t<b>&nbsp;&nbsp;It is the largest airline in India by fleet size\r\n");
      out.write("\t\t\t\tand destinations!!&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Customer\r\n");
      out.write("\t\t\t\tService:080 4666 2222\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\tContact: airlineservice@airlines.com</b>\r\n");
      out.write("\t\t</h4>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"topnav\">\r\n");
      out.write("\t\t<a class=\"active-non\" href=\"menupage.jsp\">Home <span\r\n");
      out.write("\t\t\tclass=\"sr-only\">(current)</span>\r\n");
      out.write("\t\t</a> <a class=\"active-non\" href=\"flightsearch.jsp\">Available Flights</a> <a\r\n");
      out.write("\t\t\tclass=\"active\" href=\"singletrip.jsp\">New ticket Booking</a> <a\r\n");
      out.write("\t\t\tclass=\"active-non\" href=\"ticketstatus.jsp\">Ticket Status</a> <a\r\n");
      out.write("\t\t\tclass=\"active-non\" href=\"cancelticket.jsp\">Cancel Ticket</a> <a\r\n");
      out.write("\t\t\tclass=\"active-non\" href=\"support.jsp\">Support Details</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<form method=\"post\" action=\"FlightIdServlet\">\r\n");
      out.write("\t\t<h3>List of flights :</h3>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border: 6px solid #dddddd; text-align: left; padding: 12px;\">FlightID</th>\r\n");
      out.write("\t\t\t\t\t<th\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border: 6px solid #dddddd; text-align: left; padding: 12px;\">Flight\r\n");
      out.write("\t\t\t\t\t\tName</th>\r\n");
      out.write("\t\t\t\t\t<th\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border: 6px solid #dddddd; text-align: left; padding: 12px;\">Source</th>\r\n");
      out.write("\t\t\t\t\t<th\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border: 6px solid #dddddd; text-align: left; padding: 12px;\">Destination</th>\r\n");
      out.write("\t\t\t\t\t<th\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border: 6px solid #dddddd; text-align: left; padding: 12px;\">Date\r\n");
      out.write("\t\t\t\t\t\tOf Journey</th>\r\n");
      out.write("\t\t\t\t\t<th\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border: 6px solid #dddddd; text-align: left; padding: 12px;\">Departure\r\n");
      out.write("\t\t\t\t\t\tTime</th>\r\n");
      out.write("\t\t\t\t\t<th\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border: 6px solid #dddddd; text-align: left; padding: 12px;\">Arrival\r\n");
      out.write("\t\t\t\t\t\tTime</th>\r\n");
      out.write("\t\t\t\t\t<th\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border: 6px solid #dddddd; text-align: left; padding: 12px;\">Available\r\n");
      out.write("\t\t\t\t\t\tTicket</th>\r\n");
      out.write("\t\t\t\t\t<th\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border: 6px solid #dddddd; text-align: left; padding: 12px;\">Adult\r\n");
      out.write("\t\t\t\t\t\tTicket Rate</th>\r\n");
      out.write("\t\t\t\t\t<th\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border: 6px solid #dddddd; text-align: left; padding: 12px;\">Children\r\n");
      out.write("\t\t\t\t\t\tTicket Rate</th>\r\n");
      out.write("\t\t\t\t\t<th\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border: 6px solid #dddddd; text-align: left; padding: 12px;\">Baby\r\n");
      out.write("\t\t\t\t\t\tTicket Rate</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<div class=\"hero-content\">\r\n");
      out.write("\t\t\t<a href=\"index.jsp\" class=\"btn btn-info\" role=\"button\">LOGOUT</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"hero-back\">\r\n");
      out.write("\t\t\t<a href=\"flightsearch.jsp\" class=\"btn btn-info\" role=\"button\">BACK</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br> <br> <br> <br> <br> <br> <br>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /listflights.jsp(157,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("FLIGHTSLIST");
      // /listflights.jsp(157,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/listflights.jsp(157,4) '${FLIGHTS}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${FLIGHTS}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t<td\r\n");
            out.write("\t\t\t\t\t\t\tstyle=\"border: 2px solid #dddddd; text-align: left; padding: 10px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${FLIGHTSLIST.flightId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td\r\n");
            out.write("\t\t\t\t\t\t\tstyle=\"border: 2px solid #dddddd; text-align: left; padding: 10px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${FLIGHTSLIST.flightName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td\r\n");
            out.write("\t\t\t\t\t\t\tstyle=\"border: 2px solid #dddddd; text-align: left; padding: 10px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${FLIGHTSLIST.source}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td\r\n");
            out.write("\t\t\t\t\t\t\tstyle=\"border: 2px solid #dddddd; text-align: left; padding: 10px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${FLIGHTSLIST.destination}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td\r\n");
            out.write("\t\t\t\t\t\t\tstyle=\"border: 2px solid #dddddd; text-align: left; padding: 10px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${FLIGHTSLIST.dateOfJourney}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td\r\n");
            out.write("\t\t\t\t\t\t\tstyle=\"border: 2px solid #dddddd; text-align: left; padding: 10px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${FLIGHTSLIST.departureTime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td\r\n");
            out.write("\t\t\t\t\t\t\tstyle=\"border: 2px solid #dddddd; text-align: left; padding: 10px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${FLIGHTSLIST.arrivalTime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td\r\n");
            out.write("\t\t\t\t\t\t\tstyle=\"border: 2px solid #dddddd; text-align: left; padding: 10px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${FLIGHTSLIST.avaliableTicket}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td\r\n");
            out.write("\t\t\t\t\t\t\tstyle=\"border: 2px solid #dddddd; text-align: left; padding: 10px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${FLIGHTSLIST.adultTicketRate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td\r\n");
            out.write("\t\t\t\t\t\t\tstyle=\"border: 2px solid #dddddd; text-align: left; padding: 10px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${FLIGHTSLIST.childTicketRate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td\r\n");
            out.write("\t\t\t\t\t\t\tstyle=\"border: 2px solid #dddddd; text-align: left; padding: 10px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${FLIGHTSLIST.babyTicketRate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td><button type=\"submit\" style=\"width: 60px\"\r\n");
            out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-info\" role=\"button\"\r\n");
            out.write("\t\t\t\t\t\t\t\tvalue=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${FLIGHTSLIST.flightId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\" name=\"flightnumber\">SELECT</button>\r\n");
            out.write("\t\t\t\t\t\t\t</a>\r\n");
            out.write("\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t<td></td>\r\n");
            out.write("\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
