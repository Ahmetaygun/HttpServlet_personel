package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import model.Personel;

@WebServlet("/personel")
public class PersonelServlet extends HttpServlet {
    private List<Personel> personelList = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        String personelJson = new Gson().toJson(personelList);
        response.getWriter().write(personelJson);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ad = request.getParameter("ad");
        String soyad = request.getParameter("soyad");
        String sicilNumarasi = request.getParameter("sicilNumarasi");
        String[] departmanArray = request.getParameterValues("departman");
        List<String> departman = Arrays.asList(departmanArray != null ? departmanArray : new String[]{});
        String telefon = request.getParameter("telefon");
        String iseGirisTarihi = request.getParameter("iseGirisTarihi");
        String maasStr = request.getParameter("maas");
        String aktifStr = request.getParameter("aktif");

        if (ad == null || ad.isEmpty() ||
            soyad == null || soyad.isEmpty() ||
            iseGirisTarihi == null || iseGirisTarihi.isEmpty() ||
            maasStr == null || maasStr.isEmpty()) {
            response.setContentType("text/plain");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("Lütfen zorunlu alanları doldurun");
            return;
        }

        double maas = Double.parseDouble(maasStr);
        boolean aktif = Boolean.parseBoolean(aktifStr);

        Personel personel = new Personel(ad, soyad, sicilNumarasi, departman, telefon, iseGirisTarihi, maas, aktif);
        personelList.add(personel);

        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write("Personel eklendi");
    }
}
