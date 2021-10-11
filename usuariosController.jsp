<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<%@page import="TO.TOUsuarios"%>
<%@page import="TO.TOProductos"%>
<%@page import="controller.CtrlUsuarios"%>
<%@page import="controller.CtrlProductos"%>
<%CtrlUsuarios usuariosCtrl = new CtrlUsuarios();
    String opcion = request.getParameter("opcion");
    if ("listar".equals(opcion)) {
        ArrayList<TOUsuarios> usuarios = usuariosCtrl.consultarUsuarios();

        out.print(new Gson().toJson(usuarios));

    } else if ("login".equals(opcion)) {
        String datos = request.getParameter("data");
        TOUsuarios usuario = new Gson().fromJson(datos, TOUsuarios.class);
        usuario = usuariosCtrl.verificarUsuarios(usuario.getEmail(), usuario.getClave());
        out.println(new Gson().toJson(usuario));

    } else if ("insertar".equals(opcion)) {

    } else if ("actualizar".equals(opcion)) {

    } else if ("eliminar".equals(opcion)) {

    } else {
        out.print("Opcion no valida");
    }
%>

