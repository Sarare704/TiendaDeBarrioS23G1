<%@page import="com.google.gson.Gson"%>
<%@page import="TO.TOProveedores"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.CtrlProveedores"%>
<% 
    CtrlProveedores proveedoresCtrl = new CtrlProveedores();
    String opcion = request.getParameter("opcion");
if ("listar".equals(opcion)){
    ArrayList<TOProveedores> proveedores =proveedoresCtrl.consultarProveedores();
    out.print(new Gson().toJson(proveedores));}
    
else{
    out.print("Opcion no valida");            
}  

%>