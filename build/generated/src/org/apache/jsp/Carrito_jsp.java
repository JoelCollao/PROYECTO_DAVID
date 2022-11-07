package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Empresa;
import ModeloDAO.EmpresaDAO;
import ModeloDAO.CarritoDAO;
import Modelo.Carrito;
import java.util.ArrayList;
import ModeloDAO.CarritoDAO;
import Modelo.Carrito;
import java.util.ArrayList;

public final class Carrito_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!DOCTYPE html>\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\"> \n");
      out.write("            <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css\" integrity=\"sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"Estilos/estilosindex.css\"/>\n");
      out.write("\n");
      out.write("            <title>Technology Networks</title>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Technology Networks</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- para ver toda la lista de catalogos -->\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Control?accion=home\">Home<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Control?accion=home\">Seguir Comprando<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    <div>        \n");
      out.write("                        <style type=\"text/css\">\n");
      out.write("                            #logeo{\n");
      out.write("                                color: white;\n");
      out.write("                            }\n");
      out.write("                        </style>\n");
      out.write("\n");
      out.write("                        <a id = \"logeo\" class=\"nav-link\"><span class=\"sr-only\">(current)</span>\n");
      out.write("                            ");

                                HttpSession sesion = request.getSession();
                                if (sesion.getAttribute("cliente") == null) {
                            
      out.write(" \n");
      out.write("                            ");

                        } else {
      out.write("Bienvenido ");
      out.print( sesion.getAttribute("cliente"));
      out.write("\n");
      out.write("                            ");
}
      out.write(" \n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Sesión\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("\n");
      out.write("                            <!--a class=\"dropdown-item\" href=\"Control?accion=login\">Iniciar Sesion</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"Control?accion=registrarse\">Registrarse</a-->\n");
      out.write("\n");
      out.write("                            <a class=\"dropdown-item\" href=\"Control?accion=logout\">Cerrar Sesion</a>\n");
      out.write("\n");
      out.write("                            <!--a class=\"dropdown-item\" href=\"Control?accion=ir_a_carrito\">Ir al carrito</a-->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <div class=\"container mt-4\">\n");
      out.write("                <h3>Listado de Carrito</h3>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-8\">\n");
      out.write("                        <table class=\"table table-hover\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Item</th>\n");
      out.write("                                    <th>Producto</th>\n");
      out.write("                                    <th>Descripcion</th>\n");
      out.write("                                    <th>Cantidad</th>\n");
      out.write("                                    <th>Precio</th>\n");
      out.write("                                    <th>Subtotal</th>\n");
      out.write("                                    <th>Opcion</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");


                                    CarritoDAO cDAO = new CarritoDAO();
                                    ArrayList<Carrito> listaCarrito = cDAO.listarCarrito();
                                    Carrito c;
                                    Double subtotal = 0.0;
                                    Double IGV = 0.0;
                                    Double Total = 0.0;
                                    for (int i = 0; i < listaCarrito.size(); i++) {
                                        c = new Carrito();
                                        c = listaCarrito.get(i);
                                        subtotal = subtotal + c.getSubtotal();
                                
      out.write("\n");
      out.write("                                 \n");
      out.write("                                <tr>\n");
      out.write("                                <td><input type=\"text\" name=\"item\" id=\"item\" value=\"");
      out.print( c.getItem() );
      out.write("\" readonly=\"readonly\" size=\"1\"  class=\"form-control-sm border-0\"></td>\n");
      out.write("                                <td><img src=\"ControladorImg?parametro=");
      out.print( c.getDescripcion_producto() );
      out.write(" \" width=\"50\" height=\"50\"></td>\n");
      out.write("                                <td>");
      out.print( c.getDescripcion_producto() );
      out.write("</td>\n");
      out.write("                                <td><input type=\"text\" name=\"carCantidad\" id=\"carCantidad\" value=\"");
      out.print( c.getCantidad() );
      out.write("\" readonly=\"readonly\" size=\"1\"  class=\"form-control-sm border-0\"></td>\n");
      out.write("                                <td><input type=\"text\" name=\"carPrecioUnit\" id=\"carPrecioUnit\" value=\"");
      out.print( c.getPrecio_unitario_producto() );
      out.write("\" readonly=\"readonly\" size=\"3\"  class=\"form-control-sm border-0\"></td>\n");
      out.write("                                <td><input type=\"text\" name=\"carSubTotal\" id=\"carSubTotal\" value=\"");
      out.print( c.getSubtotal() );
      out.write("\" readonly=\"readonly\" size=\"3\"  class=\"form-control-sm border-0\"></td>\n");
      out.write("                                <td>    \n");
      out.write("                                  <a href=\"Control?accion=quitarItem&item=");
      out.print( c.getItem() );
      out.write("\" class=\"btn btn-warning\">Quitar</a>\n");
      out.write("                                </td>\n");
      out.write("                               \n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                                ");
}
                                    // Calculos Transaccionales
                                    IGV = 0.18 * subtotal;
                                    Total = subtotal + IGV;
                                
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <form action=\"Control?accion=Pagar\" method=\"POST\">\n");
      out.write("                        <label>Elegir Tienda</label>                            \n");
      out.write("                        <select name=\"txtLoc\" id=\"txtLoc\">\n");
      out.write("                    ");

                        EmpresaDAO eDAO = new EmpresaDAO();
                        ArrayList<Empresa> listarempresa = eDAO.listarEmpresas();
                        for (int k = 0; k < listarempresa.size(); k++) {
      out.write("\n");
      out.write("                            <option value=\"");
      out.print( listarempresa.get(k).getLocacion());
      out.write('"');
      out.write('>');
      out.print( listarempresa.get(k).getLocacion());
      out.write("</option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                        \n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-header\">\n");
      out.write("                                <h3>Generar Compra</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                                <label>Subtotal:</label>\n");
      out.write("                                <input type=\"text\" readonly=\"\" name=\"subtotal\" id=\"subtotal\" value=\"");
      out.print( subtotal);
      out.write("\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                                <label>IGV:</label>\n");
      out.write("                                <input type=\"text\" readonly=\"\" name=\"IGV\" id=\"IGV\" value=\"");
      out.print( IGV);
      out.write("\"  class=\"form-control\">\n");
      out.write("\n");
      out.write("                                <label>Total a Pagar:</label>\n");
      out.write("                                <input type=\"text\" readonly=\"\" name=\"total\" id=\"total\" value=\"");
      out.print( Total);
      out.write("\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-footer\">\n");
      out.write("                                <input type=\"submit\" value=\"Realizar Pago\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("             \n");
      out.write("                       \n");
      out.write("            <script src=\"https://checkout.culqi.com/js/v4\"></script>  \n");
      out.write("            <script type=\"text/javascript\" src=\"Js/Procesar_Pagos_Culqui.js\"></script> \n");
      out.write("                                \n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js\" integrity=\"sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\" integrity=\"sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("            \n");
      out.write("        </body>\n");
      out.write("    </html>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
