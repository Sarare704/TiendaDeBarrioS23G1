<%@page import="com.google.gson.Gson"%>
<%@page import="TO.TOProductos"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.CtrlProductos"%>
<% 
    CtrlProductos productosCtrl = new CtrlProductos();
    String opcion = request.getParameter("opcion");
if ("listar".equals(opcion)){
    ArrayList<TOProductos> productos =productosCtrl.consultarProductos();
    out.print(new Gson().toJson(productos));}
    
else{
    out.print("Opcion no valida");            
}  

%>