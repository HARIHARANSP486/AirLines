/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2019-05-23 08:54:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PaymentGateway_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
  }

  public void _jspDestroy() {
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\">\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\t\t\t/* var y = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${returnUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"return url\" + y); */\r\n");
      out.write("\t\t\t\t\t\t/* var param = $('#retUrl').val();\r\n");
      out.write("\t\t\t\t\t\tconsole.log(param); */\r\n");
      out.write("\t\t\t\t\t\t$(\"#acountnumber\")\r\n");
      out.write("\t\t\t\t\t\t\t\t.blur(function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#accounterr\").empty();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#paymentamounterr\").empty();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\turl : 'PaymentServlet',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype : 'post',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\taccountnumber : $(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#acountnumber\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(),\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpayment : \"getAccountBal\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(data);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tif (data == \"Invalid Account number\") {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#accounterr\").html(\"<p style='color:red;'>\"+ data+ \"</p>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\telse if(data == null)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#accounterr\").html(\"<p style='color:red;'>Invalid Account number</p>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\telse {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#accountbalance').val(data);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar paymentAmount = $(\"#paymentamount\").val();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar accountBalance = $('#accountbalance').val();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (paymentAmount > 0) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tif (Number(paymentAmount) <= Number(accountBalance)) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar remainingBal = accountBalance\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t- paymentAmount;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#remainingamount\").val(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tremainingBal);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#paymentamounterr\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.html(\"<p style='color:red;'>Enter less than or equal to your accout balance</p>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#paymentamounterr\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.html(\"<p style='color:red;'>Enter amount greater than zero</p>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t/* $(\"#paymentamount\")\r\n");
      out.write("\t\t\t\t\t\t\t\t.blur(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#paymentamounterr\").empty();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar paymentAmount = $(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"#paymentamount\").val();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar accountBalance = $(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t'#accountbalance').val();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif (paymentAmount > 0) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tif (Number(paymentAmount) <= Number(accountBalance)) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar remainingBal = accountBalance\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t- paymentAmount;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#remainingamount\").val(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tremainingBal);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#paymentamounterr\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.html(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"<p style='color:red;'>Enter less than or equal to your accout balance</p>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#paymentamounterr\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.html(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"<p style='color:red;'>Enter amount greater than zero</p>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t}); */\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<p class=\"text-center\">\r\n");
      out.write("\t\t\t<a href=\"PaymentGateway.html\"> Payment Gateway</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<p>PAYMENT DETAILS</p>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\r\n");
      out.write("\t\t<article class=\"card\">\r\n");
      out.write("\t\t<div class=\"card-body p-5\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<ul class=\"nav bg-light nav-pills rounded nav-fill mb-3\"\r\n");
      out.write("\t\t\t\trole=\"tablist\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link active show\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"pill\" href=\"#nav-tab-bank\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-university\"></i> Bank Transfer\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" data-toggle=\"pill\"\r\n");
      out.write("\t\t\t\t\thref=\"#nav-tab-card\"> <i class=\"fa fa-credit-card\"></i> Credit\r\n");
      out.write("\t\t\t\t\t\tCard\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" data-toggle=\"pill\"\r\n");
      out.write("\t\t\t\t\thref=\"#nav-tab-paypal\"> <i class=\"fas fa-wallet\"></i> Wallet\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t\t<div class=\"tab-pane fade\" id=\"nav-tab-card\">\r\n");
      out.write("\t\t\t\t\t<p class=\"alert alert-success\">Some text success or error</p>\r\n");
      out.write("\t\t\t\t\t<form role=\"form\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"username\">Full name (on the card)</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" name=\"username\" placeholder=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\trequired=\"\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- form-group.// -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"cardNumber\">Card number</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"cardNumber\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group-append\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-text text-muted\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fab fa-cc-visa\"></i>   <i class=\"fab fa-cc-amex\"></i>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fab fa-cc-mastercard\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- form-group.// -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label><span class=\"hidden-xs\">Expiration</span> </label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"number\" class=\"form-control\" placeholder=\"MM\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"\"> <input type=\"number\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"YY\" name=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label data-toggle=\"tooltip\" title=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-original-title=\"3 digits code on back side of the card\">CVV\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-question-circle\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label> <input type=\"number\" class=\"form-control\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- form-group.// -->\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- row.// -->\r\n");
      out.write("\t\t\t\t\t\t<button class=\"subscribe btn btn-primary btn-block\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"payment\" value=\"CardPayment\">Confirm</button>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- tab-pane.// -->\r\n");
      out.write("\t\t\t\t<div class=\"tab-pane fade\" id=\"nav-tab-paypal\">\r\n");
      out.write("\t\t\t\t\t<p>Wallet is easiest way to pay online</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fas fa-wallet\"></i> Paytm Wallet\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fas fa-wallet\"></i> Phonepe Wallet\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fas fa-wallet\"></i> Airtel Money\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<strong>Note:&nbsp;</strong>Never share your wallet password to\r\n");
      out.write("\t\t\t\t\t\tanyone.\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"tab-pane fade active show\" id=\"nav-tab-bank\">\r\n");
      out.write("\t\t\t\t\t<center>\r\n");
      out.write("\t\t\t\t\t\t<p style=\"font-size: 25px; color: blue;\">BANK ACCOUNT DETAILS</p>\r\n");
      out.write("\t\t\t\t\t\t<dl class=\"param\">\r\n");
      out.write("\t\t\t\t\t\t\t<p style=\"font-size: 25px; color: BLACK;\">ATEK BANK</p>\r\n");
      out.write("\t\t\t\t\t</center>\r\n");
      out.write("\t\t\t\t\t<form action=\"PaymentServlet\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"username\">Enter your Account Number</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" name=\"accountnumber\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"acountnumber\" placeholder=\"Enter your account number\"\r\n");
      out.write("\t\t\t\t\t\t\t\trequired pattern=\"^\\d{12}$\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"accounterr\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- form-group.// -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"username\">Account Balance</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"accountbalance\" id=\"accountbalance\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"your account number\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"username\">Payment Amount</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"amount\" id=\"paymentamount\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Enter Payment Amount\" required minimum=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paymentAmount }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"paymentamounterr\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"username\">Remaining Account Balance</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" name=\"remainingamount\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"remainingamount\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"After payment Remaining Amount\" required\r\n");
      out.write("\t\t\t\t\t\t\t\tminimum=\"1\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- form-group.// -->\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"retUrl\" id=\"retUrl\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${returnUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button class=\"subscribe btn btn-primary btn-block\" type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"payment\" value=\"bankPayment\">Confirm</button>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- tab-pane.// -->\r\n");
      out.write("\t\t\t\t<!-- <div class=\"tab-pane fade\" id=\"nav-tab-paypal\">\r\n");
      out.write("<p>Wallet is easiest way to pay online</p>\r\n");
      out.write("<p>\r\n");
      out.write("<button type=\"button\" class=\"btn btn-primary\"> <i class=\"fab fa-paypal\"></i> Log into my Wallet </button>\r\n");
      out.write("</p>\r\n");
      out.write("<p><strong>Note:</strong> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\r\n");
      out.write("tempor incididunt ut labore et dolore magna aliqua. </p>\r\n");
      out.write("</div> -->\r\n");
      out.write("\t\t\t\t<!-- tab-pane.// -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- tab-content .// -->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- card-body.// --> </article>\r\n");
      out.write("\t\t<!-- card.// -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("\t\t<!-- col.// -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- row.// -->\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--container end.//-->\r\n");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<article class=\"bg-secondary mb-3\">\r\n");
      out.write("\t<div class=\"card-body text-center\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<p style=\"font-size: 25px; color: black;\">Safe Transaction Using\r\n");
      out.write("\t\t\t256-bit Encryption</p>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t</article>\r\n");
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
}
