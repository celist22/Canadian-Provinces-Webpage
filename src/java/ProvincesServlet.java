import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.json.Json;
import javax.json.stream.JsonGenerator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SpyderCel
 */
@WebServlet(urlPatterns = {"/ProvincesServlet"})
public class ProvincesServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Canada canada = new Canada();
        ArrayList<Province> province = canada.getProvinces();
        double population=Double.parseDouble(request.getParameter("population"));
        double landArea=Double.parseDouble(request.getParameter("landArea"));
        double waterArea=Double.parseDouble(request.getParameter("waterArea"));
        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
                try (JsonGenerator generate = Json.createGenerator(out)) {
                    generate.writeStartObject();
                        generate.writeStartArray("getDetails");
                            for (Province p : province) {
                                if ((population < p.getPopulation()) && 
                                        (landArea < p.getLandArea()) && 
                                        (waterArea < p.getWaterArea())){
                                    generate.writeStartObject();
                                    generate.write("name", p.getName());
                                    generate.write("population", p.getPopulation());
                                    generate.write("landArea", p.getLandArea());
                                    generate.write("waterArea", p.getWaterArea());
                                    generate.write("totalArea", p.getTotalArea());
                                    generate.write("officialLanguage", p.getOfficialLanguage());
                                    generate.writeEnd();
                                }
                            }
                        generate.writeEnd();
                    generate.writeEnd();
                }
            }
        }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}