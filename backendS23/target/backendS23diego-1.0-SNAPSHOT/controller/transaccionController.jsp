<%@page import="com.google.gson.Gson"%>
<%@page import="TO.TOTransaccion"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.CtrlTransaccion"%>
<% 
    CtrlTransaccion transaccionCtrl = new CtrlTransaccion();
    String opcion = request.getParameter("opcion");
if ("listar".equals(opcion)){
    ArrayList<TOTransaccion> transaccion =transaccionCtrl.consultarTransaccion();
    out.print(new Gson().toJson(transaccion));}
    
else{
    out.print("Opcion no valida");            
}  

%>