<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<%@page import="TO.TOProductos"%>
<%@page import="controller.CtrlProductos"%>
<%CtrlProductos productosCtrl = new CtrlProductos();
    String opcion = request.getParameter("opcion");
    if ("listar".equals(opcion)) {
        ArrayList<TOProductos> productos = productosCtrl.consultarProductos();
        
        out.print(new Gson().toJson(productos));
        }else if("insertar".equals(opcion)){
            
          String producto = request.getParameter("data");
          TOProductos productoTo = new Gson().fromJson(producto,TOProductos.class);
          productosCtrl.insertarProductos(productoTo);
        
        }else if("actualizar".equals(opcion)){
        
        }else if("eliminar".equals(opcion)){
        
        }else{
    out.print("Opcion no valida");
    }
%>