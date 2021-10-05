<%@page import="com.google.gson.Gson"%>
<%@page import="TO.TOProductosTransaccion"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.CtrllProductosTransaccion"%>
<% 
    CtrllProductosTransaccion productostransaccionCtrl = new CtrllProductosTransaccion();
    String opcion = request.getParameter("opcion");
if ("listar".equals(opcion)){
    ArrayList<TOProductosTransaccion> productostransaccion =productostransaccionCtrl.consultarProductosTransaccion();
    out.print(new Gson().toJson(productostransaccion));}
    
else{
    out.print("Opcion no valida");            
}  

%>