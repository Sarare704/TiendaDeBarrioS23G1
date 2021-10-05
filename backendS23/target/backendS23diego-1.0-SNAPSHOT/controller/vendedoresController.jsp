<%@page import="com.google.gson.Gson"%>
<%@page import="TO.TOVendetores"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.CtrlVendedores"%>
<% 
    CtrlVendedores vendedoresCtrl = new CtrlVendedores();
    String opcion = request.getParameter("opcion");
if ("listar".equals(opcion)){
    ArrayList<TOVendetores> vendedores =vendedoresCtrl.consultarVendedores();
    out.print(new Gson().toJson(vendedores));}
    
else{
    out.print("Opcion no valida");            
}  

%>