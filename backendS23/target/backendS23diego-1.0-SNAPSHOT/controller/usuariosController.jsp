<%@page import="com.google.gson.Gson"%>
<%@page import="TO.TOUsuarios"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.CtrUsuarios"%>
<% 
    CtrUsuarios usuariosCtrl = new CtrUsuarios();
    String opcion = request.getParameter("opcion");
if ("listar".equals(opcion)){
    ArrayList<TOUsuarios> usuarios =usuariosCtrl.consultarUsuarios();
    out.print(new Gson().toJson(usuarios));}
    
else{
    out.print("Opcion no valida");            
}  

%>

