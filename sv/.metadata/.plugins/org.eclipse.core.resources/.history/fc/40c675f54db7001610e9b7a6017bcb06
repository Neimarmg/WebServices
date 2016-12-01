<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleCalculoWebServiceProxyid" scope="session" class="com.calculadora.CalculoWebServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleCalculoWebServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleCalculoWebServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleCalculoWebServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.calculadora.CalculoWebService getCalculoWebService10mtemp = sampleCalculoWebServiceProxyid.getCalculoWebService();
if(getCalculoWebService10mtemp == null){
%>
<%=getCalculoWebService10mtemp %>
<%
}else{
        if(getCalculoWebService10mtemp!= null){
        String tempreturnp11 = getCalculoWebService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String operacao_1id=  request.getParameter("operacao16");
            java.lang.String operacao_1idTemp = null;
        if(!operacao_1id.equals("")){
         operacao_1idTemp  = operacao_1id;
        }
        String numerador_2id=  request.getParameter("numerador18");
        float numerador_2idTemp  = Float.parseFloat(numerador_2id);
        String denonominador_3id=  request.getParameter("denonominador20");
        float denonominador_3idTemp  = Float.parseFloat(denonominador_3id);
        java.lang.String getResultado13mtemp = sampleCalculoWebServiceProxyid.getResultado(operacao_1idTemp,numerador_2idTemp,denonominador_3idTemp);
if(getResultado13mtemp == null){
%>
<%=getResultado13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getResultado13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>