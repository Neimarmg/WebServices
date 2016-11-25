<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleServicoCalculoProxyid" scope="session" class="com.calculos.ServicoCalculoProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleServicoCalculoProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleServicoCalculoProxyid.getEndpoint();
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
        sampleServicoCalculoProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.calculos.ServicoCalculo getServicoCalculo10mtemp = sampleServicoCalculoProxyid.getServicoCalculo();
if(getServicoCalculo10mtemp == null){
%>
<%=getServicoCalculo10mtemp %>
<%
}else{
        if(getServicoCalculo10mtemp!= null){
        String tempreturnp11 = getServicoCalculo10mtemp.toString();
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
        String valor1_2id=  request.getParameter("valor118");
        float valor1_2idTemp  = Float.parseFloat(valor1_2id);
        String valor2_3id=  request.getParameter("valor220");
        float valor2_3idTemp  = Float.parseFloat(valor2_3id);
        java.lang.String getResultado13mtemp = sampleServicoCalculoProxyid.getResultado(operacao_1idTemp,valor1_2idTemp,valor2_3idTemp);
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