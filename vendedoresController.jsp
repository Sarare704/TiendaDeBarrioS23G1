<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<%@page import="TO.TOVendetores"%>
<%@page import="controller.CtrolVendedores"%>
<%CtrolVendedores vendedoresCtrl = new CtrolVendedores();
    String opcion = request.getParameter("opcion");
    if ("listar".equals(opcion)) {
       

    } else if ("login".equals(opcion)) {
     
    } else if ("insertar".equals(opcion)) {

    } else if ("actualizar".equals(opcion)) {

    } else if ("eliminar".equals(opcion)) {

    } else {
        out.print("Opcion no valida");
    }
%>
